package com.scyb.aisweather.webservice.client.LightAidsMarkedDynamic;


import com.scyb.aisweather.webservice.client.WsClinetAuthHandler;
import org.apache.cxf.binding.soap.interceptor.SoapInterceptor;
import org.apache.cxf.binding.soap.saaj.SAAJOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.handler.WSHandlerConstants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        factory.setServiceClass(ILightAidsMarkedDynamic.class);
        factory.setAddress("http://localhost:8080/ais/services/lightAmd");
        factory.getOutInterceptors().addAll(list);
        ILightAidsMarkedDynamic lightAmdService = (ILightAidsMarkedDynamic) factory.create();
        LightDynamicBo lightAmdBo = new LightDynamicBo();
        lightAmdBo.setSourceId(123456789);
        lightAmdBo.setDestinationId(987654321);
        lightAmdBo.setStatus(7);
        lightAmdBo.setRange(6);
        lightAmdBo.setLatitude(34624525);
        lightAmdBo.setLongitude(124546232);
        lightAmdBo.setType(4);
        lightAmdBo.setRhythmName(3);
        lightAmdBo.setRhythmParameters(3);
        lightAmdBo.setLightColor(5);
        lightAmdBo.setLightCycle(12);
        lightAmdService.lightAmdBroadcastService(lightAmdBo);
//        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
//        org.apache.cxf.endpoint.Client client = dcf.createClient("http://localhost:8080/services/hwf?wsdl");
//        HydrologyWeatherForecastBo hwfBo = new HydrologyWeatherForecastBo();
//        hwfBo.
//        Object[] objects=client.invoke("hwfBroadcastService", "张三");
//        //输出调用结果
//        System.out.println(objects[0].toString());
    }
}
