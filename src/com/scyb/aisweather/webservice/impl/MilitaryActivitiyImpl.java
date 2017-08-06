/**     
 * @Title: MilitaryActivitiyImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月23日 下午3:26:25    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.jws.WebService;

import com.scyb.aisweather.vdl.service.IMilitaryActivitiyService;
import com.scyb.aisweather.vdl.vo.HydrologyWeatherForecastVo;
import com.scyb.aisweather.vdl.vo.MilitaryActivitiyVo;
import com.scyb.aisweather.webservice.IMilitaryActivitiy;
import com.scyb.aisweather.webservice.bo.MilitaryActivitiyBo;
import org.apache.commons.beanutils.BeanUtils;

/**   
 * @ClassName: MilitaryActivitiyImpl   
 * @Description: TODO(演习、打靶、海上军事活动接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月23日 下午3:26:25      
 *    
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.IMilitaryActivitiy")
public class MilitaryActivitiyImpl implements IMilitaryActivitiy {
	
	private IMilitaryActivitiyService maServiceImpl;
	
	
	/**
	 * @param maServiceImpl the maServiceImpl to set
	 */
	public void setMaServiceImpl(IMilitaryActivitiyService maServiceImpl) {
		this.maServiceImpl = maServiceImpl;
	}


	/** (非 Javadoc)   
	 * <p>Title: getStatement</p>  
	 * <p>Description: </p>  
	 * @param maBo
	 * @return   
	 * @see com.scyb.aisweather.webservice.IMilitaryActivitiy#getStatement(com.scyb.aisweather.webservice.bo.MilitaryActivitiyBo)   
	 */
	@Override
	public int maBroadcastService(MilitaryActivitiyBo maBo) {
		// TODO Auto-generated method stub
		MilitaryActivitiyVo maVo = new MilitaryActivitiyVo();
		try {
			BeanUtils.copyProperties(maVo, maBo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		maVo.setMessageNo(6);
		maVo.setActivitiyTheme(maBo.getActivitiyTheme());
		maVo.setDurationType(maBo.getDurationType());
		for(int i=0;i<maBo.getLatitudeList().size();i++) {
			maVo.getLatitudeDList().add(maBo.getLatitudeList().get(i) / 1000000);
			maVo.getLatitudeMList().add(maBo.getLatitudeList().get(i) % 1000000 * 60 / 1000000);
			maVo.getLatitudeSList().add((Double) (Math.round(maBo.getLatitudeList().get(i) % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
			maVo.getLongitudeDList().add(maBo.getLongitudeList().get(i) / 1000000);
			maVo.getLongitudeMList().add(maBo.getLongitudeList().get(i) % 1000000 * 60 / 1000000);
			maVo.getLongitudeSList().add((Double) (Math.round(maBo.getLongitudeList().get(i) % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		maVo.setStartDateTime(sdf.format(new Date(maBo.getDateTime1())));
		maVo.setEndDateTime(sdf.format(new Date(maBo.getDateTime2())));
		maVo.setPrecautions(maBo.getPrecautions());
		maServiceImpl.transformVdl(maVo);
		return 0;
	}

}
