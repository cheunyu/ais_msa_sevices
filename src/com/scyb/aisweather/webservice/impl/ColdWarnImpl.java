/**     
 * @Title: ColdWarnImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月17日 下午3:45:42    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;

import com.scyb.aisweather.vdl.service.IMarineWeatherWarnService;
import com.scyb.aisweather.vdl.vo.MarineWeatherWarnVo;
import com.scyb.aisweather.webservice.IColdWarn;
import com.scyb.aisweather.webservice.bo.ColdWarnBo;
import org.apache.commons.beanutils.BeanUtils;

/**   
 * @ClassName: ColdWarnImpl   
 * @Description: TODO(海洋气象寒潮预警接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月17日 下午3:45:42      
 *    
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.IColdWarn")
public class ColdWarnImpl implements IColdWarn {

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
	 * @param coldWarnBo
	 * @return   
	 * @see com.scyb.aisweather.webservice.IColdWarn#getStatement(com.scyb.aisweather.webservice.bo.ColdWarnBo)   
	 */
	@Override
	public int coldWarnBroadcastService(ColdWarnBo coldWarnBo) {
		// TODO Auto-generated method stub
		MarineWeatherWarnVo mww = new MarineWeatherWarnVo();
		try {
			BeanUtils.copyProperties(mww, coldWarnBo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		mww.setMessageNo(6);
		mww.setWarnType(coldWarnBo.getTypeWarn());
		mww.setTimeRange(String.valueOf(coldWarnBo.getRange()));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		mww.setWarnDateTime(sdf.format(new Date(coldWarnBo.getDateTime())));
		mww.setColdWarnLatd(coldWarnBo.getLatitude() / 1000000);
		mww.setColdWarnLatm(coldWarnBo.getLatitude() % 1000000 * 60 / 1000000);
		mww.setColdWarnLats((Double) (Math.round(coldWarnBo.getLatitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		mww.setColdWarnLond(coldWarnBo.getLongitude() / 1000000);
		mww.setColdWarnLonm(coldWarnBo.getLongitude() % 1000000 * 60 / 1000000);
		mww.setColdWarnLons((Double) (Math.round(coldWarnBo.getLongitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		mww.setColdWarnRad(String.valueOf(coldWarnBo.getRadius()));
		mww.setColdWarnLevel(String.valueOf(coldWarnBo.getLevel()));
		mwwServiceImpl.transformVdl(mww);
		return 0;
	}

}
