package com.scyb.aisweather.webservice.client.WarnTc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2015-04-12T23:06:50.139+08:00
 * Generated source version: 3.0.4
 * 
 */
@WebService(targetNamespace = "http://webservice.aisweather.scyb.com/", name = "ITropicalCycloneWarn")
@XmlSeeAlso({ObjectFactory.class})
public interface ITropicalCycloneWarn {

    @WebMethod
    @RequestWrapper(localName = "tcWarnBroadcastService", targetNamespace = "http://webservice.aisweather.scyb.com/", className = "com.scyb.aisweather.webservice.client.WarnTc.TcWarnBroadcastService")
    @ResponseWrapper(localName = "tcWarnBroadcastServiceResponse", targetNamespace = "http://webservice.aisweather.scyb.com/", className = "com.scyb.aisweather.webservice.client.WarnTc.TcWarnBroadcastServiceResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String tcWarnBroadcastService(
            @WebParam(name = "arg0", targetNamespace = "")
            TropicalCycloneWarnBo arg0
    );
}
