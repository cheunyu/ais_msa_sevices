package com.scyb.aisweather.message.vdl.util;

import org.apache.log4j.Logger;

import com.scyb.aisweather.message.vdl.head.bo.MessageSix;

public class MessageHeadUtil {

	private Logger log = Logger.getLogger(this.getClass());
	
	public static void messageSix(MessageSix ms) {
		String message_id = Encode.charTo6bit(Integer.toString(ms.getMessageId()), 6);
		String repeat = Encode.charTo6bit(Integer.toString(ms.getRepeat()), 2);
		String source_id = Encode.toFullBinaryString(ms.getSource_id(), 30);
		String sequence_number = Encode.charTo6bit(Integer.toString(ms.getSequence_number()), 2);
		String destination_id = Encode.toFullBinaryString(ms.getDestination_id(), 30);
		String retransmit_flag = Encode.charTo6bit(Integer.toString(ms.getRetransmit_flag()), 1);
		String spare = Encode.charTo6bit(Integer.toString(ms.getSpare()), 1);
		System.out.println(message_id);
		System.out.println(repeat);
		System.out.println(source_id);
		System.out.println(sequence_number);
		System.out.println(destination_id);
		System.out.println(retransmit_flag);
		System.out.println(spare);
	}
}
