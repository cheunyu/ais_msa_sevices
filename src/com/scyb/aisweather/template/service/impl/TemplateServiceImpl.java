package com.scyb.aisweather.template.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import com.scyb.aisweather.template.bo.Station;
import com.scyb.aisweather.template.bo.Template;
import com.scyb.aisweather.template.dao.IStationDao;
import com.scyb.aisweather.template.dao.ITemplateDao;
import com.scyb.aisweather.template.service.ITemplateService;

public class TemplateServiceImpl implements ITemplateService {

	private Logger log = Logger.getLogger(this.getClass());
	
	private ITemplateDao temDaoImpl;
	
	private IStationDao staDaoImpl;
	
	public void setStaDaoImpl(IStationDao staDaoImpl) {
		this.staDaoImpl = staDaoImpl;
	}

	public void setTemDaoImpl(ITemplateDao temDaoImpl) {
		this.temDaoImpl = temDaoImpl;
	}

	/** (非 Javadoc)   
	 * <p>Title: saveTemplate</p>  
	 * <p>Description: </p>  
	 * @param timeSet
	 * @param interval_h
	 * @param interval_m
	 * @param interval_s
	 * @param countdown_s
	 * @param definite_date
	 * @param staArr   
	 * @see com.scyb.aisweather.template.service.ITemplateService#saveTemplate(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)   
	 */
	@Override
	public void saveTemplate(String timeSet, String temName, String temRemark, int interval_h,
			int interval_m, int interval_s, Date definite_date, String staArr) {
		// TODO Auto-generated method stub
		int intervalTime = 0;
		if("INTERVAL".equals(timeSet)) {
			intervalTime = interval_h * 3600 + interval_m * 60 + interval_s;
			definite_date = null;
		}
		Date date = new Date();
		Template tem = new Template(temName, intervalTime, definite_date, temRemark, date);
		tem.setStations(staDaoImpl.queryStationsByStaNames(staArr));
		temDaoImpl.saveTemplate(tem);
	}

	@Override
	public List<Template> queryTemList() {
		return temDaoImpl.queryTemList();
	}

	/** (非 Javadoc)   
	 * <p>Title: queryTemById</p>  
	 * <p>Description: </p>  
	 * @param temId
	 * @return   
	 * @see com.scyb.aisweather.template.service.ITemplateService#queryTemById(java.lang.String)   
	 */
	@Override
	public Template queryTemById(String temId) {
		return temDaoImpl.queryTemById(temId);
	}

	@Override
	public void deleteTemById(String templateIds) {
		// TODO Auto-generated method stub
		ArrayList<String> templateIdsList = new ArrayList<String>();
		for(int i = 0;i < templateIds.split(",").length;i++){
			templateIdsList.add(templateIds.split(",")[i]);
		}
		temDaoImpl.removeTemplateByTemIds(templateIdsList);
	}

	/** (非 Javadoc)   
	 * <p>Title: modifyTemById</p>  
	 * <p>Description: </p>  
	 * @param timeSet
	 * @param temName
	 * @param temRemark
	 * @param interval_h
	 * @param interval_m
	 * @param interval_s
	 * @param definite_date
	 * @param staArr
	 * @param temId   
	 * @see com.scyb.aisweather.template.service.ITemplateService#modifyTemById(java.lang.String, java.lang.String, java.lang.String, int, int, int, java.util.Date, java.lang.String, java.lang.String)   
	 */
	@Override
	public void modifyTemById(String timeSet, String temName, String temRemark, int interval_h, int interval_m, int interval_s,
			Date definite_date, String staArr, String temId) {
		// TODO Auto-generated method stub
		Template tem = this.queryTemById(temId);
		tem.setDefinite(definite_date);
		int intervalTime = 0;
		if("INTERVAL".equals(timeSet)) {
			intervalTime = interval_h * 3600 + interval_m * 60 + interval_s;
			definite_date = null;
		}
		tem.setIntervalTime(intervalTime);
		tem.setRemark(temRemark);
		tem.setStations(staDaoImpl.queryStationsByStaNames(staArr));
		tem.setTemplateName(temName);
		temDaoImpl.save(tem);
	}

}
