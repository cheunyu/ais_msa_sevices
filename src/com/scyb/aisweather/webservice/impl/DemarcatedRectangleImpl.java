/**     
 * @Title: DemarcatedRectangleImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月23日 下午4:15:41    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import com.scyb.aisweather.vdl.service.IDemarcatedAreaService;
import com.scyb.aisweather.vdl.vo.DemarcatedAreaVo;
import com.scyb.aisweather.webservice.IDemarcatedRectangle;
import com.scyb.aisweather.webservice.bo.DemarcatedRectangleBo;
import org.apache.commons.beanutils.BeanUtils;

import javax.jws.WebService;

/**
 *      @ClassName: DemarcatedRectangleImpl   
 *  @Description: TODO(划定区域矩形接口实现类)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年12月23日 下午4:15:41           
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.IDemarcatedRectangle")
public class DemarcatedRectangleImpl implements IDemarcatedRectangle {

	private IDemarcatedAreaService daServiceImpl;

	/**
	 * @param daServiceImpl
	 *            the daServiceImpl to set
	 */
	public void setDaServiceImpl(IDemarcatedAreaService daServiceImpl) {
		this.daServiceImpl = daServiceImpl;
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
	 *     @param drBo  @return     @see
	 * com.scyb.aisweather.webservice.IDemarcatedRectangle
	 * #getStatement(com.scyb.aisweather.webservice.bo.DemarcatedRectangleBo)   
	 */
	@Override
	public int rectangleAreaBroadcastService(DemarcatedRectangleBo drBo) {
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
		daVo.setRectangleStartLatitudeD(drBo.getLatitudeNw() / 1000000);
		daVo.setRectangleStartLatitudeM(drBo.getLatitudeNw() % 1000000 * 60 / 1000000);
		daVo.setRectangleStartLatitudeS((Double) (Math.round(drBo.getLatitudeNw() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		daVo.setRectangleStartLongitudeD(drBo.getLongitudeNw() / 1000000);
		daVo.setRectangleStartLongitudeM(drBo.getLongitudeNw() % 1000000 * 60 / 1000000);
		daVo.setRectangleStartLongitudeS((Double) (Math.round(drBo.getLongitudeNw() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		daVo.setRectangleEndLatitudeD(drBo.getLatitudeSe() / 1000000);
		daVo.setRectangleEndLatitudeM(drBo.getLatitudeSe() % 1000000 * 60 / 1000000);
		daVo.setRectangleEndLatitudeS((Double) (Math.round(drBo.getLatitudeSe() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		daVo.setRectangleEndLongitudeD(drBo.getLongitudeSe() / 1000000);
		daVo.setRectangleEndLongitudeM(drBo.getLongitudeSe() % 1000000 * 60 / 1000000);
		daVo.setRectangleEndLongitudeS((Double) (Math.round(drBo.getLongitudeSe() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		daServiceImpl.transformVdl(daVo);
		return 0;
	}

}
