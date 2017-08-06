package com.scyb.aisweather.template.dao;

import java.util.List;

import com.scyb.aisweather.common.dao.IBaseDao;
import com.scyb.aisweather.template.bo.Template;

/**   
 * @ClassName: ITemplateDao   
 * @Description: TODO(模板数据层接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date Nov 19, 2013 4:52:19 PM      
 *    
 */
public interface ITemplateDao extends IBaseDao{

	/**
	 * @Title: saveTemplate   
	 * @Description: TODO(添加模板接口)   
	 * @param tem    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public void saveTemplate(Template tem);
	
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
	 * @Title: deleteTemById   
	 * @Description: TODO(删除模板接口)   
	 * @param templateId    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public void removeTemplateByTemIds(List<String> templateIdsList);
	
}
