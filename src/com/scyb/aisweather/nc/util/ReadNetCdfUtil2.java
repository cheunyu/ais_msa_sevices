/**     
 * @Title: ReadNetCdfUtil.java    
 * @Package com.scyb.aisweather.nc.util   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2013-12-3 上午11:32:26    
 * @version V1.0    
 */
package com.scyb.aisweather.nc.util;

import java.io.IOException;

import ucar.ma2.Array;
import ucar.ma2.IndexIterator;
import ucar.ma2.InvalidRangeException;
import ucar.nc2.NetcdfFile;
import ucar.nc2.Variable;

/**
 *      @ClassName: ReadNetCdfUtil     @Description: TODO(解析NETCDF文件工具类)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2013-12-3 上午11:32:26           
 */
public class ReadNetCdfUtil2 {

	NetcdfFile ncfile = null;

	public String[] get1DFromNc(String filePath, String variable) {
		String arr[] = null;
		try {
			ncfile = NetcdfFile.open(filePath);
			Variable varBean = ncfile.findVariable(variable);
			if (null != varBean) {
				Array lon = varBean.read();
				arr = lon.toString().split(" ");
				System.out.println(lon.toString());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arr;
	}

	public String[] get3DFromNc(String filePath, String variable) {
		String array[] = null;
		try {
			ncfile = NetcdfFile.open(filePath);
			Variable varBean = ncfile.findVariable(variable);
			if (null != varBean) {
				int[] origin = new int[] { 0, 0, 0 };
				int[] size = new int[] { 72, 171, 117 };
				Array all = varBean.read(origin, size).reduce();
				System.out.println(all.getDouble(1440503));
				IndexIterator iter = all.getIndexIterator();
				Double test[][][] = new Double[72][171][117];
				int i = 0, time = 0, lat = 0, lon = 0;
//				while (iter.hasNext()) {
//					double val = iter.getDoubleNext();
//					test[time][lat][lon] = val;
//					lon++;
//					if (lon%117==0) {
//						lon = 0;
//						lat++;
//					}
//					if(lat%171==0&&lat!=0) {
//						lat = 0;
//						time++;
//					}
//				}
//				System.out.println(test[1][0][116]);
//				System.out.println(test[1][1][0]);
//				System.out.println(test[1][2][10]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return array;
	}
}
