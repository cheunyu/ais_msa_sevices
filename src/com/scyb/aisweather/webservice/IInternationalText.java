package com.scyb.aisweather.webservice;

import com.scyb.aisweather.webservice.bo.InternationalTextBo;

import javax.jws.WebService;

/**
 * Created by foo on 2015/4/13.
 */
@WebService
public interface IInternationalText {

    public int iTextBroadcastService(InternationalTextBo iTextBo);
}
