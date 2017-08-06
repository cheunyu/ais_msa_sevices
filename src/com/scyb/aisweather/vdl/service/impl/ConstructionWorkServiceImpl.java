/**     
 * @Title: ConstructionWorkServiceImpl.java    
 * @Package com.scyb.aisweather.vdl.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月6日 下午1:22:06    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.scyb.aisweather.serial.service.ISerialDataService;
import com.scyb.aisweather.socket.service.IVDMSocket;
import com.scyb.aisweather.vdl.bo.AidsMarkedDynamicBo;
import com.scyb.aisweather.vdl.bo.ConstructionWorkBo;
import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;
import com.scyb.aisweather.vdl.service.IConstructionWorkService;
import com.scyb.aisweather.vdl.util.AscIIConvertBinaryUtil;
import com.scyb.aisweather.vdl.util.ConvertCoordinateUtil;
import com.scyb.aisweather.vdl.util.MessageHeadBinaryUtil;
import com.scyb.aisweather.vdl.vo.ConstructionWorkVo;

/**
 *      @ClassName: ConstructionWorkServiceImpl   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年10月6日 下午1:22:06           
 */
public class ConstructionWorkServiceImpl implements IConstructionWorkService {
	
	private Logger log = Logger.getLogger(this.getClass());
	private AscIIConvertBinaryUtil acbUtil = new AscIIConvertBinaryUtil();
	private ConvertCoordinateUtil ccUtil = new ConvertCoordinateUtil();
	private ISerialDataService serialDataServiceImpl;
	private IVDMSocket vdmSocketImpl;

	/**
	 * @param serialDataServiceImpl the serialDataServiceImpl to set
	 */
	public void setSerialDataServiceImpl(ISerialDataService serialDataServiceImpl) {
		this.serialDataServiceImpl = serialDataServiceImpl;
	}

	/**
	 * @param vdmSocketImpl the vdmSocketImpl to set
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
	 *     @param cwVo  @return     @see
	 * com.scyb.aisweather.vdl.service.IConstructionWorkService
	 * #transformVdl(com.scyb.aisweather.vdl.vo.ConstructionWorkVo)   
	 */
	@Override
	public String transformVdl(ConstructionWorkVo cwVo) {
		// TODO Auto-generated method stub
		ConstructionWorkBo cwBo = new ConstructionWorkBo();
		String messageHead = new String();
		MessageHeadBinaryUtil mhbu = new MessageHeadBinaryUtil();
		// 判断6、8号报文类型
		if (cwVo.getMessageNo() == 6) {
			MessageSix messageSix = new MessageSix();
			messageSix.setSource_id(cwVo.getSource_id());
			messageSix.setDestination_id(cwVo.getDestination_id());
			cwBo.setMessageSix(messageSix);
			messageHead = mhbu.generationMessageSixHead(messageSix);
		} else {
			MessageEight messageEight = new MessageEight();
			messageEight.setSource_id(cwVo.getSource_id());
			cwBo.setMessageEight(messageEight);
			messageHead = mhbu.generationMessageEightHead(messageEight);
		}
		cwBo.setType(cwVo.getType());
		cwBo.setShipType(cwVo.getShipType());
		cwBo.setShipMMSI(cwVo.getShipMMSI());
		cwBo.setRadius((int)(cwVo.getRadius()*10));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			cwBo.setStartDateTime(sdf.parse(cwVo.getStartDateTime()));
			cwBo.setEndDateTime(sdf.parse(cwVo.getEndDateTime()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String dac = acbUtil.convertBin(cwBo.getDac(), 10);
		String fi = acbUtil.convertBin(cwBo.getFi(), 6);
		String type = acbUtil.convertBin(cwBo.getType(), 4);
		StringBuffer binary = new StringBuffer();
		binary.append(dac).append(fi).append(type);
		binary.append(acbUtil.convertBin(cwBo.getShipType(), 3));
		binary.append(acbUtil.convertBin(cwBo.getShipMMSI(), 30));
		binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(cwVo.getStartLongitudeD(), cwVo.getStartLongitudeM(), cwVo.getStartLongitudeS(), 105, 10000), 24));
		binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(cwVo.getStartLatitudeD(), cwVo.getStartLatitudeM(), cwVo.getStartLatitudeS(), 4, 10000), 25));
		binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(cwVo.getEndLongitudeD(), cwVo.getEndLongitudeM(), cwVo.getEndLongitudeS(), 105, 10000), 24));
		binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(cwVo.getEndLatitudeD(), cwVo.getEndLatitudeM(), cwVo.getEndLatitudeS(), 4, 10000), 25));
		binary.append(acbUtil.convertBin(cwBo.getRadius(), 7));
		binary.append(acbUtil.convertBin(cwBo.getStartDateTime().getMonth()+1, 4));
		binary.append(acbUtil.convertBin(cwBo.getStartDateTime().getDate(), 5));
		binary.append(acbUtil.convertBin(cwBo.getStartDateTime().getHours(), 5));
		binary.append(acbUtil.convertBin(cwBo.getStartDateTime().getMinutes(), 6));
		binary.append(acbUtil.convertBin(cwBo.getEndDateTime().getMonth()+1, 4));
		binary.append(acbUtil.convertBin(cwBo.getEndDateTime().getDate(), 5));
		binary.append(acbUtil.convertBin(cwBo.getEndDateTime().getHours(), 5));
		binary.append(acbUtil.convertBin(cwBo.getEndDateTime().getMinutes(), 6));
		binary.append(acbUtil.convertBin(0, 2));
		List<String> vdmMessageList = new ArrayList<String>();
		log.info(cwVo.toString());
		log.info(cwBo.toString());
		log.info(binary.toString());
		if (cwVo.getMessageNo() == 6) {
			vdmMessageList = serialDataServiceImpl.generationABM(binary.toString(), cwBo.getMessageSix());
		} else {
			vdmMessageList = serialDataServiceImpl.generationBBM(binary.toString(), cwBo.getMessageEight());
		}
		vdmSocketImpl.sendMessage(vdmMessageList);
		StringBuffer messageSB = new StringBuffer();
		for(String str:vdmMessageList) {
			messageSB.append(str);
		}
		return messageSB.toString();
	}

}
