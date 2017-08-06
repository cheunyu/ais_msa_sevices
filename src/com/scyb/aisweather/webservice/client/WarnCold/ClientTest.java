package com.scyb.aisweather.webservice.client.WarnCold;


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
        factory.setServiceClass(IColdWarn.class);
        factory.setAddress("http://localhost:8080/ais/services/coldWarn");
        factory.getOutInterceptors().addAll(list);
        IColdWarn coldWarnService = (IColdWarn) factory.create();
        ColdWarnBo coldWarnBo = new ColdWarnBo();
        coldWarnBo.setSourceId(123456789);
        coldWarnBo.setDestinationId(987654321);
        coldWarnBo.setTypeWarn(7);
        coldWarnBo.setDateTime(System.currentTimeMillis());
        coldWarnBo.setRange(2);
        coldWarnBo.setLongitude(124546232);
        coldWarnBo.setLatitude(34624525);
        coldWarnBo.setRadius(21);
        coldWarnBo.setLevel(2);
        coldWarnService.coldWarnBroadcastService(coldWarnBo);
    }
}
