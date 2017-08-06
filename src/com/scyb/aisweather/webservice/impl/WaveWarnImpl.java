/**     
 * @Title: WaveWarnImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月17日 下午3:44:07    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;

import com.scyb.aisweather.vdl.service.IMarineWeatherWarnService;
import com.scyb.aisweather.vdl.vo.MarineWeatherWarnVo;
import com.scyb.aisweather.webservice.IWaveWarn;
import com.scyb.aisweather.webservice.bo.WaveWarnBo;
import org.apache.commons.beanutils.BeanUtils;

/**   
 * @ClassName: WaveWarnImpl   
 * @Description: TODO(海洋气象大浪预警接口实现类)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月17日 下午3:44:07      
 *    
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.IWaveWarn")
public class WaveWarnImpl implements IWaveWarn {

	private IMarineWeatherWarnService mwwServiceImpl;

	/**
	 * @param mwwServiceImpl
	 *            the mwwServiceImpl to set
	 */
	public void setMwwServiceImpl(IMarineWeatherWarnService mwwServiceImpl) {
		this.mwwServiceImpl = mwwServiceImpl;
	}
	
	/** (非 Javadoc)   
	 * <p>Title: getStatement</p>  
	 * <p>Description: </p>  
	 * @param waveWarnBo
	 * @return   
	 * @see com.scyb.aisweather.webservice.IWaveWarn#getStatement(com.scyb.aisweather.webservice.bo.WaveWarnBo)   
	 */
	@Override
	public int waveWarnBroadcastService(WaveWarnBo waveWarnBo) {
		MarineWeatherWarnVo mww = new MarineWeatherWarnVo();
		try {
			BeanUtils.copyProperties(mww, waveWarnBo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		mww.setMessageNo(6);
		mww.setWarnType(waveWarnBo.getTypeWarn());
		mww.setTimeRange(String.valueOf(waveWarnBo.getRange()));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		mww.setWarnDateTime(sdf.format(new Date(waveWarnBo.getDateTime())));
		mww.setWaveWarnLatd(waveWarnBo.getLatitude() / 1000000);
		mww.setWaveWarnLatm(waveWarnBo.getLatitude() % 1000000 * 60 / 1000000);
		mww.setWaveWarnLats((Double) (Math.round(waveWarnBo.getLatitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		mww.setWaveWarnLond(waveWarnBo.getLongitude() / 1000000);
		mww.setWaveWarnLonm(waveWarnBo.getLongitude() % 1000000 * 60 / 1000000);
		mww.setWaveWarnLons((Double) (Math.round(waveWarnBo.getLongitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		mww.setWaveWarnPeriod(String.valueOf(waveWarnBo.getPeriod()));
		mww.setWaveWarnRad(String.valueOf(waveWarnBo.getRadius()));
		mwwServiceImpl.transformVdl(mww);
		return 0;
	}

}
