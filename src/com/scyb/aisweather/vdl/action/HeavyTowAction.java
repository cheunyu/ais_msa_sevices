/**     
 * @Title: HeavyTowAction.java    
 * @Package com.scyb.aisweather.vdl.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月6日 下午6:42:08    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.vdl.service.IConstructionWorkService;
import com.scyb.aisweather.vdl.service.IHeavyTowService;
import com.scyb.aisweather.vdl.vo.ConstructionWorkVo;
import com.scyb.aisweather.vdl.vo.HeavyTowVo;

/**   
 * @ClassName: HeavyTowAction   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月6日 下午6:42:08      
 *    
 */
public class HeavyTowAction implements Action {
	private Logger log = Logger.getLogger(this.getClass());
	private HeavyTowVo htVo;
	private IHeavyTowService htServiceImpl;
	
	
	/**
	 * @return the htVo
	 */
	public HeavyTowVo getHtVo() {
		return htVo;
	}


	/**
	 * @param htVo the htVo to set
	 */
	public void setHtVo(HeavyTowVo htVo) {
		this.htVo = htVo;
	}


	/**
	 * @param htServiceImpl the htServiceImpl to set
	 */
	public void setHtServiceImpl(IHeavyTowService htServiceImpl) {
		this.htServiceImpl = htServiceImpl;
	}

	public String sendMessage() {
		htServiceImpl.transformVdl(htVo);
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
