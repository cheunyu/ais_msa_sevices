package com.scyb.aisweather.webservice.client.Text;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2015-04-12T22:45:04.205+08:00
 * Generated source version: 3.0.4
 * 
 */
@WebService(targetNamespace = "http://webservice.aisweather.scyb.com/", name = "IText")
@XmlSeeAlso({ObjectFactory.class})
public interface IText {

    @WebMethod
    @RequestWrapper(localName = "textBroadcastService", targetNamespace = "http://webservice.aisweather.scyb.com/", className = "com.scyb.aisweather.webservice.client.Text.TextBroadcastService")
    @ResponseWrapper(localName = "textBroadcastServiceResponse", targetNamespace = "http://webservice.aisweather.scyb.com/", className = "com.scyb.aisweather.webservice.client.Text.TextBroadcastServiceResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String textBroadcastService(
            @WebParam(name = "arg0", targetNamespace = "")
            com.scyb.aisweather.webservice.client.Text.TextBo arg0
    );
}
