/**     
 * @Title: HydrologyWeatherForecastImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月19日 上午9:09:24    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.jws.WebService;

import com.scyb.aisweather.vdl.service.IHydrologyWeatherForecastService;
import com.scyb.aisweather.vdl.vo.HydrologyWeatherForecastVo;
import com.scyb.aisweather.webservice.IHydrologyWeatherForecast;
import com.scyb.aisweather.webservice.bo.HydrologyWeatherForecastBo;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;

/**   
 * @ClassName: HydrologyWeatherForecastImpl   
 * @Description: TODO(水文气象预报接口实现类)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月19日 上午9:09:24      
 *    
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.IHydrologyWeatherForecast")
public class HydrologyWeatherForecastImpl implements IHydrologyWeatherForecast {

    private Logger log = Logger.getLogger(this.getClass());

    @Override
    public int hwfBroadcastService(HydrologyWeatherForecastBo hwfBo) {
        System.out.println(hwfBo.toString());
        HydrologyWeatherForecastVo hwf = new HydrologyWeatherForecastVo();
        try {
            BeanUtils.copyProperties(hwf, hwfBo);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        hwf.setMessageNo(6);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, hwfBo.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        hwf.setForecastDateTime(sdf.format(cal.getTime()));
        for(int i=0;i<hwfBo.getHighTideTime().size();i++) {
            hwf.getHighTideTime().add(sdf.format(new Date(hwfBo.getHighTideTime().get(i))));
            hwf.getLowTideTime().add((sdf.format(new Date(hwfBo.getLowTideTime().get(i)))));
            hwf.getTide().add(hwfBo.getTide().get(i));
            hwf.getLatitudeDList().add(String.valueOf(hwfBo.getLatitudeList().get(i) / 1000000));
            hwf.getLatitudeMList().add(String.valueOf(hwfBo.getLatitudeList().get(i) % 1000000 * 60 / 1000000));
            hwf.getLatitudeSList().add(String.valueOf((Double) (Math.round(hwfBo.getLatitudeList().get(i) % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0)));
            hwf.getLongitudeDList().add(String.valueOf(hwfBo.getLongitudeList().get(i) / 1000000));
            hwf.getLongitudeMList().add(String.valueOf(hwfBo.getLongitudeList().get(i) % 1000000 * 60 / 1000000));
            hwf.getLongitudeSList().add(String.valueOf((Double) (Math.round(hwfBo.getLongitudeList().get(i) % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0)));
        }
        hwfServiceImpl.transformVdl(hwf);
        return 0;
    }

    private IHydrologyWeatherForecastService hwfServiceImpl;


	/**
	 * @param hwfServiceImpl the hwfServiceImpl to set
	 */
	public void setHwfServiceImpl(IHydrologyWeatherForecastService hwfServiceImpl) {
		this.hwfServiceImpl = hwfServiceImpl;
	}

}
