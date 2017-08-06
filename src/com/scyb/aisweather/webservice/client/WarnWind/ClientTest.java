package com.scyb.aisweather.webservice.client.WarnWind;


import com.scyb.aisweather.webservice.client.WarnTc.ITropicalCycloneWarn;
import com.scyb.aisweather.webservice.client.WarnTc.TropicalCycloneWarnBo;
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
        factory.setServiceClass(IWindWarn.class);
        factory.setAddress("http://localhost:8080/ais/services/windWarn");
        factory.getOutInterceptors().addAll(list);
        IWindWarn windWarnService = (IWindWarn) factory.create();
        WindWarnBo windWarnBo = new WindWarnBo();
        windWarnBo.setSourceId(123456789);
        windWarnBo.setDestinationId(987654321);
        windWarnBo.setTypeWarn(2);
        windWarnBo.setDateTime(System.currentTimeMillis());
        windWarnBo.setRange(2);
        windWarnBo.setLongitude(124546232);
        windWarnBo.setLatitude(34624525);
        windWarnBo.setRadius(21);
        windWarnBo.setMaxPower(5);
        windWarnBo.setMinPower(2);
        windWarnBo.setDirection(3);
        windWarnService.windWarnBroadcastService(windWarnBo);
    }
}
