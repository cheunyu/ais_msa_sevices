/**     
 * @Title: StationDaoImpl.java    
 * @Package com.scyb.aisweather.template.dao.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2013-11-14 下午4:21:22    
 * @version V1.0    
 */
package com.scyb.aisweather.template.dao.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import com.scyb.aisweather.common.dao.impl.BaseDaoImpl;
import com.scyb.aisweather.template.bo.Station;
import com.scyb.aisweather.template.dao.IStationDao;

/**   
 * @ClassName: StationDaoImpl   
 * @Description: TODO(基站管理数据层接口实现类)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2013-11-14 下午4:21:22      
 *    
 */
public class StationDaoImpl extends BaseDaoImpl implements IStationDao {

	private Logger log = Logger.getLogger(this.getClass());
	
	/** (非 Javadoc)   
	 * <p>Title: queryAllStations</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see com.scyb.aisweather.template.dao.IStationDao#queryAllStations()   
	 */
	@Override
	public List<Station> queryAllStations() {
		String hql = "from Station";
		return super.queryList(hql);
	}

	/** (非 Javadoc)   
	 * <p>Title: removeStaNamesByStaNames</p>  
	 * <p>Description: </p>  
	 * @param staNames
	 * @return   
	 * @see com.scyb.aisweather.template.dao.IStationDao#removeStaNamesByStaNames(java.lang.String)   
	 */
	@Override
	public void removeStaNamesByStaNames(List<String> staNamesList) {
		String hql = "from Station sta where sta.stationName in ('";
		for(String staName:staNamesList) {
			hql += staName + "','";
		}
		List<?> staList = super.queryList(hql.substring(0, hql.length()-2).toString()+")");
		log.info(hql.substring(0, hql.length()-2).toString()+")");
		super.delList(staList);
	}

	@Override
	public Set<Station> queryStationsByStaNames(String staNames) {
		String hql = "from Station sta where sta.stationName in ('";
		for(int i=0;i<staNames.split(",").length;i++) {
			hql += staNames.split(",")[i] + "','";
		}
		List<Station> staList = super.queryList(hql.substring(0, hql.length()-2).toString()+")");
		Set staSet = new HashSet();
		for(Station sta:staList) {
			staSet.add(sta);
		}
		return staSet;
	}

}
