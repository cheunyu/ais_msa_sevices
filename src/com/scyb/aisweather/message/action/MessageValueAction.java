package com.scyb.aisweather.message.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.scyb.aisweather.message.service.IMessageValueService;

public class MessageValueAction implements Action {

	private Logger log = Logger.getLogger(this.getClass());
	private String temOption;
	
	private String lonArr;
	
	private String latArr;
	
	private String dataTypeArr;
	
	private int dataTime;
	
	private IMessageValueService msgValueServiceImpl;
	
	public void setTemOption(String temOption) {
		this.temOption = temOption;
	}

	public void setLonArr(String lonArr) {
		this.lonArr = lonArr;
	}

	public void setLatArr(String latArr) {
		this.latArr = latArr;
	}

	public void setDataTypeArr(String dataTypeArr) {
		this.dataTypeArr = dataTypeArr;
	}

	public void setDataTime(int dataTime) {
		this.dataTime = dataTime;
	}

	public void setMsgValueServiceImpl(IMessageValueService msgValueServiceImpl) {
		this.msgValueServiceImpl = msgValueServiceImpl;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public String saveMsgV() throws Exception {
		// TODO Auto-generated method stub
		msgValueServiceImpl.saveMsgV(temOption, lonArr, latArr, dataTypeArr, dataTime);
		return this.SUCCESS;
	}
}
