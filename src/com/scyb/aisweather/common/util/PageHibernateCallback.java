package com.scyb.aisweather.common.util;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

public class PageHibernateCallback implements HibernateCallback{
	 private String hql;
	 private int firstResult;
	 private int maxResult;
	 public PageHibernateCallback(String hql,int firstResult, int maxResult){
		 this.hql=hql;
		 this.firstResult=firstResult;
		 this.maxResult=maxResult;
	 }
	 public Object doInHibernate(Session session) throws HibernateException, SQLException {
		 Query query = session.createQuery(hql);
		 query.setFirstResult(firstResult);
		 query.setMaxResults(maxResult);
		 return query.list();
	}
}
