/**     
 * @Title: NetCdfDataServiceImpl.java    
 * @Package com.scyb.aisweather.nc.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年8月1日 上午10:46:26    
 * @version V1.0    
 */
package com.scyb.aisweather.nc.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.ServletContextAware;

import ucar.ma2.InvalidRangeException;

import com.scyb.aisweather.nc.service.INetCdfDataService;
import com.scyb.aisweather.nc.util.ReadNetCdfUtil;
import com.scyb.aisweather.vdl.util.GoogleGetDistanceUtil;

/**
 *      @ClassName: NetCdfDataServiceImpl   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年8月1日 上午10:46:26           
 */
public class NetCdfDataServiceImpl implements INetCdfDataService, ServletContextAware {

	private Logger log = Logger.getLogger(this.getClass());
	private ReadNetCdfUtil readNcUtil = new ReadNetCdfUtil();
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	private ServletContext servletContext;
	private Calendar cal = Calendar.getInstance();
	/**
	 *      @Fields lonIndexCurrentList : TODO(流场经度下标集合)   
	 */
	private List<Integer> lonIndexCurrentList = new ArrayList<Integer>();
	/**
	 *      @Fields latIndexCurrentList : TODO(流场纬度下标集合)   
	 */
	private List<Integer> latIndexCurrentList = new ArrayList<Integer>();
	/**
	 *      @Fields timeIndexCurrent : TODO(流场时间下标)   
	 */
	private int timeIndexCurrent = 0;
	/**
	 *      @Fields u_surList : TODO(流场u矢量集合)   
	 */
	private List<String> u_surList = new ArrayList<String>();
	/**
	 *      @Fields v_surList : TODO(流场v矢量集合)   
	 */
	private List<String> v_surList = new ArrayList<String>();
	/**
	 *      @Fields lonIndexWaveList : TODO(浪场经度下标集合)   
	 */
	private List<Integer> lonIndexWaveList = new ArrayList<Integer>();
	/**
	 *      @Fields latIndexWaveList : TODO(浪场纬度下标集合)   
	 */
	private List<Integer> latIndexWaveList = new ArrayList<Integer>();
	/**
	 *      @Fields timeIndexWave : TODO(浪场时间下标)   
	 */
	private int timeIndexWave = 0;
	/**
	 *      @Fields lonIndexWindList : TODO(风场经度下标集合)   
	 */
	private List<Integer> lonIndexWindList = new ArrayList<Integer>();
	/**
	 *      @Fields latIndexWindList : TODO(风场纬度下标集合)   
	 */
	private List<Integer> latIndexWindList = new ArrayList<Integer>();
	/**
	 *      @Fields dateTimeIndexWind : TODO(风场时间下标)   
	 */
	private int dateTimeIndexWind = 0;
	/**
	 *      @Fields u_surList : TODO(风场u矢量集合)   
	 */
	private List<String> u10List = new ArrayList<String>();
	/**
	 *      @Fields v_surList : TODO(风场v矢量集合)   
	 */
	private List<String> v10List = new ArrayList<String>();

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: initCurrentNcDataIndexs
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param lonList  @param latList  @param time     @see
	 * com.scyb.aisweather
	 * .nc.service.INetCdfDataService#initCurrentNcDataIndexs(java.util.List,
	 * java.util.List, int)   
	 */
	@Override
	public void initCurrentNcDataIndexs(List<String> lonList, List<String> latList, String time) {
		// TODO Auto-generated method stub
		String ncFilePath = (String) ContextLoader.getCurrentWebApplicationContext().getServletContext().getAttribute("ncFilePath");
		Calendar cal = (Calendar) servletContext.getAttribute("netcdfDateTime");
		StringBuffer filePath = new StringBuffer();
		filePath.append(ncFilePath).append("/").append(sdf.format(cal.getTime())).append("/nc/");
		cal.add(Calendar.DAY_OF_MONTH, -1);
		filePath.append("current_").append(sdf.format(cal.getTime())).append("20.nc");
		cal.add(Calendar.DAY_OF_MONTH, 1);
		// 获取流场文件中经度的相似值坐标
		lonIndexCurrentList = readNcUtil.getLonIndexFromCurrent(filePath.toString(), lonList);
		// 获取流场文件中纬度的相似值坐标
		latIndexCurrentList = readNcUtil.getLatIndexFromCurrent(filePath.toString(), latList);
		// 获取流场文件中时间值坐标
		timeIndexCurrent = readNcUtil.getTimeIndexFromCurrent(filePath.toString(), "time", time);
		// U/V矢量值
		try {
			for (int i = 0; i < latIndexCurrentList.size(); i++) {
				u_surList
						.add(readNcUtil.getDataFrom3DNc(filePath.toString(), "u_sur", timeIndexCurrent, latIndexCurrentList.get(i), lonIndexCurrentList.get(i)));
				v_surList
						.add(readNcUtil.getDataFrom3DNc(filePath.toString(), "v_sur", timeIndexCurrent, latIndexCurrentList.get(i), lonIndexCurrentList.get(i)));
			}
			for (int i = 0; i < u_surList.size(); i++) {
				if (u_surList.get(i).equals("NaN") || v_surList.get(i).equals("NaN")) {
					u_surList.remove(i);
					v_surList.remove(i);
				}
			}
		} catch (InvalidRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: getCurrentWaterSpeed
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param lonList  @param lat  @return     @see
	 * com.scyb.aisweather.nc.service
	 * .INetCdfDataService#getCurrentWaterSpeed(java.util.List,
	 * java.util.List)   
	 */
	@Override
	public List<Double> getCurrentWaterSpeedFromNc() {
		List<Double> waterSpeedList = new ArrayList<Double>();
		for (int i = 0; i < u_surList.size(); i++) {
			waterSpeedList.add(Math.sqrt(Double.parseDouble(v_surList.get(i)) * Double.parseDouble(v_surList.get(i)) + Double.parseDouble(u_surList.get(i))
					* Double.parseDouble(u_surList.get(i))));
		}
		return waterSpeedList;
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: getCurrentwaterDirection
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @return     @see com.scyb.aisweather.nc.service.INetCdfDataService#
	 * getCurrentwaterDirection()   
	 */
	@Override
	public List<Double> getCurrentWaterDirectionFromNc() {
		// TODO Auto-generated method stub
		List<Double> waterDirectionList = new ArrayList<Double>();
		for (int i = 0; i < u_surList.size(); i++) {
			waterDirectionList.add(Math.atan2(Double.parseDouble(v_surList.get(i)), Double.parseDouble(u_surList.get(i))) * 180 / Math.PI);
		}
		return waterDirectionList;
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: getCurrentWaterTemperatureFromNc
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @return     @see com.scyb.aisweather.nc.service.INetCdfDataService#
	 * getCurrentWaterTemperatureFromNc()   
	 */
	@Override
	public List<Double> getCurrentWaterTemperatureFromNc() {
		// TODO Auto-generated method stub
		List<String> tempList = new ArrayList<String>();
		List<Double> waterTemperatureList = new ArrayList<Double>();
		String ncFilePath = (String) ContextLoader.getCurrentWebApplicationContext().getServletContext().getAttribute("ncFilePath");
		Calendar cal = (Calendar) servletContext.getAttribute("netcdfDateTime");
		StringBuffer filePath = new StringBuffer();
		filePath.append(ncFilePath).append("/").append(sdf.format(cal.getTime())).append("/nc/");
		cal.add(Calendar.DAY_OF_MONTH, -1);
		filePath.append("current_").append(sdf.format(cal.getTime())).append("20.nc");
		cal.add(Calendar.DAY_OF_MONTH, 1);
		try {
			for (int i = 0; i < latIndexCurrentList.size(); i++) {
				tempList.add(readNcUtil.getDataFrom3DNc(filePath.toString(), "temp_sur", timeIndexCurrent,
						latIndexCurrentList.get(i), lonIndexCurrentList.get(i)));
			}
			for (int i = 0; i < tempList.size(); i++) {
				if (tempList.get(i).equals("NaN") || tempList.get(i).equals("NaN")) {
					tempList.remove(i);
				} else {
					waterTemperatureList.add(Double.parseDouble(tempList.get(i)));
				}
			}
		} catch (InvalidRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return waterTemperatureList;
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: initWaveNcDataIndexs
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param lonList  @param latList  @param time     @see
	 * com.scyb.aisweather
	 * .nc.service.INetCdfDataService#initWaveNcDataIndexs(java.util.List,
	 * java.util.List, int)   
	 */
	@Override
	public void initWaveNcDataIndexs(List<String> lonList, List<String> latList, String time) {
		String ncFilePath = (String) ContextLoader.getCurrentWebApplicationContext().getServletContext().getAttribute("ncFilePath");
		Calendar cal = (Calendar) servletContext.getAttribute("netcdfDateTime");
		StringBuffer filePath = new StringBuffer();
		filePath.append(ncFilePath).append("/").append(sdf.format(cal.getTime())).append("/nc/");
		filePath.append("wave_").append(sdf.format(cal.getTime())).append(".nc");
		// 获取浪场文件中经度的相似值坐标
		lonIndexWaveList = readNcUtil.getLonOrLatIndexFromWave(filePath.toString(), "nodes_x", lonList);
		// 获取浪场文件中纬度的相似值坐标
		latIndexWaveList = readNcUtil.getLonOrLatIndexFromWave(filePath.toString(), "nodes_y", latList);
		// 获取浪场文件中时间值坐标
		SimpleDateFormat sdfEn = new SimpleDateFormat("dd-MMM-yyyyHH:mm:ss", Locale.US);
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyyMMddHH");
		try {
			timeIndexWave = readNcUtil.getTimeIndexFromCurrent(filePath.toString(), "time_str", sdfEn.format(sdformat.parse(time)));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: getWaveHsListFromNc
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param lonList  @param latList  @param time  @return     @see
	 * com.scyb
	 * .aisweather.nc.service.INetCdfDataService#getWaveHsListFromNc(java
	 * .util.List, java.util.List, java.lang.String)   
	 */
	@Override
	public List<Double> getWaveFieldListFromNc(List<String> lonList, List<String> latList, String time, String field) {
		// TODO Auto-generated method stub
		String ncFilePath = (String) ContextLoader.getCurrentWebApplicationContext().getServletContext().getAttribute("ncFilePath");
		Calendar cal = (Calendar) servletContext.getAttribute("netcdfDateTime");
		StringBuffer filePath = new StringBuffer();
		filePath.append(ncFilePath).append("/").append(sdf.format(cal.getTime())).append("/nc/");
		filePath.append("wave_").append(sdf.format(cal.getTime())).append(".nc");
		List<Double> ncLonList = readNcUtil.getLonOrLatFromWave(filePath.toString(), "nodes_x");
		List<Double> ncLatList = readNcUtil.getLonOrLatFromWave(filePath.toString(), "nodes_y");
		List<Integer> minLatLonIndexList = new ArrayList<Integer>();
		for (int i = 0; i < lonList.size(); i++) {
			Double tempValue = 0d;
			Double minValue = 1000d;
			Double minLon = 0d;
			Double minLat = 0d;
			int minLatLonIndex = 0;
			for (int j = 0; j < ncLonList.size(); j++) {
				tempValue = GoogleGetDistanceUtil.GetDistance(Double.parseDouble(latList.get(i)), Double.parseDouble(lonList.get(i)), ncLatList.get(j),
						ncLonList.get(j));
				if (tempValue < minValue) {
					minValue = tempValue;
					minLon = ncLonList.get(j);
					minLat = ncLatList.get(j);
					minLatLonIndex = j;
				}
			}
			minLatLonIndexList.add(minLatLonIndex);
//			log.info("与【" + lonList.get(i) + "/" + latList.get(i) + "】最近的点是【" + minLon + "/" + minLat + "】相差了" + minValue + "千米");
		}
		List<Double> waveFieldList = new ArrayList<Double>();
		for (int i = 0; i < minLatLonIndexList.size(); i++) {
			waveFieldList.add(readNcUtil.getWaveHsListFromWave(filePath.toString(), field, timeIndexWave,
					minLatLonIndexList.get(i)));
		}
		return waveFieldList;
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: initWindNcDataIndexs
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param lonList  @param latList  @param time     @see
	 * com.scyb.aisweather
	 * .nc.service.INetCdfDataService#initWindNcDataIndexs(java.util.List,
	 * java.util.List, java.lang.String)   
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void initWindNcDataIndexs(List<String> lonList, List<String> latList, String time) {
		// TODO Auto-generated method stub
		String ncFilePath = (String) ContextLoader.getCurrentWebApplicationContext().getServletContext().getAttribute("ncFilePath");
		Calendar cal = (Calendar) servletContext.getAttribute("netcdfDateTime");
		StringBuffer filePath = new StringBuffer();
		filePath.append(ncFilePath).append("/").append(sdf.format(cal.getTime())).append("/nc/");
		filePath.append("wind_").append(sdf.format(cal.getTime())).append(".nc");
		// 获取风场文件中经度的相似值坐标
		lonIndexWindList = readNcUtil.getLonOrLatIndexFromWind(filePath.toString(), lonList, "lon");
		// 获取风场文件中纬度的相似值坐标
		latIndexWindList = readNcUtil.getLonOrLatIndexFromWind(filePath.toString(), latList, "lat");
		// 获取风场文件中时间值坐标
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHH");
		String[] dayIndex = null;
		String[] hourIndex = null;
		try {
			dayIndex = readNcUtil.getDateTimeIndexFromWind(filePath.toString(), sdf.parse(time).getDate(), "day");
			hourIndex = readNcUtil.getDateTimeIndexFromWind(filePath.toString(), sdf.parse(time).getHours(), "hour");
			for (int i = 0; i < dayIndex.length; i++) {
				if (sdf.parse(time).getDate() == Integer.parseInt(dayIndex[i]) && sdf.parse(time).getHours() == Integer.parseInt(hourIndex[i])) {
					dateTimeIndexWind = i;
				}
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// U/V矢量值
		try {
			for (int i = 0; i < lonIndexWindList.size(); i++) {
				u10List.add(readNcUtil.getDataFrom3DNc(filePath.toString(), "u10", dateTimeIndexWind, latIndexWindList.get(i), lonIndexWindList.get(i)));
				v10List.add(readNcUtil.getDataFrom3DNc(filePath.toString(), "v10", dateTimeIndexWind, latIndexWindList.get(i), lonIndexWindList.get(i)));
			}
			for (int i = 0; i < u10List.size(); i++) {
				if (u10List.get(i).equals("NaN") || v10List.get(i).equals("NaN")) {
					u10List.remove(i);
					v10List.remove(i);
				}
			}
		} catch (InvalidRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: setServletContext
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param arg0     @see
	 * org.springframework.web.context.ServletContextAware
	 * #setServletContext(javax.servlet.ServletContext)   
	 */
	@Override
	public void setServletContext(ServletContext arg0) {
		// TODO Auto-generated method stub
		this.servletContext = arg0;
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: getWindSpeedFromNc
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @return     @see
	 * com.scyb.aisweather.nc.service.INetCdfDataService#getWindSpeedFromNc()   
	 */
	@Override
	public List<Double> getWindSpeedFromNc() {
		// TODO Auto-generated method stub
		List<Double> windSpeedList = new ArrayList<Double>();
		for (int i = 0; i < u10List.size(); i++) {
			windSpeedList.add(Math.sqrt(Double.parseDouble(u10List.get(i)) * Double.parseDouble(u10List.get(i)) + Double.parseDouble(v10List.get(i))
					* Double.parseDouble(v10List.get(i))));
		}
		return windSpeedList;
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: getWindDirectionFromNc
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @return     @see com.scyb.aisweather.nc.service.INetCdfDataService#
	 * getWindDirectionFromNc()   
	 */
	@Override
	public List<Double> getWindDirectionFromNc() {
		// TODO Auto-generated method stub
		List<Double> windDirectionList = new ArrayList<Double>();
		for (int i = 0; i < u10List.size(); i++) {
			Double temp = Math.atan2(Double.parseDouble(v10List.get(i)), Double.parseDouble(u10List.get(i)) * 180 / Math.PI);
			if (temp < 0) {
				temp = 360 + temp;
			}
			windDirectionList.add(temp);
		}
		return windDirectionList;
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: getPressureFromNc
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @return     @see
	 * com.scyb.aisweather.nc.service.INetCdfDataService#getPressureFromNc()   
	 */
	@Override
	public List<Double> getPressureFromNc() {
		// TODO Auto-generated method stub
		List<Double> pressureList = new ArrayList<Double>();
		String ncFilePath = (String) ContextLoader.getCurrentWebApplicationContext().getServletContext().getAttribute("ncFilePath");
		Calendar cal = (Calendar) servletContext.getAttribute("netcdfDateTime");
		StringBuffer filePath = new StringBuffer();
		filePath.append(ncFilePath).append("/").append(sdf.format(cal.getTime())).append("/nc/");
		// cal.add(Calendar.DAY_OF_MONTH, -1);
		filePath.append("wind_").append(sdf.format(cal.getTime())).append(".nc");
		// cal.add(Calendar.DAY_OF_MONTH, +1);
		for (int i = 0; i < lonIndexWindList.size(); i++) {
			try {
				pressureList.add(Double.parseDouble(readNcUtil.getDataFrom3DNc(filePath.toString(), "slp", dateTimeIndexWind, latIndexWindList.get(i),
						lonIndexWindList.get(i))) / 100);
			} catch (InvalidRangeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return pressureList;
	}

}