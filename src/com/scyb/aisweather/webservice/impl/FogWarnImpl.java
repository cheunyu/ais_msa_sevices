/**     
 * @Title: FogWarnImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月17日 下午3:45:16    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;

import com.scyb.aisweather.vdl.service.IMarineWeatherWarnService;
import com.scyb.aisweather.vdl.vo.MarineWeatherWarnVo;
import com.scyb.aisweather.webservice.IFogWarn;
import com.scyb.aisweather.webservice.bo.FogWarnBo;
import org.apache.commons.beanutils.BeanUtils;

/**
 *      @ClassName: FogWarnImpl     @Description: TODO(海洋气象大雾预警接口实现类)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月17日 下午3:45:16      
 *     
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.IFogWarn")
public class FogWarnImpl implements IFogWarn {

	private IMarineWeatherWarnService mwwServiceImpl;

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
	 *     @param fogWarnBo  @return     @see
	 * com.scyb.aisweather.webservice.IFogWarn
	 * #getStatement(com.scyb.aisweather.webservice.bo.FogWarnBo)   
	 */
	@Override
	public int fogWarnBroadcastService(FogWarnBo fogWarnBo) {
		// TODO Auto-generated method stub
		MarineWeatherWarnVo mww = new MarineWeatherWarnVo();
		try {
			BeanUtils.copyProperties(mww, fogWarnBo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		mww.setMessageNo(6);
		mww.setWarnType(fogWarnBo.getTypeWarn());
		mww.setTimeRange(String.valueOf(fogWarnBo.getRange()));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		mww.setWarnDateTime(sdf.format(new Date(fogWarnBo.getDateTime())));
		mww.setFogWarnLatd(fogWarnBo.getLatitude() / 1000000);
		mww.setFogWarnLatm(fogWarnBo.getLatitude() % 1000000 * 60 / 1000000);
		mww.setFogWarnLats((Double) (Math.round(fogWarnBo.getLatitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		mww.setFogWarnLond(fogWarnBo.getLongitude() / 1000000);
		mww.setFogWarnLonm(fogWarnBo.getLongitude() % 1000000 * 60 / 1000000);
		mww.setFogWarnLons((Double) (Math.round(fogWarnBo.getLongitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		mww.setFogWarnRad(String.valueOf(fogWarnBo.getRadius()));
		mww.setFogWarnVisibility(String.valueOf(fogWarnBo.getVisibility()));
		mwwServiceImpl.transformVdl(mww);
		return 0;
	}

}
