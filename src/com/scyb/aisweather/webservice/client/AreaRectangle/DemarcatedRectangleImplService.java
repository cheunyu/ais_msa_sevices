package com.scyb.aisweather.webservice.client.AreaRectangle;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2015-04-12T15:21:16.270+08:00
 * Generated source version: 3.0.4
 * 
 */
@WebServiceClient(name = "DemarcatedRectangleImplService", 
                  wsdlLocation = "http://localhost:8080/services/drl?wsdl",
                  targetNamespace = "http://impl.webservice.aisweather.scyb.com/") 
public class DemarcatedRectangleImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.webservice.aisweather.scyb.com/", "DemarcatedRectangleImplService");
    public final static QName DemarcatedRectangleImplPort = new QName("http://impl.webservice.aisweather.scyb.com/", "DemarcatedRectangleImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/services/drl?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(DemarcatedRectangleImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/services/drl?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public DemarcatedRectangleImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DemarcatedRectangleImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DemarcatedRectangleImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public DemarcatedRectangleImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public DemarcatedRectangleImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public DemarcatedRectangleImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns IDemarcatedRectangle
     */
    @WebEndpoint(name = "DemarcatedRectangleImplPort")
    public IDemarcatedRectangle getDemarcatedRectangleImplPort() {
        return super.getPort(DemarcatedRectangleImplPort, IDemarcatedRectangle.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IDemarcatedRectangle
     */
    @WebEndpoint(name = "DemarcatedRectangleImplPort")
    public IDemarcatedRectangle getDemarcatedRectangleImplPort(WebServiceFeature... features) {
        return super.getPort(DemarcatedRectangleImplPort, IDemarcatedRectangle.class, features);
    }

}