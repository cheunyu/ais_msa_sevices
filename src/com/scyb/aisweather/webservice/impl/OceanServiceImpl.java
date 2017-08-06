package com.scyb.aisweather.webservice.impl;

import com.scyb.aisweather.webservice.ICoastalService;
import com.scyb.aisweather.webservice.IOceanService;
import com.scyb.aisweather.webservice.bo.Coastal;
import com.scyb.aisweather.webservice.bo.Ocean;
import com.scyb.aisweather.webservice.dao.ICoastalDao;
import com.scyb.aisweather.webservice.dao.IOceanDao;
import org.apache.log4j.Logger;

import javax.jws.WebService;
import java.util.Date;
import java.util.List;

/**
 * Created by foo on 2015/6/15.
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.IOceanService")
public class OceanServiceImpl implements IOceanService {

    private Logger log = Logger.getLogger(this.getClass());
    private IOceanDao oceanDaoImpl;

    public void setOceanDaoImpl(IOceanDao oceanDaoImpl) {
        this.oceanDaoImpl = oceanDaoImpl;
    }

    @Override
    public List<Ocean> oceanService(Date date) {
        return oceanDaoImpl.queryOceanByDate(date);
    }

}
