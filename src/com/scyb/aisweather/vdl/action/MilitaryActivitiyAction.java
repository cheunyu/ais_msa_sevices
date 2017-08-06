/**     
 * @Title: MilitaryActivitiyAction.java    
 * @Package com.scyb.aisweather.vdl.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月6日 下午7:09:15    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.vdl.service.IMilitaryActivitiyService;
import com.scyb.aisweather.vdl.vo.MilitaryActivitiyVo;

/**   
 * @ClassName: MilitaryActivitiyAction   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月6日 下午7:09:15      
 *    
 */
public class MilitaryActivitiyAction implements Action{
	private Logger log = Logger.getLogger(this.getClass());
	private MilitaryActivitiyVo maVo;
	private IMilitaryActivitiyService maServiceImpl;
	
	
	/**
	 * @return the maVo
	 */
	public MilitaryActivitiyVo getMaVo() {
		return maVo;
	}


	/**
	 * @param maVo the maVo to set
	 */
	public void setMaVo(MilitaryActivitiyVo maVo) {
		this.maVo = maVo;
	}


	/**
	 * @param maServiceImpl the maServiceImpl to set
	 */
	public void setMaServiceImpl(IMilitaryActivitiyService maServiceImpl) {
		this.maServiceImpl = maServiceImpl;
	}

	public String sendMessage() {
		maServiceImpl.transformVdl(maVo);
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
