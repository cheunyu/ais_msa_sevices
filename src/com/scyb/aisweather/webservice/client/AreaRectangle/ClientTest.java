package com.scyb.aisweather.webservice.client.AreaRectangle;


import com.scyb.aisweather.webservice.client.AreaRound.DemarcatedRoundBo;
import com.scyb.aisweather.webservice.client.AreaRound.IDemarcatedRound;
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
        factory.setServiceClass(IDemarcatedRectangle.class);
        factory.setAddress("http://localhost:8080/services/drl");
        factory.getOutInterceptors().addAll(list);
        IDemarcatedRectangle drlService = (IDemarcatedRectangle) factory.create();
        DemarcatedRectangleBo drlBo = new DemarcatedRectangleBo();
        drlBo.setSourceId(123456789);
        drlBo.setDestinationId(987654321);
        drlBo.setType(2);
        drlBo.setFeature(1);
        drlBo.setDateTime1(System.currentTimeMillis());
        drlBo.setDateTime2(System.currentTimeMillis());
        drlBo.setFarther(3);
        drlBo.setLatitudeNw(34624525);
        drlBo.setLongitudeNw(124546232);
        drlBo.setLatitudeSe(34624525);
        drlBo.setLongitudeSe(124546232);
        drlService.rectangleAreaBroadcastService(drlBo);
//        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
//        org.apache.cxf.endpoint.Client client = dcf.createClient("http://localhost:8080/services/hwf?wsdl");
//        HydrologyWeatherForecastBo hwfBo = new HydrologyWeatherForecastBo();
//        hwfBo.
//        Object[] objects=client.invoke("hwfBroadcastService", "张三");
//        //输出调用结果
//        System.out.println(objects[0].toString());
    }
}
