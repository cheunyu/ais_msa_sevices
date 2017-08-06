/**     
 * @Title: DemarcatedIrregulaAreaServiceImpl.java    
 * @Package com.scyb.aisweather.vdl.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月7日 下午4:35:58    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;

import com.scyb.aisweather.serial.service.ISerialDataService;
import com.scyb.aisweather.socket.service.IVDMSocket;
import com.scyb.aisweather.vdl.bo.DemarcatedAreaBo;
import com.scyb.aisweather.vdl.bo.DemarcatedIrregulaAreaBo;
import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;
import com.scyb.aisweather.vdl.service.IDemarcatedIrregulaAreaService;
import com.scyb.aisweather.vdl.util.AscIIConvertBinaryUtil;
import com.scyb.aisweather.vdl.util.ConvertCoordinateUtil;
import com.scyb.aisweather.vdl.util.MessageHeadBinaryUtil;
import com.scyb.aisweather.vdl.vo.DemarcatedIrregulaAreaVo;

/**   
 * @ClassName: DemarcatedIrregulaAreaServiceImpl   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月7日 下午4:35:58      
 *    
 */
public class DemarcatedIrregulaAreaServiceImpl implements
		IDemarcatedIrregulaAreaService {

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
	 * @param diaVo
	 * @return   
	 * @see com.scyb.aisweather.vdl.service.IDemarcatedIrregulaAreaService#transformVdl(com.scyb.aisweather.vdl.vo.DemarcatedIrregulaAreaVo)   
	 */
	@Override
	public String transformVdl(DemarcatedIrregulaAreaVo diaVo) {
		// TODO Auto-generated method stub
		DemarcatedIrregulaAreaBo diaBo = new DemarcatedIrregulaAreaBo();
		BeanUtils.copyProperties(diaVo, diaBo);
		String messageHead = new String();
		MessageHeadBinaryUtil mhbu = new MessageHeadBinaryUtil();
		// 判断6、8号报文类型
		if (diaVo.getMessageNo() == 6) {
			MessageSix messageSix = new MessageSix();
			messageSix.setSource_id(diaVo.getSource_id());
			messageSix.setDestination_id(diaVo.getDestination_id());
			diaBo.setMessageSix(messageSix);
			messageHead = mhbu.generationMessageSixHead(messageSix);
		} else {
			MessageEight messageEight = new MessageEight();
			messageEight.setSource_id(diaVo.getSource_id());
			diaBo.setMessageEight(messageEight);
			messageHead = mhbu.generationMessageEightHead(messageEight);
		}
		String dac = acbUtil.convertBin(DemarcatedIrregulaAreaBo.getDac(), 10);
		String fi = acbUtil.convertBin(DemarcatedIrregulaAreaBo.getFi(), 6);
		StringBuffer binary = new StringBuffer();
		binary.append(dac).append(fi);
		binary.append(acbUtil.convertBin(diaBo.getAreaType(), 4));
		for(int i=0; i<diaBo.getLatitudeDList().size(); i++) {
			binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(diaBo.getLongitudeDList().get(i), diaBo.getLongitudeMList().get(i), diaBo.getLongitudeSList().get(i), 105, 10000), 24));
			binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(diaBo.getLatitudeDList().get(i), diaBo.getLatitudeMList().get(i), diaBo.getLatitudeSList().get(i), 4, 10000), 25));
		}
		binary.append(acbUtil.convertBin(diaBo.getStartDateTime().getMonth()+1, 4));
		binary.append(acbUtil.convertBin(diaBo.getStartDateTime().getDate(), 5));
		binary.append(acbUtil.convertBin(diaBo.getStartDateTime().getHours(), 5));
		binary.append(acbUtil.convertBin(diaBo.getStartDateTime().getMinutes(), 6));
		binary.append(acbUtil.convertBin(diaBo.getEndDateTime().getMonth(), 4));
		binary.append(acbUtil.convertBin(diaBo.getEndDateTime().getDate(), 5));
		binary.append(acbUtil.convertBin(diaBo.getEndDateTime().getHours(), 5));
		if (binary.toString().length() % 8 != 0) {
			for (int i = 0; i < binary.toString().length() % 8; i++) {
				binary.append("0");
			}
		}
		List<String> vdmMessageList = new ArrayList<String>();
		log.info(diaVo.toString());
		log.info(diaBo.toString());
		log.info(binary.toString());
		if (diaVo.getMessageNo() == 6) {
			vdmMessageList = serialDataServiceImpl.generationABM(binary.toString(), diaBo.getMessageSix());
		} else {
			vdmMessageList = serialDataServiceImpl.generationBBM(binary.toString(), diaBo.getMessageEight());
		}
		vdmSocketImpl.sendMessage(vdmMessageList);
		StringBuffer messageSB = new StringBuffer();
		for(String str:vdmMessageList) {
			messageSB.append(str);
		}
		return messageSB.toString();
	}

}
