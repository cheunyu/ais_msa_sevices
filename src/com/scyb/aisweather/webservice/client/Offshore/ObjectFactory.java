
package com.scyb.aisweather.webservice.client.Offshore;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.Offshore package. 
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

    private final static QName _OffshoreServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "offshoreServiceResponse");
    private final static QName _OffshoreService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "offshoreService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.Offshore
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OffshoreServiceResponse }
     * 
     */
    public OffshoreServiceResponse createOffshoreServiceResponse() {
        return new OffshoreServiceResponse();
    }

    /**
     * Create an instance of {@link OffshoreService }
     * 
     */
    public OffshoreService createOffshoreService() {
        return new OffshoreService();
    }

    /**
     * Create an instance of {@link Offshore }
     * 
     */
    public Offshore createOffshore() {
        return new Offshore();
    }

    /**
     * Create an instance of {@link Timestamp }
     * 
     */
    public Timestamp createTimestamp() {
        return new Timestamp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OffshoreServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "offshoreServiceResponse")
    public JAXBElement<OffshoreServiceResponse> createOffshoreServiceResponse(OffshoreServiceResponse value) {
        return new JAXBElement<OffshoreServiceResponse>(_OffshoreServiceResponse_QNAME, OffshoreServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OffshoreService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "offshoreService")
    public JAXBElement<OffshoreService> createOffshoreService(OffshoreService value) {
        return new JAXBElement<OffshoreService>(_OffshoreService_QNAME, OffshoreService.class, null, value);
    }

}
