/**     
 * @Title: ReadNetCdfUtil.java    
 * @Package com.scyb.aisweather.nc.util   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年8月1日 下午2:59:15    
 * @version V1.0    
 */
package com.scyb.aisweather.nc.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import ucar.ma2.Array;
import ucar.ma2.IndexIterator;
import ucar.ma2.InvalidRangeException;
import ucar.ma2.Section;
import ucar.nc2.Dimension;
import ucar.nc2.NCdumpW;
import ucar.nc2.NetcdfFile;
import ucar.nc2.Variable;

/**
 *      @ClassName: ReadNetCdfUtil     @Description: TODO(解NETCDF数据工具类)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年8月1日 下午2:59:15           
 */
public class ReadNetCdfUtil {

	private Logger log = Logger.getLogger(this.getClass());
	NetcdfFile ncfile = null;
	BubbleUtil bubbleUtil = new BubbleUtil();

	/**
	 *  @Title: getTimeIndexFromCurrent   
	 *  @Description: TODO(根据参数timeValue取nc流场文件中时间的下标值)     @param @param
	 * filePath  @param @param timeValue  @param @return    设定文件  
	 *  @return int    返回类型    @throws   
	 */
	public int getTimeIndexFromCurrent(String filePath, String variableName, String timeValue) {
		try {
			ncfile = NetcdfFile.open(filePath);
			Variable varBean = ncfile.findVariable(variableName);
			if (null != varBean) {
				Array all = varBean.read();
				String data = NCdumpW.printArray(all, "time", null);
				String temp = data.replace(variableName, "").replace("\"", "").replace("=", "");
				Pattern p = Pattern.compile("\\s*|\t|\r|\n");
				Matcher m = p.matcher(temp);
				String[] timeStrArray = m.replaceAll("").split(",");
				for (int i = 0; i < timeStrArray.length; i++) {
					if (timeValue.equals(timeStrArray[i])) {
						return i;
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 *  @Title: getLonIndexFromCurrent   
	 *  @Description: TODO(根据参数lonList取nc流场文件中的下标值)     @param @param filePath
	 *  @param @param lonList  @param @return    设定文件  
	 *  @return List<Integer>    返回类型    @throws   
	 */
	public List<Integer> getLonIndexFromCurrent(String filePath, List<String> lonList) {
		List<Integer> lonIndexList = new ArrayList<Integer>();
		try {
			ncfile = NetcdfFile.open(filePath);
			final String VARIABLE = "lon";
			Variable varBean = ncfile.findVariable(VARIABLE);
			if (null != varBean) {
				Array all = varBean.read("0:0:1, 0:408:1");
				String data = NCdumpW.printArray(all, "lon", null);
				String temp = data.replace("lon", "").replace("\"", "").replace("=", "").replace("{", "").replace("}", "");
				Pattern p = Pattern.compile("\\s*|\t|\r|\n");
				Matcher m = p.matcher(temp);
				@SuppressWarnings({ "unchecked", "rawtypes" })
				List<String> ncList = new ArrayList(Arrays.asList(m.replaceAll("").split(",")));
				return bubbleUtil.getIndexOfList(ncList, lonList);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lonIndexList;
	}

	/**
	 *  @Title: getLatIndexFromCurrent   
	 *  @Description: TODO(根据参数latList取nc流场文件中的下标值)     @param @param filePath
	 *  @param @param latList  @param @return    设定文件  
	 *  @return List<Integer>    返回类型    @throws   
	 */
	public List<Integer> getLatIndexFromCurrent(String filePath, List<String> latList) {
		List<Integer> latIndexList = new ArrayList<Integer>();
		try {
			ncfile = NetcdfFile.open(filePath);
			final String VARIABLE = "lat";
			Variable varBean = ncfile.findVariable(VARIABLE);
			if (null != varBean) {
				Array all = varBean.read("0:432:1, 0:0:1");
				String data = NCdumpW.printArray(all, "lat", null);
				String temp = data.replace("lat", "").replace("\"", "").replace("=", "").replace("{", "").replace("}", "");
				Pattern p = Pattern.compile("\\s*|\t|\r|\n");
				Matcher m = p.matcher(temp);
				@SuppressWarnings({ "unchecked", "rawtypes" })
				List<String> ncList = new ArrayList(Arrays.asList(m.replaceAll("").split(",")));
				return bubbleUtil.getIndexOfList(ncList, latList);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return latIndexList;
	}

	/**
	 *  @Title: getDataFrom3DNc     @Description: TODO(从三维NC文件中取数据)   
	 *  @param @param filePath  @param @param field  @param @param timeIndex
	 *  @param @param latIndex  @param @param lonIndex  @param @return
	 *  @param @throws InvalidRangeException    设定文件    @return String    返回类型  
	 *  @throws   
	 */
	public String getDataFrom3DNc(String filePath, String field, int timeIndex, int latIndex, int lonIndex) throws InvalidRangeException {
		List<String> list = new ArrayList<String>();
		try {
			ncfile = NetcdfFile.open(filePath);
			Variable varBean = ncfile.findVariable(field);
			if (null != varBean) {
				int[] origin = new int[] { timeIndex, latIndex, lonIndex }; // 数据读取起点，一纬时间(小时)，二纬纬度，三纬经度
				int[] size = new int[] { 1, 1, 1 }; // 数据读取范围数量，一纬读1个增量，二纬读285个增量，三纬读331个增量
				int[] stride = new int[] { 1, 1, 1 }; // 数据读取跨度配置，一纬时间0间隔读取，二纬纬度2个间隔读取，三纬经度2个间隔读取
				Section section = new Section(origin, size, stride);
				Array all = varBean.read(section);
				String data = NCdumpW.printArray(all, field, null);
				list = Arrays.asList(data.replace(field, "").replace("=", "").replace("{", "").replace("}", "").replace(" ", "").replace("\\r|\\n|\\t|\\s", "")
						.trim().split(","));
				return list.get(0);
			}
			ncfile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Integer> getLonOrLatIndexFromWave(String filePath, String variableName, List<String> lonOrLatList) {
		String array[] = null;
		try {
			ncfile = NetcdfFile.open(filePath);
			Variable varBean = ncfile.findVariable(variableName);
			if (null != varBean) {
				Array all = varBean.read();
				String data = NCdumpW.printArray(all, variableName, null);
				array = data.replace(variableName, "").replace(" ", "").replace("=", "").replace("{", "").replace("}", "").replace("\"", "").split(",");
				List<String> dataList = Arrays.asList(array);
				List<String> outOrderList = new ArrayList<String>();
				outOrderList.addAll(dataList);
				Collections.sort(dataList, new Comparator() {
					@Override
					public int compare(Object o1, Object o2) {
						return new Double((String) o1).compareTo(new Double((String) o2));
					}
				});
				return bubbleUtil.getIndexOfOutOrderList(dataList, outOrderList, lonOrLatList);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Double> getLonOrLatFromWave(String filePath, String variableName) {
		String array[] = null;
		List<Double> list = new ArrayList<Double>();
		try {
			ncfile = NetcdfFile.open(filePath);
			Variable varBean = ncfile.findVariable(variableName);
			if (null != varBean) {
				Array all = varBean.read();
				String data = NCdumpW.printArray(all, variableName, null);
				array = data.replace(variableName, "").replace(" ", "").replace("=", "").replace("{", "").replace("}", "").replace("\"", "").split(",");
				for(String s:Arrays.asList(array)) {
					list.add(Double.parseDouble(s));
				}
				return list;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Double getWaveHsListFromWave(String filePath, String field, int timeIndexWave, int latlonIndex) {
		String array[] = null;
		try {
			ncfile = NetcdfFile.open(filePath);
			Variable varBean = ncfile.findVariable(field);
			if (null != varBean) {
				int[] origin = new int[] { timeIndexWave, latlonIndex }; // 数据读取起点，一纬时间(小时)，二纬纬度，三纬经度
				int[] size = new int[] { 1, 1 }; // 数据读取范围数量，一纬读1个增量，二纬读285个增量，三纬读331个增量
				int[] stride = new int[] { 1, 1 }; // 数据读取跨度配置，一纬时间0间隔读取，二纬纬度2个间隔读取，三纬经度2个间隔读取
				Section section = new Section(origin, size, stride);
				Array all = varBean.read(section);
				String data = NCdumpW.printArray(all, field, null);
				array = data.replace(field, "").replace(" ", "").replace("=", "").replace("{", "").replace("}", "").split(",");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Double.parseDouble(array[0]);
	}
	
	public List<Integer> getLonOrLatIndexFromWind(String filePath, List<String> lonOrLatList, String field) {
		List<Integer> lonIndexList = new ArrayList<Integer>();
		try {
			ncfile = NetcdfFile.open(filePath);
			final String VARIABLE = field;
			Variable varBean = ncfile.findVariable(VARIABLE);
			if (null != varBean) {
				Array all = varBean.read();
				String data = NCdumpW.printArray(all, VARIABLE, null);
				Pattern p = Pattern.compile("\\s*|\t|\r|\n");    
	            Matcher m = p.matcher(data);
	            String strNoBlank = m.replaceAll("");
				String array[] = strNoBlank.replace(VARIABLE, "").replace("=", "").replace("{", "").replace("}", "").replace("\"", "").split(",");
				List<String> ncList = new ArrayList<String>(Arrays.asList(array));
				return bubbleUtil.getIndexOfList(ncList, lonOrLatList);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lonIndexList;
	}
	
	public String[] getDateTimeIndexFromWind(String filePath, int dateOrHour, String field) {
		List<Integer> lonIndexList = new ArrayList<Integer>();
		try {
			ncfile = NetcdfFile.open(filePath);
			final String VARIABLE = field;
			Variable varBean = ncfile.findVariable(VARIABLE);
			if (null != varBean) {
				Array all = varBean.read();
				String data = NCdumpW.printArray(all, VARIABLE, null);
				Pattern p = Pattern.compile("\\s*|\t|\r|\n");    
	            Matcher m = p.matcher(data);
	            String strNoBlank = m.replaceAll("");
				String array[] = strNoBlank.replace(VARIABLE, "").replace("=", "").replace("{", "").replace("}", "").replace(".0", "").replace("\"", "").split(",");
				return array;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 输出txt
	 * */
	public static void write(String path, String content) {
		String s = new String();
		String s1 = new String();
		try {
			File f = new File(path);
			if (f.exists()) {
			} else {
				if (f.createNewFile()) {
				} else {
				}
			}
			BufferedReader input = new BufferedReader(new FileReader(f));
			while ((s = input.readLine()) != null) {
				s1 += s + "\n";
			}
			input.close();
			s1 += content;
			BufferedWriter output = new BufferedWriter(new FileWriter(f));
			output.write(s1);
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
