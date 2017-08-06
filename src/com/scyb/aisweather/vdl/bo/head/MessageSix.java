package com.scyb.aisweather.vdl.bo.head;

public class MessageSix {

	private final static int MESSAGE_ID = 6;
	private int repeat = 0;
	private int source_id;
	private int sequence_number = 0;
	private int destination_id;
	private int retransmit_flag = 0;
	private int spare = 0;

	public MessageSix() {
		super();
	}

	public MessageSix(int repeat, int source_id, int sequence_number,
			int destination_id, int retransmit_flag, int spare) {
		super();
		this.repeat = repeat;
		this.source_id = source_id;
		this.sequence_number = sequence_number;
		this.destination_id = destination_id;
		this.retransmit_flag = retransmit_flag;
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

	public int getSequence_number() {
		return sequence_number;
	}

	public void setSequence_number(int sequence_number) {
		this.sequence_number = sequence_number;
	}

	public int getDestination_id() {
		return destination_id;
	}

	public void setDestination_id(int destination_id) {
		this.destination_id = destination_id;
	}

	public int getRetransmit_flag() {
		return retransmit_flag;
	}

	public void setRetransmit_flag(int retransmit_flag) {
		this.retransmit_flag = retransmit_flag;
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
		return "MessageSix [repeat=" + repeat + ", source_id=" + source_id
				+ ", sequence_number=" + sequence_number + ", destination_id="
				+ destination_id + ", retransmit_flag=" + retransmit_flag
				+ ", spare=" + spare + "]";
	}

}
