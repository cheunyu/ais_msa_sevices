
package com.scyb.aisweather.webservice.client.AreaIrregula;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.AreaIrregula package. 
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

    private final static QName _IrregulaAreaBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "irregulaAreaBroadcastService");
    private final static QName _IrregulaAreaBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "irregulaAreaBroadcastServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.AreaIrregula
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IrregulaAreaBroadcastService }
     * 
     */
    public IrregulaAreaBroadcastService createIrregulaAreaBroadcastService() {
        return new IrregulaAreaBroadcastService();
    }

    /**
     * Create an instance of {@link IrregulaAreaBroadcastServiceResponse }
     * 
     */
    public IrregulaAreaBroadcastServiceResponse createIrregulaAreaBroadcastServiceResponse() {
        return new IrregulaAreaBroadcastServiceResponse();
    }

    /**
     * Create an instance of {@link BroadcastMMSIBo }
     * 
     */
    public BroadcastMMSIBo createBroadcastMMSIBo() {
        return new BroadcastMMSIBo();
    }

    /**
     * Create an instance of {@link DemarcatedIrregulaAreaBo }
     * 
     */
    public DemarcatedIrregulaAreaBo createDemarcatedIrregulaAreaBo() {
        return new DemarcatedIrregulaAreaBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IrregulaAreaBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "irregulaAreaBroadcastService")
    public JAXBElement<IrregulaAreaBroadcastService> createIrregulaAreaBroadcastService(IrregulaAreaBroadcastService value) {
        return new JAXBElement<IrregulaAreaBroadcastService>(_IrregulaAreaBroadcastService_QNAME, IrregulaAreaBroadcastService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IrregulaAreaBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "irregulaAreaBroadcastServiceResponse")
    public JAXBElement<IrregulaAreaBroadcastServiceResponse> createIrregulaAreaBroadcastServiceResponse(IrregulaAreaBroadcastServiceResponse value) {
        return new JAXBElement<IrregulaAreaBroadcastServiceResponse>(_IrregulaAreaBroadcastServiceResponse_QNAME, IrregulaAreaBroadcastServiceResponse.class, null, value);
    }

}
