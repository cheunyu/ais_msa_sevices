package com.scyb.aisweather.webservice.dao;

import com.scyb.aisweather.webservice.bo.Coastal;

import java.util.Date;
import java.util.List;

/**
 * Created by foo on 2015/6/15.
 */
public interface ICoastalDao {

    /**
     * �������ڲ�ѯ�غ�����Ԥ��
     * */
    public List<Coastal> queryCoastalByDate(Date date);
}
