/**     
 * @Title: GoogleGetDistance.java    
 * @Package com.scyb.aisweather.vdl.util   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年8月21日 下午3:13:45    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.util;

/**
 *      @ClassName: GoogleGetDistance     @Description: TODO(google的算法，计算两个地理坐标距离)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年8月21日 下午3:13:45           
 */
public class GoogleGetDistanceUtil {
	private static double EARTH_RADIUS = 6378.137;

	private static double rad(double d) {
		return d * Math.PI / 180.0;
	}

	public static double GetDistance(double lat1, double lng1, double lat2, double lng2) {
		double radLat1 = rad(lat1);
		double radLat2 = rad(lat2);
		double a = radLat1 - radLat2;
		double b = rad(lng1) - rad(lng2);
		double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) + Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
		s = s * EARTH_RADIUS;
//		s = Math.round(s * 10000) / 10000;
		return s;
	}
}
