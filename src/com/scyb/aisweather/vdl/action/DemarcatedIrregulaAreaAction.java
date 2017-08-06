/**     
 * @Title: DemarcatedIrregulaAreaAction.java    
 * @Package com.scyb.aisweather.vdl.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月7日 下午4:40:11    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.vdl.service.IDemarcatedIrregulaAreaService;
import com.scyb.aisweather.vdl.vo.DemarcatedIrregulaAreaVo;

/**   
 * @ClassName: DemarcatedIrregulaAreaAction   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月7日 下午4:40:11      
 *    
 */
public class DemarcatedIrregulaAreaAction implements Action {

	private Logger log = Logger.getLogger(this.getClass());
	private DemarcatedIrregulaAreaVo diaVo;
	private IDemarcatedIrregulaAreaService diaServiceImpl;
	
	/**
	 * @return the diaVo
	 */
	public DemarcatedIrregulaAreaVo getDiaVo() {
		return diaVo;
	}

	/**
	 * @param diaVo the diaVo to set
	 */
	public void setDiaVo(DemarcatedIrregulaAreaVo diaVo) {
		this.diaVo = diaVo;
	}

	/**
	 * @param diaServiceImpl the diaServiceImpl to set
	 */
	public void setDiaServiceImpl(IDemarcatedIrregulaAreaService diaServiceImpl) {
		this.diaServiceImpl = diaServiceImpl;
	}

	public String sendMessage() {
		diaServiceImpl.transformVdl(diaVo);
		return this.SUCCESS;
	}
	
	/** (非 Javadoc)   
	 * <p>Title: execute</p>  
	 * <p>Description: </p>  
	 * @return
	 * @throws Exception   
	 * @see com.opensymphony.xwork2.Action#execute()   
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
