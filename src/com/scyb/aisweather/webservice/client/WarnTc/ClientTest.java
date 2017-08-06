package com.scyb.aisweather.webservice.client.WarnTc;


import com.scyb.aisweather.webservice.client.ShiftAidsMarkedDynamic.IShiftAidsMarkedDynamic;
import com.scyb.aisweather.webservice.client.ShiftAidsMarkedDynamic.ShiftDynamicBo;
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
        factory.setServiceClass(ITropicalCycloneWarn.class);
        factory.setAddress("http://localhost:8080/ais/services/tropicalCycloneWarn");
        factory.getOutInterceptors().addAll(list);
        ITropicalCycloneWarn tcWarnService = (ITropicalCycloneWarn) factory.create();
        TropicalCycloneWarnBo tcWarnBo = new TropicalCycloneWarnBo();
        tcWarnBo.setSourceId(123456789);
        tcWarnBo.setDestinationId(987654321);
        tcWarnBo.setTypeWarn(1);
        tcWarnBo.setDateTime(System.currentTimeMillis());
        tcWarnBo.setRange(2);
        tcWarnBo.setLongitude(124546232);
        tcWarnBo.setLatitude(34624525);
        tcWarnBo.setType(1);
        tcWarnBo.setRadius(21);
        tcWarnBo.setSpeed(12);
        tcWarnBo.setDirection(125);
        tcWarnBo.setWindPower(15);
        tcWarnService.tcWarnBroadcastService(tcWarnBo);
    }
}
