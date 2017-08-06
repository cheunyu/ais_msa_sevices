package com.scyb.aisweather.message.dao;

import java.util.List;

import com.scyb.aisweather.common.dao.IBaseDao;
import com.scyb.aisweather.message.bo.MessageValue;

/**   
 * @ClassName: IMessageHDao   
 * @Description: TODO(前台报文数据层接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date Nov 20, 2013 4:44:00 PM      
 *    
 */
public interface IMessageValueDao extends IBaseDao{

	/**
	 * @Title: saveMsg   
	 * @Description: TODO(保存数值预报)   
	 * @param msgV    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public void saveMsgV(MessageValue msgV);
	
	/**
	 * @Title: queryAllMsgV   
	 * @Description: TODO(查询所有数值预报报文)   
	 * @param @return    设定文件  
	 * @return List<MessageValue>    返回类型  
	 * @throws   
	 */
	public List<MessageValue> queryAllMsgVList();
}