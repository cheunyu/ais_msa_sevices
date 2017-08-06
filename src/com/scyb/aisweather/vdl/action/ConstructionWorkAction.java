/**     
 * @Title: ConstructionWorkAction.java    
 * @Package com.scyb.aisweather.vdl.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月6日 下午1:35:54    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.vdl.service.IConstructionWorkService;
import com.scyb.aisweather.vdl.vo.ConstructionWorkVo;

/**   
 * @ClassName: ConstructionWorkAction
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月6日 下午1:35:54      
 *    
 */
public class ConstructionWorkAction implements Action {
	private Logger log = Logger.getLogger(this.getClass());
	private ConstructionWorkVo cwVo;
	private IConstructionWorkService cwServiceImpl;
	
	/**
	 * @param cwVo the cwVo to set
	 */
	public void setCwVo(ConstructionWorkVo cwVo) {
		this.cwVo = cwVo;
	}

	/**
	 * @param cwServiceImpl the cwServiceImpl to set
	 */
	public void setCwServiceImpl(IConstructionWorkService cwServiceImpl) {
		this.cwServiceImpl = cwServiceImpl;
	}
	
	/**
	 * @return the cwVo
	 */
	public ConstructionWorkVo getCwVo() {
		return cwVo;
	}

	public String sendMessage() {
		cwServiceImpl.transformVdl(cwVo);
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
