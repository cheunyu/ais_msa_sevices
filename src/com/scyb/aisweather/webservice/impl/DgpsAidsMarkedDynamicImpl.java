/**     
 * @Title: DgpsAidsMarkedDynamicImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月22日 下午4:00:55    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.impl;

import javax.jws.WebService;

import com.scyb.aisweather.vdl.service.IAidsMarkedDynamicService;
import com.scyb.aisweather.vdl.vo.AidsMarkedDynamicVo;
import com.scyb.aisweather.webservice.IDgpsAidsMarkedDynamic;
import com.scyb.aisweather.webservice.bo.DgpsDynamicBo;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**   
 * @ClassName: DgpsAidsMarkedDynamicImpl   
 * @Description: TODO(助航标注动态-DGPS台站停止发射接口实现类)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月22日 下午4:00:55      
 *    
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.IDgpsAidsMarkedDynamic")
public class DgpsAidsMarkedDynamicImpl implements IDgpsAidsMarkedDynamic {

	private IAidsMarkedDynamicService amdServiceImpl;

	/**
	 * @param amdServiceImpl the amdServiceImpl to set
	 */
	public void setAmdServiceImpl(IAidsMarkedDynamicService amdServiceImpl) {
		this.amdServiceImpl = amdServiceImpl;
	}

	/**
	 *  (非 Javadoc)   
	 *  <p>Title: getStatement</p>  
	 *  <p>Description: </p>  
	 *  @param dgpsBo
	 *  @return   
	 *  @see com.scyb.aisweather.webservice.IDgpsAidsMarkedDynamic#getStatement(com.scyb.aisweather.webservice.bo.DgpsDynamicBo)   
	 */
	@Override
	public int dgpsAmdBroadcastService(DgpsDynamicBo dgpsBo) {
		// TODO Auto-generated method stub
		AidsMarkedDynamicVo amdVo = new AidsMarkedDynamicVo();
		try {
			BeanUtils.copyProperties(amdVo, dgpsBo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		amdVo.setMessageNo(6);
		amdVo.setType(dgpsBo.getStatus());
		amdVo.setPublishRange(String.valueOf(dgpsBo.getRange()));
		amdVo.setDgpsLatitudeD(dgpsBo.getLatitude() / 1000000);
		amdVo.setDgpsLatitudeM(dgpsBo.getLatitude() % 1000000 * 60 / 1000000);
		amdVo.setDgpsLatitudeS((Double) (Math.round(dgpsBo.getLatitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		amdVo.setDgpsLongitudeD(dgpsBo.getLongitude() / 1000000);
		amdVo.setDgpsLongitudeM(dgpsBo.getLongitude() % 1000000 * 60 / 1000000);
		amdVo.setDgpsLongitudeS((Double) (Math.round(dgpsBo.getLongitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		amdVo.setDgpsLaunch(String.valueOf(dgpsBo.getLaunch()));
		amdServiceImpl.transformVdl(amdVo);
		return 0;
	}
}
