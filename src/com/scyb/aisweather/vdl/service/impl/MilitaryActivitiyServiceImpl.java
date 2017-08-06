/**     
 * @Title: MilitaryActivitiyServiceImpl.java    
 * @Package com.scyb.aisweather.vdl.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月6日 下午6:52:19    
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
import com.scyb.aisweather.vdl.bo.HydrologyWeatherForecastBo;
import com.scyb.aisweather.vdl.bo.MilitaryActivitiyBo;
import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;
import com.scyb.aisweather.vdl.service.IMilitaryActivitiyService;
import com.scyb.aisweather.vdl.util.AscIIConvertBinaryUtil;
import com.scyb.aisweather.vdl.util.ConvertCoordinateUtil;
import com.scyb.aisweather.vdl.util.MessageHeadBinaryUtil;
import com.scyb.aisweather.vdl.vo.MilitaryActivitiyVo;

/**
 *      @ClassName: MilitaryActivitiyServiceImpl   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年10月6日 下午6:52:19           
 */
public class MilitaryActivitiyServiceImpl implements IMilitaryActivitiyService {

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
	 *     @param maVo     @see
	 * com.scyb.aisweather.vdl.service.IMilitaryActivitiyService
	 * #transformVdl(com.scyb.aisweather.vdl.vo.MilitaryActivitiyVo)   
	 */
	@Override
	public String transformVdl(MilitaryActivitiyVo maVo) {
		// TODO Auto-generated method stub
		MilitaryActivitiyBo maBo = new MilitaryActivitiyBo();
		String messageHead = new String();
		MessageHeadBinaryUtil mhbu = new MessageHeadBinaryUtil();
		// 判断6、8号报文类型
		if (maVo.getMessageNo() == 6) {
			MessageSix messageSix = new MessageSix();
			messageSix.setSource_id(maVo.getSource_id());
			messageSix.setDestination_id(maVo.getDestination_id());
			maBo.setMessageSix(messageSix);
			messageHead = mhbu.generationMessageSixHead(messageSix);
		} else {
			MessageEight messageEight = new MessageEight();
			messageEight.setSource_id(maVo.getSource_id());
			maBo.setMessageEight(messageEight);
			messageHead = mhbu.generationMessageEightHead(messageEight);
		}
		maBo.setActivitiyTheme(maVo.getActivitiyTheme());
		maBo.setDurationType(maVo.getDurationType());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			maBo.setStartDateTime(sdf.parse(maVo.getStartDateTime()));
			maBo.setEndDateTime(sdf.parse(maVo.getEndDateTime()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		maBo.setPrecautions(maVo.getPrecautions());
		StringBuffer binary = new StringBuffer();
		String dac = acbUtil.convertBin(maBo.getDac(), 10);
		String fi = acbUtil.convertBin(maBo.getFi(), 6);
		binary.append(dac).append(fi);
		binary.append(acbUtil.convertBin(maBo.getActivitiyTheme(), 4));
		binary.append(acbUtil.convertBin(maBo.getDurationType(), 1));
		for(int i=0; i<maVo.getLatitudeDList().size(); i++) {
			binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(maVo.getLongitudeDList().get(i), maVo.getLongitudeMList().get(i), maVo.getLongitudeSList().get(i), 105, 10000), 24));
			binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(maVo.getLatitudeDList().get(i), maVo.getLatitudeMList().get(i), maVo.getLatitudeSList().get(i), 4, 10000), 25));
		}
		binary.append(acbUtil.convertBin(maBo.getStartDateTime().getMonth()+1, 4));
		binary.append(acbUtil.convertBin(maBo.getStartDateTime().getDate(), 5));
		binary.append(acbUtil.convertBin(maBo.getStartDateTime().getHours(), 5));
		binary.append(acbUtil.convertBin(maBo.getStartDateTime().getMinutes(), 6));
		binary.append(acbUtil.convertBin(maBo.getEndDateTime().getMonth()+1, 4));
		binary.append(acbUtil.convertBin(maBo.getEndDateTime().getDate(), 5));
		binary.append(acbUtil.convertBin(maBo.getEndDateTime().getHours(), 5));
		binary.append(acbUtil.convertBin(maBo.getEndDateTime().getMinutes(), 6));
		binary.append(acbUtil.convertBin(maBo.getPrecautions(), 4));
		if (binary.toString().length() % 8 != 0) {
			for (int i = 0; i < binary.toString().length() % 8; i++) {
				binary.append("0");
			}
		}
		log.info(maVo.toString());
		log.info(maBo.toString());
		log.info(binary.toString());
		List<String> vdmMessageList = new ArrayList<String>();
		if (maVo.getMessageNo() == 6) {
			vdmMessageList = serialDataServiceImpl.generationABM(binary.toString(), maBo.getMessageSix());
		} else {
			vdmMessageList = serialDataServiceImpl.generationBBM(binary.toString(), maBo.getMessageEight());
		}
		vdmSocketImpl.sendMessage(vdmMessageList);
		StringBuffer messageSB = new StringBuffer();
		for(String str:vdmMessageList) {
			messageSB.append(str);
		}
		return messageSB.toString();
	}

}
