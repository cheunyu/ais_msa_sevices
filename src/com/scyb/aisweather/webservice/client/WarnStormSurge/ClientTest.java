package com.scyb.aisweather.webservice.client.WarnStormSurge;


import com.scyb.aisweather.webservice.client.WarnFog.FogWarnBo;
import com.scyb.aisweather.webservice.client.WarnFog.IFogWarn;
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
        factory.setServiceClass(IStormSurgeWarn.class);
        factory.setAddress("http://localhost:8080/ais/services/stormSurgeWarn");
        factory.getOutInterceptors().addAll(list);
        IStormSurgeWarn ssWarnService = (IStormSurgeWarn) factory.create();
        StormSurgeWarnBo ssWarnBo = new StormSurgeWarnBo();
        ssWarnBo.setSourceId(123456789);
        ssWarnBo.setDestinationId(987654321);
        ssWarnBo.setTypeWarn(5);
        ssWarnBo.setDateTime(System.currentTimeMillis());
        ssWarnBo.setRange(2);
        ssWarnBo.setLongitude(124546232);
        ssWarnBo.setLatitude(34624525);
        ssWarnBo.setRadius(21);
        ssWarnBo.setIncreasWater(210);
        ssWarnBo.setTide(252);
        ssWarnBo.setPeriod(842);
        ssWarnService.ssWarnBroadcastService(ssWarnBo);
    }
}
