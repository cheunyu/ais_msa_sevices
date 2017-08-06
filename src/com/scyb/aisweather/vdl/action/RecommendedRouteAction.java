/**     
 * @Title: RecommendedRouteAction.java    
 * @Package com.scyb.aisweather.vdl.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月7日 下午6:42:37    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.vdl.service.IRecommendedRouteService;
import com.scyb.aisweather.vdl.vo.RecommendedRouteVo;

/**
 *      @ClassName: RecommendedRouteAction   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年10月7日 下午6:42:37           
 */
public class RecommendedRouteAction implements Action {

	private Logger log = Logger.getLogger(this.getClass());
	private RecommendedRouteVo rrVo;
	private IRecommendedRouteService rrServiceImpl;

	/**
	 * @return the rrVo
	 */
	public RecommendedRouteVo getRrVo() {
		return rrVo;
	}

	/**
	 * @param rrVo
	 *            the rrVo to set
	 */
	public void setRrVo(RecommendedRouteVo rrVo) {
		this.rrVo = rrVo;
	}

	/**
	 * @param rrServiceImpl
	 *            the rrServiceImpl to set
	 */
	public void setRrServiceImpl(IRecommendedRouteService rrServiceImpl) {
		this.rrServiceImpl = rrServiceImpl;
	}

	public String sendMessage() {
		rrServiceImpl.transformVdl(rrVo);
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
