/**     
 * @Title: HeavyTowServiceImpl.java    
 * @Package com.scyb.aisweather.vdl.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月6日 下午6:34:37    
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
import com.scyb.aisweather.vdl.bo.ConstructionWorkBo;
import com.scyb.aisweather.vdl.bo.HeavyTowBo;
import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;
import com.scyb.aisweather.vdl.service.IHeavyTowService;
import com.scyb.aisweather.vdl.util.AscIIConvertBinaryUtil;
import com.scyb.aisweather.vdl.util.ConvertCoordinateUtil;
import com.scyb.aisweather.vdl.util.MessageHeadBinaryUtil;
import com.scyb.aisweather.vdl.vo.HeavyTowVo;

/**   
 * @ClassName: HeavyTowServiceImpl   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月6日 下午6:34:37      
 *    
 */
public class HeavyTowServiceImpl implements IHeavyTowService {
	
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

	/** (非 Javadoc)   
	 * <p>Title: transformVdl</p>  
	 * <p>Description: </p>  
	 * @param htVo
	 * @return   
	 * @see com.scyb.aisweather.vdl.service.IHeavyTowService#transformVdl(com.scyb.aisweather.vdl.vo.HeavyTowVo)   
	 */
	@Override
	public String transformVdl(HeavyTowVo htVo) {
		HeavyTowBo htBo = new HeavyTowBo();
		String messageHead = new String();
		MessageHeadBinaryUtil mhbu = new MessageHeadBinaryUtil();
		// 判断6、8号报文类型
		if (htVo.getMessageNo() == 6) {
			MessageSix messageSix = new MessageSix();
			messageSix.setSource_id(htVo.getSource_id());
			messageSix.setDestination_id(htVo.getDestination_id());
			htBo.setMessageSix(messageSix);
			messageHead = mhbu.generationMessageSixHead(messageSix);
		} else {
			MessageEight messageEight = new MessageEight();
			messageEight.setSource_id(htVo.getSource_id());
			htBo.setMessageEight(messageEight);
			messageHead = mhbu.generationMessageEightHead(messageEight);
		}
		htBo.setMmsi(htVo.getMmsi());
		htBo.setOverallLength(htVo.getOverallLength());
		htBo.setSpeed(htVo.getSpeed());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			htBo.setStartDateTime(sdf.parse(htVo.getStartDateTime()));
			htBo.setEndDateTime(sdf.parse(htVo.getEndDateTime()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		htBo.setPrecautions(htVo.getPrecautions());
		String dac = acbUtil.convertBin(htBo.getDac(), 10);
		String fi = acbUtil.convertBin(htBo.getFi(), 6);
		StringBuffer binary = new StringBuffer();
		binary.append(dac).append(fi);
		binary.append(acbUtil.convertBin(htBo.getMmsi(), 30));
		binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(htVo.getStartLongitudeD(), htVo.getStartLongitudeM(), htVo.getStartLongitudeS(), 105, 10000), 24));
		binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(htVo.getStartLatitudeD(), htVo.getStartLatitudeM(), htVo.getStartLatitudeS(), 4, 10000), 25));
		binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(htVo.getEndLongitudeD(), htVo.getEndLongitudeM(), htVo.getEndLongitudeS(), 105, 10000), 24));
		binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(htVo.getEndLatitudeD(), htVo.getEndLatitudeM(), htVo.getEndLatitudeS(), 4, 10000), 25));
		binary.append(acbUtil.convertBin(htBo.getOverallLength(), 9));
		binary.append(acbUtil.convertBin(htBo.getSpeed(), 6));
		binary.append(acbUtil.convertBin(htBo.getStartDateTime().getMonth()+1, 4));
		binary.append(acbUtil.convertBin(htBo.getStartDateTime().getDate(), 5));
		binary.append(acbUtil.convertBin(htBo.getStartDateTime().getHours(), 5));
		binary.append(acbUtil.convertBin(htBo.getStartDateTime().getMinutes(), 6));
		binary.append(acbUtil.convertBin(htBo.getEndDateTime().getDate(), 5));
		binary.append(acbUtil.convertBin(htBo.getEndDateTime().getHours(), 5));
		binary.append(acbUtil.convertBin(htBo.getEndDateTime().getMinutes(), 6));
		binary.append(acbUtil.convertBin(htBo.getPrecautions(), 4));
		binary.append(acbUtil.convertBin(0, 1));
		List<String> vdmMessageList = new ArrayList<String>();
		log.info(htVo.toString());
		log.info(htBo.toString());
		log.info(binary.toString());
		if (htVo.getMessageNo() == 6) {
			vdmMessageList = serialDataServiceImpl.generationABM(binary.toString(), htBo.getMessageSix());
		} else {
			vdmMessageList = serialDataServiceImpl.generationBBM(binary.toString(), htBo.getMessageEight());
		}
		vdmSocketImpl.sendMessage(vdmMessageList);
		StringBuffer messageSB = new StringBuffer();
		for(String str:vdmMessageList) {
			messageSB.append(str);
		}
		return messageSB.toString();
	}

}
