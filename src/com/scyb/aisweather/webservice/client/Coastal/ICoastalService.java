package com.scyb.aisweather.webservice.client.Coastal;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2015-06-16T09:30:16.378+08:00
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://webservice.aisweather.scyb.com/", name = "ICoastalService")
@XmlSeeAlso({ObjectFactory.class})
public interface ICoastalService {

    @WebMethod
    @RequestWrapper(localName = "coastalService", targetNamespace = "http://webservice.aisweather.scyb.com/", className = "com.scyb.aisweather.webservice.client.Coastal.CoastalService")
    @ResponseWrapper(localName = "coastalServiceResponse", targetNamespace = "http://webservice.aisweather.scyb.com/", className = "com.scyb.aisweather.webservice.client.Coastal.CoastalServiceResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.scyb.aisweather.webservice.client.Coastal.Coastal> coastalService(
            @WebParam(name = "arg0", targetNamespace = "")
            javax.xml.datatype.XMLGregorianCalendar arg0
    );
}
