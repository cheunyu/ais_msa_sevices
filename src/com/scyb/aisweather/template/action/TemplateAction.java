package com.scyb.aisweather.template.action;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.template.bo.Template;
import com.scyb.aisweather.template.service.ITemplateService;

public class TemplateAction implements Action {

	private Logger log = Logger.getLogger(this.getClass());
	
	private String timeSet;
	
	private int interval_h;
	
	private int interval_m;
	
	private int interval_s;
	
	private Date definite_date;
	
	private String staArr;
	
	private String temName;
	
	private String temRemark;
	
	private String templateIds;
	
	private List<Template> temList;
	
	private Template template;
	
	private ITemplateService temServiceImpl;
	
	public void setTimeSet(String timeSet) {
		this.timeSet = timeSet;
	}

	public void setInterval_h(int interval_h) {
		this.interval_h = interval_h;
	}

	public void setInterval_m(int interval_m) {
		this.interval_m = interval_m;
	}

	public void setInterval_s(int interval_s) {
		this.interval_s = interval_s;
	}

	public void setDefinite_date(Date definite_date) {
		this.definite_date = definite_date;
	}

	public void setStaArr(String staArr) {
		this.staArr = staArr;
	}

	public void setTemName(String temName) {
		this.temName = temName;
	}

	public void setTemRemark(String temRemark) {
		this.temRemark = temRemark;
	}

	public void setTemServiceImpl(ITemplateService temServiceImpl) {
		this.temServiceImpl = temServiceImpl;
	}

	public List<Template> getTemList() {
		return temList;
	}

	public void setTemplateIds(String templateIds) {
		this.templateIds = templateIds;
	}

	/**
	 * @return the template
	 */
	public Template getTemplate() {
		return template;
	}

	/**
	 * @Title: saveTemplate   
	 * @Description: TODO(保存模板)   
	 * @return
	 * @throws Exception    设定文件  
	 * @return String    返回类型  
	 * @throws   
	 */
	public String saveTemplate() throws Exception {
		temServiceImpl.saveTemplate(timeSet, temName, temRemark, interval_h, interval_m, interval_s, definite_date, staArr);
		return this.SUCCESS;
	}
	
	public String queryTemplate() throws Exception {
		template = temServiceImpl.queryTemById(templateIds);
		return this.SUCCESS;
	}
	
	/**
	 * @Title: queryTemList   
	 * @Description: TODO(查询所有模板)   
	 * @return
	 * @throws Exception    设定文件  
	 * @return String    返回类型  
	 * @throws   
	 */
	public String queryTemList() throws Exception {
		temList = temServiceImpl.queryTemList();
		long end = System.currentTimeMillis();
		return this.SUCCESS;
	}
	
	/**
	 * @Title: modifyTemplate   
	 * @Description: TODO(修改模板)   
	 * @param @return
	 * @param @throws Exception    设定文件  
	 * @return String    返回类型  
	 * @throws   
	 */
	public String modifyTemplate() throws Exception {
		temServiceImpl.modifyTemById(timeSet, temName, temRemark, interval_h, interval_m, interval_s, definite_date, staArr, templateIds);
		return staArr;
	}
	
	/**
	 * @Title: delTemplate   
	 * @Description: TODO(删除模板)   
	 * @return
	 * @throws Exception    设定文件  
	 * @return String    返回类型  
	 * @throws   
	 */
	public String delTemplate() throws Exception {
		temServiceImpl.deleteTemById(templateIds);
		return this.SUCCESS;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
