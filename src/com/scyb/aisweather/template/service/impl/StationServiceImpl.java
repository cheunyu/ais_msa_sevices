/**     
 * @Title: StationServiceImpl.java    
 * @Package com.scyb.aisweather.template.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2013-11-14 下午4:35:38    
 * @version V1.0    
 */
package com.scyb.aisweather.template.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.scyb.aisweather.template.bo.Station;
import com.scyb.aisweather.template.dao.IStationDao;
import com.scyb.aisweather.template.service.IStationService;

/**   
 * @ClassName: StationServiceImpl   
 * @Description: TODO(基站业务层接口实现类)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2013-11-14 下午4:35:38      
 *    
 */
public class StationServiceImpl implements IStationService {

	private Logger log = Logger.getLogger(this.getClass());
	
	/**   
	 * @Fields staDaoImpl : TODO(基站数据层接口对象)   
	 */
	private IStationDao staDaoImpl;
	
	/**
	 * @param staDaoImpl the staDaoImpl to set
	 */
	public void setStaDaoImpl(IStationDao staDaoImpl) {
		this.staDaoImpl = staDaoImpl;
	}

	/** (非 Javadoc)   
	 * <p>Title: getAllStationName</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see com.scyb.aisweather.template.service.IStationService#getAllStationName()   
	 */
	@Override
	public List<String> getAllStationName() {
		List<Station> stasList = staDaoImpl.queryAllStations();
		List<String> staNameList = new ArrayList<String>();
		for(Station sta : stasList) {
			staNameList.add(sta.getStationName());
		}
		return staNameList;
	}

	@Override
	public void delStaByStaNames(String staNames) {
		ArrayList<String> staNamesList = new ArrayList<String>();
		for(int i = 0;i < staNames.split(",").length;i++){
			staNamesList.add(staNames.split(",")[i]);
		}
		staDaoImpl.removeStaNamesByStaNames(staNamesList);
	}

}
