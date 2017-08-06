/**     
 * @Title: WindWarnImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月17日 下午2:38:27    
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
import com.scyb.aisweather.webservice.IWindWarn;
import com.scyb.aisweather.webservice.bo.WindWarnBo;
import org.apache.commons.beanutils.BeanUtils;

/**
 *      @ClassName: WindWarnImpl     @Description: TODO(海洋气象大风预警接口实现类)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月17日 下午2:38:27      
 *     
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.IWindWarn")
public class WindWarnImpl implements IWindWarn {

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
	 *     @param windWarnBo  @return     @see
	 * com.scyb.aisweather.webservice.IWindWarn
	 * #getStatement(com.scyb.aisweather.webservice.bo.WindWarnBo)   
	 */
	@Override
	public int windWarnBroadcastService(WindWarnBo windWarnBo) {
		MarineWeatherWarnVo mww = new MarineWeatherWarnVo();
		try {
			BeanUtils.copyProperties(mww, windWarnBo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		mww.setMessageNo(6);
		mww.setDestination_id(windWarnBo.getDestination_id());
		mww.setSource_id(windWarnBo.getSource_id());
		mww.setWarnType(windWarnBo.getTypeWarn());
		mww.setTimeRange(String.valueOf(windWarnBo.getRange()));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		mww.setWarnDateTime(sdf.format(new Date(windWarnBo.getDateTime())));
		mww.setWindWarnLatd(windWarnBo.getLatitude() / 1000000);
		mww.setWindWarnLatm(windWarnBo.getLatitude() % 1000000 * 60 / 1000000);
		mww.setWindWarnLats((Double) (Math.round(windWarnBo.getLatitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		mww.setWindWarnLond(windWarnBo.getLongitude() / 1000000);
		mww.setWindWarnLonm(windWarnBo.getLongitude() % 1000000 * 60 / 1000000);
		mww.setWindWarnLons((Double) (Math.round(windWarnBo.getLongitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		mww.setWindWarnRad(String.valueOf(windWarnBo.getRadius()));
		mww.setWindWarnMaxWindPower(String.valueOf(windWarnBo.getMaxPower()));
		mww.setWindWarnMinWindPower(String.valueOf(windWarnBo.getMinPower()));
		mww.setWindWarnDirection(String.valueOf(windWarnBo.getDirection()));
		mwwServiceImpl.transformVdl(mww);
		return 0;
	}

}
