/**     
 * @Title: PortStatusAction.java    
 * @Package com.scyb.aisweather.vdl.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月7日 下午7:09:26    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.vdl.service.IPortStatusService;
import com.scyb.aisweather.vdl.vo.PortStatusVo;

/**   
 * @ClassName: PortStatusAction   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月7日 下午7:09:26      
 *    
 */
public class PortStatusAction implements Action {

	private Logger log = Logger.getLogger(this.getClass());
	private PortStatusVo psVo;
	private IPortStatusService psServiceImpl;
	
	/**
	 * @return the psVo
	 */
	public PortStatusVo getPsVo() {
		return psVo;
	}

	/**
	 * @param psVo the psVo to set
	 */
	public void setPsVo(PortStatusVo psVo) {
		this.psVo = psVo;
	}

	/**
	 * @param psServiceImpl the psServiceImpl to set
	 */
	public void setPsServiceImpl(IPortStatusService psServiceImpl) {
		this.psServiceImpl = psServiceImpl;
	}


	public String sendMessage() {
		psServiceImpl.transformVdl(psVo);
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
