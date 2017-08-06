
package com.scyb.aisweather.webservice.client.DistressShip;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.DistressShip package. 
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

    private final static QName _DsBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "dsBroadcastService");
    private final static QName _DsBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "dsBroadcastServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.DistressShip
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DsBroadcastService }
     * 
     */
    public DsBroadcastService createDsBroadcastService() {
        return new DsBroadcastService();
    }

    /**
     * Create an instance of {@link DsBroadcastServiceResponse }
     * 
     */
    public DsBroadcastServiceResponse createDsBroadcastServiceResponse() {
        return new DsBroadcastServiceResponse();
    }

    /**
     * Create an instance of {@link BroadcastMMSIBo }
     * 
     */
    public BroadcastMMSIBo createBroadcastMMSIBo() {
        return new BroadcastMMSIBo();
    }

    /**
     * Create an instance of {@link DistressShipBo }
     * 
     */
    public DistressShipBo createDistressShipBo() {
        return new DistressShipBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DsBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "dsBroadcastService")
    public JAXBElement<DsBroadcastService> createDsBroadcastService(DsBroadcastService value) {
        return new JAXBElement<DsBroadcastService>(_DsBroadcastService_QNAME, DsBroadcastService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DsBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "dsBroadcastServiceResponse")
    public JAXBElement<DsBroadcastServiceResponse> createDsBroadcastServiceResponse(DsBroadcastServiceResponse value) {
        return new JAXBElement<DsBroadcastServiceResponse>(_DsBroadcastServiceResponse_QNAME, DsBroadcastServiceResponse.class, null, value);
    }

}
