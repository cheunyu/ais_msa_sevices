/**     
 * @Title: DemarcatedAreaServiceImpl.java    
 * @Package com.scyb.aisweather.vdl.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月6日 下午10:29:24    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;

import com.scyb.aisweather.serial.service.ISerialDataService;
import com.scyb.aisweather.socket.service.IVDMSocket;
import com.scyb.aisweather.vdl.bo.ConstructionWorkBo;
import com.scyb.aisweather.vdl.bo.DemarcatedAreaBo;
import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;
import com.scyb.aisweather.vdl.service.IDemarcatedAreaService;
import com.scyb.aisweather.vdl.util.AscIIConvertBinaryUtil;
import com.scyb.aisweather.vdl.util.ConvertCoordinateUtil;
import com.scyb.aisweather.vdl.util.MessageHeadBinaryUtil;
import com.scyb.aisweather.vdl.vo.DemarcatedAreaVo;

/**   
 * @ClassName: DemarcatedAreaServiceImpl   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月6日 下午10:29:24      
 *    
 */
public class DemarcatedAreaServiceImpl implements IDemarcatedAreaService {

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
	 * @param daVo
	 * @return   
	 * @see com.scyb.aisweather.vdl.service.IDemarcatedAreaService#transformVdl(com.scyb.aisweather.vdl.vo.DemarcatedAreaVo)   
	 */
	@Override
	public String transformVdl(DemarcatedAreaVo daVo) {
		// TODO Auto-generated method stub
		DemarcatedAreaBo daBo = new DemarcatedAreaBo();
		BeanUtils.copyProperties(daVo, daBo);
		String messageHead = new String();
		MessageHeadBinaryUtil mhbu = new MessageHeadBinaryUtil();
		// 判断6、8号报文类型
		if (daVo.getMessageNo() == 6) {
			MessageSix messageSix = new MessageSix();
			messageSix.setSource_id(daVo.getSource_id());
			messageSix.setDestination_id(daVo.getDestination_id());
			daBo.setMessageSix(messageSix);
			messageHead = mhbu.generationMessageSixHead(messageSix);
		} else {
			MessageEight messageEight = new MessageEight();
			messageEight.setSource_id(daVo.getSource_id());
			daBo.setMessageEight(messageEight);
			messageHead = mhbu.generationMessageEightHead(messageEight);
		}
		String dac = acbUtil.convertBin(DemarcatedAreaBo.getDac(), 10);
		String fi = acbUtil.convertBin(DemarcatedAreaBo.getFi(), 6);
		StringBuffer binary = new StringBuffer();
		binary.append(dac).append(fi);
		binary.append(acbUtil.convertBin(daBo.getAreaType(), 4));
		binary.append(acbUtil.convertBin(daBo.getAreaFeature(), 2));
		//圆形
		if(daBo.getAreaFeature() == 1) {
			binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(daVo.getRoundLongitudeD(), daVo.getRoundLatitudeM(), daVo.getRoundLatitudeS(), 105, 10000), 24));
			binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(daVo.getRoundLatitudeD(), daVo.getRoundLatitudeM(), daVo.getRoundLatitudeS(), 4, 10000), 25));
			binary.append(acbUtil.convertBin(daBo.getRadius(), 7));
			binary.append(acbUtil.convertBin(0, 42));
		}else {
			binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(daVo.getRectangleEndLongitudeD(), daVo.getRectangleEndLongitudeM(), daVo.getRectangleEndLongitudeS(), 105, 10000), 24));
			binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(daVo.getRectangleEndLatitudeD(), daVo.getRectangleEndLatitudeM(), daVo.getRectangleEndLatitudeS(), 4, 10000), 25));
			binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(daVo.getRectangleStartLongitudeD(), daVo.getRectangleStartLongitudeM(), daVo.getRectangleStartLongitudeS(), 105, 10000), 24));
			binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(daVo.getRectangleStartLatitudeD(), daVo.getRectangleStartLatitudeM(), daVo.getRectangleStartLatitudeS(), 4, 10000), 25));
		}
		binary.append(acbUtil.convertBin(daBo.getStartDateTime().getMonth()+1, 4));
		binary.append(acbUtil.convertBin(daBo.getStartDateTime().getDate(), 5));
		binary.append(acbUtil.convertBin(daBo.getStartDateTime().getHours(), 5));
		binary.append(acbUtil.convertBin(daBo.getStartDateTime().getMinutes(), 6));
		binary.append(acbUtil.convertBin(daBo.getEndDateTime().getMonth(), 4));
		binary.append(acbUtil.convertBin(daBo.getEndDateTime().getDate(), 5));
		binary.append(acbUtil.convertBin(daBo.getEndDateTime().getHours(), 5));
		binary.append(acbUtil.convertBin(daBo.getFarther(), 4));
		binary.append(acbUtil.convertBin(0, 2));
		List<String> vdmMessageList = new ArrayList<String>();
		log.info(daVo.toString());
		log.info(daBo.toString());
		log.info(binary.toString());
		if (daVo.getMessageNo() == 6) {
			vdmMessageList = serialDataServiceImpl.generationABM(binary.toString(), daBo.getMessageSix());
		} else {
			vdmMessageList = serialDataServiceImpl.generationBBM(binary.toString(), daBo.getMessageEight());
		}
		vdmSocketImpl.sendMessage(vdmMessageList);
		StringBuffer messageSB = new StringBuffer();
		for(String str:vdmMessageList) {
			messageSB.append(str);
		}
		return messageSB.toString();
	}

}
