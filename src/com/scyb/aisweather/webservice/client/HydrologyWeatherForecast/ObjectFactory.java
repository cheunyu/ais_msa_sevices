
package com.scyb.aisweather.webservice.client.HydrologyWeatherForecast;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.HydrologyWeatherForecast package. 
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

    private final static QName _HwfBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "hwfBroadcastService");
    private final static QName _HwfBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "hwfBroadcastServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.HydrologyWeatherForecast
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HwfBroadcastService }
     * 
     */
    public HwfBroadcastService createHwfBroadcastService() {
        return new HwfBroadcastService();
    }

    /**
     * Create an instance of {@link HwfBroadcastServiceResponse }
     * 
     */
    public HwfBroadcastServiceResponse createHwfBroadcastServiceResponse() {
        return new HwfBroadcastServiceResponse();
    }

    /**
     * Create an instance of {@link BroadcastMMSIBo }
     * 
     */
    public BroadcastMMSIBo createBroadcastMMSIBo() {
        return new BroadcastMMSIBo();
    }

    /**
     * Create an instance of {@link HydrologyWeatherForecastBo }
     * 
     */
    public HydrologyWeatherForecastBo createHydrologyWeatherForecastBo() {
        return new HydrologyWeatherForecastBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HwfBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "hwfBroadcastService")
    public JAXBElement<HwfBroadcastService> createHwfBroadcastService(HwfBroadcastService value) {
        return new JAXBElement<HwfBroadcastService>(_HwfBroadcastService_QNAME, HwfBroadcastService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HwfBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "hwfBroadcastServiceResponse")
    public JAXBElement<HwfBroadcastServiceResponse> createHwfBroadcastServiceResponse(HwfBroadcastServiceResponse value) {
        return new JAXBElement<HwfBroadcastServiceResponse>(_HwfBroadcastServiceResponse_QNAME, HwfBroadcastServiceResponse.class, null, value);
    }

}
