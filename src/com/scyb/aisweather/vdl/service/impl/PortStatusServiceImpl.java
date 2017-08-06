/**     
 * @Title: PortStatusServiceImpl.java    
 * @Package com.scyb.aisweather.vdl.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月7日 下午7:05:22    
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
import com.scyb.aisweather.vdl.bo.PortStatusBo;
import com.scyb.aisweather.vdl.bo.head.MessageEight;
import com.scyb.aisweather.vdl.bo.head.MessageSix;
import com.scyb.aisweather.vdl.service.IPortStatusService;
import com.scyb.aisweather.vdl.util.AscIIConvertBinaryUtil;
import com.scyb.aisweather.vdl.util.ConvertCoordinateUtil;
import com.scyb.aisweather.vdl.util.MessageHeadBinaryUtil;
import com.scyb.aisweather.vdl.vo.PortStatusVo;

/**
 *      @ClassName: PortStatusServiceImpl   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年10月7日 下午7:05:22           
 */
public class PortStatusServiceImpl implements IPortStatusService {

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
	 *     @param psVo  @return     @see
	 * com.scyb.aisweather.vdl.service.IPortStatusService
	 * #transformVdl(com.scyb.aisweather.vdl.vo.PortStatusVo)   
	 */
	@Override
	public int transformVdl(PortStatusVo psVo) {
		// TODO Auto-generated method stub
		PortStatusBo psBo = new PortStatusBo();
		BeanUtils.copyProperties(psVo, psBo);
		String messageHead = new String();
		MessageHeadBinaryUtil mhbu = new MessageHeadBinaryUtil();
		MessageSix messageSix = new MessageSix();
		messageSix.setSource_id(psVo.getSource_id());
		messageSix.setDestination_id(psVo.getDestination_id());
		psBo.setMessageSix(messageSix);
		messageHead = mhbu.generationMessageSixHead(messageSix);
		String dac = acbUtil.convertBin(PortStatusBo.getDac(), 10);
		String fi = acbUtil.convertBin(PortStatusBo.getFi(), 6);
		StringBuffer binary = new StringBuffer();
		binary.append(dac).append(fi);
		binary.append(acbUtil.convertBin(psBo.getBerthTotal(), 12));
		binary.append(acbUtil.convertBin(psBo.getMoorageTotal(), 12));
		binary.append(acbUtil.convertBin(psBo.getWaitInboundTotal(), 12));
		binary.append(acbUtil.convertBin(psBo.getAnchorageTotal(), 7));
		binary.append(acbUtil.convertBin(psBo.getWaitMoorageTotal(), 12));
		binary.append(acbUtil.convertBin(0, 1));
		List<String> vdmMessageList = new ArrayList<String>();
		vdmMessageList = serialDataServiceImpl.generationABM(messageHead
				+ binary.toString(), psBo.getMessageSix());
		vdmSocketImpl.sendMessage(vdmMessageList);
		return 0;
	}

}
