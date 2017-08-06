
package com.scyb.aisweather.webservice.client.DgpsAidsMarkedDynamic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.DgpsAidsMarkedDynamic package. 
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

    private final static QName _DgpsAmdBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "dgpsAmdBroadcastService");
    private final static QName _DgpsAmdBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "dgpsAmdBroadcastServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.DgpsAidsMarkedDynamic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DgpsAmdBroadcastService }
     * 
     */
    public DgpsAmdBroadcastService createDgpsAmdBroadcastService() {
        return new DgpsAmdBroadcastService();
    }

    /**
     * Create an instance of {@link DgpsAmdBroadcastServiceResponse }
     * 
     */
    public DgpsAmdBroadcastServiceResponse createDgpsAmdBroadcastServiceResponse() {
        return new DgpsAmdBroadcastServiceResponse();
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
     * Create an instance of {@link DgpsDynamicBo }
     * 
     */
    public DgpsDynamicBo createDgpsDynamicBo() {
        return new DgpsDynamicBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DgpsAmdBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "dgpsAmdBroadcastService")
    public JAXBElement<DgpsAmdBroadcastService> createDgpsAmdBroadcastService(DgpsAmdBroadcastService value) {
        return new JAXBElement<DgpsAmdBroadcastService>(_DgpsAmdBroadcastService_QNAME, DgpsAmdBroadcastService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DgpsAmdBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "dgpsAmdBroadcastServiceResponse")
    public JAXBElement<DgpsAmdBroadcastServiceResponse> createDgpsAmdBroadcastServiceResponse(DgpsAmdBroadcastServiceResponse value) {
        return new JAXBElement<DgpsAmdBroadcastServiceResponse>(_DgpsAmdBroadcastServiceResponse_QNAME, DgpsAmdBroadcastServiceResponse.class, null, value);
    }

}
