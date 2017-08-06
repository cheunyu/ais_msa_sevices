/**   
* @Title: IDecompressNetCdfFile.java 
* @Package com.scyb.rescue.netcdf.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author cheunyu 
* @date 2012-10-11 下午1:40:36 
* @version V1.0   
*/
package com.scyb.aisweather.common.service;

/** 
 * @ClassName: IDecompressNetCdfFile 
 * @Description: TODO(解压缩NETCDF包接口) 
 * @author cheunyu 
 * @date 2012-10-11 下午1:40:36 
 *  
 */
public interface IDecompressNetCdfService {
	
	public boolean judgeUnGz(String gzFilePath);
	
	public void unGzFile(String gzFilePath);
}
