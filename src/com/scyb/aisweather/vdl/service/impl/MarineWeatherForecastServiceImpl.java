/**     
 * @Title: MarineWeatherForecastServiceImpl.java    
 * @Package com.scyb.aisweather.vdl.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月17日 上午11:11:03    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;

import com.scyb.aisweather.nc.service.INetCdfDataService;
import com.scyb.aisweather.serial.service.ISerialDataService;
import com.scyb.aisweather.socket.service.IVDMSocket;
import com.scyb.aisweather.vdl.bo.MarineWeatherForecastBo;
import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;
import com.scyb.aisweather.vdl.service.IMarineWeatherForecastService;
import com.scyb.aisweather.vdl.util.AscIIConvertBinaryUtil;
import com.scyb.aisweather.vdl.util.ConvertCoordinateUtil;
import com.scyb.aisweather.vdl.vo.MarineWeatherForecastVo;

/**
 *      @ClassName: MarineWeatherForecastServiceImpl   
 *  @Description: TODO(海洋气象预报业务逻辑实现类)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年9月17日 上午11:11:03           
 */
public class MarineWeatherForecastServiceImpl implements IMarineWeatherForecastService {

	private Logger log = Logger.getLogger(this.getClass().getName());
	private ConvertCoordinateUtil ccUtil = new ConvertCoordinateUtil();
	private AscIIConvertBinaryUtil acbUtil = new AscIIConvertBinaryUtil();
	private INetCdfDataService ncDataServiceImpl;
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
	 *     @param mwfVo     @see
	 * com.scyb.aisweather.vdl.service.IMarineWeatherForecastService
	 * #transformVdl(com.scyb.aisweather.vdl.vo.MarineWeatherForecastVo)   
	 */
	@Override
	public int transformVdl(MarineWeatherForecastVo mwfVo) {
		// TODO Auto-generated method stub
		MarineWeatherForecastBo mwfBo = new MarineWeatherForecastBo();
		try {
			BeanUtils.copyProperties(mwfBo, mwfVo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh时");
		StringBuffer messageHead = new StringBuffer();
		// 判断6 or 8号报文
		if (mwfVo.getMessageNo() == 6) {
			MessageSix ms = new MessageSix();
			ms.setSource_id(mwfVo.getSource_id());
			ms.setDestination_id(mwfVo.getDestination_id());
			mwfBo.setMs(ms);
			messageHead.append(acbUtil.convertBin(mwfBo.getMs().getMessageId(), 6));
			messageHead.append(acbUtil.convertBin(mwfBo.getMs().getRepeat(), 2));
			messageHead.append(acbUtil.convertBin(mwfBo.getMs().getSource_id(), 30));
			messageHead.append(acbUtil.convertBin(mwfBo.getMs().getSequence_number(), 2));
			messageHead.append(acbUtil.convertBin(mwfBo.getMs().getDestination_id(), 30));
			messageHead.append(acbUtil.convertBin(mwfBo.getMs().getRetransmit_flag(), 1));
			messageHead.append(acbUtil.convertBin(mwfBo.getMs().getSpare(), 1));
		} else {
			MessageEight me = new MessageEight();
			me.setSource_id(mwfVo.getSource_id());
			mwfBo.setMe(me);
		}
		mwfBo.setLatitudeList(ccUtil.dmsToDecimal(mwfVo.getLatitudeDList(), mwfVo.getLatitudeMList(), mwfVo.getLatitudeSList()));
		mwfBo.setLongitudeList(ccUtil.dmsToDecimal(mwfVo.getLongitudeDList(), mwfVo.getLongitudeMList(), mwfVo.getLongitudeSList()));
		StringBuffer binary = new StringBuffer();
		String dac = acbUtil.convertBin(mwfBo.getDac(), 10);
		String fi = acbUtil.convertBin(mwfBo.getFi(), 6);
		String time = acbUtil.convertBin(mwfBo.getForecastDateTime(), 5);
		binary.append(dac).append(fi).append(time);
		try {
			for (int i = 0; i < mwfBo.getLatitudeList().size(); i++) {
				binary.append(acbUtil.convertBin(mwfBo.getWeatherPhenomenaList().get(i), 5));
				if(i==0) {
					binary.append(acbUtil.convertBin((int) (Math.round(Double.parseDouble(mwfBo.getLongitudeList().get(i))) - 105)*60, 11));
					binary.append(acbUtil.convertBin((int) (Math.round(Double.parseDouble(mwfBo.getLatitudeList().get(i))) - 8)*60, 11));
				}else {
					if(Double.parseDouble(mwfBo.getLongitudeList().get(i))>=Double.parseDouble(mwfBo.getLongitudeList().get(0))){
						binary.append(acbUtil.convertBin((int)(Math.round(Double.parseDouble(mwfBo.getLongitudeList().get(i))*60) - Math.round(Double.parseDouble(mwfBo.getLongitudeList().get(0))*60)), 7));
					}else {
						binary.append(acbUtil.convertBin(1,1)).append(acbUtil.convertBin((int)(Math.round(Double.parseDouble(mwfBo.getLongitudeList().get(0))*60) - Math.round(Double.parseDouble(mwfBo.getLongitudeList().get(i))*60)), 6));
					}
					if(Double.parseDouble(mwfBo.getLatitudeList().get(i))>=Double.parseDouble(mwfBo.getLatitudeList().get(0))){
						binary.append(acbUtil.convertBin((int)(Math.round(Double.parseDouble(mwfBo.getLatitudeList().get(i))*60) - Math.round(Double.parseDouble(mwfBo.getLatitudeList().get(0))*60)), 7));
					}else {
						binary.append(acbUtil.convertBin(1,1)).append(acbUtil.convertBin((int)(Math.round(Double.parseDouble(mwfBo.getLatitudeList().get(0))*60) - Math.round(Double.parseDouble(mwfBo.getLatitudeList().get(i))*60)), 6));
					}
				}
				binary.append(acbUtil.convertBin(Math.round(mwfBo.getWindSpeedList().get(i)), 7));
				binary.append(acbUtil.convertBin(Math.round(mwfBo.getWindDirectionList().get(i)), 9));
				binary.append(acbUtil.convertBin((int) (mwfBo.getTemperatureList().get(i) * 10), 11));
				binary.append(acbUtil.convertBin(Math.round(mwfBo.getPressureList().get(i)) - 800, 9));
				binary.append(acbUtil.convertBin((int) (mwfBo.getVisibilityList().get(i) * 10), 8));
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
		List<String> vdmMessageList = new ArrayList<String>();
		if (mwfVo.getMessageNo() == 6) {
			vdmMessageList = serialDataServiceImpl.generationABM(binary.toString(), mwfBo.getMs());
		} else {
			vdmMessageList = serialDataServiceImpl.generationBBM(binary.toString(), mwfBo.getMe());
		}
		vdmSocketImpl.sendMessage(vdmMessageList);
		return 0;
	}

}
