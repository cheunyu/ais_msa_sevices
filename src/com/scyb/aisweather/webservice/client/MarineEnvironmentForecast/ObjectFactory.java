
package com.scyb.aisweather.webservice.client.MarineEnvironmentForecast;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.MarineEnvironmentForecast package. 
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

    private final static QName _MefBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "mefBroadcastService");
    private final static QName _MefBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "mefBroadcastServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.MarineEnvironmentForecast
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MefBroadcastService }
     * 
     */
    public MefBroadcastService createMefBroadcastService() {
        return new MefBroadcastService();
    }

    /**
     * Create an instance of {@link MefBroadcastServiceResponse }
     * 
     */
    public MefBroadcastServiceResponse createMefBroadcastServiceResponse() {
        return new MefBroadcastServiceResponse();
    }

    /**
     * Create an instance of {@link MarineEnvironmentForecastBo }
     * 
     */
    public MarineEnvironmentForecastBo createMarineEnvironmentForecastBo() {
        return new MarineEnvironmentForecastBo();
    }

    /**
     * Create an instance of {@link BroadcastMMSIBo }
     * 
     */
    public BroadcastMMSIBo createBroadcastMMSIBo() {
        return new BroadcastMMSIBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MefBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "mefBroadcastService")
    public JAXBElement<MefBroadcastService> createMefBroadcastService(MefBroadcastService value) {
        return new JAXBElement<MefBroadcastService>(_MefBroadcastService_QNAME, MefBroadcastService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MefBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "mefBroadcastServiceResponse")
    public JAXBElement<MefBroadcastServiceResponse> createMefBroadcastServiceResponse(MefBroadcastServiceResponse value) {
        return new JAXBElement<MefBroadcastServiceResponse>(_MefBroadcastServiceResponse_QNAME, MefBroadcastServiceResponse.class, null, value);
    }

}
