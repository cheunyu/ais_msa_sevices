/**     
 * @Title: TextServiceImpl.java    
 * @Package com.scyb.aisweather.vdl.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年10月8日 下午3:59:39    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;

import com.scyb.aisweather.serial.service.ISerialDataService;
import com.scyb.aisweather.socket.service.IVDMSocket;
import com.scyb.aisweather.vdl.bo.DemarcatedAreaBo;
import com.scyb.aisweather.vdl.bo.PortStatusBo;
import com.scyb.aisweather.vdl.bo.ShipDistressBo;
import com.scyb.aisweather.vdl.bo.TextBo;
import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;
import com.scyb.aisweather.vdl.service.ITextService;
import com.scyb.aisweather.vdl.util.AscIIConvertBinaryUtil;
import com.scyb.aisweather.vdl.util.CharacterConvertAisCodeUtil;
import com.scyb.aisweather.vdl.util.ConvertCoordinateUtil;
import com.scyb.aisweather.vdl.util.MessageHeadBinaryUtil;
import com.scyb.aisweather.vdl.vo.TextVo;

/**
 *      @ClassName: TextServiceImpl     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年10月8日 下午3:59:39           
 */
public class TextServiceImpl implements ITextService {

	private Logger log = Logger.getLogger(this.getClass());
	private AscIIConvertBinaryUtil acbUtil = new AscIIConvertBinaryUtil();
	private ConvertCoordinateUtil ccUtil = new ConvertCoordinateUtil();
	private CharacterConvertAisCodeUtil ccacUtil = new CharacterConvertAisCodeUtil();
	private ISerialDataService serialDataServiceImpl;
	private IVDMSocket vdmSocketImpl;

	/**
	 * @param serialDataServiceImpl
	 *            the serialDataServiceImpl to set
	 */
	public void setSerialDataServiceImpl(ISerialDataService serialDataServiceImpl) {
		this.serialDataServiceImpl = serialDataServiceImpl;
	}

	/**
	 * @param vdmSocketImpl
	 *            the vdmSocketImpl to set
	 */
	public void setVdmSocketImpl(IVDMSocket vdmSocketImpl) {
		this.vdmSocketImpl = vdmSocketImpl;
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: transformVdl
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param sdVo  @return     @see
	 * com.scyb.aisweather.vdl.service.ITextService
	 * #transformVdl(com.scyb.aisweather.vdl.vo.TextVo)   
	 */
	@Override
	public String transformVdl(TextVo tVo) {
		// TODO Auto-generated method stub
		TextBo tBo = new TextBo();
		try {
			BeanUtils.copyProperties(tVo, tBo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		log.info(tVo.toString());
		log.info(tBo.toString());
		String messageHead = new String();
		MessageHeadBinaryUtil mhbu = new MessageHeadBinaryUtil();
		// 判断6、8号报文类型
		if (tVo.getMessageNo() == 6) {
			MessageSix messageSix = new MessageSix();
			messageSix.setSource_id(tVo.getSource_id());
			messageSix.setDestination_id(tVo.getDestination_id());
			tBo.setMessageSix(messageSix);
			messageHead = mhbu.generationMessageSixHead(messageSix);
		} else {
			MessageEight messageEight = new MessageEight();
			messageEight.setSource_id(tVo.getSource_id());
			tBo.setMessageEight(messageEight);
			messageHead = mhbu.generationMessageEightHead(messageEight);
		}
		String dac = acbUtil.convertBin(TextBo.getDac(), 10);
		String fi = acbUtil.convertBin(TextBo.getFi(), 6);
		StringBuffer binary = new StringBuffer();
		binary.append(dac).append(fi);
		binary.append(ccacUtil.convertAisCode(tBo.getContent()));
		if (binary.toString().length() % 8 != 0) {
			for (int i = 0; i < binary.toString().length() % 8; i++) {
				binary.append("0");
			}
		}
		List<String> vdmMessageList = new ArrayList<String>();
		log.info(binary.toString());
		vdmMessageList = serialDataServiceImpl.generationABM(binary.toString(), tBo.getMessageSix());
		vdmSocketImpl.sendMessage(vdmMessageList);
		StringBuffer messageSB = new StringBuffer();
		for(String str:vdmMessageList) {
			messageSB.append(str);
		}
		return messageSB.toString();
	}

}
