
package com.scyb.aisweather.webservice.client.Text;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.Text package. 
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

    private final static QName _TextBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "textBroadcastService");
    private final static QName _TextBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "textBroadcastServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.Text
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TextBroadcastService }
     * 
     */
    public TextBroadcastService createTextBroadcastService() {
        return new TextBroadcastService();
    }

    /**
     * Create an instance of {@link TextBroadcastServiceResponse }
     * 
     */
    public TextBroadcastServiceResponse createTextBroadcastServiceResponse() {
        return new TextBroadcastServiceResponse();
    }

    /**
     * Create an instance of {@link BroadcastMMSIBo }
     * 
     */
    public BroadcastMMSIBo createBroadcastMMSIBo() {
        return new BroadcastMMSIBo();
    }

    /**
     * Create an instance of {@link TextBo }
     * 
     */
    public TextBo createTextBo() {
        return new TextBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "textBroadcastService")
    public JAXBElement<TextBroadcastService> createTextBroadcastService(TextBroadcastService value) {
        return new JAXBElement<TextBroadcastService>(_TextBroadcastService_QNAME, TextBroadcastService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "textBroadcastServiceResponse")
    public JAXBElement<TextBroadcastServiceResponse> createTextBroadcastServiceResponse(TextBroadcastServiceResponse value) {
        return new JAXBElement<TextBroadcastServiceResponse>(_TextBroadcastServiceResponse_QNAME, TextBroadcastServiceResponse.class, null, value);
    }

}
