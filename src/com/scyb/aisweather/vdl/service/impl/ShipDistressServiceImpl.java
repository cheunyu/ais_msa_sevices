/**     
 * @Title: ShipDistressServiceImpl.java    
 * @Package com.scyb.aisweather.vdl.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月6日 下午9:55:45    
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
import com.scyb.aisweather.vdl.bo.NavigationBo;
import com.scyb.aisweather.vdl.bo.ShipDistressBo;
import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;
import com.scyb.aisweather.vdl.service.IShipDistressService;
import com.scyb.aisweather.vdl.util.AscIIConvertBinaryUtil;
import com.scyb.aisweather.vdl.util.ConvertCoordinateUtil;
import com.scyb.aisweather.vdl.util.MessageHeadBinaryUtil;
import com.scyb.aisweather.vdl.vo.ShipDistressVo;

/**   
 * @ClassName: ShipDistressServiceImpl   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月6日 下午9:55:46      
 *    
 */
public class ShipDistressServiceImpl implements IShipDistressService{

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
	 * @param sdVo
	 * @return   
	 * @see com.scyb.aisweather.vdl.service.IShipDistressService#transformVdl(com.scyb.aisweather.vdl.vo.ShipDistressVo)   
	 */
	@Override
	public String transformVdl(ShipDistressVo sdVo) {
		// TODO Auto-generated method stub
		ShipDistressBo sdBo = new ShipDistressBo();
		String messageHead = new String();
		MessageHeadBinaryUtil mhbu = new MessageHeadBinaryUtil();
		// 判断6、8号报文类型
		if (sdVo.getMessageNo() == 6) {
			MessageSix messageSix = new MessageSix();
			messageSix.setSource_id(sdVo.getSource_id());
			messageSix.setDestination_id(sdVo.getDestination_id());
			sdBo.setMessageSix(messageSix);
			messageHead = mhbu.generationMessageSixHead(messageSix);
		} else {
			MessageEight messageEight = new MessageEight();
			messageEight.setSource_id(sdVo.getSource_id());
			sdBo.setMessageEight(messageEight);
			messageHead = mhbu.generationMessageEightHead(messageEight);
		}
		sdBo.setDistressType(sdVo.getDistressType());
		sdBo.setStatusDescribed(sdVo.getStatusDescribed());
		sdBo.setShipType(sdVo.getShipType());
		sdBo.setFarther(sdVo.getFarther());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			sdBo.setDateTime(sdf.parse(sdVo.getDateTime()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sdBo.setReleaseTime(sdVo.getReleaseTime());
		String dac = acbUtil.convertBin(sdBo.getDac(), 10);
		String fi = acbUtil.convertBin(sdBo.getFi(), 6);
		StringBuffer binary = new StringBuffer();
		binary.append(dac).append(fi);
		binary.append(acbUtil.convertBin(sdBo.getDistressType(), 4));
		binary.append(acbUtil.convertBin(sdBo.getStatusDescribed(), 4));
		binary.append(acbUtil.convertBin(sdBo.getShipType(), 3));
		binary.append(acbUtil.convertBin(sdBo.getFarther(), 4));
		binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(sdVo.getLongitudeD(), sdVo.getLongitudeM(), sdVo.getLongitudeS(), 105, 10000), 24));
		binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(sdVo.getLatitudeD(), sdVo.getLatitudeM(), sdVo.getLatitudeS(), 4, 10000), 25));
		binary.append(acbUtil.convertBin(sdBo.getDateTime().getMonth()+1, 4));
		binary.append(acbUtil.convertBin(sdBo.getDateTime().getDate(), 5));
		binary.append(acbUtil.convertBin(sdBo.getDateTime().getHours(), 5));
		binary.append(acbUtil.convertBin(sdBo.getDateTime().getMinutes(), 6));
		binary.append(acbUtil.convertBin(sdBo.getReleaseTime(), 6));
		binary.append(acbUtil.convertBin(0, 6));
		List<String> vdmMessageList = new ArrayList<String>();
		log.info(sdVo.toString());
		log.info(sdBo.toString());
		log.info(binary.toString());
		if (sdVo.getMessageNo() == 6) {
			vdmMessageList = serialDataServiceImpl.generationABM(binary.toString(), sdBo.getMessageSix());
		} else {
			vdmMessageList = serialDataServiceImpl.generationBBM(binary.toString(), sdBo.getMessageEight());
		}
		vdmSocketImpl.sendMessage(vdmMessageList);
		StringBuffer messageSB = new StringBuffer();
		for(String str:vdmMessageList) {
			messageSB.append(str);
		}
		return messageSB.toString();
	}

}
