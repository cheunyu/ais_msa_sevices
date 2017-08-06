/**     
 * @Title: NavigationServiceImpl.java    
 * @Package com.scyb.aisweather.vdl.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月5日 下午9:39:25    
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
import com.scyb.aisweather.vdl.bo.NavigationBo;
import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;
import com.scyb.aisweather.vdl.service.INavigationService;
import com.scyb.aisweather.vdl.util.AscIIConvertBinaryUtil;
import com.scyb.aisweather.vdl.util.ConvertCoordinateUtil;
import com.scyb.aisweather.vdl.util.MessageHeadBinaryUtil;
import com.scyb.aisweather.vdl.vo.AidsMarkedDynamicVo;
import com.scyb.aisweather.vdl.vo.NavigationVo;

/**   
 * @ClassName: NavigationServiceImpl   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月5日 下午9:39:25      
 *    
 */
public class NavigationServiceImpl implements INavigationService {

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
	 * @param navVo
	 * @return   
	 * @see com.scyb.aisweather.vdl.service.INavigationService#transformVdl(com.scyb.aisweather.vdl.vo.NavigationVo)   
	 */
	@Override
	public String transformVdl(NavigationVo navVo) {
		// TODO Auto-generated method stub
		NavigationBo navBo = new NavigationBo();
		String messageHead = new String();
		MessageHeadBinaryUtil mhbu = new MessageHeadBinaryUtil();
		// 判断6、8号报文类型
		if (navVo.getMessageNo() == 6) {
			MessageSix messageSix = new MessageSix();
			messageSix.setSource_id(navVo.getSource_id());
			messageSix.setDestination_id(navVo.getDestination_id());
			navBo.setMessageSix(messageSix);
			messageHead = mhbu.generationMessageSixHead(messageSix);
		} else {
			MessageEight messageEight = new MessageEight();
			messageEight.setSource_id(navVo.getSource_id());
			navBo.setMessageEight(messageEight);
			messageHead = mhbu.generationMessageEightHead(messageEight);
		}
		navBo.setType(navVo.getType());
		navBo.setRadius((int)(navVo.getRadius()*10));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			navBo.setTime1(sdf.parse(navVo.getTime1()));
			navBo.setTime2(sdf.parse(navVo.getTime2()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		navBo.setFarther(navVo.getFarther());
		String dac = acbUtil.convertBin(navBo.getDac(), 10);
		String fi = acbUtil.convertBin(navBo.getFi(), 6);
		StringBuffer binary = new StringBuffer();
		binary.append(dac).append(fi);
		binary.append(acbUtil.convertBin(navBo.getType(), 4));
		binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(navVo.getLongitudeD(), navVo.getLongitudeM(), navVo.getLongitudeS(), 105, 10000), 24));
		binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(navVo.getLatitudeD(), navVo.getLatitudeM(), navVo.getLatitudeS(), 4, 10000), 25));
		binary.append(acbUtil.convertBin(navBo.getRadius(), 7));
		binary.append(acbUtil.convertBin(navBo.getTime1().getMonth()+1, 4));
		binary.append(acbUtil.convertBin(navBo.getTime1().getDate(), 5));
		binary.append(acbUtil.convertBin(navBo.getTime1().getHours(), 5));
		binary.append(acbUtil.convertBin(navBo.getTime1().getMinutes(), 6));
		binary.append(acbUtil.convertBin(navBo.getTime2().getMonth()+1, 4));
		binary.append(acbUtil.convertBin(navBo.getTime2().getDate(), 5));
		binary.append(acbUtil.convertBin(navBo.getTime2().getHours(), 5));
		binary.append(acbUtil.convertBin(navBo.getTime2().getMinutes(), 6));
		binary.append(acbUtil.convertBin(navBo.getFarther(), 4));
		List<String> vdmMessageList = new ArrayList<String>();
		log.info(navVo.toString());
		log.info(navBo.toString());
		log.info(binary.toString());
		if (navVo.getMessageNo() == 6) {
			vdmMessageList = serialDataServiceImpl.generationABM(binary.toString(), navBo.getMessageSix());
		} else {
			vdmMessageList = serialDataServiceImpl.generationBBM(binary.toString(), navBo.getMessageEight());
		}
		vdmSocketImpl.sendMessage(vdmMessageList);
		StringBuffer messageSB = new StringBuffer();
		for(String str:vdmMessageList) {
			messageSB.append(str);
		}
		return messageSB.toString();
	}

}
