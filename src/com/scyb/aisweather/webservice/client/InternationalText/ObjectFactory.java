
package com.scyb.aisweather.webservice.client.InternationalText;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.InternationalText package. 
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

    private final static QName _ITextBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "iTextBroadcastService");
    private final static QName _ITextBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "iTextBroadcastServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.InternationalText
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.scyb.aisweather.webservice.client.InternationalText.ITextBroadcastService }
     * 
     */
    public ITextBroadcastService createITextBroadcastService() {
        return new ITextBroadcastService();
    }

    /**
     * Create an instance of {@link com.scyb.aisweather.webservice.client.InternationalText.ITextBroadcastServiceResponse }
     * 
     */
    public ITextBroadcastServiceResponse createITextBroadcastServiceResponse() {
        return new ITextBroadcastServiceResponse();
    }

    /**
     * Create an instance of {@link InternationalTextBo }
     * 
     */
    public InternationalTextBo createInternationalTextBo() {
        return new InternationalTextBo();
    }

    /**
     * Create an instance of {@link BroadcastMMSIBo }
     * 
     */
    public BroadcastMMSIBo createBroadcastMMSIBo() {
        return new BroadcastMMSIBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.scyb.aisweather.webservice.client.InternationalText.ITextBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "iTextBroadcastService")
    public JAXBElement<ITextBroadcastService> createITextBroadcastService(ITextBroadcastService value) {
        return new JAXBElement<ITextBroadcastService>(_ITextBroadcastService_QNAME, ITextBroadcastService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.scyb.aisweather.webservice.client.InternationalText.ITextBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "iTextBroadcastServiceResponse")
    public JAXBElement<ITextBroadcastServiceResponse> createITextBroadcastServiceResponse(ITextBroadcastServiceResponse value) {
        return new JAXBElement<ITextBroadcastServiceResponse>(_ITextBroadcastServiceResponse_QNAME, ITextBroadcastServiceResponse.class, null, value);
    }

}
