/**     
 * @Title: AidsMarkedDynamicServiceImpl.java    
 * @Package com.scyb.aisweather.vdl.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月5日 下午1:11:26    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.scyb.aisweather.serial.service.ISerialDataService;
import com.scyb.aisweather.socket.service.IVDMSocket;
import com.scyb.aisweather.vdl.bo.AidsMarkedDynamicBo;
import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;
import com.scyb.aisweather.vdl.service.IAidsMarkedDynamicService;
import com.scyb.aisweather.vdl.util.AscIIConvertBinaryUtil;
import com.scyb.aisweather.vdl.util.ConvertCoordinateUtil;
import com.scyb.aisweather.vdl.util.MessageHeadBinaryUtil;
import com.scyb.aisweather.vdl.vo.AidsMarkedDynamicVo;

/**   
 * @ClassName: AidsMarkedDynamicServiceImpl   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月5日 下午1:11:26      
 *    
 */
public class AidsMarkedDynamicServiceImpl implements IAidsMarkedDynamicService {

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
	 * @param amdVo
	 * @return   
	 * @see com.scyb.aisweather.vdl.service.IAidsMarkedDynamicService#transformVdl(com.scyb.aisweather.vdl.vo.AidsMarkedDynamicVo)   
	 */
	@Override
	public String transformVdl(AidsMarkedDynamicVo amdVo) {
		// TODO Auto-generated method stub
		AidsMarkedDynamicBo amdBo = new AidsMarkedDynamicBo();
		String messageHead = new String();
		MessageHeadBinaryUtil mhbu = new MessageHeadBinaryUtil();
		// 判断6、8号报文类型
		if (amdVo.getMessageNo() == 6) {
			MessageSix messageSix = new MessageSix();
			messageSix.setSource_id(amdVo.getSource_id());
			messageSix.setDestination_id(amdVo.getDestination_id());
			amdBo.setMessageSix(messageSix);
			messageHead = mhbu.generationMessageSixHead(messageSix);
		} else {
			MessageEight messageEight = new MessageEight();
			messageEight.setSource_id(amdVo.getSource_id());
			amdBo.setMessageEight(messageEight);
			messageHead = mhbu.generationMessageEightHead(messageEight);
		}
		amdBo.setType(amdVo.getType());
		//移位应用
//		amdBo.setShiftStartLatitude(ccUtil.dmsToDecimal(amdVo.getShiftStartLatitudeD(), amdVo.getShiftStartLatitudeM(), amdVo.getShiftStartLatitudeS()));
//		amdBo.setShiftStartLongitude(ccUtil.dmsToDecimal(amdVo.getShiftStartLongitudeD(), amdVo.getShiftStartLatitudeM(), amdVo.getShiftStartLatitudeS()));
//		amdBo.setShiftEndLatitude(ccUtil.dmsToDecimal(amdVo.getShiftEndLatitudeD(), amdVo.getShiftEndLatitudeM(), amdVo.getShiftEndLatitudeS()));
//		amdBo.setShiftEndLongitude(ccUtil.dmsToDecimal(amdVo.getShiftEndLongitudeD(), amdVo.getShiftEndLongitudeM(), amdVo.getShiftEndLongitudeS()));
		amdBo.setShiftType(amdVo.getShiftType());
		//DGPS应用
		amdBo.setDgpsLaunch((int)(amdVo.getDgpsLaunch()*10));
//		amdBo.setDgpsLaunch(3116);
		//灯质改变应用
		amdBo.setLightType(amdVo.getLightType());
		amdBo.setLightColor(amdVo.getLightColor());
		amdBo.setLightCycle(amdVo.getLightCycle());
		amdBo.setRhythmName(amdVo.getRhythmName());
		amdBo.setRhythmParameters(amdVo.getRhythmParameters());
		//other
		amdBo.setOtherType(amdVo.getOtherType());
		
		String dac = acbUtil.convertBin(amdBo.getDac(), 10);
		String fi = acbUtil.convertBin(amdBo.getFi(), 6);
		String type = acbUtil.convertBin(amdBo.getType(), 4);
		StringBuffer binary = new StringBuffer();
		binary.append(dac).append(fi).append(type);
		switch(amdBo.getType()) {
			//移位应用
			case 6:
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(amdVo.getShiftStartLongitudeD(), amdVo.getShiftStartLongitudeM(), amdVo.getShiftStartLongitudeS(), 105, 10000), 24));
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(amdVo.getShiftStartLatitudeD(), amdVo.getShiftStartLatitudeM(), amdVo.getShiftStartLatitudeS(), 4, 10000), 25));
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(amdVo.getShiftEndLongitudeD(), amdVo.getShiftEndLongitudeM(), amdVo.getShiftEndLongitudeS(), 105, 10000), 24));
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(amdVo.getShiftEndLatitudeD(), amdVo.getShiftEndLatitudeM(), amdVo.getShiftEndLatitudeS(), 4, 10000), 25));
				binary.append(acbUtil.convertBin(amdBo.getShiftType(), 5));
				break;
			//DGPS
			case 8:
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(amdVo.getDgpsLongitudeD(), amdVo.getDgpsLongitudeM(), amdVo.getDgpsLongitudeS(), 105, 10000), 24));
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(amdVo.getDgpsLatitudeD(), amdVo.getDgpsLongitudeM(), amdVo.getDgpsLongitudeS(), 4, 10000), 25));
				binary.append(acbUtil.convertBin(amdBo.getDgpsLaunch() * 10, 12));
				binary.append(acbUtil.convertBin(0, 42));
				break;
			//light
			case 7:
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(amdVo.getLightLongitudeD(), amdVo.getLightLongitudeM(), amdVo.getLightLongitudeS(), 105, 10000), 24));
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(amdVo.getLightLatitudeD(), amdVo.getLightLatitudeM(), amdVo.getLightLatitudeS(), 4, 10000), 25));
				binary.append(acbUtil.convertBin(amdBo.getLightType(), 5));
				binary.append(acbUtil.convertBin(amdBo.getRhythmName(), 5));
				binary.append(acbUtil.convertBin(amdBo.getRhythmParameters(), 5));
				binary.append(acbUtil.convertBin(amdBo.getLightColor(), 5));
				binary.append(acbUtil.convertBin(amdBo.getLightCycle(), 4));
				binary.append(acbUtil.convertBin(0, 30));
				break;
			default:
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(amdVo.getOtherLongitudeD(), amdVo.getOtherLongitudeM(), amdVo.getOtherLongitudeS(), 105, 10000), 24));
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(amdVo.getOtherLatitudeD(), amdVo.getOtherLatitudeM(), amdVo.getOtherLatitudeS(), 4, 10000), 25));
				binary.append(acbUtil.convertBin(amdBo.getOtherType(), 5));
				binary.append(acbUtil.convertBin(0, 49));
				break;
		}
		binary.append(acbUtil.convertBin(amdVo.getPublishRange(), 6));
		binary.append(acbUtil.convertBin(0, 5));
		log.info(amdVo.toString());
		log.info(amdBo.toString());
		log.info(binary.toString());
		List<String> vdmMessageList = new ArrayList<String>();
		if (amdVo.getMessageNo() == 6) {
			vdmMessageList = serialDataServiceImpl.generationABM(binary.toString(), amdBo.getMessageSix());
		} else {
			vdmMessageList = serialDataServiceImpl.generationBBM(binary.toString(), amdBo.getMessageEight());
		}
		vdmSocketImpl.sendMessage(vdmMessageList);
		StringBuffer messageSB = new StringBuffer();
		for(String str:vdmMessageList) {
			messageSB.append(str);
		}
		return messageSB.toString();
	}

}
