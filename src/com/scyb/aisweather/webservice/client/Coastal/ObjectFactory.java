
package com.scyb.aisweather.webservice.client.Coastal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.Coastal package. 
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

    private final static QName _CoastalService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "coastalService");
    private final static QName _CoastalServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "coastalServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.Coastal
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CoastalService }
     * 
     */
    public CoastalService createCoastalService() {
        return new CoastalService();
    }

    /**
     * Create an instance of {@link CoastalServiceResponse }
     * 
     */
    public CoastalServiceResponse createCoastalServiceResponse() {
        return new CoastalServiceResponse();
    }

    /**
     * Create an instance of {@link Coastal }
     * 
     */
    public Coastal createCoastal() {
        return new Coastal();
    }

    /**
     * Create an instance of {@link Timestamp }
     * 
     */
    public Timestamp createTimestamp() {
        return new Timestamp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoastalService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "coastalService")
    public JAXBElement<CoastalService> createCoastalService(CoastalService value) {
        return new JAXBElement<CoastalService>(_CoastalService_QNAME, CoastalService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoastalServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "coastalServiceResponse")
    public JAXBElement<CoastalServiceResponse> createCoastalServiceResponse(CoastalServiceResponse value) {
        return new JAXBElement<CoastalServiceResponse>(_CoastalServiceResponse_QNAME, CoastalServiceResponse.class, null, value);
    }

}
