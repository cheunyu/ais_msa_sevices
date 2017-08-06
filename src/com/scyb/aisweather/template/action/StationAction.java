/**     
 * @Title: StationAction.java    
 * @Package com.scyb.aisweather.template.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2013-11-14 下午4:46:15    
 * @version V1.0    
 */
package com.scyb.aisweather.template.action;

import java.util.List;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.template.service.IStationService;

/**   
 * @ClassName: StationAction   
 * @Description: TODO(基站管理Action)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2013-11-14 下午4:46:15      
 *    
 */
public class StationAction implements Action {

	private Logger log = Logger.getLogger(this.getClass());
	
	/**   
	 * @Fields staServiceImpl : TODO(基站业务层接口对象)   
	 */
	private IStationService staServiceImpl;
	
	/**   
	 * @Fields staNameList : TODO(基站全部名称)   
	 */
	private List<String> staNameList;
	
	/**   
	 * @Fields staArr : TODO(要删除的基站数组)   
	 */
	private String staArr;
	
	/**
	 * @param staArr the staArr to set
	 */
	public void setStaArr(String staArr) {
		this.staArr = staArr;
	}

	/**
	 * @param staServiceImpl the staServiceImpl to set
	 */
	public void setStaServiceImpl(IStationService staServiceImpl) {
		this.staServiceImpl = staServiceImpl;
	}

    /**
	 * @return the staNameList
	 */
	public List<String> getStaNameList() {
		return staNameList;
	}

	/**
	 * @Title: allStaNames   
	 * @Description: TODO(获取全部基站名称方法)   
	 * @param @return    设定文件  
	 * @return String    返回类型  
	 * @throws   
	 */
	public String allStaNames() {
		staNameList = staServiceImpl.getAllStationName();
		if(staNameList.size() > 0)
			return this.SUCCESS;
		else
			return this.ERROR;
    }
	
	public String delStaNames() {
		staServiceImpl.delStaByStaNames(staArr);
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
