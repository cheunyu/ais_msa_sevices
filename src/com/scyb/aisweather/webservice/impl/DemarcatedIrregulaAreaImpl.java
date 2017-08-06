/**     
 * @Title: DemarcatedIrregulaAreaImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月23日 下午4:19:21    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import com.scyb.aisweather.vdl.service.IDemarcatedIrregulaAreaService;
import com.scyb.aisweather.vdl.vo.DemarcatedIrregulaAreaVo;
import com.scyb.aisweather.vdl.vo.MilitaryActivitiyVo;
import com.scyb.aisweather.webservice.IDemarcatedIrregulaArea;
import com.scyb.aisweather.webservice.bo.DemarcatedIrregulaAreaBo;
import org.apache.commons.beanutils.BeanUtils;

import javax.jws.WebService;

/**   
 * @ClassName: DemarcatedIrregulaAreaImpl   
 * @Description: TODO(划定区域不规则图形接口实现类)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月23日 下午4:19:21      
 *    
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.IDemarcatedIrregulaArea")
public class DemarcatedIrregulaAreaImpl implements IDemarcatedIrregulaArea {

	private IDemarcatedIrregulaAreaService diaServiceImpl;
	private Logger log = Logger.getLogger(this.getClass().getName());

	/**
	 * @param diaServiceImpl the diaServiceImpl to set
	 */
	public void setDiaServiceImpl(IDemarcatedIrregulaAreaService diaServiceImpl) {
		this.diaServiceImpl = diaServiceImpl;
	}


	/** (非 Javadoc)   
	 * <p>Title: getStatement</p>  
	 * <p>Description: </p>  
	 * @param diaBo
	 * @return   
	 * @see com.scyb.aisweather.webservice.IDemarcatedIrregulaArea#getStatement(com.scyb.aisweather.webservice.bo.DemarcatedIrregulaAreaBo)   
	 */
	@Override
	public int irregulaAreaBroadcastService(DemarcatedIrregulaAreaBo diaBo) {
		// TODO Auto-generated method stub
		DemarcatedIrregulaAreaVo diaVo = new DemarcatedIrregulaAreaVo();
		log.info(diaBo.toString());
		try {
			BeanUtils.copyProperties(diaVo, diaBo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		diaVo.setMessageNo(6);
		diaVo.setAreaType(diaBo.getType());
		for(int i=0;i<diaBo.getLatitudeList().size();i++) {
			diaVo.getLatitudeDList().add(diaBo.getLatitudeList().get(i) / 1000000);
			diaVo.getLatitudeMList().add(diaBo.getLatitudeList().get(i) % 1000000 * 60 / 1000000);
			diaVo.getLatitudeSList().add((Double) (Math.round(diaBo.getLatitudeList().get(i) % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
			diaVo.getLongitudeDList().add(diaBo.getLongitudeList().get(i) / 1000000);
			diaVo.getLongitudeMList().add(diaBo.getLongitudeList().get(i) % 1000000 * 60 / 1000000);
			diaVo.getLongitudeSList().add((Double) (Math.round(diaBo.getLongitudeList().get(i) % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		}
		diaVo.setStartDateTime(new Date(diaBo.getDateTime1()));
		diaVo.setEndDateTime(new Date(diaBo.getDateTime2()));
		diaServiceImpl.transformVdl(diaVo);
		return 0;
	}

}
