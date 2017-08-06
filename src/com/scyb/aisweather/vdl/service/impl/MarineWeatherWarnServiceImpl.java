/**     
 * @Title: MarineWeatherWarnServiceImpl.java    
 * @Package com.scyb.aisweather.vdl.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月25日 下午2:43:32    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.scyb.aisweather.serial.service.ISerialDataService;
import com.scyb.aisweather.socket.service.IVDMSocket;
import com.scyb.aisweather.vdl.bo.MarineEnvironmentForecastBo;
import com.scyb.aisweather.vdl.bo.MarineWeatherWarnBo;
import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;
import com.scyb.aisweather.vdl.service.IMarineWeatherWarnService;
import com.scyb.aisweather.vdl.util.AscIIConvertBinaryUtil;
import com.scyb.aisweather.vdl.util.ConvertCoordinateUtil;
import com.scyb.aisweather.vdl.util.MessageHeadBinaryUtil;
import com.scyb.aisweather.vdl.vo.MarineWeatherWarnVo;

/**   
 * @ClassName: MarineWeatherWarnServiceImpl   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年9月25日 下午2:43:32      
 *    
 */
public class MarineWeatherWarnServiceImpl implements IMarineWeatherWarnService {

	private Logger log = Logger.getLogger(this.getClass());
	private ConvertCoordinateUtil ccUtil = new ConvertCoordinateUtil();
	private AscIIConvertBinaryUtil acbUtil = new AscIIConvertBinaryUtil();
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
	 * @param mwwVo   
	 * @see com.scyb.aisweather.vdl.service.IMarineWeatherWarnService#transformVdl(com.scyb.aisweather.vdl.vo.MarineWeatherWarnVo)   
	 */
	@Override
	public String transformVdl(MarineWeatherWarnVo mwwVo) {
		// TODO Auto-generated method stub
		MarineWeatherWarnBo mwwBo = new MarineWeatherWarnBo();
		MessageHeadBinaryUtil mhbu = new MessageHeadBinaryUtil();
		StringBuffer messageHead = new StringBuffer();
		if(mwwVo.getMessageNo() == 6) {
			MessageSix messageSix = new MessageSix();
			messageSix.setSource_id(mwwVo.getSource_id());
			messageSix.setDestination_id(mwwVo.getDestination_id());
			mwwBo.setMessageSix(messageSix);
			messageHead.append(mhbu.generationMessageSixHead(messageSix));
		}else {
			MessageEight messageEight = new MessageEight();
			messageEight.setSource_id(mwwVo.getSource_id());
			mwwBo.setMessageEight(messageEight);
			messageHead.append(mhbu.generationMessageEightHead(messageEight));
		}
		mwwBo.setWarnType(mwwVo.getWarnType());
		String dac = acbUtil.convertBin(MarineWeatherWarnBo.getDac(), 10);
		String fi = acbUtil.convertBin(MarineWeatherWarnBo.getFi(), 6);
		StringBuffer binary = new StringBuffer();
		binary.append(dac).append(fi).append(acbUtil.convertBin(mwwBo.getWarnType(), 4));
		switch (mwwBo.getWarnType()) {
			case 1:	//热带气旋
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(mwwVo.getTropicalCycloneLond(), mwwVo.getTropicalCycloneLonm(), mwwVo.getTropicalCycloneLons(), 105, 1000), 21));
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(mwwVo.getTropicalCycloneLatd(), mwwVo.getTropicalCycloneLatm(), mwwVo.getTropicalCycloneLats(), 4, 1000), 22));
				binary.append(acbUtil.convertBin(mwwBo.getWarnType(), 3));
				binary.append(acbUtil.convertBin(mwwVo.getTropicalCycloneRad(), 8));
				binary.append(acbUtil.convertBin(mwwVo.getTropicalCycloneSpeed(), 6));
				binary.append(acbUtil.convertBin(mwwVo.getTropicalCycloneDirection(), 9));
				binary.append(acbUtil.convertBin(mwwVo.getTropicalCycloneWindPower(), 5));
				binary.append(acbUtil.convertBin(0, 10));
				break;
			case 2: //大风预警
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(mwwVo.getWindWarnLond(), mwwVo.getWindWarnLonm(), mwwVo.getWindWarnLons(), 105, 1000), 21));
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(mwwVo.getWindWarnLatd(), mwwVo.getWindWarnLatm(), mwwVo.getWindWarnLats(), 4, 1000), 22));
				binary.append(acbUtil.convertBin(mwwVo.getWindWarnRad(), 8));
				binary.append(acbUtil.convertBin(mwwVo.getWindWarnMinWindPower(), 5));
				binary.append(acbUtil.convertBin(mwwVo.getWindWarnMaxWindPower(), 5));
				binary.append(acbUtil.convertBin(mwwVo.getWindWarnDirection(), 4));
				binary.append(acbUtil.convertBin(0, 19));
				break;
			case 3: //大浪预警
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(mwwVo.getWaveWarnLond(), mwwVo.getWaveWarnLonm(), mwwVo.getWaveWarnLons(), 105, 1000), 21));
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(mwwVo.getWaveWarnLatd(), mwwVo.getWaveWarnLatm(), mwwVo.getWaveWarnLats(), 4, 1000), 22));
				binary.append(acbUtil.convertBin(mwwVo.getWaveWarnRad(), 8));
				binary.append(acbUtil.convertBin(mwwVo.getWaveWarnHs(), 5));
				binary.append(acbUtil.convertBin(mwwVo.getWaveWarnPeriod(), 13));
				binary.append(acbUtil.convertBin(0, 15));
				break;
			case 4: //大雾预警
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(mwwVo.getFogWarnLond(), mwwVo.getFogWarnLonm(), mwwVo.getFogWarnLons(), 105, 1000), 21));
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(mwwVo.getFogWarnLatd(), mwwVo.getFogWarnLatm(), mwwVo.getFogWarnLats(), 4, 1000), 22));
				binary.append(acbUtil.convertBin(mwwVo.getFogWarnRad(), 9));
				binary.append(acbUtil.convertBin(mwwVo.getFogWarnVisibility(), 8));
				binary.append(acbUtil.convertBin(0, 24));
				break;
			case 5: //风暴潮预警
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(mwwVo.getStormSurgeWarnLond(), mwwVo.getStormSurgeWarnLonm(), mwwVo.getStormSurgeWarnLons(), 105, 1000), 21));
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(mwwVo.getStormSurgeWarnLatd(), mwwVo.getStormSurgeWarnLatm(), mwwVo.getStormSurgeWarnLats(), 4, 1000), 22));
				binary.append(acbUtil.convertBin(mwwVo.getStormSurgeWarnRad(), 9));
				binary.append(acbUtil.convertBin(mwwVo.getStormSurgeWarnIncreasWater(), 9));
				binary.append(acbUtil.convertBin(mwwVo.getStormSurgeWarnTide(), 10));
				binary.append(acbUtil.convertBin(mwwVo.getStormSurgeWarnWavePeriod(), 13));
				break;
			case 6: //海冰预警
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(mwwVo.getSeaIceWarnLond(), mwwVo.getSeaIceWarnLonm(), mwwVo.getSeaIceWarnLons(), 105, 1000), 21));
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(mwwVo.getSeaIceWarnLatd(), mwwVo.getSeaIceWarnLatm(), mwwVo.getSeaIceWarnLats(), 4, 1000), 22));
				binary.append(acbUtil.convertBin(mwwVo.getSeaIceWarnRad(), 9));
				binary.append(acbUtil.convertBin(mwwVo.getSeaIceWarnThickness(), 5));
				binary.append(acbUtil.convertBin(0, 27));
				break;
			case 7: //寒潮预警
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(mwwVo.getColdWarnLond(), mwwVo.getColdWarnLonm(), mwwVo.getColdWarnLons(), 105, 1000), 21));
				binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(mwwVo.getColdWarnLatd(), mwwVo.getColdWarnLatm(), mwwVo.getColdWarnLats(), 4, 1000), 22));
				binary.append(acbUtil.convertBin(mwwVo.getColdWarnRad(), 9));
				binary.append(acbUtil.convertBin(mwwVo.getColdWarnLevel(), 3));
				binary.append(acbUtil.convertBin(0, 29));
				break;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date warnDateTime = null;
		try {
			warnDateTime = sdf.parse(mwwVo.getWarnDateTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		binary.append(acbUtil.convertBin(warnDateTime.getMonth()+1, 4));
		binary.append(acbUtil.convertBin(warnDateTime.getDate(), 5));
		binary.append(acbUtil.convertBin(warnDateTime.getHours(), 5));
		binary.append(acbUtil.convertBin(warnDateTime.getMinutes(), 6));
		binary.append(acbUtil.convertBin(mwwVo.getTimeRange(), 6));
		binary.append(acbUtil.convertBin(0, 6));
		List<String> vdmMessageList = new ArrayList<String>();
		if (mwwVo.getMessageNo() == 6) {
			vdmMessageList = serialDataServiceImpl.generationABM(binary.toString(), mwwBo.getMessageSix());
		} else {
			vdmMessageList = serialDataServiceImpl.generationBBM(binary.toString(), mwwBo.getMessageEight());
		}
		vdmSocketImpl.sendMessage(vdmMessageList);
		StringBuffer messageSB = new StringBuffer();
		for(String str:vdmMessageList) {
			messageSB.append(str);
		}
		return messageSB.toString();
	}

}
