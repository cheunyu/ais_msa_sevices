
package com.scyb.aisweather.webservice.client.WarnCold;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.WarnCold package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ColdWarnBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "coldWarnBroadcastServiceResponse");
    private final static QName _ColdWarnBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "coldWarnBroadcastService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.WarnCold
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ColdWarnBroadcastServiceResponse }
     * 
     */
    public ColdWarnBroadcastServiceResponse createColdWarnBroadcastServiceResponse() {
        return new ColdWarnBroadcastServiceResponse();
    }

    /**
     * Create an instance of {@link ColdWarnBroadcastService }
     * 
     */
    public ColdWarnBroadcastService createColdWarnBroadcastService() {
        return new ColdWarnBroadcastService();
    }

    /**
     * Create an instance of {@link ColdWarnBo }
     * 
     */
    public ColdWarnBo createColdWarnBo() {
        return new ColdWarnBo();
    }

    /**
     * Create an instance of {@link BroadcastMMSIBo }
     * 
     */
    public BroadcastMMSIBo createBroadcastMMSIBo() {
        return new BroadcastMMSIBo();
    }

    /**
     * Create an instance of {@link com.scyb.aisweather.webservice.client.WarnCold.MarineWeatherWarnBo }
     * 
     */
    public MarineWeatherWarnBo createMarineWeatherWarnBo() {
        return new MarineWeatherWarnBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColdWarnBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "coldWarnBroadcastServiceResponse")
    public JAXBElement<ColdWarnBroadcastServiceResponse> createColdWarnBroadcastServiceResponse(ColdWarnBroadcastServiceResponse value) {
        return new JAXBElement<ColdWarnBroadcastServiceResponse>(_ColdWarnBroadcastServiceResponse_QNAME, ColdWarnBroadcastServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColdWarnBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "coldWarnBroadcastService")
    public JAXBElement<ColdWarnBroadcastService> createColdWarnBroadcastService(ColdWarnBroadcastService value) {
        return new JAXBElement<ColdWarnBroadcastService>(_ColdWarnBroadcastService_QNAME, ColdWarnBroadcastService.class, null, value);
    }

}
