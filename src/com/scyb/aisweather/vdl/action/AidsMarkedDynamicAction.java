/**     
 * @Title: AidsMarkedDynamicAction.java    
 * @Package com.scyb.aisweather.vdl.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月5日 下午1:10:35    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.vdl.service.IAidsMarkedDynamicService;
import com.scyb.aisweather.vdl.vo.AidsMarkedDynamicVo;

/**   
 * @ClassName: AidsMarkedDynamicAction   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月5日 下午1:10:35      
 *    
 */
public class AidsMarkedDynamicAction implements Action {
	private Logger log = Logger.getLogger(this.getClass());
	private AidsMarkedDynamicVo amdVo;
	private IAidsMarkedDynamicService amdServiceImpl;
	
	/**
	 * @return the amdVo
	 */
	public AidsMarkedDynamicVo getAmdVo() {
		return amdVo;
	}


	/**
	 * @param amdVo the amdVo to set
	 */
	public void setAmdVo(AidsMarkedDynamicVo amdVo) {
		this.amdVo = amdVo;
	}


	/**
	 * @param amdServiceImpl the amdServiceImpl to set
	 */
	public void setAmdServiceImpl(IAidsMarkedDynamicService amdServiceImpl) {
		this.amdServiceImpl = amdServiceImpl;
	}

	public String sendMessage() {
		amdServiceImpl.transformVdl(amdVo);
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
