
package com.scyb.aisweather.webservice.client.HeavyTow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.HeavyTow package. 
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

    private final static QName _HtBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "htBroadcastService");
    private final static QName _HtBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "htBroadcastServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.HeavyTow
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HtBroadcastService }
     * 
     */
    public HtBroadcastService createHtBroadcastService() {
        return new HtBroadcastService();
    }

    /**
     * Create an instance of {@link HtBroadcastServiceResponse }
     * 
     */
    public HtBroadcastServiceResponse createHtBroadcastServiceResponse() {
        return new HtBroadcastServiceResponse();
    }

    /**
     * Create an instance of {@link BroadcastMMSIBo }
     * 
     */
    public BroadcastMMSIBo createBroadcastMMSIBo() {
        return new BroadcastMMSIBo();
    }

    /**
     * Create an instance of {@link HeavyTowBo }
     * 
     */
    public HeavyTowBo createHeavyTowBo() {
        return new HeavyTowBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HtBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "htBroadcastService")
    public JAXBElement<HtBroadcastService> createHtBroadcastService(HtBroadcastService value) {
        return new JAXBElement<HtBroadcastService>(_HtBroadcastService_QNAME, HtBroadcastService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HtBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "htBroadcastServiceResponse")
    public JAXBElement<HtBroadcastServiceResponse> createHtBroadcastServiceResponse(HtBroadcastServiceResponse value) {
        return new JAXBElement<HtBroadcastServiceResponse>(_HtBroadcastServiceResponse_QNAME, HtBroadcastServiceResponse.class, null, value);
    }

}
