package com.scyb.aisweather.webservice.client.AreaIrregula;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2015-04-12T22:36:07.945+08:00
 * Generated source version: 3.0.4
 * 
 */
@WebServiceClient(name = "DemarcatedIrregulaAreaImplService", 
                  wsdlLocation = "http://localhost:8080/services/dia?wsdl",
                  targetNamespace = "http://impl.webservice.aisweather.scyb.com/") 
public class DemarcatedIrregulaAreaImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.webservice.aisweather.scyb.com/", "DemarcatedIrregulaAreaImplService");
    public final static QName DemarcatedIrregulaAreaImplPort = new QName("http://impl.webservice.aisweather.scyb.com/", "DemarcatedIrregulaAreaImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/services/dia?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(DemarcatedIrregulaAreaImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/services/dia?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public DemarcatedIrregulaAreaImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DemarcatedIrregulaAreaImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DemarcatedIrregulaAreaImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public DemarcatedIrregulaAreaImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public DemarcatedIrregulaAreaImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public DemarcatedIrregulaAreaImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns IDemarcatedIrregulaArea
     */
    @WebEndpoint(name = "DemarcatedIrregulaAreaImplPort")
    public IDemarcatedIrregulaArea getDemarcatedIrregulaAreaImplPort() {
        return super.getPort(DemarcatedIrregulaAreaImplPort, IDemarcatedIrregulaArea.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IDemarcatedIrregulaArea
     */
    @WebEndpoint(name = "DemarcatedIrregulaAreaImplPort")
    public IDemarcatedIrregulaArea getDemarcatedIrregulaAreaImplPort(WebServiceFeature... features) {
        return super.getPort(DemarcatedIrregulaAreaImplPort, IDemarcatedIrregulaArea.class, features);
    }

}
