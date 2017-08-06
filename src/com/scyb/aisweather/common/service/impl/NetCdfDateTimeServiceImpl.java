/**     
 * @Title: NetCdfDateTimeServiceImpl.java    
 * @Package com.scyb.aisweather.common.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月16日 下午3:16:35    
 * @version V1.0    
 */
package com.scyb.aisweather.common.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.springframework.web.context.ServletContextAware;

import com.scyb.aisweather.common.service.INetCdfDateTimeService;

/**
 *      @ClassName: NetCdfDateTimeServiceImpl   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年9月16日 下午3:16:35           
 */
public class NetCdfDateTimeServiceImpl implements INetCdfDateTimeService, ServletContextAware {

	private Logger log = Logger.getLogger(this.getClass());
	private ServletContext servletContext;
	
	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: getNetCdfDateTime
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @return     @see
	 * com.scyb.aisweather.common.service.INetCdfDateTimeService
	 * #getNetCdfDateTime()   
	 */
	@Override
	public List<String> getNetCdfDateTime() {
		List<String> netCdfDateTimeList = new ArrayList<String>();
		Calendar cal = (Calendar) servletContext.getAttribute("netcdfDateTime");
		if(cal != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			for (int i = 12; i < 69; i++) {
				if (i < 24) {
					netCdfDateTimeList.add(sdf.format(cal.getTime()) + " " + String.valueOf(i));
				} else if (24 <= i && i < 48) {
					cal.add(Calendar.DAY_OF_MONTH, +1);
					netCdfDateTimeList.add(sdf.format(cal.getTime()) + " " + String.valueOf(i%24));
					cal.add(Calendar.DAY_OF_MONTH, -1);
				} else if (48 <= i) {
					cal.add(Calendar.DAY_OF_MONTH, +2);
					netCdfDateTimeList.add(sdf.format(cal.getTime()) + " " + String.valueOf(i%24));
					cal.add(Calendar.DAY_OF_MONTH, -2);
				}
			}
		}else {
			netCdfDateTimeList.add("netcdf file not found.");
		}
		return netCdfDateTimeList;
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: setServletContext
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param arg0     @see
	 * org.springframework.web.context.ServletContextAware
	 * #setServletContext(javax.servlet.ServletContext)   
	 */
	@Override
	public void setServletContext(ServletContext arg0) {
		// TODO Auto-generated method stub
		servletContext = arg0;
	}

}
