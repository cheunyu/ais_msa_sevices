
package com.scyb.aisweather.webservice.client.WarnSeaIce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.WarnSeaIce package. 
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

    private final static QName _SeaIceWarnBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "seaIceWarnBroadcastServiceResponse");
    private final static QName _SeaIceWarnBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "seaIceWarnBroadcastService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.WarnSeaIce
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SeaIceWarnBroadcastServiceResponse }
     * 
     */
    public SeaIceWarnBroadcastServiceResponse createSeaIceWarnBroadcastServiceResponse() {
        return new SeaIceWarnBroadcastServiceResponse();
    }

    /**
     * Create an instance of {@link SeaIceWarnBroadcastService }
     * 
     */
    public SeaIceWarnBroadcastService createSeaIceWarnBroadcastService() {
        return new SeaIceWarnBroadcastService();
    }

    /**
     * Create an instance of {@link SeaIceWarnBo }
     * 
     */
    public SeaIceWarnBo createSeaIceWarnBo() {
        return new SeaIceWarnBo();
    }

    /**
     * Create an instance of {@link BroadcastMMSIBo }
     * 
     */
    public BroadcastMMSIBo createBroadcastMMSIBo() {
        return new BroadcastMMSIBo();
    }

    /**
     * Create an instance of {@link MarineWeatherWarnBo }
     * 
     */
    public MarineWeatherWarnBo createMarineWeatherWarnBo() {
        return new MarineWeatherWarnBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeaIceWarnBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "seaIceWarnBroadcastServiceResponse")
    public JAXBElement<SeaIceWarnBroadcastServiceResponse> createSeaIceWarnBroadcastServiceResponse(SeaIceWarnBroadcastServiceResponse value) {
        return new JAXBElement<SeaIceWarnBroadcastServiceResponse>(_SeaIceWarnBroadcastServiceResponse_QNAME, SeaIceWarnBroadcastServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeaIceWarnBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "seaIceWarnBroadcastService")
    public JAXBElement<SeaIceWarnBroadcastService> createSeaIceWarnBroadcastService(SeaIceWarnBroadcastService value) {
        return new JAXBElement<SeaIceWarnBroadcastService>(_SeaIceWarnBroadcastService_QNAME, SeaIceWarnBroadcastService.class, null, value);
    }

}
