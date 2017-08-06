/**     
 * @Title: TropicalCycloneWarnImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月11日 下午3:04:57    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import javax.jws.WebService;

import com.scyb.aisweather.vdl.service.IMarineWeatherWarnService;
import com.scyb.aisweather.vdl.vo.MarineWeatherWarnVo;
import com.scyb.aisweather.webservice.ITropicalCycloneWarn;
import com.scyb.aisweather.webservice.bo.TropicalCycloneWarnBo;
import org.apache.commons.beanutils.BeanUtils;

/**
 *      @ClassName: TropicalCycloneWarnImpl   
 *  @Description: TODO(海洋气象预警热带气旋)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年12月11日 下午3:04:57           
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.ITropicalCycloneWarn")
public class TropicalCycloneWarnImpl implements ITropicalCycloneWarn {

	private IMarineWeatherWarnService mwwServiceImpl;
	private Logger log = Logger.getLogger(this.getClass().getName());

	/**
	 * @param mwwServiceImpl
	 *            the mwwServiceImpl to set
	 */
	public void setMwwServiceImpl(IMarineWeatherWarnService mwwServiceImpl) {
		this.mwwServiceImpl = mwwServiceImpl;
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: getStatement
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param tcWarn  @return     @see
	 * com.scyb.aisweather.webservice.ITropicalCycloneWarn
	 * #getStatement(com.scyb.aisweather.webservice.bo.TropicalCycloneWarn)   
	 */
	@Override
	public int tcWarnBroadcastService(TropicalCycloneWarnBo tcWarn) {
		// TODO Auto-generated method stub
		MarineWeatherWarnVo mww = new MarineWeatherWarnVo();
		try {
			BeanUtils.copyProperties(mww, tcWarn);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		mww.setMessageNo(6);
		mww.setWarnType(tcWarn.getType());
		mww.setTimeRange(String.valueOf(tcWarn.getRange()));
		mww.setTropicalCycloneLatd(tcWarn.getLatitude() / 1000000);
		mww.setTropicalCycloneLatm(tcWarn.getLatitude() % 1000000 * 60 / 1000000);
		mww.setTropicalCycloneLats((Double) (Math.round(tcWarn.getLatitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		mww.setTropicalCycloneLond(tcWarn.getLongitude() / 1000000);
		mww.setTropicalCycloneLonm(tcWarn.getLongitude() % 1000000 * 60 / 1000000);
		mww.setTropicalCycloneLons((Double) (Math.round(tcWarn.getLongitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		mww.setTropicalCycloneType(String.valueOf(tcWarn.getType()));
		mww.setTropicalCycloneRad(String.valueOf(tcWarn.getRadius()));
		mww.setTropicalCycloneSpeed(String.valueOf(tcWarn.getSpeed()));
		mww.setTropicalCycloneDirection(String.valueOf(tcWarn.getDirection()));
		mww.setTropicalCycloneWindPower(String.valueOf(tcWarn.getWindPower()));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		mww.setWarnDateTime(sdf.format(new Date(tcWarn.getDateTime())));
		mwwServiceImpl.transformVdl(mww);
		return 0;
	}

}
