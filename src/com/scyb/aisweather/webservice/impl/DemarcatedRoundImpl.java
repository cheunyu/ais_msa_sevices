/**     
 * @Title: DemarcatedRoundImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月23日 下午4:05:23    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.scyb.aisweather.vdl.service.IDemarcatedAreaService;
import com.scyb.aisweather.vdl.vo.ConstructionWorkVo;
import com.scyb.aisweather.vdl.vo.DemarcatedAreaVo;
import com.scyb.aisweather.webservice.IDemarcatedRound;
import com.scyb.aisweather.webservice.bo.DemarcatedRoundBo;
import org.apache.commons.beanutils.BeanUtils;

import javax.jws.WebService;

/**   
 * @ClassName: DemarcatedRoundImpl   
 * @Description: TODO(划定区域圆形接口实现类)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月23日 下午4:05:23      
 *    
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.IDemarcatedRound")
public class DemarcatedRoundImpl implements IDemarcatedRound {

	private IDemarcatedAreaService daServiceImpl;
	
	
	/**
	 * @param daServiceImpl the daServiceImpl to set
	 */
	public void setDaServiceImpl(IDemarcatedAreaService daServiceImpl) {
		this.daServiceImpl = daServiceImpl;
	}


	/** (非 Javadoc)   
	 * <p>Title: getStatement</p>  
	 * <p>Description: </p>  
	 * @param drBo
	 * @return   
	 * @see com.scyb.aisweather.webservice.IDemarcatedRound#getStatement(com.scyb.aisweather.webservice.bo.DemarcatedRoundBo)   
	 */
	@Override
	public int roundAreaBroadcastService(DemarcatedRoundBo drBo) {
		// TODO Auto-generated method stub
		DemarcatedAreaVo daVo = new DemarcatedAreaVo();
		try {
			BeanUtils.copyProperties(daVo, drBo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		daVo.setMessageNo(6);
		daVo.setAreaType(drBo.getType());
		daVo.setAreaFeature(drBo.getFeature());
		daVo.setStartDateTime(new Date(drBo.getDateTime1()));
		daVo.setEndDateTime(new Date(drBo.getDateTime2()));
		daVo.setFarther(drBo.getFarther());
		daVo.setRoundLatitudeD(drBo.getLatitude() / 1000000);
		daVo.setRoundLatitudeM(drBo.getLatitude() % 1000000 * 60 / 1000000);
		daVo.setRoundLatitudeS((Double) (Math.round(drBo.getLatitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		daVo.setRoundLongitudeD(drBo.getLongitude() / 1000000);
		daVo.setRoundLongitudeM(drBo.getLongitude() % 1000000 * 60 / 1000000);
		daVo.setRoundLongitudeS((Double) (Math.round(drBo.getLongitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		daVo.setRadius(String.valueOf(drBo.getRadius()));
		daServiceImpl.transformVdl(daVo);
		return 0;
	}

}
