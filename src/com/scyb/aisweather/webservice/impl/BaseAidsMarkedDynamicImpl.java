/**     
 * @Title: BaseAidsMarkedDynamicImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月22日 上午10:33:39    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.impl;

import javax.jws.WebService;

import com.scyb.aisweather.vdl.service.IAidsMarkedDynamicService;
import com.scyb.aisweather.vdl.vo.AidsMarkedDynamicVo;
import com.scyb.aisweather.webservice.IBaseAidsMarkedDynamic;
import com.scyb.aisweather.webservice.bo.BaseDynamicBo;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**   
 * @ClassName: BaseAidsMarkedDynamicImpl   
 * @Description: TODO(助航标注动态【新增，撤除，漂失，故障，恢复工作】接口实现类)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月22日 上午10:33:39      
 *    
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.IBaseAidsMarkedDynamic")
public class BaseAidsMarkedDynamicImpl implements IBaseAidsMarkedDynamic {

	private IAidsMarkedDynamicService amdServiceImpl;
	
	/**
	 * @param amdServiceImpl the amdServiceImpl to set
	 */
	public void setAmdServiceImpl(IAidsMarkedDynamicService amdServiceImpl) {
		this.amdServiceImpl = amdServiceImpl;
	}


	/** (非 Javadoc)   
	 * <p>Title: getStatement</p>  
	 * <p>Description: </p>  
	 * @param bdBo
	 * @return   
	 * @see com.scyb.aisweather.webservice.IBaseAidsMarkedDynamic#getStatement(com.scyb.aisweather.webservice.bo.BaseDynamicBo)   
	 */
	@Override
	public int amdBroadcastService(BaseDynamicBo bdBo) {
		// TODO Auto-generated method stub
		AidsMarkedDynamicVo amdVo = new AidsMarkedDynamicVo();
		try {
			BeanUtils.copyProperties(amdVo, bdBo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		amdVo.setMessageNo(6);
		amdVo.setType(bdBo.getStatus());
		amdVo.setPublishRange(String.valueOf(bdBo.getRange()));
		amdVo.setOtherLatitudeD(bdBo.getLatitude() / 1000000);
		amdVo.setOtherLatitudeM(bdBo.getLatitude() % 1000000 * 60 / 1000000);
		amdVo.setOtherLatitudeS((Double) (Math.round(bdBo.getLatitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		amdVo.setOtherLongitudeD(bdBo.getLongitude() / 1000000);
		amdVo.setOtherLongitudeM(bdBo.getLatitude() % 1000000 * 60 / 1000000);
		amdVo.setOtherLongitudeS((Double) (Math.round(bdBo.getLongitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		amdVo.setOtherType(bdBo.getType());
		amdServiceImpl.transformVdl(amdVo);
		return 0;
	}

}
