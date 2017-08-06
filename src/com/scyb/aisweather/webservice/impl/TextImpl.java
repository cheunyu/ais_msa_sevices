/**     
 * @Title: TextImpl.java    
 * @Package com.scyb.aisweather.webservice.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月24日 上午8:59:45    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;

import com.scyb.aisweather.vdl.service.ITextService;
import com.scyb.aisweather.vdl.vo.MarineWeatherWarnVo;
import com.scyb.aisweather.vdl.vo.TextVo;
import com.scyb.aisweather.webservice.IText;
import com.scyb.aisweather.webservice.bo.TextBo;
import org.apache.commons.beanutils.BeanUtils;

/**   
 * @ClassName: TextImpl   
 * @Description: TODO(中英文播发接口实现类)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年12月24日 上午8:59:45      
 *    
 */
@WebService(endpointInterface = "com.scyb.aisweather.webservice.IText")
public class TextImpl implements IText {

	private ITextService textServiceImpl;
	
	
	/**
	 * @param textServiceImpl the textServiceImpl to set
	 */
	public void setTextServiceImpl(ITextService textServiceImpl) {
		this.textServiceImpl = textServiceImpl;
	}


	/** (非 Javadoc)   
	 * <p>Title: getStatement</p>  
	 * <p>Description: </p>  
	 * @param textBo
	 * @return   
	 * @see com.scyb.aisweather.webservice.IText#getStatement(com.scyb.aisweather.webservice.bo.TextBo)   
	 */
	@Override
	public int textBroadcastService(TextBo textBo) {
		// TODO Auto-generated method stub
		TextVo textVo = new TextVo();
		try {
			BeanUtils.copyProperties(textVo, textBo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		textVo.setMessageNo(6);
		textVo.setContent(textBo.getContent());
		textServiceImpl.transformVdl(textVo);
		return 0;
	}

}
