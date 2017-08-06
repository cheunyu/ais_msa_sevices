/**     
 * @Title: A.java    
 * @Package com.scyb.aisweather.nc.util   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年8月6日 下午1:52:03    
 * @version V1.0    
 */
package com.scyb.aisweather.nc.test;

/**
 *      @ClassName: A     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年8月6日 下午1:52:03           
 */
public class BubbleTest {
	public static int binary(int[] a2, int i) {
		int low = 0;
		int high = a2.length - 1;
		int lowValue = 0;
		int highValue = 0;
		while (low <= high) {
			int middle = (low + high) / 2;
			if (i == a2[middle]) {
				return middle;
			}
			if (i > a2[middle]) {
				low = middle + 1;
				lowValue = i - a2[middle];
				System.out.println("- " +  a2[middle]);
			}
			if (i < a2[middle]) {
				high = middle - 1;
				highValue = a2[middle] - i;
				System.out.println("+ " +  a2[middle]);
			}
		}
		System.out.println(lowValue);
		System.out.println(highValue);
		int k = 0;
		if(lowValue<highValue) {
			k = i - lowValue;
		}if(lowValue>highValue) {
			k = i + highValue;
		}if(i < a2[0]) {
			k =  a2[0];
		}if(i > a2[a2.length-1]) {
			k =  a2[a2.length-1];
		}
		return k;
	}

	public static void main(String[] args) {
//		int[] a = {120333336, 120375000, 120416664, 120458336, 120500000, 120541664, 120583336, 120625000, 120666664, 120708336, 120750000, 120791664};
//		int value = binary(a, 120375000);
//		System.out.println(value);
		String s = "118.458336";
		System.out.println((int)(Double.parseDouble("118.458336")*1000000));
	}
}
