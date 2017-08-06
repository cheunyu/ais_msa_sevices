package com.scyb.aisweather.webservice.client.MarineEnvironmentForecast;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2015-06-18T14:45:25.136+08:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "MarineEnvironmentForecastImplService", 
                  wsdlLocation = "http://localhost:8080/ais/services/mef?wsdl",
                  targetNamespace = "http://impl.webservice.aisweather.scyb.com/") 
public class MarineEnvironmentForecastImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.webservice.aisweather.scyb.com/", "MarineEnvironmentForecastImplService");
    public final static QName MarineEnvironmentForecastImplPort = new QName("http://impl.webservice.aisweather.scyb.com/", "MarineEnvironmentForecastImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/ais/services/mef?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MarineEnvironmentForecastImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/ais/services/mef?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MarineEnvironmentForecastImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MarineEnvironmentForecastImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MarineEnvironmentForecastImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MarineEnvironmentForecastImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MarineEnvironmentForecastImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MarineEnvironmentForecastImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns IMarineEnvironmentForecast
     */
    @WebEndpoint(name = "MarineEnvironmentForecastImplPort")
    public IMarineEnvironmentForecast getMarineEnvironmentForecastImplPort() {
        return super.getPort(MarineEnvironmentForecastImplPort, IMarineEnvironmentForecast.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IMarineEnvironmentForecast
     */
    @WebEndpoint(name = "MarineEnvironmentForecastImplPort")
    public IMarineEnvironmentForecast getMarineEnvironmentForecastImplPort(WebServiceFeature... features) {
        return super.getPort(MarineEnvironmentForecastImplPort, IMarineEnvironmentForecast.class, features);
    }

}