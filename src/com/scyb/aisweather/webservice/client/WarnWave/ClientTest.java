package com.scyb.aisweather.webservice.client.WarnWave;


import com.scyb.aisweather.webservice.client.WarnWind.IWindWarn;
import com.scyb.aisweather.webservice.client.WarnWind.WindWarnBo;
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
        factory.setServiceClass(IWaveWarn.class);
        factory.setAddress("http://localhost:8080/ais/services/waveWarn");
        factory.getOutInterceptors().addAll(list);
        IWaveWarn waveWarnService = (IWaveWarn) factory.create();
        WaveWarnBo waveWarnBo = new WaveWarnBo();
        waveWarnBo.setSourceId(123456789);
        waveWarnBo.setDestinationId(987654321);
        waveWarnBo.setTypeWarn(3);
        waveWarnBo.setDateTime(System.currentTimeMillis());
        waveWarnBo.setRange(2);
        waveWarnBo.setLongitude(124546232);
        waveWarnBo.setLatitude(34624525);
        waveWarnBo.setRadius(21);
        waveWarnBo.setHs(10);
        waveWarnBo.setPeriod(1253);
        waveWarnService.waveWarnBroadcastService(waveWarnBo);
    }
}
