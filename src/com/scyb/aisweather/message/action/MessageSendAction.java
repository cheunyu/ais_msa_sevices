/**     
 * @Title: MessageSendAction.java    
 * @Package com.scyb.aisweather.message.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2013-11-22 下午2:18:18    
 * @version V1.0    
 */
package com.scyb.aisweather.message.action;

import java.util.List;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.message.bo.MessageValue;
import com.scyb.aisweather.message.service.IMessageValueService;

/**   
 * @ClassName: MessageSendAction   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2013-11-22 下午2:18:18      
 *    
 */
public class MessageSendAction implements Action {

	private Logger log = Logger.getLogger(this.getClass());
	
	private List<MessageValue> msgVList;
	
	private IMessageValueService msgValueServiceImpl;
	
	/**
	 * @return the msgVList
	 */
	public List<MessageValue> getMsgVList() {
		return msgVList;
	}

	/**
	 * @param msgValueServiceImpl the msgValueServiceImpl to set
	 */
	public void setMsgValueServiceImpl(IMessageValueService msgValueServiceImpl) {
		this.msgValueServiceImpl = msgValueServiceImpl;
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
	
	/**
	 * @Title: allMessageSendList   
	 * @Description: TODO(查询所有报文播发队列)   
	 * @param @return
	 * @param @throws Exception    设定文件  
	 * @return String    返回类型  
	 * @throws   
	 */
	public String allMessageSendList() throws Exception {
		// TODO Auto-generated method stub
		msgVList = msgValueServiceImpl.queryAllMsgVList();
		return this.SUCCESS;
	} 
}
