package com.scyb.aisweather.webservice.client.Ocean;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2015-06-15T12:44:26.882+08:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "OceanServiceImplService", 
                  wsdlLocation = "http://localhost:8080/ais/services/ocean?wsdl",
                  targetNamespace = "http://impl.webservice.aisweather.scyb.com/") 
public class OceanServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.webservice.aisweather.scyb.com/", "OceanServiceImplService");
    public final static QName OceanServiceImplPort = new QName("http://impl.webservice.aisweather.scyb.com/", "OceanServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/ais/services/ocean?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OceanServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/ais/services/ocean?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OceanServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OceanServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OceanServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public OceanServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public OceanServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public OceanServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns IOceanService
     */
    @WebEndpoint(name = "OceanServiceImplPort")
    public IOceanService getOceanServiceImplPort() {
        return super.getPort(OceanServiceImplPort, IOceanService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IOceanService
     */
    @WebEndpoint(name = "OceanServiceImplPort")
    public IOceanService getOceanServiceImplPort(WebServiceFeature... features) {
        return super.getPort(OceanServiceImplPort, IOceanService.class, features);
    }

}
