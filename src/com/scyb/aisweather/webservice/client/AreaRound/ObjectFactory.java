
package com.scyb.aisweather.webservice.client.AreaRound;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.AreaRound package. 
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

    private final static QName _RoundAreaBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "roundAreaBroadcastService");
    private final static QName _RoundAreaBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "roundAreaBroadcastServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.AreaRound
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RoundAreaBroadcastService }
     * 
     */
    public RoundAreaBroadcastService createRoundAreaBroadcastService() {
        return new RoundAreaBroadcastService();
    }

    /**
     * Create an instance of {@link RoundAreaBroadcastServiceResponse }
     * 
     */
    public RoundAreaBroadcastServiceResponse createRoundAreaBroadcastServiceResponse() {
        return new RoundAreaBroadcastServiceResponse();
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
     * Create an instance of {@link DemarcatedRoundBo }
     * 
     */
    public DemarcatedRoundBo createDemarcatedRoundBo() {
        return new DemarcatedRoundBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoundAreaBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "roundAreaBroadcastService")
    public JAXBElement<RoundAreaBroadcastService> createRoundAreaBroadcastService(RoundAreaBroadcastService value) {
        return new JAXBElement<RoundAreaBroadcastService>(_RoundAreaBroadcastService_QNAME, RoundAreaBroadcastService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoundAreaBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "roundAreaBroadcastServiceResponse")
    public JAXBElement<RoundAreaBroadcastServiceResponse> createRoundAreaBroadcastServiceResponse(RoundAreaBroadcastServiceResponse value) {
        return new JAXBElement<RoundAreaBroadcastServiceResponse>(_RoundAreaBroadcastServiceResponse_QNAME, RoundAreaBroadcastServiceResponse.class, null, value);
    }

}
