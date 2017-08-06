
package com.scyb.aisweather.webservice.client.AreaRectangle;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.AreaRectangle package. 
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

    private final static QName _RectangleAreaBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "rectangleAreaBroadcastService");
    private final static QName _RectangleAreaBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "rectangleAreaBroadcastServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.AreaRectangle
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RectangleAreaBroadcastService }
     * 
     */
    public RectangleAreaBroadcastService createRectangleAreaBroadcastService() {
        return new RectangleAreaBroadcastService();
    }

    /**
     * Create an instance of {@link RectangleAreaBroadcastServiceResponse }
     * 
     */
    public RectangleAreaBroadcastServiceResponse createRectangleAreaBroadcastServiceResponse() {
        return new RectangleAreaBroadcastServiceResponse();
    }

    /**
     * Create an instance of {@link BroadcastMMSIBo }
     * 
     */
    public BroadcastMMSIBo createBroadcastMMSIBo() {
        return new BroadcastMMSIBo();
    }

    /**
     * Create an instance of {@link DemarcatedAreaBo }
     * 
     */
    public DemarcatedAreaBo createDemarcatedAreaBo() {
        return new DemarcatedAreaBo();
    }

    /**
     * Create an instance of {@link DemarcatedRectangleBo }
     * 
     */
    public DemarcatedRectangleBo createDemarcatedRectangleBo() {
        return new DemarcatedRectangleBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RectangleAreaBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "rectangleAreaBroadcastService")
    public JAXBElement<RectangleAreaBroadcastService> createRectangleAreaBroadcastService(RectangleAreaBroadcastService value) {
        return new JAXBElement<RectangleAreaBroadcastService>(_RectangleAreaBroadcastService_QNAME, RectangleAreaBroadcastService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RectangleAreaBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "rectangleAreaBroadcastServiceResponse")
    public JAXBElement<RectangleAreaBroadcastServiceResponse> createRectangleAreaBroadcastServiceResponse(RectangleAreaBroadcastServiceResponse value) {
        return new JAXBElement<RectangleAreaBroadcastServiceResponse>(_RectangleAreaBroadcastServiceResponse_QNAME, RectangleAreaBroadcastServiceResponse.class, null, value);
    }

}
