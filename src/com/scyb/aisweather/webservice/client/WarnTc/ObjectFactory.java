
package com.scyb.aisweather.webservice.client.WarnTc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.WarnTc package. 
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

    private final static QName _TcWarnBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "tcWarnBroadcastService");
    private final static QName _TcWarnBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "tcWarnBroadcastServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.WarnTc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TcWarnBroadcastService }
     * 
     */
    public TcWarnBroadcastService createTcWarnBroadcastService() {
        return new TcWarnBroadcastService();
    }

    /**
     * Create an instance of {@link TcWarnBroadcastServiceResponse }
     * 
     */
    public TcWarnBroadcastServiceResponse createTcWarnBroadcastServiceResponse() {
        return new TcWarnBroadcastServiceResponse();
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
     * Create an instance of {@link TropicalCycloneWarnBo }
     * 
     */
    public TropicalCycloneWarnBo createTropicalCycloneWarnBo() {
        return new TropicalCycloneWarnBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TcWarnBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "tcWarnBroadcastService")
    public JAXBElement<TcWarnBroadcastService> createTcWarnBroadcastService(TcWarnBroadcastService value) {
        return new JAXBElement<TcWarnBroadcastService>(_TcWarnBroadcastService_QNAME, TcWarnBroadcastService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TcWarnBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "tcWarnBroadcastServiceResponse")
    public JAXBElement<TcWarnBroadcastServiceResponse> createTcWarnBroadcastServiceResponse(TcWarnBroadcastServiceResponse value) {
        return new JAXBElement<TcWarnBroadcastServiceResponse>(_TcWarnBroadcastServiceResponse_QNAME, TcWarnBroadcastServiceResponse.class, null, value);
    }

}
