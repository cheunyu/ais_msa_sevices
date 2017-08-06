/**     
 * @Title: NavigationAction.java    
 * @Package com.scyb.aisweather.vdl.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月5日 下午9:38:35    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.vdl.service.INavigationService;
import com.scyb.aisweather.vdl.vo.NavigationVo;

/**   
 * @ClassName: NavigationAction   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月5日 下午9:38:35      
 *    
 */
public class NavigationAction implements Action {

	private Logger log = Logger.getLogger(this.getClass());
	private NavigationVo navVo;
	private INavigationService navServiceImpl;
	
	/**
	 * @return the navVo
	 */
	public NavigationVo getNavVo() {
		return navVo;
	}

	/**
	 * @param navVo the navVo to set
	 */
	public void setNavVo(NavigationVo navVo) {
		this.navVo = navVo;
	}

	/**
	 * @param navServiceImpl the navServiceImpl to set
	 */
	public void setNavServiceImpl(INavigationService navServiceImpl) {
		this.navServiceImpl = navServiceImpl;
	}
	
	public String sendMessage() {
		navServiceImpl.transformVdl(navVo);
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
