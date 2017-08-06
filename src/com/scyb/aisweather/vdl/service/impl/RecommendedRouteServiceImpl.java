/**     
 * @Title: RecommendedRouteServiceImpl.java    
 * @Package com.scyb.aisweather.vdl.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月7日 下午5:01:40    
 * @version V1.0    
 */
package com.scyb.aisweather.vdl.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;

import com.scyb.aisweather.serial.service.ISerialDataService;
import com.scyb.aisweather.socket.service.IVDMSocket;
import com.scyb.aisweather.vdl.bo.DemarcatedAreaBo;
import com.scyb.aisweather.vdl.bo.DemarcatedIrregulaAreaBo;
import com.scyb.aisweather.vdl.bo.RecommendedRouteBo;
import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;
import com.scyb.aisweather.vdl.service.IRecommendedRouteService;
import com.scyb.aisweather.vdl.util.AscIIConvertBinaryUtil;
import com.scyb.aisweather.vdl.util.ConvertCoordinateUtil;
import com.scyb.aisweather.vdl.util.MessageHeadBinaryUtil;
import com.scyb.aisweather.vdl.vo.RecommendedRouteVo;

/**
 *      @ClassName: RecommendedRouteServiceImpl   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年10月7日 下午5:01:40           
 */
public class RecommendedRouteServiceImpl implements IRecommendedRouteService {

	private Logger log = Logger.getLogger(this.getClass());
	private AscIIConvertBinaryUtil acbUtil = new AscIIConvertBinaryUtil();
	private ConvertCoordinateUtil ccUtil = new ConvertCoordinateUtil();
	private ISerialDataService serialDataServiceImpl;
	private IVDMSocket vdmSocketImpl;

	/**
	 * @param serialDataServiceImpl
	 *            the serialDataServiceImpl to set
	 */
	public void setSerialDataServiceImpl(
			ISerialDataService serialDataServiceImpl) {
		this.serialDataServiceImpl = serialDataServiceImpl;
	}

	/**
	 * @param vdmSocketImpl
	 *            the vdmSocketImpl to set
	 */
	public void setVdmSocketImpl(IVDMSocket vdmSocketImpl) {
		this.vdmSocketImpl = vdmSocketImpl;
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: transformVdl
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param rrVo  @return     @see
	 * com.scyb.aisweather.vdl.service.IRecommendedRouteService
	 * #transformVdl(com.scyb.aisweather.vdl.vo.RecommendedRouteVo)   
	 */
	@Override
	public int transformVdl(RecommendedRouteVo rrVo) {
		// TODO Auto-generated method stub
		RecommendedRouteBo rrBo = new RecommendedRouteBo();
		BeanUtils.copyProperties(rrVo, rrBo);
		String messageHead = new String();
		MessageHeadBinaryUtil mhbu = new MessageHeadBinaryUtil();
		// 判断6、8号报文类型
		MessageSix messageSix = new MessageSix();
		messageSix.setSource_id(rrVo.getSource_id());
		messageSix.setDestination_id(rrVo.getDestination_id());
		rrBo.setMessageSix(messageSix);
		messageHead = mhbu.generationMessageSixHead(messageSix);
		String dac = acbUtil.convertBin(RecommendedRouteBo.getDac(), 10);
		String fi = acbUtil.convertBin(RecommendedRouteBo.getFi(), 6);
		StringBuffer binary = new StringBuffer();
		binary.append(dac).append(fi);
		for (int i = 0; i < rrBo.getLatitudeDList().size(); i++) {
			log.info(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(rrBo
					.getLongitudeDList().get(i), rrBo.getLongitudeMList()
					.get(i), rrBo.getLongitudeSList().get(i), 0, 10000), 28));
			binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(rrBo
					.getLongitudeDList().get(i), rrBo.getLongitudeMList()
					.get(i), rrBo.getLongitudeSList().get(i), 0, 10000), 28));
			binary.append(acbUtil.convertBin(ccUtil.dmsToCenterCoordinates(rrBo
					.getLatitudeDList().get(i), rrBo.getLatitudeMList().get(i),
					rrBo.getLatitudeSList().get(i), 0, 10000), 27));
		}
		if (binary.toString().length() % 8 != 0) {
			for (int i = 0; i < binary.toString().length() % 8; i++) {
				binary.append("0");
			}
		}
		List<String> vdmMessageList = new ArrayList<String>();
		vdmMessageList = serialDataServiceImpl.generationABM(messageHead
				+ binary.toString(), rrBo.getMessageSix());
		vdmSocketImpl.sendMessage(vdmMessageList);
		return 0;
	}

}
