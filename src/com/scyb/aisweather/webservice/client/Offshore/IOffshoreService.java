package com.scyb.aisweather.webservice.client.Offshore;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2015-06-15T12:53:21.254+08:00
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://webservice.aisweather.scyb.com/", name = "IOffshoreService")
@XmlSeeAlso({ObjectFactory.class})
public interface IOffshoreService {

    @WebMethod
    @RequestWrapper(localName = "offshoreService", targetNamespace = "http://webservice.aisweather.scyb.com/", className = "com.scyb.aisweather.webservice.client.Offshore.OffshoreService")
    @ResponseWrapper(localName = "offshoreServiceResponse", targetNamespace = "http://webservice.aisweather.scyb.com/", className = "com.scyb.aisweather.webservice.client.Offshore.OffshoreServiceResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.scyb.aisweather.webservice.client.Offshore.Offshore> offshoreService(
            @WebParam(name = "arg0", targetNamespace = "")
            javax.xml.datatype.XMLGregorianCalendar arg0
    );
}
