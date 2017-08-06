package com.scyb.aisweather.webservice.client.MarineWeatherForecast;

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
        factory.setServiceClass(IMarineWeatherForecast.class);
        factory.setAddress("http://localhost:8080/ais/services/mwf");
        factory.getOutInterceptors().addAll(list);
        IMarineWeatherForecast mwfService = (IMarineWeatherForecast) factory.create();
        MarineWeatherForecastBo mwfBo = new MarineWeatherForecastBo();
        mwfBo.setSourceId(123456789);
        mwfBo.setDestinationId(987654321);
        mwfBo.setTime(16);
        List<Integer> phenomenaList = new ArrayList<Integer>();
        phenomenaList.add(1);
        mwfBo.setWeatherPhenomena(phenomenaList);
        List<Integer> latList = new ArrayList<Integer>();
        latList.add(34624525);
        mwfBo.setLatitudeList(latList);
        List<Integer> lonList = new ArrayList<Integer>();
        lonList.add(124546232);
        mwfBo.setLongitudeList(lonList);
        List<Integer> windSpeedList = new ArrayList<Integer>();
        windSpeedList.add(12);
        mwfBo.setWindSpeedList(windSpeedList);
        List<Integer> windDirectionList = new ArrayList<Integer>();
        windDirectionList.add(231);
        mwfBo.setWindDirectionList(windDirectionList);
        List<Double> arrayListirTemperatureList = new ArrayList<Double>();
        arrayListirTemperatureList.add(13.4d);
        mwfBo.setTemperatureList(arrayListirTemperatureList);
        List<Integer> pressureList = new ArrayList<Integer>();
        pressureList.add(850);
        mwfBo.setPressureList(pressureList);
        List<Double> visibilityList = new ArrayList<Double>();
        visibilityList.add(3.3d);
        mwfBo.setVisibilityList(visibilityList);
        mwfService.mwfBroadcastService(mwfBo);
    }
}
