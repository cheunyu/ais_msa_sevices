package com.scyb.aisweather.webservice.dao;

import com.scyb.aisweather.webservice.bo.Ocean;

import java.util.Date;
import java.util.List;

/**
 * Created by foo on 2015/6/15.
 */
public interface IOceanDao {

    /**
     * �������ڲ�ѯԶ������Ԥ��
     * */
    public List<Ocean> queryOceanByDate(Date date);
}
