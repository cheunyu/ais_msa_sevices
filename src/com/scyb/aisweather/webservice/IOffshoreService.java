package com.scyb.aisweather.webservice;

import com.scyb.aisweather.webservice.bo.Ocean;
import com.scyb.aisweather.webservice.bo.Offshore;

import javax.jws.WebService;
import java.util.Date;
import java.util.List;

/**
 * Created by foo on 2015/6/15.
 */
@WebService
public interface IOffshoreService {
    public List<Offshore> offshoreService(Date date);
}