/**     
 * @Title: HydrologyWeatherForecastServiceImpl.java    
 * @Package com.scyb.aisweather.vdl.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月4日 下午7:55:47    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;

import com.scyb.aisweather.serial.service.ISerialDataService;
import com.scyb.aisweather.socket.service.IVDMSocket;
import com.scyb.aisweather.vdl.bo.HydrologyWeatherForecastBo;
import com.scyb.aisweather.vdl.bo.MarineEnvironmentForecastBo;
import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;
import com.scyb.aisweather.vdl.service.IHydrologyWeatherForecastService;
import com.scyb.aisweather.vdl.util.AscIIConvertBinaryUtil;
import com.scyb.aisweather.vdl.util.ConvertCoordinateUtil;
import com.scyb.aisweather.vdl.util.MessageHeadBinaryUtil;
import com.scyb.aisweather.vdl.vo.HydrologyWeatherForecastVo;
import com.scyb.aisweather.vdl.vo.MarineWeatherForecastVo;

/**
 *      @ClassName: HydrologyWeatherForecastServiceImpl   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年10月4日 下午7:55:47           
 */
public class HydrologyWeatherForecastServiceImpl implements
		IHydrologyWeatherForecastService {

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
	 *     @param hwfVo  @return     @see
	 * com.scyb.aisweather.vdl.service.IHydrologyWeatherForecastService
	 * #transformVdl(com.scyb.aisweather.vdl.vo.HydrologyWeatherForecastVo)   
	 */
	@Override
	public String transformVdl(HydrologyWeatherForecastVo hwfVo) {
		// TODO Auto-generated method stub
		HydrologyWeatherForecastBo hwfBo = new HydrologyWeatherForecastBo();
		BeanUtils.copyProperties(hwfVo, hwfBo);
		String messageHead = new String();
		MessageHeadBinaryUtil mhbu = new MessageHeadBinaryUtil();
		// 判断6、8号报文类型
		if (hwfVo.getMessageNo() == 6) {
			MessageSix messageSix = new MessageSix();
			messageSix.setSource_id(hwfVo.getSource_id());
			messageSix.setDestination_id(hwfVo.getDestination_id());
			hwfBo.setMessageSix(messageSix);
			messageHead = mhbu.generationMessageSixHead(messageSix);
		} else {
			MessageEight messageEight = new MessageEight();
			messageEight.setSource_id(hwfVo.getSource_id());
			hwfBo.setMessageEight(messageEight);
			messageHead = mhbu.generationMessageEightHead(messageEight);
		}
		//模拟预报时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		String time = null;
		try {
			time = acbUtil.convertBin(sdf.parse(hwfBo.getForecastDateTime()).getHours(), 5);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String dac = acbUtil.convertBin(hwfBo.getDac(), 10);
		String fi = acbUtil.convertBin(hwfBo.getFi(), 6);
		hwfBo.setLatitudeList(ccUtil.dmsToDecimal(hwfVo.getLatitudeDList(), hwfVo.getLatitudeMList(), hwfVo.getLatitudeSList()));
		hwfBo.setLongitudeList(ccUtil.dmsToDecimal(hwfVo.getLongitudeDList(), hwfVo.getLongitudeMList(), hwfVo.getLongitudeSList()));
		hwfBo.setHighTideTimeList(hwfVo.getHighTideTime());
		hwfBo.setLowTideTimeList(hwfVo.getLowTideTime());
		hwfBo.setTideList(hwfVo.getTide());
		StringBuffer binary = new StringBuffer();
		binary.append(dac).append(fi).append(time);
		for (int i = 0; i < hwfBo.getLatitudeList().size(); i++) {
			binary.append(acbUtil.convertBin((int) (Math.round((Double.parseDouble(hwfBo.getLongitudeList().get(i)) - 105)*60)), 11));
			binary.append(acbUtil.convertBin((int) (Math.round((Double.parseDouble(hwfBo.getLatitudeList().get(i)) - 8)*60)), 11));
			try {
				binary.append(acbUtil.convertBin(sdf.parse(hwfBo.getHighTideTimeList().get(i)).getDate(), 5));
				binary.append(acbUtil.convertBin(sdf.parse(hwfBo.getHighTideTimeList().get(i)).getHours(), 5));
				binary.append(acbUtil.convertBin(sdf.parse(hwfBo.getHighTideTimeList().get(i)).getMinutes(), 6));
				binary.append(acbUtil.convertBin(sdf.parse(hwfBo.getLowTideTimeList().get(i)).getDate(), 5));
				binary.append(acbUtil.convertBin(sdf.parse(hwfBo.getLowTideTimeList().get(i)).getHours(), 5));
				binary.append(acbUtil.convertBin(sdf.parse(hwfBo.getLowTideTimeList().get(i)).getMinutes(), 6));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			binary.append(acbUtil.convertBin((int)(hwfBo.getTideList().get(i)*10), 8));
		}
		if (binary.toString().length() % 8 != 0) {
			for (int i = 0; i < binary.toString().length() % 8; i++) {
				binary.append("0");
			}
		}
		List<String> vdmMessageList = new ArrayList<String>();
		log.info(hwfVo.toString());
		log.info(hwfBo.toString());
		log.info(binary.toString());
		if (hwfVo.getMessageNo() == 6) {
			vdmMessageList = serialDataServiceImpl.generationABM(binary.toString(), hwfBo.getMessageSix());
		} else {
			vdmMessageList = serialDataServiceImpl.generationBBM(binary.toString(), hwfBo.getMessageEight());
		}
		vdmSocketImpl.sendMessage(vdmMessageList);
		StringBuffer messageSB = new StringBuffer();
		for(String str:vdmMessageList) {
			messageSB.append(str);
		}
		return messageSB.toString();
	}

}
