/**     
 * @Title: DecodeMessageImpl.java    
 * @Package com.scyb.aisweather.vdl.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2015年1月12日 下午1:04:04    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service.impl;

import org.apache.log4j.Logger;

import com.scyb.aisweather.vdl.request.bo.PortStatusReqBo;
import com.scyb.aisweather.vdl.request.bo.RecommendeRouteReqBo;
import com.scyb.aisweather.vdl.request.bo.RouteWeatherReqBo;
import com.scyb.aisweather.vdl.service.IDecodeMessageService;
import com.scyb.aisweather.vdl.service.IResolveVDMService;
import com.scyb.aisweather.vdl.util.CharacterConvertAisCodeUtil;
import com.scyb.aisweather.vdl.util.ConvertCoordinateUtil;

/**
 *      @ClassName: DecodeMessageImpl     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2015年1月12日 下午1:04:04           
 */
public class DecodeMessageServiceImpl implements IDecodeMessageService {

	private Logger log = Logger.getLogger(this.getClass());
	private ConvertCoordinateUtil ccUtil = new ConvertCoordinateUtil();
	private CharacterConvertAisCodeUtil ccacUtil = new CharacterConvertAisCodeUtil();
	private IResolveVDMService resolveVDMServiceImpl;

    public void setResolveVDMServiceImpl(IResolveVDMService resolveVDMServiceImpl) {
        this.resolveVDMServiceImpl = resolveVDMServiceImpl;
    }

    /**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: decodeMessage
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param binaryMessage     @see
	 * com.scyb.aisweather.vdl.service.IDecodeMessage
	 * #decodeMessage(java.lang.String)   
	 */
	@Override
	public Object decodeMessage(String binaryMessage) {
		// TODO Auto-generated method stub
		int messageNo = resolveVDMServiceImpl.checkMessageNo(binaryMessage);
		switch (messageNo) {
		case 6:
			log.info("6号报文");
			log.info(binaryMessage);
			int dac = Integer.valueOf(binaryMessage.substring(72, 82), 2);
			int fi = Integer.valueOf(binaryMessage.substring(82, 88), 2);
			log.info(dac);
			log.info(fi);
			if (dac == 412) {
				switch (fi) {
				case 14: // 航线推荐应用
					RecommendeRouteReqBo rrReqBo = new RecommendeRouteReqBo();
					rrReqBo.setTonnage(Integer.valueOf(binaryMessage.substring(88, 107), 2));
					rrReqBo.setCargoType(Integer.valueOf(binaryMessage.substring(107, 112), 2));
					rrReqBo.setLongitude1(ccUtil.binaryToDms(binaryMessage.substring(112, 140), 10000));
					rrReqBo.setLatitude1(ccUtil.binaryToDms(binaryMessage.substring(140, 167), 10000));
					rrReqBo.setLongitude2(ccUtil.binaryToDms(binaryMessage.substring(167, 195), 10000));
					rrReqBo.setLatitude2(ccUtil.binaryToDms(binaryMessage.substring(195, 222), 10000));
					return rrReqBo;
				case 16:	//航线气象应用
					RouteWeatherReqBo rwReqBo = new RouteWeatherReqBo();
					int locationCount = (binaryMessage.length() - 88) / (28 + 27);
					int startIndex = 88;
					int lonStartIndex,
					lonEndIndex,
					latEndIndex = 0;
					for (int i = 0; i < locationCount; i++) {
						if (i == 0) {
							lonStartIndex = startIndex;
						} else {
							lonStartIndex = latEndIndex;
						}
						lonEndIndex = lonStartIndex + 28;
						latEndIndex = lonEndIndex + 27;
						rwReqBo.getLongitudeList().add(ccUtil.binaryToDms(binaryMessage.substring(lonStartIndex, lonEndIndex), 2));
						rwReqBo.getLatitudeList().add(ccUtil.binaryToDms(binaryMessage.substring(lonEndIndex, latEndIndex), 2));
					}
					log.info(rwReqBo.toString());
					return rwReqBo;
				case 18:	//港口状况
					PortStatusReqBo psReqBo = new PortStatusReqBo();
					psReqBo.setCodeType(Integer.valueOf(binaryMessage.substring(88, 89), 2));
					psReqBo.setPortName(ccacUtil.convertAsciiCode(binaryMessage.substring(96, 216)));
					psReqBo.setAnchorageName(ccacUtil.convertAsciiCode(binaryMessage.substring(216, 336)));
					log.info(psReqBo.toString());
					return psReqBo;
				case 20:	//扩展船舶静态数据和航行相关信息
					return null;
				}
			} else {

			}
			switch (dac) {

			}
			break;
		}
		return null;
	}
}
