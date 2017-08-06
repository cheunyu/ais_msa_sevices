package com.scyb.aisweather.test;

public class EncodeTest {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EncodeTest et = new EncodeTest();
		// TODO Auto-generated method stub
		String str = "D5CDP=5CC175PD:=C1";
		for(int i=0;i<str.getBytes().length;i++) {
//			System.out.println(et.toFullBinaryString(str.getBytes()[i], 8));
			int j = str.getBytes()[i]+40;
			if((str.getBytes()[i]+40)>128) {
				System.out.println(et.toFullBinaryString(str.getBytes()[i]+40+32, 6));
			}else {
				System.out.println(et.toFullBinaryString(str.getBytes()[i]+40+40, 6));
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
