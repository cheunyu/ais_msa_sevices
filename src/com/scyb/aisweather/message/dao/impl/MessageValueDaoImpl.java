package com.scyb.aisweather.message.dao.impl;

import java.util.List;

import com.scyb.aisweather.common.dao.impl.BaseDaoImpl;
import com.scyb.aisweather.message.bo.MessageValue;
import com.scyb.aisweather.message.dao.IMessageValueDao;

public class MessageValueDaoImpl extends BaseDaoImpl implements IMessageValueDao {

	@Override
	public void saveMsgV(MessageValue msgV) {
		// TODO Auto-generated method stub
		super.saveOrUpdate(msgV);
	}

	/** (非 Javadoc)   
	 * <p>Title: queryAllMsgV</p>  
	 * <p>Description: </p>  
	 * @return   
	 * @see com.scyb.aisweather.message.dao.IMessageValueDao#queryAllMsgV()   
	 */
	@Override
	public List<MessageValue> queryAllMsgVList() {
		String hql = "from MessageValue";
		return super.queryList(hql);
	}

}
