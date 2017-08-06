package com.scyb.aisweather.message.service;

import java.util.List;

import com.scyb.aisweather.message.bo.MessageValue;

/**   
 * @ClassName: IMessageValueService   
 * @Description: TODO(数值预报业务逻辑层接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date Nov 20, 2013 6:49:11 PM      
 *    
 */
public interface IMessageValueService {
	
	/**
	 * @Title: saveMsgV   
	 * @Description: TODO(添加数值预报接口)   
	 * @param temOption
	 * @param lonArr
	 * @param latArr
	 * @param dataTypeArr
	 * @param dataTime    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public void saveMsgV(String temOption, String lonArr, String latArr, String dataTypeArr, int dataTime);
	
	/**
	 * @Title: queryAllMsgVList   
	 * @Description: TODO(查询所有数值预报报文)   
	 * @param     设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public  List<MessageValue> queryAllMsgVList();
	
}
