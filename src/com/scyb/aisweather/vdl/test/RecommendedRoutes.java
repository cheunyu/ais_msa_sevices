/**     
 * @Title: RecommendedRoutes.java    
 * @Package com.scyb.aisweather.vdl.test   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年11月10日 上午9:44:50    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.test;

import com.scyb.aisweather.serial.service.ISerialDataService;
import com.scyb.aisweather.serial.service.impl.SerialDataServiceImpl;
import com.scyb.aisweather.vdl.bo.RecommendedRouteBo;
import com.scyb.aisweather.vdl.util.AscIIConvertBinaryUtil;
import com.scyb.aisweather.vdl.util.ConvertCoordinateUtil;

/**
 *      @ClassName: RecommendedRoutes     @Description: TODO(航线推荐 船舶请求)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年11月10日 上午9:44:50      
 *     
 */
public class RecommendedRoutes {

	private AscIIConvertBinaryUtil acbUtil = new AscIIConvertBinaryUtil();
	private ConvertCoordinateUtil ccUtil = new ConvertCoordinateUtil();

	public String test() {
		StringBuffer binary = new StringBuffer();
		int MESSAGE_ID = 6;
		binary.append(acbUtil.convertBin(MESSAGE_ID, 6));
		int repeat = 0;
		binary.append(acbUtil.convertBin(repeat, 2));
		int source_id = 123456;
		binary.append(acbUtil.convertBin(source_id, 30));
		int sequence_number = 0;
		binary.append(acbUtil.convertBin(sequence_number, 2));
		int destination_id = 123456;
		binary.append(acbUtil.convertBin(destination_id, 30));
		int retransmit_flag = 0;
		binary.append(acbUtil.convertBin(retransmit_flag, 1));
		int spare = 0;
		String dac = acbUtil.convertBin(412, 10);
		String fi = acbUtil.convertBin(14, 6);
		binary.append(dac).append(fi);
		// 吨位
		int tonnage = 500000;
		binary.append(acbUtil.convertBin(tonnage, 19));
		// 货物类型
		int cargoType = 1;
		binary.append(acbUtil.convertBin(cargoType, 5));
		int latdStart = 34;
		int latmStart = 24;
		Double latsStart = 23d;
		int londStart = 122;
		int lonmStart = 23;
		Double lonsStart = 53d;
		int latdEnd = 34;
		int latmEnd = 24;
		Double latsEnd = 23d;
		int londEnd = 122;
		int lonmEnd = 23;
		Double lonsEnd = 53d;
		binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(londStart, lonmStart, lonsStart, 0, 10000), 28));
		binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(latdStart, latmStart, latsStart, 0, 10000), 27));
		binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(londEnd, lonmEnd, lonsEnd, 0, 10000), 28));
		binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(latdEnd, latmEnd, latsEnd, 0, 10000), 27));
		binary.append(acbUtil.convertBin(0, 2));
		System.out.println(binary.toString());
		return binary.toString();
	}

	public static void main(String args[]) {
		RecommendedRoutes rr = new RecommendedRoutes();
		RecommendedRouteBo rrBo = new RecommendedRouteBo();
		IEC i = new IEC();
		System.out.println(i.decode(rr.test()));
	}
}
