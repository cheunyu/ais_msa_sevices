/**     
 * @Title: NavigationImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月23日 下午12:26:27    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;

import com.scyb.aisweather.vdl.service.INavigationService;
import com.scyb.aisweather.vdl.vo.AidsMarkedDynamicVo;
import com.scyb.aisweather.vdl.vo.NavigationVo;
import com.scyb.aisweather.webservice.INavigation;
import com.scyb.aisweather.webservice.bo.NavigationBo;
import org.apache.commons.beanutils.BeanUtils;

/**   
 * @ClassName: NavigationImpl   
 * @Description: TODO(碍航物信息接口实现类)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月23日 下午12:26:27      
 *    
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.INavigation")
public class NavigationImpl implements INavigation {

	private INavigationService navServiceImpl;


	/**
	 * @param navServiceImpl the navServiceImpl to set
	 */
	public void setNavServiceImpl(INavigationService navServiceImpl) {
		this.navServiceImpl = navServiceImpl;
	}


	/** (非 Javadoc)   
	 * <p>Title: getStatement</p>  
	 * <p>Description: </p>  
	 * @param navBo
	 * @return   
	 * @see com.scyb.aisweather.webservice.INavigation#getStatement(com.scyb.aisweather.webservice.bo.NavigationBo)   
	 */
	@Override
	public int navBroadcastService(NavigationBo navBo) {
		// TODO Auto-generated method stub
		NavigationVo navVo = new NavigationVo();
		try {
			BeanUtils.copyProperties(navVo, navBo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		navVo.setMessageNo(6);
		navVo.setType(navBo.getType());
		navVo.setLatitudeD(navBo.getLatitude() / 1000000);
		navVo.setLatitudeM(navBo.getLatitude() % 1000000 * 60 / 1000000);
		navVo.setLatitudeS((Double) (Math.round(navBo.getLatitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		navVo.setLongitudeD(navBo.getLongitude() / 1000000);
		navVo.setLongitudeM(navBo.getLongitude() % 1000000 * 60 / 1000000);
		navVo.setLongitudeS((Double) (Math.round(navBo.getLongitude() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		navVo.setRadius(String.valueOf(navBo.getRadius()) + "海里");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		navVo.setTime1(sdf.format(new Date(navBo.getTime1())));
		navVo.setTime2(sdf.format(new Date(navBo.getTime2())));
		navVo.setFarther(navBo.getFarther());
		navServiceImpl.transformVdl(navVo);
		return 0;
	}

}
