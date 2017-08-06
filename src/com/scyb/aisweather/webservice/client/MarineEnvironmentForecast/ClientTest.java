package com.scyb.aisweather.webservice.client.MarineEnvironmentForecast;


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
        factory.setServiceClass(IMarineEnvironmentForecast.class);
        factory.setAddress("http://localhost:8080/ais/services/mef");
        factory.getOutInterceptors().addAll(list);
        IMarineEnvironmentForecast mefService = (IMarineEnvironmentForecast) factory.create();
        MarineEnvironmentForecastBo mefBo = new MarineEnvironmentForecastBo();
        mefBo.setSourceId(123456789);
        mefBo.setDestinationId(987654321);
        mefBo.setForecastDateTime("16");
        List<Integer> latList = new ArrayList<Integer>();
        latList.add(34624525);
        mefBo.setLatitudeList(latList);
        List<Integer> lonList = new ArrayList<Integer>();
        lonList.add(124546232);
        mefBo.setLongitudeList(lonList);
        List<Double> speedList = new ArrayList<Double>();
        speedList.add(1.4d);
        mefBo.setWaterSpeedList(speedList);
        List<Integer> waterDirectionList = new ArrayList<Integer>();
        waterDirectionList.add(231);
        mefBo.setWaterDirectionList(waterDirectionList);
        List<Double> hsList = new ArrayList<Double>();
        hsList.add(2.4d);
        mefBo.setWaveHsList(hsList);
        List<Integer> waveDirectionList = new ArrayList<Integer>();
        waveDirectionList.add(214);
        mefBo.setWaveDirectionList(waveDirectionList);
        List<Double> waterTemperatureList = new ArrayList<Double>();
        waterTemperatureList.add(12.3d);
        mefBo.setWaterTemperatureList(waterTemperatureList);
        mefService.mefBroadcastService(mefBo);
//        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
//        org.apache.cxf.endpoint.Client client = dcf.createClient("http://localhost:8080/services/hwf?wsdl");
//        HydrologyWeatherForecastBo hwfBo = new HydrologyWeatherForecastBo();
//        hwfBo.
//        Object[] objects=client.invoke("hwfBroadcastService", "张三");
//        //输出调用结果
//        System.out.println(objects[0].toString());
    }
}
