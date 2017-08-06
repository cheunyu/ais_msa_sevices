/**     
 * @Title: LightAidsMarkedDynamicImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月22日 下午3:36:00    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.impl;

import javax.jws.WebService;

import com.scyb.aisweather.vdl.service.IAidsMarkedDynamicService;
import com.scyb.aisweather.vdl.vo.AidsMarkedDynamicVo;
import com.scyb.aisweather.webservice.ILightAidsMarkedDynamic;
import com.scyb.aisweather.webservice.bo.LightDynamicBo;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 *      @ClassName: LightAidsMarkedDynamicImpl   
 *  @Description: TODO(助航标注动态灯质改变接口实现类)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年12月22日 下午3:36:00           
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.ILightAidsMarkedDynamic")
public class LightAidsMarkedDynamicImpl implements ILightAidsMarkedDynamic {

	private IAidsMarkedDynamicService amdServiceImpl;

	/**
	 * @param amdServiceImpl
	 *            the amdServiceImpl to set
	 */
	public void setAmdServiceImpl(IAidsMarkedDynamicService amdServiceImpl) {
		this.amdServiceImpl = amdServiceImpl;
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
	 *     @param ldBo  @return     @see
	 * com.scyb.aisweather.webservice.ILightAidsMarkedDynamic
	 * #getStatement(com.scyb.aisweather.webservice.bo.LightDynamicBo)   
	 */
	@Override
	public int lightAmdBroadcastService(LightDynamicBo ldBo) {
		// TODO Auto-generated method stub
		AidsMarkedDynamicVo amdVo = new AidsMarkedDynamicVo();
		try {
			BeanUtils.copyProperties(amdVo, ldBo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		amdVo.setMessageNo(6);
		amdVo.setType(ldBo.getStatus());
		amdVo.setPublishRange(String.valueOf(ldBo.getRange()));
		amdVo.setLightLatitudeD(ldBo.getLatitude() / 1000000);
		amdVo.setLightLatitudeM(ldBo.getLatitude() % 1000000 * 60 / 1000000);
		amdVo.setLightLatitudeS((Double) (Math.round(ldBo.getLatitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		amdVo.setLightLongitudeD(ldBo.getLongitude() / 1000000);
		amdVo.setLightLongitudeM(ldBo.getLongitude() % 1000000 * 60 / 1000000);
		amdVo.setLightLongitudeS((Double) (Math.round(ldBo.getLongitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		amdVo.setLightType(ldBo.getType());
		amdVo.setLightCycle(ldBo.getLightCycle());
		amdVo.setLightColor(ldBo.getLightColor());
		amdVo.setRhythmName(ldBo.getRhythmName());
		amdVo.setRhythmParameters(ldBo.getRhythmParameters());
		amdServiceImpl.transformVdl(amdVo);
		return 0;
	}

}
