/**     
 * @Title: FiledDataFormatUtil.java    
 * @Package com.scyb.aisweather.vdl.util   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月28日 下午2:00:12    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.util;

/**   
 * @ClassName: FiledDataFormatUtil   
 * @Description: TODO(格式化VO对象数据内容格式)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年9月28日 下午2:00:12      
 *    
 */
public class FiledDataFormatUtil {

	public static int nauticalMileFormat(String str) {
		return Integer.parseInt(str.replace("海里", ""));
	}
	
	public static Double nauticalMileFormatDouble(String str) {
		return Double.parseDouble(str.replace("海里", ""));
	}
	
	public static int windPowerFormat(String str) {
		return Integer.parseInt(str.replace("级", ""));
	}
	
	public static int kilometerFormat(String str) {
		return Integer.parseInt(str.replace("公里", ""));
	}
	
	public static int hourFormat(String str) {
		return Integer.parseInt(str.replace("小时", ""));
	}
	
	public static int secondsFormat(String str) {
		return Integer.parseInt(str.replace("秒", ""));
	}
	
	public static int meterFormat(String str) {
		return Integer.parseInt(str.replace("米", ""));
	}
	
	public static int centimeterFormat(String str) {
		return Integer.parseInt(str.replace("厘米", ""));
	}
	
	public static int speedFormat(String str) {
		return Integer.parseInt(str.replace("公里/小时", ""));
	}
	
	public static int speedJieFormat(String str) {
		return Integer.parseInt(str.replace("节", ""));
	}
	
	public static int directionFormat(String str) {
		return Integer.parseInt(str.replace("°", ""));
	}
	
	public static int optionDefaultFormat(String str) {
		return Integer.parseInt(str.replace("==请选择==", "1"));
	}
	
	public static Double launchFormat(String str) {
		return Double.parseDouble(str.replace("KHz", ""));
	}
}
