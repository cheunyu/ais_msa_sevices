package com.scyb.aisweather.webservice.client.WarnCold;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2015-04-13T09:55:31.259+08:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "ColdWarnImplService", 
                  wsdlLocation = "http://localhost:8080/services/coldWarn?wsdl",
                  targetNamespace = "http://impl.webservice.aisweather.scyb.com/") 
public class ColdWarnImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.webservice.aisweather.scyb.com/", "ColdWarnImplService");
    public final static QName ColdWarnImplPort = new QName("http://impl.webservice.aisweather.scyb.com/", "ColdWarnImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/services/coldWarn?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ColdWarnImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/services/coldWarn?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ColdWarnImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ColdWarnImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ColdWarnImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ColdWarnImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ColdWarnImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ColdWarnImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns IColdWarn
     */
    @WebEndpoint(name = "ColdWarnImplPort")
    public IColdWarn getColdWarnImplPort() {
        return super.getPort(ColdWarnImplPort, IColdWarn.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IColdWarn
     */
    @WebEndpoint(name = "ColdWarnImplPort")
    public IColdWarn getColdWarnImplPort(WebServiceFeature... features) {
        return super.getPort(ColdWarnImplPort, IColdWarn.class, features);
    }

}
