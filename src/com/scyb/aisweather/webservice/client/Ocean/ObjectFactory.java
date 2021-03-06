
package com.scyb.aisweather.webservice.client.Ocean;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.Ocean package. 
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

    private final static QName _OceanServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "oceanServiceResponse");
    private final static QName _OceanService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "oceanService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.Ocean
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OceanServiceResponse }
     * 
     */
    public OceanServiceResponse createOceanServiceResponse() {
        return new OceanServiceResponse();
    }

    /**
     * Create an instance of {@link OceanService }
     * 
     */
    public OceanService createOceanService() {
        return new OceanService();
    }

    /**
     * Create an instance of {@link Ocean }
     * 
     */
    public Ocean createOcean() {
        return new Ocean();
    }

    /**
     * Create an instance of {@link Timestamp }
     * 
     */
    public Timestamp createTimestamp() {
        return new Timestamp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OceanServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "oceanServiceResponse")
    public JAXBElement<OceanServiceResponse> createOceanServiceResponse(OceanServiceResponse value) {
        return new JAXBElement<OceanServiceResponse>(_OceanServiceResponse_QNAME, OceanServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OceanService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "oceanService")
    public JAXBElement<OceanService> createOceanService(OceanService value) {
        return new JAXBElement<OceanService>(_OceanService_QNAME, OceanService.class, null, value);
    }

}
