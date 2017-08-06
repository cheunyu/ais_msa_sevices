/**     
 * @Title: StormSurgeWarnImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月17日 下午3:44:40    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;

import com.scyb.aisweather.vdl.service.IMarineWeatherWarnService;
import com.scyb.aisweather.vdl.vo.MarineWeatherWarnVo;
import com.scyb.aisweather.webservice.IStormSurgeWarn;
import com.scyb.aisweather.webservice.bo.StormSurgeWarnBo;
import org.apache.commons.beanutils.BeanUtils;

/**   
 * @ClassName: StormSurgeWarnImpl   
 * @Description: TODO(海洋气象风暴潮预警接口实现类)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月17日 下午3:44:40      
 *    
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.IStormSurgeWarn")
public class StormSurgeWarnImpl implements IStormSurgeWarn {

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
	 * @param stormSurgeWarnBo
	 * @return   
	 * @see com.scyb.aisweather.webservice.IStormSurgeWarn#getStatement(com.scyb.aisweather.webservice.bo.StormSurgeWarnBo)   
	 */
	@Override
	public int ssWarnBroadcastService(StormSurgeWarnBo stormSurgeWarnBo) {
		// TODO Auto-generated method stub
		MarineWeatherWarnVo mww = new MarineWeatherWarnVo();
		try {
			BeanUtils.copyProperties(mww, stormSurgeWarnBo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		mww.setMessageNo(6);
		mww.setWarnType(stormSurgeWarnBo.getTypeWarn());
		mww.setTimeRange(String.valueOf(stormSurgeWarnBo.getRange()));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		mww.setWarnDateTime(sdf.format(new Date(stormSurgeWarnBo.getDateTime())));
		mww.setStormSurgeWarnLatd(stormSurgeWarnBo.getLatitude() / 1000000);
		mww.setStormSurgeWarnLatm(stormSurgeWarnBo.getLatitude() % 1000000 * 60 / 1000000);
		mww.setStormSurgeWarnLats((Double) (Math.round(stormSurgeWarnBo.getLatitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		mww.setStormSurgeWarnLond(stormSurgeWarnBo.getLongitude() / 1000000);
		mww.setStormSurgeWarnLonm(stormSurgeWarnBo.getLongitude() % 1000000 * 60 / 1000000);
		mww.setStormSurgeWarnLons((Double) (Math.round(stormSurgeWarnBo.getLongitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		mww.setStormSurgeWarnRad(String.valueOf(stormSurgeWarnBo.getRadius()));
		mww.setStormSurgeWarnTide(String.valueOf(stormSurgeWarnBo.getTide()));
		mww.setStormSurgeWarnWavePeriod(String.valueOf(stormSurgeWarnBo.getPeriod()));
		mwwServiceImpl.transformVdl(mww);
		return 0;
	}

}
