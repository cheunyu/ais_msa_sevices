/**     
 * @Title: ShipDistressAction.java    
 * @Package com.scyb.aisweather.vdl.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月6日 下午10:03:17    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.vdl.service.IShipDistressService;
import com.scyb.aisweather.vdl.vo.ShipDistressVo;

/**
 *      @ClassName: ShipDistressAction     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年10月6日 下午10:03:17      
 *     
 */
public class ShipDistressAction implements Action {

	private Logger log = Logger.getLogger(this.getClass());
	private ShipDistressVo sdVo;
	private IShipDistressService sdServiceImpl;


	/**
	 * @return the sdVo
	 */
	public ShipDistressVo getSdVo() {
		return sdVo;
	}
	/**
	 * @param sdVo the sdVo to set
	 */
	public void setSdVo(ShipDistressVo sdVo) {
		this.sdVo = sdVo;
	}
	/**
	 * @param sdServiceImpl the sdServiceImpl to set
	 */
	public void setSdServiceImpl(IShipDistressService sdServiceImpl) {
		this.sdServiceImpl = sdServiceImpl;
	}
	public String sendMessage() {
		sdServiceImpl.transformVdl(sdVo);
		return this.SUCCESS;
	}
	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: execute
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @return  @throws Exception     @see
	 * com.opensymphony.xwork2.Action#execute()   
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
