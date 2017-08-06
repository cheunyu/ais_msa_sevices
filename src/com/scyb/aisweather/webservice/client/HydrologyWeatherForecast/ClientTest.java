package com.scyb.aisweather.webservice.client.HydrologyWeatherForecast;


import org.apache.cxf.binding.soap.interceptor.SoapInterceptor;
import org.apache.cxf.binding.soap.saaj.SAAJOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.handler.WSHandlerConstants;
import com.scyb.aisweather.webservice.client.WsClinetAuthHandler;

import java.util.*;

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
        factory.setServiceClass(IHydrologyWeatherForecast.class);
        factory.setAddress("http://localhost:8080/ais/services/hwf");
        factory.getOutInterceptors().addAll(list);
        IHydrologyWeatherForecast hefService = (IHydrologyWeatherForecast) factory.create();
        HydrologyWeatherForecastBo hwfBo = new HydrologyWeatherForecastBo();
        hwfBo.setTime(16);
        List<Long> highTideList = new ArrayList<Long>();
        highTideList.add(System.currentTimeMillis());
        hwfBo.setHighTideTime(highTideList);
        List<Long> lowTideList = new ArrayList<Long>();
        lowTideList.add(System.currentTimeMillis());
        hwfBo.setLowTideTime(lowTideList);
        List<Integer> latTideList = new ArrayList<Integer>();
        latTideList.add(34624525);
        hwfBo.setLatitudeList(latTideList);
        List<Integer> lonTideList = new ArrayList<Integer>();
        lonTideList.add(124546232);
        hwfBo.setLongitudeList(lonTideList);
        List<Double> tideTideList = new ArrayList<Double>();
        tideTideList.add(2.4d);
        hwfBo.setTide(tideTideList);
        hwfBo.setSourceId(123456789);
        hwfBo.setDestinationId(987654321);
        System.out.println(hwfBo.toString());
        hefService.hwfBroadcastService(hwfBo);
//        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
//        org.apache.cxf.endpoint.Client client = dcf.createClient("http://localhost:8080/services/hwf?wsdl");
//        HydrologyWeatherForecastBo hwfBo = new HydrologyWeatherForecastBo();
//        hwfBo.
//        Object[] objects=client.invoke("hwfBroadcastService", "张三");
//        //输出调用结果
//        System.out.println(objects[0].toString());
    }
}
