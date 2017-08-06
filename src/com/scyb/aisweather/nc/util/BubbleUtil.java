/**     
 * @Title: A.java    
 * @Package com.scyb.aisweather.nc.util   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年8月6日 下午1:52:03    
 * @version V1.0    
 */
package com.scyb.aisweather.nc.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 *      @ClassName: A     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年8月6日 下午1:52:03           
 */
public class BubbleUtil {
	
	private Logger log = Logger.getLogger(this.getClass());
	
	public int binaryTree(List<Integer> ncList, int i) {
		int low = 0;
		int high = ncList.size() - 1;
		int lowValue = 0;
		int highValue = 0;
		while (low <= high) {
			int middle = (low + high) / 2;
			if (i == ncList.get(middle)) {
				return middle;
			}
			if (i > ncList.get(middle)) {
				low = middle + 1;
				lowValue = i - ncList.get(middle);
//				log.info("i值" + i + ">" + ncList.get(middle));
//				log.info(middle);
//				System.out.println("- " +  ncList.get(middle));
			}
			if (i < ncList.get(middle)) {
				high = middle - 1;
				highValue = ncList.get(middle) - i;
//				log.info("i值" + i + "<" + ncList.get(middle));
//				System.out.println("+ " +  ncList.get(middle));
			}
		}
//		System.out.println(lowValue);
//		System.out.println(highValue);
//		System.out.println(i);
		int k = 0;
		if(lowValue<highValue) {
			k = i - lowValue;
		}if(lowValue>highValue) {
			k = i + highValue;
		}if(i < ncList.get(0)) {
			k =  ncList.get(0);
		}if(i > ncList.get(ncList.size()-1)) {
			k =  ncList.get(ncList.size()-1);
		}
		for(int j=0;j<ncList.size();j++) {
			if(ncList.get(j)==k) {
				return j;
			}
		}
		return k;
	}

	public List<Integer> getIndexOfList(List<String> ncList, List<String> list) {
		List<Integer> indexList = new ArrayList<Integer>();
		List<Integer> ncIntList = new ArrayList<Integer>();
		for(String s:ncList) {
			ncIntList.add((int)(Double.parseDouble(s)*1000000));
		}
		StringBuffer sb = new StringBuffer();
		int index = 0;
		sb.append("NC中匹配相近值为");
		for(String i:list) {
			index = this.binaryTree(ncIntList, (int)(Double.parseDouble(i)*1000000));
			sb.append("[" + ncList.get(index) + "]");
			indexList.add(index);
		}
//		log.info(sb.toString());
		return indexList;
	}
	
	public List<Integer> getIndexOfOutOrderList(List<String> orderList, List<String> outOrderList, List<String> list) {
		List<Integer> orderIndexList = new ArrayList<Integer>();
		List<Integer> ncIntList = new ArrayList<Integer>();
		List<Integer> outOrderIndexList = new ArrayList<Integer>();
		for(String s:orderList) {
			ncIntList.add((int)(Double.parseDouble(s)*1000000));
		}
		for(String i:list) {
			orderIndexList.add(this.binaryTree(ncIntList, (int)(Double.parseDouble(i)*1000000)));
		}
		StringBuffer sb = new StringBuffer();
		sb.append("NC中匹配相近值为");
		for(int i=0;i<orderIndexList.size();i++) {
			for(int j=0;j<outOrderList.size();j++) {
				if(orderList.get(orderIndexList.get(i)).equals(outOrderList.get(j))) {
					sb.append("[" + outOrderList.get(j) + "]");
					outOrderIndexList.add(j);
				}
			}
		}
//		log.info(sb.toString());
		return outOrderIndexList;
	}
}
