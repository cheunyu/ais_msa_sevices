
package com.scyb.aisweather.webservice.client.ShiftAidsMarkedDynamic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.ShiftAidsMarkedDynamic package. 
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

    private final static QName _ShiftAmdBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "shiftAmdBroadcastService");
    private final static QName _ShiftAmdBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "shiftAmdBroadcastServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.ShiftAidsMarkedDynamic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShiftAmdBroadcastService }
     * 
     */
    public ShiftAmdBroadcastService createShiftAmdBroadcastService() {
        return new ShiftAmdBroadcastService();
    }

    /**
     * Create an instance of {@link ShiftAmdBroadcastServiceResponse }
     * 
     */
    public ShiftAmdBroadcastServiceResponse createShiftAmdBroadcastServiceResponse() {
        return new ShiftAmdBroadcastServiceResponse();
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
     * Create an instance of {@link ShiftDynamicBo }
     * 
     */
    public ShiftDynamicBo createShiftDynamicBo() {
        return new ShiftDynamicBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShiftAmdBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "shiftAmdBroadcastService")
    public JAXBElement<ShiftAmdBroadcastService> createShiftAmdBroadcastService(ShiftAmdBroadcastService value) {
        return new JAXBElement<ShiftAmdBroadcastService>(_ShiftAmdBroadcastService_QNAME, ShiftAmdBroadcastService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShiftAmdBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "shiftAmdBroadcastServiceResponse")
    public JAXBElement<ShiftAmdBroadcastServiceResponse> createShiftAmdBroadcastServiceResponse(ShiftAmdBroadcastServiceResponse value) {
        return new JAXBElement<ShiftAmdBroadcastServiceResponse>(_ShiftAmdBroadcastServiceResponse_QNAME, ShiftAmdBroadcastServiceResponse.class, null, value);
    }

}
