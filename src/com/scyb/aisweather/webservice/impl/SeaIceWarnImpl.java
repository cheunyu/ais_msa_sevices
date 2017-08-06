/**     
 * @Title: SeaIceWarnImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月17日 下午3:45:00    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;

import com.scyb.aisweather.vdl.service.IMarineWeatherWarnService;
import com.scyb.aisweather.vdl.vo.MarineWeatherWarnVo;
import com.scyb.aisweather.webservice.ISeaIceWarn;
import com.scyb.aisweather.webservice.bo.SeaIceWarnBo;
import org.apache.commons.beanutils.BeanUtils;

/**
 *      @ClassName: SeaIceWarnImpl     @Description: TODO(海洋气象海冰预警接口实现类)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月17日 下午3:45:00      
 *     
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.ISeaIceWarn")
public class SeaIceWarnImpl implements ISeaIceWarn {

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
	 *     @param seaIceWarnBo  @return     @see
	 * com.scyb.aisweather.webservice.ISeaIceWarn
	 * #getStatement(com.scyb.aisweather.webservice.bo.SeaIceWarnBo)   
	 */
	@Override
	public int seaIceWarnBroadcastService(SeaIceWarnBo seaIceWarnBo) {
		// TODO Auto-generated method stub
		MarineWeatherWarnVo mww = new MarineWeatherWarnVo();
		try {
			BeanUtils.copyProperties(mww, seaIceWarnBo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		mww.setMessageNo(6);
		mww.setWarnType(seaIceWarnBo.getTypeWarn());
		mww.setTimeRange(String.valueOf(seaIceWarnBo.getRange()));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		mww.setWarnDateTime(sdf.format(new Date(seaIceWarnBo.getDateTime())));
		mww.setSeaIceWarnLatd(seaIceWarnBo.getLatitude() / 1000000);
		mww.setSeaIceWarnLatm(seaIceWarnBo.getLatitude() % 1000000 * 60 / 1000000);
		mww.setSeaIceWarnLats((Double) (Math.round(seaIceWarnBo.getLatitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		mww.setSeaIceWarnLond(seaIceWarnBo.getLongitude() / 1000000);
		mww.setSeaIceWarnLonm(seaIceWarnBo.getLongitude() % 1000000 * 60 / 1000000);
		mww.setSeaIceWarnLons((Double) (Math.round(seaIceWarnBo.getLongitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		mww.setSeaIceWarnRad(String.valueOf(seaIceWarnBo.getRadius()));
		mww.setSeaIceWarnThickness(String.valueOf(seaIceWarnBo.getThickness()));
		mwwServiceImpl.transformVdl(mww);
		return 0;
	}

}
