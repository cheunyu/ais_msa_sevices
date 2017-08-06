
package com.scyb.aisweather.webservice.client.WarnStormSurge;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.WarnStormSurge package. 
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

    private final static QName _SsWarnBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "ssWarnBroadcastService");
    private final static QName _SsWarnBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "ssWarnBroadcastServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.WarnStormSurge
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SsWarnBroadcastService }
     * 
     */
    public SsWarnBroadcastService createSsWarnBroadcastService() {
        return new SsWarnBroadcastService();
    }

    /**
     * Create an instance of {@link SsWarnBroadcastServiceResponse }
     * 
     */
    public SsWarnBroadcastServiceResponse createSsWarnBroadcastServiceResponse() {
        return new SsWarnBroadcastServiceResponse();
    }

    /**
     * Create an instance of {@link StormSurgeWarnBo }
     * 
     */
    public StormSurgeWarnBo createStormSurgeWarnBo() {
        return new StormSurgeWarnBo();
    }

    /**
     * Create an instance of {@link BroadcastMMSIBo }
     * 
     */
    public BroadcastMMSIBo createBroadcastMMSIBo() {
        return new BroadcastMMSIBo();
    }

    /**
     * Create an instance of {@link com.scyb.aisweather.webservice.client.WarnStormSurge.MarineWeatherWarnBo }
     * 
     */
    public MarineWeatherWarnBo createMarineWeatherWarnBo() {
        return new MarineWeatherWarnBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsWarnBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "ssWarnBroadcastService")
    public JAXBElement<SsWarnBroadcastService> createSsWarnBroadcastService(SsWarnBroadcastService value) {
        return new JAXBElement<SsWarnBroadcastService>(_SsWarnBroadcastService_QNAME, SsWarnBroadcastService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsWarnBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "ssWarnBroadcastServiceResponse")
    public JAXBElement<SsWarnBroadcastServiceResponse> createSsWarnBroadcastServiceResponse(SsWarnBroadcastServiceResponse value) {
        return new JAXBElement<SsWarnBroadcastServiceResponse>(_SsWarnBroadcastServiceResponse_QNAME, SsWarnBroadcastServiceResponse.class, null, value);
    }

}
