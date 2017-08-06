/**     
 * @Title: HeavyTowImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月23日 下午2:43:08    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import javax.jws.WebService;

import com.scyb.aisweather.vdl.service.IHeavyTowService;
import com.scyb.aisweather.vdl.vo.HeavyTowVo;
import com.scyb.aisweather.webservice.IHeavyTow;
import com.scyb.aisweather.webservice.bo.HeavyTowBo;
import org.apache.commons.beanutils.BeanUtils;

/**   
 * @ClassName: HeavyTowImpl   
 * @Description: TODO(笨重拖带接口实现类)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月23日 下午2:43:08      
 *    
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.IHeavyTow")
public class HeavyTowImpl implements IHeavyTow {

	private IHeavyTowService htServiceImpl;
	private Logger log = Logger.getLogger(this.getClass().getName());
	
	/**
	 * @param htServiceImpl the htServiceImpl to set
	 */
	public void setHtServiceImpl(IHeavyTowService htServiceImpl) {
		this.htServiceImpl = htServiceImpl;
	}

	/** (非 Javadoc)   
	 * <p>Title: getStatement</p>  
	 * <p>Description: </p>  
	 * @param htBo
	 * @return   
	 * @see com.scyb.aisweather.webservice.IHeavyTow#getStatement(com.scyb.aisweather.webservice.bo.HeavyTowBo)   
	 */
	@Override
	public int htBroadcastService(HeavyTowBo htBo) {
		// TODO Auto-generated method stub
		HeavyTowVo htVo = new HeavyTowVo();
		try {
			BeanUtils.copyProperties(htVo, htBo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		htVo.setMessageNo(6);
		htVo.setMmsi(htBo.getMmsi());
		htVo.setStartLatitudeD(htBo.getLatitudeStart() / 1000000);
		htVo.setStartLatitudeM(htBo.getLatitudeStart() % 1000000 * 60 / 1000000);
		htVo.setStartLatitudeS((Double) (Math.round(htBo.getLatitudeStart() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		htVo.setStartLongitudeD(htBo.getLongitudeStart() / 1000000);
		htVo.setStartLongitudeM(htBo.getLongitudeStart() % 1000000 * 60 / 1000000);
		htVo.setStartLongitudeS((Double) (Math.round(htBo.getLongitudeStart() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		htVo.setEndLatitudeD(htBo.getLatitudeEnd() / 1000000);
		htVo.setEndLatitudeM(htBo.getLatitudeEnd() % 1000000 * 60 / 1000000);
		htVo.setEndLatitudeS((Double) (Math.round(htBo.getLatitudeEnd() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		htVo.setEndLongitudeD(htBo.getLongitudeEnd() / 1000000);
		htVo.setEndLongitudeM(htBo.getLongitudeEnd() % 1000000 * 60 / 1000000);
		htVo.setEndLongitudeS((Double) (Math.round(htBo.getLongitudeEnd() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		htVo.setOverallLength(String.valueOf(htBo.getOverallLength()));
		htVo.setSpeed(String.valueOf(htBo.getSpeed()));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		htVo.setStartDateTime(sdf.format(new Date(htBo.getDateTime1())));
		htVo.setEndDateTime(sdf.format(new Date(htBo.getDateTime2())));
		htVo.setPrecautions(htBo.getPrecautions());
		htVo.setSource_id(htBo.getSource_id());
		htServiceImpl.transformVdl(htVo);
		return 0;
	}

}
