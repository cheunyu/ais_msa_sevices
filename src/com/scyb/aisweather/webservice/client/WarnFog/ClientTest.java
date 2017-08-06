package com.scyb.aisweather.webservice.client.WarnFog;


import com.scyb.aisweather.webservice.client.WsClinetAuthHandler;
import org.apache.cxf.binding.soap.interceptor.SoapInterceptor;
import org.apache.cxf.binding.soap.saaj.SAAJOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.handler.WSHandlerConstants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by foo on 2015/4/9.
 */
public class ClientTest {
    public static void main(String[] args) throws Exception{
        Map<String, Object> outProps = new HashMap<String, Object>();
        outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
        outProps.put(WSHandlerConstants.USER, "admin");
        outProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
        outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS, WsClinetAuthHandler.class.getName());
        ArrayList<SoapInterceptor> list = new ArrayList<SoapInterceptor>();
        list.add(new SAAJOutInterceptor());
        list.add(new WSS4JOutInterceptor(outProps));
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(IFogWarn.class);
        factory.setAddress("http://localhost:8080/ais/services/fogWarn");
        factory.getOutInterceptors().addAll(list);
        IFogWarn fogWarnService = (IFogWarn) factory.create();
        FogWarnBo fogWarnBo = new FogWarnBo();
        fogWarnBo.setSourceId(123456789);
        fogWarnBo.setDestinationId(987654321);
        fogWarnBo.setTypeWarn(4);
        fogWarnBo.setDateTime(System.currentTimeMillis());
        fogWarnBo.setRange(2);
        fogWarnBo.setLongitude(124546232);
        fogWarnBo.setLatitude(34624525);
        fogWarnBo.setRadius(21);
        fogWarnBo.setVisibility(15);
        fogWarnService.fogWarnBroadcastService(fogWarnBo);
    }
}
