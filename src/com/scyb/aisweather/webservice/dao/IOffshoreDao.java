package com.scyb.aisweather.webservice.dao;

import com.scyb.aisweather.webservice.bo.Ocean;
import com.scyb.aisweather.webservice.bo.Offshore;

import java.util.Date;
import java.util.List;

/**
 * Created by foo on 2015/6/15.
 */
public interface IOffshoreDao {

    /**
     * 根据日期查询近海海区预报
     * */
    public List<Offshore> queryOffshoreByDate(Date date);
}
