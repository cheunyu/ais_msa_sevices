/**     
 * @Title: NavigationalInformationAction.java    
 * @Package com.scyb.aisweather.vdl.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月7日 下午7:33:29    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.vdl.service.INavigationalInformationService;
import com.scyb.aisweather.vdl.vo.NavigationalInformationVo;

/**   
 * @ClassName: NavigationalInformationAction   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月7日 下午7:33:29      
 *    
 */
public class NavigationalInformationAction implements Action {

	private Logger log = Logger.getLogger(this.getClass());
	private NavigationalInformationVo niVo;
	private INavigationalInformationService niServiceImpl;
	
	/**
	 * @return the niVo
	 */
	public NavigationalInformationVo getNiVo() {
		return niVo;
	}

	/**
	 * @param niVo the niVo to set
	 */
	public void setNiVo(NavigationalInformationVo niVo) {
		this.niVo = niVo;
	}

	/**
	 * @param niServiceImpl the niServiceImpl to set
	 */
	public void setNiServiceImpl(INavigationalInformationService niServiceImpl) {
		this.niServiceImpl = niServiceImpl;
	}

	public String sendMessage() {
		niServiceImpl.transformVdl(niVo);
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
