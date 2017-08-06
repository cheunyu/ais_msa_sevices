/**     
 * @Title: DemarcatedAreaAction.java    
 * @Package com.scyb.aisweather.vdl.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月6日 下午10:56:26    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.vdl.service.IDemarcatedAreaService;
import com.scyb.aisweather.vdl.vo.DemarcatedAreaVo;

/**   
 * @ClassName: DemarcatedAreaAction   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月6日 下午10:56:26      
 *    
 */
public class DemarcatedAreaAction implements Action {
	
	private Logger log = Logger.getLogger(this.getClass());
	private DemarcatedAreaVo daVo;
	private IDemarcatedAreaService daServiceImpl;
	
	
	/**
	 * @return the daVo
	 */
	public DemarcatedAreaVo getDaVo() {
		return daVo;
	}


	/**
	 * @param daVo the daVo to set
	 */
	public void setDaVo(DemarcatedAreaVo daVo) {
		this.daVo = daVo;
	}


	/**
	 * @param daServiceImpl the daServiceImpl to set
	 */
	public void setDaServiceImpl(IDemarcatedAreaService daServiceImpl) {
		this.daServiceImpl = daServiceImpl;
	}

	public String sendMessage() {
		daServiceImpl.transformVdl(daVo);
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
