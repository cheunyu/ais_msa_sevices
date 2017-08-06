package com.scyb.aisweather.webservice.impl;

import com.scyb.aisweather.webservice.IOceanService;
import com.scyb.aisweather.webservice.IOffshoreService;
import com.scyb.aisweather.webservice.bo.Ocean;
import com.scyb.aisweather.webservice.bo.Offshore;
import com.scyb.aisweather.webservice.dao.IOceanDao;
import com.scyb.aisweather.webservice.dao.IOffshoreDao;
import org.apache.log4j.Logger;

import javax.jws.WebService;
import java.util.Date;
import java.util.List;

/**
 * Created by foo on 2015/6/15.
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.IOffshoreService")
public class OffshoreServiceImpl implements IOffshoreService {

    private Logger log = Logger.getLogger(this.getClass());
    private IOffshoreDao offshoreDaoImpl;

    public void setOffshoreDaoImpl(IOffshoreDao offshoreDaoImpl) {
        this.offshoreDaoImpl = offshoreDaoImpl;
    }

    @Override
    public List<Offshore> offshoreService(Date date) {
        return offshoreDaoImpl.queryOffshoreByDate(date);
    }

}
