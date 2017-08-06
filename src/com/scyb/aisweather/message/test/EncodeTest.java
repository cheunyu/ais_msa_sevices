/**     
 * @Title: EncodeTest.java    
 * @Package com.scyb.aisweather.message.test   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2013-11-22 上午10:14:33    
 * @version V1.0    
 */
package com.scyb.aisweather.message.test;

/**
 *      @ClassName: EncodeTest     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2013-11-22 上午10:14:33      
 *     
 */
public class EncodeTest {

	/**
	 *  @Title: main     @Description: TODO(这里用一句话描述这个方法的作用)     @param @param
	 * args    设定文件    @return void    返回类型    @throws   
	 */
	public static void main(String[] args) {
		EncodeTest et = new EncodeTest();
		// TODO Auto-generated method stub
		String str = "D5CDP=5CC175PD:=C1";
		for (int i = 0; i < str.getBytes().length; i++) {
			// System.out.println(et.toFullBinaryString(str.getBytes()[i], 8));
			int j = str.getBytes()[i] + 40;
			if ((str.getBytes()[i] + 40) > 128) {
				System.out.println(et.toFullBinaryString(str.getBytes()[i] + 40 + 32, 6));
			} else {
				System.out.println(et.toFullBinaryString(str.getBytes()[i] + 40 + 40, 6));
			}
		}
	}

	public static String toFullBinaryString(int num, int subIndex) {
		char[] chs = new char[subIndex];
		for (int i = 0, k = chs.length; i < k; i++) {
			chs[k - i - 1] = ((num >> i) & 1) == 0 ? '0' : '1';
		}
		return new String(chs);
	}
}
