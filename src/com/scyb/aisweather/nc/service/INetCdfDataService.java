/**     
 * @Title: INetCdfDataService.java    
 * @Package com.scyb.aisweather.nc.service   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年8月1日 上午10:41:32    
 * @version V1.0    
 */
package com.scyb.aisweather.nc.service;

import java.util.List;

/**   
 * @ClassName: INetCdfDataService   
 * @Description: TODO(获取netcdf数据接口)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年8月1日 上午10:41:32      
 *    
 */
public interface INetCdfDataService {
	
	/**
	 * @Title: initCurrentNcDataIndexs   
	 * @Description: TODO(初始化流场经度、纬度、时间下标与U/V矢量值)   
	 * @param @param lonList
	 * @param @param latList
	 * @param @param time    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public void initCurrentNcDataIndexs(List<String> lonList, List<String> latList, String time);

	/**
	 * @Title: getCurrentWaterSpeed   
	 * @Description: TODO(获取流速数据)   
	 * @param @return    设定文件  
	 * @return List<Double>    返回类型  
	 * @throws   
	 */
	public List<Double> getCurrentWaterSpeedFromNc();
	
	/**
	 * @Title: getCurrentWaterDirection   
	 * @Description: TODO(获取流向数据)   
	 * @param @return    设定文件  
	 * @return List<Double>    返回类型  
	 * @throws   
	 */
	public List<Double> getCurrentWaterDirectionFromNc();
	
	/**
	 * @Title: getCurrentWaterTemperatureFromNc   
	 * @Description: TODO(获取水温数据)   
	 * @param @return    设定文件  
	 * @return List<Double>    返回类型  
	 * @throws   
	 */
	public List<Double> getCurrentWaterTemperatureFromNc();
	
	/**
	 * @Title: initWaveLonIndexs   
	 * @Description: TODO(初始化浪场经度、纬度、时间下标)   
	 * @param @param lonList    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public void initWaveNcDataIndexs(List<String> lonList, List<String> latList, String time);
	
	public List<Double> getWaveFieldListFromNc(List<String> lonList, List<String> latList, String time, String field);
	
	/**
	 * @Title: initWaveLonIndexs   
	 * @Description: TODO(初始化风场经度、纬度、时间下标)   
	 * @param @param lonList    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public void initWindNcDataIndexs(List<String> lonList, List<String> latList, String time);
	
	/**
	 * @Title: getWindSpeedFromNc   
	 * @Description: TODO(获取风速数据)   
	 * @param @return    设定文件  
	 * @return List<Double>    返回类型  
	 * @throws   
	 */
	public List<Double> getWindSpeedFromNc();
	/**
	 * @Title: getWindDirectionFromNc   
	 * @Description: TODO(获取风向数据)   
	 * @param @return    设定文件  
	 * @return List<Double>    返回类型  
	 * @throws   
	 */
	public List<Double> getWindDirectionFromNc();
	/**
	 * @Title: getPressureFromNc   
	 * @Description: TODO(获取气压数据)   
	 * @param @return    设定文件  
	 * @return List<Double>    返回类型  
	 * @throws   
	 */
	public List<Double> getPressureFromNc();
}