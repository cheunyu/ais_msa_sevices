package com.scyb.aisweather.webservice.client.HeavyTow;


import com.scyb.aisweather.webservice.client.DgpsAidsMarkedDynamic.DgpsDynamicBo;
import com.scyb.aisweather.webservice.client.DgpsAidsMarkedDynamic.IDgpsAidsMarkedDynamic;
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
        factory.setServiceClass(IHeavyTow.class);
        factory.setAddress("http://localhost:8080/ais/services/ht");
        factory.getOutInterceptors().addAll(list);
        IHeavyTow dAmdService = (IHeavyTow) factory.create();
        HeavyTowBo htBo = new HeavyTowBo();
        htBo.setDestinationId(987654321);
        htBo.setSourceId(123456789);
        htBo.setMmsi(77777777);
        htBo.setLongitudeStart(124546232);
        htBo.setLongitudeEnd(124546232);
        htBo.setLatitudeStart(34624525);
        htBo.setLatitudeEnd(34624525);
        htBo.setOverallLength(221);
        htBo.setSpeed(14);
        htBo.setDateTime1(System.currentTimeMillis());
        htBo.setDateTime2(System.currentTimeMillis());
        htBo.setPrecautions(2);
        dAmdService.htBroadcastService(htBo);
    }
}
