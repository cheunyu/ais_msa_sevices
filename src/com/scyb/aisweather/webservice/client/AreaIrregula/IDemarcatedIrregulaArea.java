package com.scyb.aisweather.webservice.client.AreaIrregula;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2015-04-12T22:36:07.919+08:00
 * Generated source version: 3.0.4
 * 
 */
@WebService(targetNamespace = "http://webservice.aisweather.scyb.com/", name = "IDemarcatedIrregulaArea")
@XmlSeeAlso({ObjectFactory.class})
public interface IDemarcatedIrregulaArea {

    @WebMethod
    @RequestWrapper(localName = "irregulaAreaBroadcastService", targetNamespace = "http://webservice.aisweather.scyb.com/", className = "com.scyb.aisweather.webservice.client.AreaIrregula.IrregulaAreaBroadcastService")
    @ResponseWrapper(localName = "irregulaAreaBroadcastServiceResponse", targetNamespace = "http://webservice.aisweather.scyb.com/", className = "com.scyb.aisweather.webservice.client.AreaIrregula.IrregulaAreaBroadcastServiceResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String irregulaAreaBroadcastService(
            @WebParam(name = "arg0", targetNamespace = "")
            DemarcatedIrregulaAreaBo arg0
    );
}
