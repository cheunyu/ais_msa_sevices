/**     
 * @Title: ResolveNcServiceImpl.java    
 * @Package com.scyb.aisweather.nc.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2013-11-4 下午12:00:39    
 * @version V1.0    
 */
package com.scyb.aisweather.nc.service.impl;

import ucar.ma2.InvalidRangeException;

import com.scyb.aisweather.nc.service.IResolveNcService;
import com.scyb.aisweather.nc.util.ReadNetCdfUtil2;

/**
 *      @ClassName: ResolveNcServiceImpl   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2013-11-4 下午12:00:39           
 */
public class ResolveNcServiceImpl implements IResolveNcService {

	private ReadNetCdfUtil2 readNcUtil = new ReadNetCdfUtil2();

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: resolveWind
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *          @see
	 * com.scyb.aisweather.nc.service.IResolveNcService#resolveWind()   
	 */
	@Override
	public void resolveWind(String filePath) {
		// TODO Auto-generated method stub
//		readNcUtil.get1DFromNc(filePath, "lon");
//		readNcUtil.get1DFromNc(filePath, "lat");
//		readNcUtil.get1DFromNc(filePath, "year");
//		readNcUtil.get1DFromNc(filePath, "month");
//		readNcUtil.get1DFromNc(filePath, "day");
//		readNcUtil.get1DFromNc(filePath, "hour");
		readNcUtil.get3DFromNc(filePath, "u10");
	}

	public static void main(String args[]) {
		ResolveNcServiceImpl r = new ResolveNcServiceImpl();
		r.resolveWind("E:/海事/东海搜救/nc数据/wind_20131203.nc");
	}

}