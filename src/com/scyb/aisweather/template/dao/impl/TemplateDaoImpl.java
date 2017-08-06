package com.scyb.aisweather.template.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.scyb.aisweather.common.dao.impl.BaseDaoImpl;
import com.scyb.aisweather.template.bo.Template;
import com.scyb.aisweather.template.dao.ITemplateDao;

public class TemplateDaoImpl extends BaseDaoImpl implements ITemplateDao {

	private Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public void saveTemplate(Template tem) {
		// TODO Auto-generated method stub
		super.saveOrUpdate(tem);
	}

	@Override
	public List<Template> queryTemList() {
		// TODO Auto-generated method stub
		String hql = "from Template tem order by tem.createTime desc";
		return super.queryList(hql);
	}

	/** (非 Javadoc)   
	 * <p>Title: queryTemById</p>  
	 * <p>Description: </p>  
	 * @param temId
	 * @return   
	 * @see com.scyb.aisweather.template.dao.ITemplateDao#queryTemById(java.lang.String)   
	 */
	@Override
	public Template queryTemById(String temId) {
		// TODO Auto-generated method stub
		return (Template) super.getObjectById(Template.class, temId);
	}

	@Override
	public void removeTemplateByTemIds(List<String> templateIdsList) {
		// TODO Auto-generated method stub
		String hql = "from Template tem where tem.guid in ('";
		for(String templateIds:templateIdsList) {
			hql += templateIds + "','";
		}
		List<Template> temList = super.queryList(hql.substring(0, hql.length()-2).toString()+")");
		log.info(hql.substring(0, hql.length()-2).toString()+")");
		super.delList(temList);
	}


}
