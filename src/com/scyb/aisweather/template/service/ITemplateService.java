package com.scyb.aisweather.template.service;

import java.util.Date;
import java.util.List;

import com.scyb.aisweather.template.bo.Template;

/**
 *      @ClassName: ITemplateService     @Description: TODO(模板业务层接口)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date Nov 19, 2013 2:54:24 PM      
 *     
 */
public interface ITemplateService {


	/**
	 * @Title: saveTemplate   
	 * @Description: TODO(保存模板接口)   
	 * @param timeSet
	 * @param interval_h
	 * @param interval_m
	 * @param interval_s
	 * @param countdown_s
	 * @param definite_date
	 * @param staArr    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public void saveTemplate(String timeSet, String temName, String temRemark, int interval_h,
							 int interval_m, int interval_s, Date definite_date, String staArr);
	
	/**
	 * @Title: queryTemList   
	 * @Description: TODO(查询所有模板接口)   
	 * @return    设定文件  
	 * @return List<Template>    返回类型  
	 * @throws   
	 */
	public List<Template> queryTemList();
	
	/**
	 * @Title: queryTemById   
	 * @Description: TODO(根据ID查询指定模板接口)   
	 * @param @param temId
	 * @param @return    设定文件  
	 * @return Template    返回类型  
	 * @throws   
	 */
	public Template queryTemById(String temId);
	
	/**
	 * @Title: modifyTemById   
	 * @Description: TODO(根据ID修改指定模板接口)   
	 * @param @param temId    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public void modifyTemById(String timeSet, String temName, String temRemark, int interval_h,
							  int interval_m, int interval_s, Date definite_date, String staArr, String temId);
	
	/**
	 * @Title: deleteTemById   
	 * @Description: TODO(根据ID删除指定模板接口)   
	 * @param templateId    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public void deleteTemById(String templateIds);

}
