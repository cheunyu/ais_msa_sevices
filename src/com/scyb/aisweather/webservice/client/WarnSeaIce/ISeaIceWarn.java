package com.scyb.aisweather.webservice.client.WarnSeaIce;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2015-05-28T13:55:25.446+08:00
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://webservice.aisweather.scyb.com/", name = "ISeaIceWarn")
@XmlSeeAlso({ObjectFactory.class})
public interface ISeaIceWarn {

    @WebMethod
    @RequestWrapper(localName = "seaIceWarnBroadcastService", targetNamespace = "http://webservice.aisweather.scyb.com/", className = "com.scyb.aisweather.webservice.client.WarnSeaIce.SeaIceWarnBroadcastService")
    @ResponseWrapper(localName = "seaIceWarnBroadcastServiceResponse", targetNamespace = "http://webservice.aisweather.scyb.com/", className = "com.scyb.aisweather.webservice.client.WarnSeaIce.SeaIceWarnBroadcastServiceResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int seaIceWarnBroadcastService(
            @WebParam(name = "arg0", targetNamespace = "")
            SeaIceWarnBo arg0
    );
}
