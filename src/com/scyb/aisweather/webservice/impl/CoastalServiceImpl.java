package com.scyb.aisweather.webservice.impl;

import com.scyb.aisweather.webservice.ICoastalService;
import com.scyb.aisweather.webservice.bo.Coastal;
import com.scyb.aisweather.webservice.dao.ICoastalDao;
import org.apache.log4j.Logger;

import javax.jws.WebService;
import java.util.Date;
import java.util.List;

/**
 * Created by foo on 2015/6/15.
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.ICoastalService")
public class CoastalServiceImpl implements ICoastalService {

    private Logger log = Logger.getLogger(this.getClass());
    private ICoastalDao coastalDaoImpl;

    public void setCoastalDaoImpl(ICoastalDao coastalDaoImpl) {
        this.coastalDaoImpl = coastalDaoImpl;
    }

    @Override
    public List<Coastal> coastalService(Date date) {
        return coastalDaoImpl.queryCoastalByDate(date);
    }
}
