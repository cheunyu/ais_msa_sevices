
package com.scyb.aisweather.webservice.client.ConstructionWork;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.ConstructionWork package. 
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

    private final static QName _WorkBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "workBroadcastService");
    private final static QName _WorkBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "workBroadcastServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.ConstructionWork
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WorkBroadcastService }
     * 
     */
    public WorkBroadcastService createWorkBroadcastService() {
        return new WorkBroadcastService();
    }

    /**
     * Create an instance of {@link WorkBroadcastServiceResponse }
     * 
     */
    public WorkBroadcastServiceResponse createWorkBroadcastServiceResponse() {
        return new WorkBroadcastServiceResponse();
    }

    /**
     * Create an instance of {@link BroadcastMMSIBo }
     * 
     */
    public BroadcastMMSIBo createBroadcastMMSIBo() {
        return new BroadcastMMSIBo();
    }

    /**
     * Create an instance of {@link ConstructionWorkBo }
     * 
     */
    public ConstructionWorkBo createConstructionWorkBo() {
        return new ConstructionWorkBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "workBroadcastService")
    public JAXBElement<WorkBroadcastService> createWorkBroadcastService(WorkBroadcastService value) {
        return new JAXBElement<WorkBroadcastService>(_WorkBroadcastService_QNAME, WorkBroadcastService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "workBroadcastServiceResponse")
    public JAXBElement<WorkBroadcastServiceResponse> createWorkBroadcastServiceResponse(WorkBroadcastServiceResponse value) {
        return new JAXBElement<WorkBroadcastServiceResponse>(_WorkBroadcastServiceResponse_QNAME, WorkBroadcastServiceResponse.class, null, value);
    }

}
