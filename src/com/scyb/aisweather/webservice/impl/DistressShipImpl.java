/**     
 * @Title: DistressShipImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月23日 下午3:39:43    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.jws.WebService;

import com.scyb.aisweather.vdl.service.IShipDistressService;
import com.scyb.aisweather.vdl.vo.MarineWeatherWarnVo;
import com.scyb.aisweather.vdl.vo.ShipDistressVo;
import com.scyb.aisweather.webservice.IDistressShip;
import com.scyb.aisweather.webservice.bo.DistressShipBo;
import org.apache.commons.beanutils.BeanUtils;

/**   
 * @ClassName: DistressShipImpl   
 * @Description: TODO(船舶遇险接口实现类)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月23日 下午3:39:43      
 *    
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.IDistressShip")
public class DistressShipImpl implements IDistressShip {

	private IShipDistressService sdServiceImpl;
	
	
	/**
	 * @param sdServiceImpl the sdServiceImpl to set
	 */
	public void setSdServiceImpl(IShipDistressService sdServiceImpl) {
		this.sdServiceImpl = sdServiceImpl;
	}


	/** (非 Javadoc)   
	 * <p>Title: getStatement</p>  
	 * <p>Description: </p>  
	 * @param dsBo
	 * @return   
	 * @see com.scyb.aisweather.webservice.IDistressShip#getStatement(com.scyb.aisweather.webservice.bo.DistressShipBo)   
	 */
	@Override
	public int dsBroadcastService(DistressShipBo dsBo) {
		// TODO Auto-generated method stub
		ShipDistressVo sdVo = new ShipDistressVo();
		try {
			BeanUtils.copyProperties(sdVo, dsBo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		sdVo.setMessageNo(6);
		sdVo.setDistressType(dsBo.getType());
		sdVo.setStatusDescribed(dsBo.getDescribed());
		sdVo.setShipType(dsBo.getShipType());
		sdVo.setFarther(dsBo.getFarther());
		sdVo.setLatitudeD(dsBo.getLatitude() / 1000000);
		sdVo.setLatitudeM(dsBo.getLatitude() % 1000000 * 60 / 1000000);
		sdVo.setLatitudeS((Double) (Math.round(dsBo.getLatitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		sdVo.setLongitudeD(dsBo.getLongitude() / 1000000);
		sdVo.setLongitudeM(dsBo.getLongitude() % 1000000 * 60 / 1000000);
		sdVo.setLongitudeS((Double) (Math.round(dsBo.getLongitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdVo.setDateTime(sdf.format(new Date(dsBo.getDateTime())));
		sdVo.setReleaseTime(String.valueOf(dsBo.getRange()));
		sdServiceImpl.transformVdl(sdVo);
		return 0;
	}

}
