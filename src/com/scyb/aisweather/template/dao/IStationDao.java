/**     
 * @Title: IStationDao.java    
 * @Package com.scyb.aisweather.template.dao   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2013-11-14 下午4:12:27    
 * @version V1.0    
 */
package com.scyb.aisweather.template.dao;

import java.util.List;
import java.util.Set;

import com.scyb.aisweather.common.dao.IBaseDao;
import com.scyb.aisweather.template.bo.Station;

/**   
 * @ClassName: IStationDao   
 * @Description: TODO(基站管理数据层接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2013-11-14 下午4:12:27      
 *    
 */
public interface IStationDao extends IBaseDao{

	/**
	 * @Title: queryAllStations   
	 * @Description: TODO(查询所有基站)   
	 * @param @return    设定文件  
	 * @return List<String>    返回类型  
	 * @throws   
	 */
	public List<Station> queryAllStations();
	
	/**
	 * @Title: queryStationsByStaNames   
	 * @Description: TODO(根据基站名称查询基站)   
	 * @param staNames
	 * @return    设定文件  
	 * @return Set<Station>    返回类型  
	 * @throws   
	 */
	public Set<Station> queryStationsByStaNames(String staNames);
	
	/**
	 * @Title: removeStaNamesByStaNames   
	 * @Description: TODO(根基基站名称删除基站)   
	 * @param @param staNames
	 * @param @return    设定文件  
	 * @return Boolean    返回类型  
	 * @throws   
	 */
	public void removeStaNamesByStaNames(List<String> staNamesList);
}
