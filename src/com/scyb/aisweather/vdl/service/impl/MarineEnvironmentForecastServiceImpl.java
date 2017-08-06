/**     
 * @Title: MarineEnvironmentForecastServiceImpl.java    
 * @Package com.scyb.aisweather.vdl.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年7月29日 下午2:29:31    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;

import com.scyb.aisweather.nc.service.INetCdfDataService;
import com.scyb.aisweather.serial.service.ISerialDataService;
import com.scyb.aisweather.socket.service.IVDMSocket;
import com.scyb.aisweather.vdl.bo.MarineEnvironmentForecastBo;
import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;
import com.scyb.aisweather.vdl.service.IMarineEnvironmentForecastService;
import com.scyb.aisweather.vdl.util.AscIIConvertBinaryUtil;
import com.scyb.aisweather.vdl.util.ConvertCoordinateUtil;
import com.scyb.aisweather.vdl.util.MessageHeadBinaryUtil;
import com.scyb.aisweather.vdl.vo.MarineEnvironmentForecastVo;

/**
 *      @ClassName: MarineEnvironmentForecastServiceImpl   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年7月29日 下午2:29:31           
 */
public class MarineEnvironmentForecastServiceImpl implements IMarineEnvironmentForecastService {

	private INetCdfDataService ncDataServiceImpl;
	private Logger log = Logger.getLogger(this.getClass());
	private ConvertCoordinateUtil ccUtil = new ConvertCoordinateUtil();
	private AscIIConvertBinaryUtil acbUtil = new AscIIConvertBinaryUtil();
	private ISerialDataService serialDataServiceImpl;
	private IVDMSocket vdmSocketImpl;

	/**
	 * @param ncDataServiceImpl
	 *            the ncDataServiceImpl to set
	 */
	public void setNcDataServiceImpl(INetCdfDataService ncDataServiceImpl) {
		this.ncDataServiceImpl = ncDataServiceImpl;
	}

	/**
	 * @param serialDataServiceImpl
	 *            the serialDataServiceImpl to set
	 */
	public void setSerialDataServiceImpl(ISerialDataService serialDataServiceImpl) {
		this.serialDataServiceImpl = serialDataServiceImpl;
	}

	/**
	 * @param vdmSocketImpl
	 *            the vdmSocketImpl to set
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
	 *     @param mefVo     @see
	 * com.scyb.aisweather.vdl.service.IMarineEnvironmentForecastService
	 * #transformVdl(com.scyb.aisweather.vdl.vo.MarineEnvironmentForecastVo)   
	 */
	@Override
	public int transformVdl(MarineEnvironmentForecastVo mefVo) {
		MarineEnvironmentForecastBo mefBo = new MarineEnvironmentForecastBo();
		String messageHead = new String();
		MessageHeadBinaryUtil mhbu = new MessageHeadBinaryUtil();
        try {
            BeanUtils.copyProperties(mefBo, mefVo);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
		// 判断6、8号报文类型
		if (mefVo.getMessageNo() == 6) {
			MessageSix messageSix = new MessageSix();
			messageSix.setSource_id(mefVo.getSource_id());
			messageSix.setDestination_id(mefVo.getDestination_id());
			mefBo.setMessageSix(messageSix);
			messageHead = mhbu.generationMessageSixHead(messageSix);
		} else {
			MessageEight messageEight = new MessageEight();
			messageEight.setSource_id(mefVo.getSource_id());
			mefBo.setMessageEight(messageEight);
			messageHead = mhbu.generationMessageEightHead(messageEight);
		}
		mefBo.setLatitudeList(ccUtil.dmsToDecimal(mefVo.getLatitudeDList(), mefVo.getLatitudeMList(), mefVo.getLatitudeSList()));
		mefBo.setLongitudeList(ccUtil.dmsToDecimal(mefVo.getLongitudeDList(), mefVo.getLongitudeMList(), mefVo.getLongitudeSList()));
//		ncDataServiceImpl.initCurrentNcDataIndexs(mefBo.getLongitudeList(), mefBo.getLatitudeList(), mefBo.getForecastDateTime());
//		mefBo.setWaterSpeedList(ncDataServiceImpl.getCurrentWaterSpeedFromNc());
//		mefBo.setWaterDirectionList(ncDataServiceImpl.getCurrentWaterDirectionFromNc());
//		ncDataServiceImpl.initWaveNcDataIndexs(mefBo.getLongitudeList(), mefBo.getLatitudeList(), mefBo.getForecastDateTime());

//		mefBo.setWaveHsList(ncDataServiceImpl.getWaveFieldListFromNc(mefBo.getLongitudeList(), mefBo.getLatitudeList(), mefBo.getForecastDateTime(), "Hs"));
//		mefBo.setWaveDirectionList(ncDataServiceImpl.getWaveFieldListFromNc(mefBo.getLongitudeList(), mefBo.getLatitudeList(), mefBo.getForecastDateTime(),
//				"Dir"));
//		mefBo.setWaterTemperatureList(ncDataServiceImpl.getCurrentWaterTemperatureFromNc());
		StringBuffer binary = new StringBuffer();
		String dac = acbUtil.convertBin(MarineEnvironmentForecastBo.getDac(), 10);
		String fi = acbUtil.convertBin(MarineEnvironmentForecastBo.getFi(), 6);
		String time = null;
			time = acbUtil.convertBin(Integer.parseInt(mefBo.getForecastDateTime()), 5);
		binary.append(dac).append(fi).append(time);
		try {
			for (int i = 0; i < mefBo.getLatitudeList().size(); i++) {
				if(i==0) {
					binary.append(acbUtil.convertBin((int) (Math.round(Double.parseDouble(mefBo.getLongitudeList().get(i))) - 105)*60, 11));
					binary.append(acbUtil.convertBin((int) (Math.round(Double.parseDouble(mefBo.getLatitudeList().get(i))) - 8)*60, 11));
				}else {
					if(Double.parseDouble(mefBo.getLongitudeList().get(i))>=Double.parseDouble(mefBo.getLongitudeList().get(0))){
						binary.append(acbUtil.convertBin((int)(Math.round(Double.parseDouble(mefBo.getLongitudeList().get(i))*60) - Math.round(Double.parseDouble(mefBo.getLongitudeList().get(0))*60)), 7));
					}else {
						binary.append(acbUtil.convertBin(1,1)).append(acbUtil.convertBin((int)(Math.round(Double.parseDouble(mefBo.getLongitudeList().get(0))*60) - Math.round(Double.parseDouble(mefBo.getLongitudeList().get(i))*60)), 6));
					}
					if(Double.parseDouble(mefBo.getLatitudeList().get(i))>=Double.parseDouble(mefBo.getLatitudeList().get(0))){
						binary.append(acbUtil.convertBin((int)(Math.round(Double.parseDouble(mefBo.getLatitudeList().get(i))*60) - Math.round(Double.parseDouble(mefBo.getLatitudeList().get(0))*60)), 7));
					}else {
						binary.append(acbUtil.convertBin(1,1)).append(acbUtil.convertBin((int)(Math.round(Double.parseDouble(mefBo.getLatitudeList().get(0))*60) - Math.round(Double.parseDouble(mefBo.getLatitudeList().get(i))*60)), 6));
					}
				}
				binary.append(acbUtil.convertBin((int) (Math.round(mefBo.getWaterSpeedList().get(i) * 10)), 8));
				binary.append(acbUtil.convertBin((int) (Math.round(mefBo.getWaterDirectionList().get(i))), 9));
				binary.append(acbUtil.convertBin((int) (Math.round(mefBo.getWaveHsList().get(i) * 10)), 8));
				binary.append(acbUtil.convertBin((int) (Math.round(mefBo.getWaveDirectionList().get(i))), 9));
				binary.append(acbUtil.convertBin((int) (Math.round(mefBo.getWaterTemperatureList().get(i) * 10)), 11));
			}
		} catch (Exception e) {
            e.printStackTrace();
			return 1;
		}
		if (binary.toString().length() % 8 != 0) {
			for (int i = 0; i < binary.toString().length() % 8; i++) {
				binary.append("0");
			}
		}
		log.info(mefBo.toString());
		log.info(binary.toString());
		List<String> vdmMessageList = new ArrayList<String>();
		if (mefVo.getMessageNo() == 6) {
			vdmMessageList = serialDataServiceImpl.generationABM(binary.toString(), mefBo.getMessageSix());
		} else {
			vdmMessageList = serialDataServiceImpl.generationBBM(binary.toString(), mefBo.getMessageEight());
		}
		vdmSocketImpl.sendMessage(vdmMessageList);
		return 0;
	}
}