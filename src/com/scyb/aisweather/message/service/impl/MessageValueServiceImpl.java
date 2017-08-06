package com.scyb.aisweather.message.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.scyb.aisweather.message.bo.MessageValue;
import com.scyb.aisweather.message.dao.IMessageValueDao;
import com.scyb.aisweather.message.service.IMessageValueService;
import com.scyb.aisweather.template.bo.Template;
import com.scyb.aisweather.template.service.ITemplateService;

/**   
 * @ClassName: MessageValueServiceImpl   
 * @Description: TODO(数值预报业务逻辑层接口实现类)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date Nov 20, 2013 6:50:07 PM      
 *    
 */
public class MessageValueServiceImpl implements IMessageValueService {

	private Logger log = Logger.getLogger(this.getClass());
	
	private IMessageValueDao msgValueDaoImpl;
	
	private ITemplateService temServiceImpl;
	
	public void setMsgValueDaoImpl(IMessageValueDao msgValueDaoImpl) {
		this.msgValueDaoImpl = msgValueDaoImpl;
	}

	/**
	 * @param temServiceImpl the temServiceImpl to set
	 */
	public void setTemServiceImpl(ITemplateService temServiceImpl) {
		this.temServiceImpl = temServiceImpl;
	}

	@Override
	public void saveMsgV(String temOption, String lonArr, String latArr,
			String dataTypeArr, int dataTime) {
		// TODO Auto-generated method stub
		Template tem = temServiceImpl.queryTemById(temOption);
		Date createTime = new Date();
		Calendar sendCal = Calendar.getInstance();
		sendCal.setTime(createTime);
		sendCal.add(Calendar.SECOND, tem.getIntervalTime());
		Calendar nextCal = Calendar.getInstance();
		nextCal.setTime(sendCal.getTime());
		nextCal.add(Calendar.SECOND, tem.getIntervalTime());
		MessageValue mv = new MessageValue(lonArr, latArr, dataTypeArr, dataTime, tem, createTime, sendCal.getTime(), nextCal.getTime());
		msgValueDaoImpl.save(mv);
	}

	/** (非 Javadoc)   
	 * <p>Title: queryAllMsgVList</p>  
	 * <p>Description: </p>  
	 *    
	 * @see com.scyb.aisweather.message.service.IMessageValueService#queryAllMsgVList()   
	 */
	@Override
	public List<MessageValue> queryAllMsgVList() {
		return msgValueDaoImpl.queryAllMsgVList();
	}

}
