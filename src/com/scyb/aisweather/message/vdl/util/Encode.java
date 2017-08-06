package com.scyb.aisweather.message.vdl.util;

import org.apache.log4j.Logger;

public class Encode {

	private Logger log = Logger.getLogger(this.getClass());
	
	public static String charTo6bit(String str, int subIndex) {
		int tmp = str.getBytes()[0];
		if((tmp+40)>128) 
			tmp = tmp+72;
		else
			tmp = tmp+80;
		return toFullBinaryString(tmp, subIndex);
	}
	
	
	public static String toFullBinaryString(int num, int subIndex) {
		char[] chs = new char[subIndex];
		for (int i = 0, k = chs.length; i < k; i++) {
			chs[k - i - 1] = ((num >> i) & 1) == 0 ? '0' : '1';
		}
		return new String(chs);
	}
	
}
