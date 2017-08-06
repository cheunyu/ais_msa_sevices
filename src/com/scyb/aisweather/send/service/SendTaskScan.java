/**     
 * @Title: SendTaskScan.java    
 * @Package com.scyb.aisweather.send.service   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2013-11-22 下午2:09:16    
 * @version V1.0    
 */
package com.scyb.aisweather.send.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.scyb.aisweather.message.bo.MessageValue;
import com.scyb.aisweather.message.dao.IMessageValueDao;
import com.scyb.aisweather.message.service.IMessageValueService;
import com.scyb.aisweather.message.util.MessageValueUtil;

/**   
 * @ClassName: SendTaskScan   
 * @Description: TODO(轮询播发任务)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2013-11-22 下午2:09:16      
 *    
 */
public class SendTaskScan {
	
	private Logger log = Logger.getLogger(this.getClass());
	
	private IMessageValueService msgValueServiceImpl;
	
	private IMessageValueDao msgValueDaoImpl;
	
	private MessageValueUtil msgValueUtil = new MessageValueUtil();
	
	/**
	 * @param msgValueServiceImpl the msgValueServiceImpl to set
	 */
	public void setMsgValueServiceImpl(IMessageValueService msgValueServiceImpl) {
		this.msgValueServiceImpl = msgValueServiceImpl;
	}
	
	public void setMsgValueDaoImpl(IMessageValueDao msgValueDaoImpl) {
		this.msgValueDaoImpl = msgValueDaoImpl;
	}

	public synchronized void scanTask() {
		List<MessageValue> msgVList = msgValueServiceImpl.queryAllMsgVList();
		for(int i=0;i<msgVList.size();i++) {
//			log.info("DB : " + msgVList.get(i).getSendTime().getTime()/1000);
//			log.info("Task : " + new Date().getTime()/1000);
			if(msgVList.get(i).getSendTime().getTime()/1000==new Date().getTime()/1000) {
				msgValueUtil.msgValueToSAAB(msgVList.get(i));
				log.info("播发完成，更新下次播发时间");
				msgVList.get(i).setSendTime(msgVList.get(i).getNextTime());
				Calendar cal = Calendar.getInstance();
				cal.setTime(msgVList.get(i).getNextTime());
				cal.add(Calendar.SECOND, msgVList.get(i).getTemplate().getIntervalTime());
				msgVList.get(i).setNextTime(cal.getTime());
				msgValueDaoImpl.saveMsgV(msgVList.get(i));
			}
		}
	}
	
}
