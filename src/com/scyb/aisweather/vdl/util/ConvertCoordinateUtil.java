/**     
 * @Title: ConvertCoordinateUtil.java    
 * @Package com.scyb.aisweather.vdl.util   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年7月29日 下午5:01:38    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 *      @ClassName: ConvertCoordinateUtil     @Description: TODO(坐标转换工具类)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年7月29日 下午5:01:38           
 */
public class ConvertCoordinateUtil {

	private Logger log = Logger.getLogger(this.getClass());

	/**
	 *  @Title: dmsToDecimal     @Description: TODO(度分秒转换为十进制格式)   
	 *  @param @param d  @param @param m  @param @param s
	 *  @param @return    设定文件    @return String    返回类型    @throws   
	 */
	public List<String> dmsToDecimal(List<String> d, List<String> m, List<String> s) {
		double du = 0d, fen = 0d, miao = 0d;
		List<String> dmsListDec = new ArrayList<String>();
		for (int i = 0; i < d.size(); i++) {
			du = Double.parseDouble(d.get(i));
			fen = Double.parseDouble(m.get(i)) / 60;
			miao = Double.parseDouble(s.get(i)) / 3600;
			dmsListDec.add(String.valueOf(du + fen + miao));
		}
		return dmsListDec;
	}

	public String dmsToDecimal(String d, String m, String s) {
		double du = 0d, fen = 0d, miao = 0d;
		du = Double.parseDouble(d);
		fen = Double.parseDouble(m) / 60;
		miao = Double.parseDouble(s) / 3600;
		return String.valueOf(du + fen + miao);
	}

	public int dmsToCenterCoordinates(Integer d, Integer m, Double s, Integer startD, int accuracy) {
		return (int) (((d - startD) * 60 + m + (s / 60)) * accuracy);
	}

	/**
	 * @Title: binaryToDms   
	 * @Description: TODO(经纬度转换方法，由二进制转换十进制整型)   
	 * @param @param binaryData
	 * @param @param accuracy
	 * @param @return    设定文件  
	 * @return int    返回类型  
	 * @throws   
	 */
	public int binaryToDms(String binaryData, int accuracy) {
		BigDecimal b1 = new BigDecimal(Integer.valueOf(binaryData, 2));  
		BigDecimal b2 = new BigDecimal(10000);
		BigDecimal b3 = new BigDecimal(60);
		Double rslt = b1.divide(b2, 6, BigDecimal.ROUND_HALF_UP).doubleValue();
		BigDecimal b4 = new BigDecimal(rslt);
		Double b5 = b4.divide(b3, 6, BigDecimal.ROUND_HALF_UP).doubleValue();
		BigDecimal b = new BigDecimal(b5);
		return b.movePointRight(6).toBigInteger().intValue();
	}

	public String dmsDecimalToBinary(int dmsDec) {
		// System.out.println((int)(Double.parseDouble(this.dmsToDecimal("122",
		// "32", "42"))*1000000));
		System.out.println(dmsDec / 1000000 * 60);
		System.out.println(ArithUtil.div(dmsDec % 1000000, 1000000, 6));
		return null;
	}

	public static void main(String args[]) {
		List<String> d = new ArrayList<String>();
		List<String> m = new ArrayList<String>();
		List<String> s = new ArrayList<String>();
		d.add("119");
		d.add("118");
		m.add("32");
		m.add("15");
		s.add("8");
		s.add("57");
		// new ConvertCoordinateUtil().dmsToDecimal(d, m, s);
		//
		// System.out.println(new
		// ConvertCoordinateUtil().dmsToCenterCoordinates(129, 31, 26.71, 105,
		// 1000));
		System.out.println(new ConvertCoordinateUtil().binaryToDms("001001011000001001000111010", 10000));
		// new ConvertCoordinateUtil().dmsDecimalToBinary(122545000);
	}
}