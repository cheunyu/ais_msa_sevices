package com.scyb.aisweather.message.vdl.head.bo;

public class MessageEight {
	
	private final static int MESSAGE_ID = 8;
	private int repeat;
	private int source_id;
	private int spare;
	
	public MessageEight() {
		super();
	}
	public MessageEight(int repeat, int source_id, int spare) {
		super();
		this.repeat = repeat;
		this.source_id = source_id;
		this.spare = spare;
	}
	public int getRepeat() {
		return repeat;
	}
	public void setRepeat(int repeat) {
		this.repeat = repeat;
	}
	public int getSource_id() {
		return source_id;
	}
	public void setSource_id(int source_id) {
		this.source_id = source_id;
	}
	public int getSpare() {
		return spare;
	}
	public void setSpare(int spare) {
		this.spare = spare;
	}
	public static int getMessageId() {
		return MESSAGE_ID;
	}
	@Override
	public String toString() {
		return "MessageEight [repeat=" + repeat + ", source_id=" + source_id
				+ ", spare=" + spare + "]";
	}
	
	
}
