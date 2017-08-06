/**     
 * @Title: NetCdfDateTimeAction.java    
 * @Package com.scyb.aisweather.common.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月16日 下午12:50:50    
 * @version V1.0    
 */
package com.scyb.aisweather.common.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.common.service.INetCdfDateTimeService;

/**   
 * @ClassName: NetCdfDateTimeAction   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年9月16日 下午12:50:50      
 *    
 */
public class NetCdfDateTimeAction implements Action {

	private Logger log = Logger.getLogger(this.getClass());
	private List<String> netCdfDateTimeList = new ArrayList<String>();
	private INetCdfDateTimeService ncDateTimeServiceImpl;
	
	/**
	 * @return the netCdfDateTimeList
	 */
	public List<String> getNetCdfDateTimeList() {
		return netCdfDateTimeList;
	}

	/**
	 * @param ncDateTimeServiceImpl the ncDateTimeServiceImpl to set
	 */
	public void setNcDateTimeServiceImpl(INetCdfDateTimeService ncDateTimeServiceImpl) {
		this.ncDateTimeServiceImpl = ncDateTimeServiceImpl;
	}

	public String netCdfDateTime() {
		netCdfDateTimeList = ncDateTimeServiceImpl.getNetCdfDateTime();
		return this.SUCCESS;
	}

	/** (非 Javadoc)   
	 * <p>Title: execute</p>  
	 * <p>Description: </p>  
	 * @return
	 * @throws Exception   
	 * @see com.opensymphony.xwork2.Action#execute()   
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
