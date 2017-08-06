/**     
 * @Title: IEC.java    
 * @Package com.scyb.aisweather.vdl.test   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年11月10日 上午10:07:20    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.scyb.aisweather.vdl.util.AscIIConvertBinaryUtil;

/**
 *      @ClassName: IEC     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年11月10日 上午10:07:20      
 *     
 */
public class IEC {

	private AscIIConvertBinaryUtil acbUtil = new AscIIConvertBinaryUtil();
	
	/**
	 *  @Title: main     @Description: TODO(这里用一句话描述这个方法的作用)     @param @param
	 * args    设定文件    @return void    返回类型    @throws   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String decode(String iecCode) {
		Map<String, String> sixbitMap = new HashMap<String, String>();
		sixbitMap.put("0", "000000");
		sixbitMap.put("1", "000001");
		sixbitMap.put("2", "000010");
		sixbitMap.put("3", "000011");
		sixbitMap.put("4", "000100");
		sixbitMap.put("5", "000101");
		sixbitMap.put("6", "000110");
		sixbitMap.put("7", "000111");
		sixbitMap.put("8", "001000");
		sixbitMap.put("9", "001001");
		sixbitMap.put(":", "001010");
		sixbitMap.put(";", "001011");
		sixbitMap.put("<", "001100");
		sixbitMap.put("=", "001101");
		sixbitMap.put(">", "001110");
		sixbitMap.put("?", "001111");
		sixbitMap.put("@", "010000");
		sixbitMap.put("A", "010001");
		sixbitMap.put("B", "010010");
		sixbitMap.put("C", "010011");
		sixbitMap.put("D", "010100");
		sixbitMap.put("E", "010101");
		sixbitMap.put("F", "010110");
		sixbitMap.put("G", "010111");
		sixbitMap.put("H", "011000");
		sixbitMap.put("I", "011001");
		sixbitMap.put("J", "011010");
		sixbitMap.put("K", "011011");
		sixbitMap.put("L", "011100");
		sixbitMap.put("M", "011101");
		sixbitMap.put("N", "011110");
		sixbitMap.put("O", "011111");
		sixbitMap.put("P", "100000");
		sixbitMap.put("Q", "100001");
		sixbitMap.put("R", "100010");
		sixbitMap.put("S", "100011");
		sixbitMap.put("T", "100100");
		sixbitMap.put("U", "100101");
		sixbitMap.put("V", "100110");
		sixbitMap.put("W", "100111");
		sixbitMap.put("`", "101000");
		sixbitMap.put("a", "101001");
		sixbitMap.put("b", "101010");
		sixbitMap.put("c", "101011");
		sixbitMap.put("d", "101100");
		sixbitMap.put("e", "101101");
		sixbitMap.put("f", "101110");
		sixbitMap.put("g", "101111");
		sixbitMap.put("h", "110000");
		sixbitMap.put("i", "110001");
		sixbitMap.put("j", "110010");
		sixbitMap.put("k", "110011");
		sixbitMap.put("l", "110100");
		sixbitMap.put("m", "110101");
		sixbitMap.put("n", "110110");
		sixbitMap.put("o", "110111");
		sixbitMap.put("p", "111000");
		sixbitMap.put("q", "111001");
		sixbitMap.put("r", "111010");
		sixbitMap.put("s", "111011");
		sixbitMap.put("t", "111100");
		sixbitMap.put("u", "111101");
		sixbitMap.put("v", "111110");
		sixbitMap.put("w", "111111");
		for (int i = 0; i < iecCode.length() % 6; i++) {
			iecCode = iecCode + "0";
		}
		StringBuffer serialCode = new StringBuffer();
		for (int i = 0; i < iecCode.length() / 6; i++) {
			int tmp = Integer.valueOf(iecCode.substring(i * 6, (i + 1) * 6), 2);
			Iterator<Entry<String, String>> iter = sixbitMap.entrySet().iterator();
			while (iter.hasNext()) {
				@SuppressWarnings("rawtypes")
				Entry entry = (Entry) iter.next();
				if (entry.getValue().equals(acbUtil.convertBin(tmp, 6))) {
					serialCode.append(entry.getKey());
				}
			}
		}
		return serialCode.toString();
	}
}
