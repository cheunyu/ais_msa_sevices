package com.scyb.aisweather.webservice.client.HeavyTow;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2015-04-12T14:19:54.777+08:00
 * Generated source version: 3.0.4
 * 
 */
@WebService(targetNamespace = "http://webservice.aisweather.scyb.com/", name = "IHeavyTow")
@XmlSeeAlso({ObjectFactory.class})
public interface IHeavyTow {

    @WebMethod
    @RequestWrapper(localName = "htBroadcastService", targetNamespace = "http://webservice.aisweather.scyb.com/", className = "com.scyb.aisweather.webservice.client.HeavyTow.HtBroadcastService")
    @ResponseWrapper(localName = "htBroadcastServiceResponse", targetNamespace = "http://webservice.aisweather.scyb.com/", className = "com.scyb.aisweather.webservice.client.HeavyTow.HtBroadcastServiceResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String htBroadcastService(
            @WebParam(name = "arg0", targetNamespace = "")
            com.scyb.aisweather.webservice.client.HeavyTow.HeavyTowBo arg0
    );
}
