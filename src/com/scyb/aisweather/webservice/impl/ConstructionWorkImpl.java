/**     
 * @Title: ConstructionWorkImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月23日 下午12:49:19    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;

import com.scyb.aisweather.vdl.service.IConstructionWorkService;
import com.scyb.aisweather.vdl.vo.ConstructionWorkVo;
import com.scyb.aisweather.webservice.IConstructionWork;
import com.scyb.aisweather.webservice.bo.ConstructionWorkBo;
import org.apache.commons.beanutils.BeanUtils;

/**   
 * @ClassName: ConstructionWorkImpl   
 * @Description: TODO(施工作业接口实现类)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月23日 下午12:49:19      
 *    
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.IConstructionWork")
public class ConstructionWorkImpl implements IConstructionWork {

	private IConstructionWorkService cwServiceImpl;
	
	/**
	 * @param cwServiceImpl the cwServiceImpl to set
	 */
	public void setCwServiceImpl(IConstructionWorkService cwServiceImpl) {
		this.cwServiceImpl = cwServiceImpl;
	}



	/** (非 Javadoc)   
	 * <p>Title: getStatement</p>  
	 * <p>Description: </p>  
	 * @param cwBo
	 * @return   
	 * @see com.scyb.aisweather.webservice.IConstructionWork#getStatement(com.scyb.aisweather.webservice.bo.ConstructionWorkBo)   
	 */
	@Override
	public int workBroadcastService(ConstructionWorkBo cwBo) {
		// TODO Auto-generated method stub
		ConstructionWorkVo cwVo = new ConstructionWorkVo();
		try {
			BeanUtils.copyProperties(cwVo, cwBo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		cwVo.setMessageNo(6);
		cwVo.setType(cwBo.getType());
		cwVo.setShipType(cwBo.getShipType());
		cwVo.setShipMMSI(cwBo.getShipMmsi());
		cwVo.setStartLatitudeD(cwBo.getLatitudeStart() / 1000000);
		cwVo.setStartLatitudeM(cwBo.getLatitudeStart() % 1000000 * 60 / 1000000);
		cwVo.setStartLatitudeS((Double) (Math.round(cwBo.getLatitudeStart() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		cwVo.setStartLongitudeD(cwBo.getLongitudeStart() / 1000000);
		cwVo.setStartLongitudeM(cwBo.getLongitudeStart() % 1000000 * 60 / 1000000);
		cwVo.setStartLongitudeS((Double) (Math.round(cwBo.getLongitudeStart() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		cwVo.setEndLatitudeD(cwBo.getLatitudeEnd() / 1000000);
		cwVo.setEndLatitudeM(cwBo.getLatitudeEnd() % 1000000 * 60 / 1000000);
		cwVo.setEndLatitudeS((Double) (Math.round(cwBo.getLatitudeEnd() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		cwVo.setEndLongitudeD(cwBo.getLongitudeEnd() / 1000000);
		cwVo.setEndLongitudeM(cwBo.getLongitudeEnd() % 1000000 * 60 / 1000000);
		cwVo.setEndLongitudeS((Double) (Math.round(cwBo.getLongitudeEnd() % 1000000 * 60 % 1000000 * 60 / 100000) / 10.0));
		cwVo.setRadius(String.valueOf(cwBo.getRadius()));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		cwVo.setStartDateTime(sdf.format(new Date(cwBo.getDateTime1())));
		cwVo.setEndDateTime(sdf.format(new Date(cwBo.getDateTime2())));
		cwServiceImpl.transformVdl(cwVo);
		return 0;
	}

}
