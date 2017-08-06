
package com.scyb.aisweather.webservice.client.MarineWeatherForecast;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.MarineWeatherForecast package. 
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

    private final static QName _MwfBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "mwfBroadcastServiceResponse");
    private final static QName _MwfBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "mwfBroadcastService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.MarineWeatherForecast
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MwfBroadcastServiceResponse }
     * 
     */
    public MwfBroadcastServiceResponse createMwfBroadcastServiceResponse() {
        return new MwfBroadcastServiceResponse();
    }

    /**
     * Create an instance of {@link MwfBroadcastService }
     * 
     */
    public MwfBroadcastService createMwfBroadcastService() {
        return new MwfBroadcastService();
    }

    /**
     * Create an instance of {@link BroadcastMMSIBo }
     * 
     */
    public BroadcastMMSIBo createBroadcastMMSIBo() {
        return new BroadcastMMSIBo();
    }

    /**
     * Create an instance of {@link MarineWeatherForecastBo }
     * 
     */
    public MarineWeatherForecastBo createMarineWeatherForecastBo() {
        return new MarineWeatherForecastBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MwfBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "mwfBroadcastServiceResponse")
    public JAXBElement<MwfBroadcastServiceResponse> createMwfBroadcastServiceResponse(MwfBroadcastServiceResponse value) {
        return new JAXBElement<MwfBroadcastServiceResponse>(_MwfBroadcastServiceResponse_QNAME, MwfBroadcastServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MwfBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "mwfBroadcastService")
    public JAXBElement<MwfBroadcastService> createMwfBroadcastService(MwfBroadcastService value) {
        return new JAXBElement<MwfBroadcastService>(_MwfBroadcastService_QNAME, MwfBroadcastService.class, null, value);
    }

}
