
package com.scyb.aisweather.webservice.client.Navigation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.Navigation package. 
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

    private final static QName _NavBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "navBroadcastService");
    private final static QName _NavBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "navBroadcastServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.Navigation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NavBroadcastService }
     * 
     */
    public NavBroadcastService createNavBroadcastService() {
        return new NavBroadcastService();
    }

    /**
     * Create an instance of {@link NavBroadcastServiceResponse }
     * 
     */
    public NavBroadcastServiceResponse createNavBroadcastServiceResponse() {
        return new NavBroadcastServiceResponse();
    }

    /**
     * Create an instance of {@link BroadcastMMSIBo }
     * 
     */
    public BroadcastMMSIBo createBroadcastMMSIBo() {
        return new BroadcastMMSIBo();
    }

    /**
     * Create an instance of {@link NavigationBo }
     * 
     */
    public NavigationBo createNavigationBo() {
        return new NavigationBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "navBroadcastService")
    public JAXBElement<NavBroadcastService> createNavBroadcastService(NavBroadcastService value) {
        return new JAXBElement<NavBroadcastService>(_NavBroadcastService_QNAME, NavBroadcastService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "navBroadcastServiceResponse")
    public JAXBElement<NavBroadcastServiceResponse> createNavBroadcastServiceResponse(NavBroadcastServiceResponse value) {
        return new JAXBElement<NavBroadcastServiceResponse>(_NavBroadcastServiceResponse_QNAME, NavBroadcastServiceResponse.class, null, value);
    }

}
