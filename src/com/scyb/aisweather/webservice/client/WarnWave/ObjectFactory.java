
package com.scyb.aisweather.webservice.client.WarnWave;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scyb.aisweather.webservice.client.WarnWave package. 
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

    private final static QName _WaveWarnBroadcastService_QNAME = new QName("http://webservice.aisweather.scyb.com/", "waveWarnBroadcastService");
    private final static QName _WaveWarnBroadcastServiceResponse_QNAME = new QName("http://webservice.aisweather.scyb.com/", "waveWarnBroadcastServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scyb.aisweather.webservice.client.WarnWave
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WaveWarnBroadcastService }
     * 
     */
    public WaveWarnBroadcastService createWaveWarnBroadcastService() {
        return new WaveWarnBroadcastService();
    }

    /**
     * Create an instance of {@link WaveWarnBroadcastServiceResponse }
     * 
     */
    public WaveWarnBroadcastServiceResponse createWaveWarnBroadcastServiceResponse() {
        return new WaveWarnBroadcastServiceResponse();
    }

    /**
     * Create an instance of {@link BroadcastMMSIBo }
     * 
     */
    public BroadcastMMSIBo createBroadcastMMSIBo() {
        return new BroadcastMMSIBo();
    }

    /**
     * Create an instance of {@link com.scyb.aisweather.webservice.client.WarnWave.MarineWeatherWarnBo }
     * 
     */
    public MarineWeatherWarnBo createMarineWeatherWarnBo() {
        return new MarineWeatherWarnBo();
    }

    /**
     * Create an instance of {@link WaveWarnBo }
     * 
     */
    public WaveWarnBo createWaveWarnBo() {
        return new WaveWarnBo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaveWarnBroadcastService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "waveWarnBroadcastService")
    public JAXBElement<WaveWarnBroadcastService> createWaveWarnBroadcastService(WaveWarnBroadcastService value) {
        return new JAXBElement<WaveWarnBroadcastService>(_WaveWarnBroadcastService_QNAME, WaveWarnBroadcastService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaveWarnBroadcastServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.aisweather.scyb.com/", name = "waveWarnBroadcastServiceResponse")
    public JAXBElement<WaveWarnBroadcastServiceResponse> createWaveWarnBroadcastServiceResponse(WaveWarnBroadcastServiceResponse value) {
        return new JAXBElement<WaveWarnBroadcastServiceResponse>(_WaveWarnBroadcastServiceResponse_QNAME, WaveWarnBroadcastServiceResponse.class, null, value);
    }

}
