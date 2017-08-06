
package com.scyb.aisweather.webservice.client.BaseAidsMarkedDynamic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.BaseAidsMarkedDynamic package. 
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

    private final static QName _AmdBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "amdBroadcastService");
    private final static QName _AmdBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "amdBroadcastServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.BaseAidsMarkedDynamic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AmdBroadcastService }
     * 
     */
    public AmdBroadcastService createAmdBroadcastService() {
        return new AmdBroadcastService();
    }

    /**
     * Create an instance of {@link AmdBroadcastServiceResponse }
     * 
     */
    public AmdBroadcastServiceResponse createAmdBroadcastServiceResponse() {
        return new AmdBroadcastServiceResponse();
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
     * Create an instance of {@link BaseDynamicBo }
     * 
     */
    public BaseDynamicBo createBaseDynamicBo() {
        return new BaseDynamicBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmdBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "amdBroadcastService")
    public JAXBElement<AmdBroadcastService> createAmdBroadcastService(AmdBroadcastService value) {
        return new JAXBElement<AmdBroadcastService>(_AmdBroadcastService_QNAME, AmdBroadcastService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmdBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "amdBroadcastServiceResponse")
    public JAXBElement<AmdBroadcastServiceResponse> createAmdBroadcastServiceResponse(AmdBroadcastServiceResponse value) {
        return new JAXBElement<AmdBroadcastServiceResponse>(_AmdBroadcastServiceResponse_QNAME, AmdBroadcastServiceResponse.class, null, value);
    }

}
