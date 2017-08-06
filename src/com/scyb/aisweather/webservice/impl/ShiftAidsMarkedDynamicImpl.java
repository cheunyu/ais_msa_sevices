/**     
 * @Title: ShiftAidsMarkedDynamicImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月22日 下午2:59:29    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.impl;

import javax.jws.WebService;

import com.scyb.aisweather.vdl.service.IAidsMarkedDynamicService;
import com.scyb.aisweather.vdl.vo.AidsMarkedDynamicVo;
import com.scyb.aisweather.webservice.IShiftAidsMarkedDynamic;
import com.scyb.aisweather.webservice.bo.ShiftDynamicBo;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 *      @ClassName: ShiftAidsMarkedDynamicImpl   
 *  @Description: TODO(助航标注动态移位接口实现类)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年12月22日 下午2:59:29           
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.IShiftAidsMarkedDynamic")
public class ShiftAidsMarkedDynamicImpl implements IShiftAidsMarkedDynamic {

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
	 *     @param sdBo  @return     @see
	 * com.scyb.aisweather.webservice.IShiftAidsMarkedDynamic
	 * #getStatement(com.scyb.aisweather.webservice.bo.ShiftDynamicBo)   
	 */
	@Override
	public int shiftAmdBroadcastService(ShiftDynamicBo sdBo) {
		// TODO Auto-generated method stub
		AidsMarkedDynamicVo amdVo = new AidsMarkedDynamicVo();
		try {
			BeanUtils.copyProperties(amdVo, sdBo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		amdVo.setMessageNo(6);
		amdVo.setType(sdBo.getStatus());
		amdVo.setPublishRange(String.valueOf(sdBo.getRange()));
		amdVo.setShiftStartLatitudeD(sdBo.getLatitudeStart() / 1000000);
		amdVo.setShiftStartLatitudeM(sdBo.getLatitudeStart()  % 1000000 * 60 / 1000000);
		amdVo.setShiftStartLatitudeS((Double) (Math.round(sdBo.getLatitudeStart() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		amdVo.setShiftStartLongitudeD(sdBo.getLongitudeStart() / 1000000);
		amdVo.setShiftStartLongitudeM(sdBo.getLongitudeStart()  % 1000000 * 60 / 1000000);
		amdVo.setShiftStartLongitudeS((Double) (Math.round(sdBo.getLongitudeStart() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		amdVo.setShiftEndLatitudeD(sdBo.getLatitudeEnd() / 1000000);
		amdVo.setShiftEndLatitudeM(sdBo.getLatitudeEnd()  % 1000000 * 60 / 1000000);
		amdVo.setShiftEndLatitudeS((Double) (Math.round(sdBo.getLatitudeEnd() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		amdVo.setShiftEndLongitudeD(sdBo.getLongitudeEnd() / 1000000);
		amdVo.setShiftEndLongitudeM(sdBo.getLongitudeEnd()  % 1000000 * 60 / 1000000);
		amdVo.setShiftEndLongitudeS((Double) (Math.round(sdBo.getLongitudeEnd() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		amdVo.setShiftType(sdBo.getType());
		amdServiceImpl.transformVdl(amdVo);
		return 0;
	}

}
