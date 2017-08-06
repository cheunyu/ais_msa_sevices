
package com.scyb.aisweather.webservice.client.WarnFog;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.WarnFog package. 
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

    private final static QName _FogWarnBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "fogWarnBroadcastService");
    private final static QName _FogWarnBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "fogWarnBroadcastServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.WarnFog
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FogWarnBroadcastService }
     * 
     */
    public FogWarnBroadcastService createFogWarnBroadcastService() {
        return new FogWarnBroadcastService();
    }

    /**
     * Create an instance of {@link com.scyb.aisweather.webservice.client.WarnFog.FogWarnBroadcastServiceResponse }
     * 
     */
    public FogWarnBroadcastServiceResponse createFogWarnBroadcastServiceResponse() {
        return new FogWarnBroadcastServiceResponse();
    }

    /**
     * Create an instance of {@link BroadcastMMSIBo }
     * 
     */
    public BroadcastMMSIBo createBroadcastMMSIBo() {
        return new BroadcastMMSIBo();
    }

    /**
     * Create an instance of {@link FogWarnBo }
     * 
     */
    public FogWarnBo createFogWarnBo() {
        return new FogWarnBo();
    }

    /**
     * Create an instance of {@link com.scyb.aisweather.webservice.client.WarnFog.MarineWeatherWarnBo }
     * 
     */
    public MarineWeatherWarnBo createMarineWeatherWarnBo() {
        return new MarineWeatherWarnBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FogWarnBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "fogWarnBroadcastService")
    public JAXBElement<FogWarnBroadcastService> createFogWarnBroadcastService(FogWarnBroadcastService value) {
        return new JAXBElement<FogWarnBroadcastService>(_FogWarnBroadcastService_QNAME, FogWarnBroadcastService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.scyb.aisweather.webservice.client.WarnFog.FogWarnBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "fogWarnBroadcastServiceResponse")
    public JAXBElement<FogWarnBroadcastServiceResponse> createFogWarnBroadcastServiceResponse(FogWarnBroadcastServiceResponse value) {
        return new JAXBElement<FogWarnBroadcastServiceResponse>(_FogWarnBroadcastServiceResponse_QNAME, FogWarnBroadcastServiceResponse.class, null, value);
    }

}
