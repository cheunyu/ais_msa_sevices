
package com.scyb.aisweather.webservice.client.LightAidsMarkedDynamic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.LightAidsMarkedDynamic package. 
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

    private final static QName _LightAmdBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "lightAmdBroadcastService");
    private final static QName _LightAmdBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "lightAmdBroadcastServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.LightAidsMarkedDynamic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LightAmdBroadcastService }
     * 
     */
    public LightAmdBroadcastService createLightAmdBroadcastService() {
        return new LightAmdBroadcastService();
    }

    /**
     * Create an instance of {@link LightAmdBroadcastServiceResponse }
     * 
     */
    public LightAmdBroadcastServiceResponse createLightAmdBroadcastServiceResponse() {
        return new LightAmdBroadcastServiceResponse();
    }

    /**
     * Create an instance of {@link BroadcastMMSIBo }
     * 
     */
    public BroadcastMMSIBo createBroadcastMMSIBo() {
        return new BroadcastMMSIBo();
    }

    /**
     * Create an instance of {@link AidsMarkedDynamicBo }
     * 
     */
    public AidsMarkedDynamicBo createAidsMarkedDynamicBo() {
        return new AidsMarkedDynamicBo();
    }

    /**
     * Create an instance of {@link LightDynamicBo }
     * 
     */
    public LightDynamicBo createLightDynamicBo() {
        return new LightDynamicBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LightAmdBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "lightAmdBroadcastService")
    public JAXBElement<LightAmdBroadcastService> createLightAmdBroadcastService(LightAmdBroadcastService value) {
        return new JAXBElement<LightAmdBroadcastService>(_LightAmdBroadcastService_QNAME, LightAmdBroadcastService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LightAmdBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "lightAmdBroadcastServiceResponse")
    public JAXBElement<LightAmdBroadcastServiceResponse> createLightAmdBroadcastServiceResponse(LightAmdBroadcastServiceResponse value) {
        return new JAXBElement<LightAmdBroadcastServiceResponse>(_LightAmdBroadcastServiceResponse_QNAME, LightAmdBroadcastServiceResponse.class, null, value);
    }

}
