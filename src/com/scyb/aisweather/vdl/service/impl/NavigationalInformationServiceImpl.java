/**     
 * @Title: NavigationalInformationServiceImpl.java    
 * @Package com.scyb.aisweather.vdl.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author cheunyu xiaoyuuii@hotmail.com    
 * @date 2014年10月7日 下午7:28:39    
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
import com.scyb.aisweather.vdl.bo.NavigationalInformationBo;
import com.scyb.aisweather.vdl.bo.PortStatusBo;
import com.scyb.aisweather.vdl.bo.head.MessageSix;
import com.scyb.aisweather.vdl.service.INavigationalInformationService;
import com.scyb.aisweather.vdl.util.AscIIConvertBinaryUtil;
import com.scyb.aisweather.vdl.util.ConvertCoordinateUtil;
import com.scyb.aisweather.vdl.util.MessageHeadBinaryUtil;
import com.scyb.aisweather.vdl.vo.NavigationalInformationVo;

/**   
 * @ClassName: NavigationalInformationServiceImpl   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年10月7日 下午7:28:39      
 *    
 */
public class NavigationalInformationServiceImpl implements
		INavigationalInformationService {

	private Logger log = Logger.getLogger(this.getClass());
	private AscIIConvertBinaryUtil acbUtil = new AscIIConvertBinaryUtil();
	private ConvertCoordinateUtil ccUtil = new ConvertCoordinateUtil();
	private ISerialDataService serialDataServiceImpl;
	private IVDMSocket vdmSocketImpl;
	
	/**
	 * @param serialDataServiceImpl the serialDataServiceImpl to set
	 */
	public void setSerialDataServiceImpl(ISerialDataService serialDataServiceImpl) {
		this.serialDataServiceImpl = serialDataServiceImpl;
	}


	/**
	 * @param vdmSocketImpl the vdmSocketImpl to set
	 */
	public void setVdmSocketImpl(IVDMSocket vdmSocketImpl) {
		this.vdmSocketImpl = vdmSocketImpl;
	}


	/** (非 Javadoc)   
	 * <p>Title: transformVdl</p>  
	 * <p>Description: </p>  
	 * @param niVo
	 * @return   
	 * @see com.scyb.aisweather.vdl.service.INavigationalInformationService#transformVdl(com.scyb.aisweather.vdl.vo.NavigationalInformationVo)   
	 */
	@Override
	public int transformVdl(NavigationalInformationVo niVo) {
		// TODO Auto-generated method stub
		NavigationalInformationBo niBo = new NavigationalInformationBo();
		BeanUtils.copyProperties(niVo, niVo);
		String messageHead = new String();
		MessageHeadBinaryUtil mhbu = new MessageHeadBinaryUtil();
		MessageSix messageSix = new MessageSix();
		messageSix.setSource_id(niVo.getSource_id());
		messageSix.setDestination_id(niVo.getDestination_id());
		niBo.setMessageSix(messageSix);
		messageHead = mhbu.generationMessageSixHead(messageSix);
		String dac = acbUtil.convertBin(NavigationalInformationBo.getDac(), 10);
		String fi = acbUtil.convertBin(NavigationalInformationBo.getFi(), 6);
		StringBuffer binary = new StringBuffer();
		binary.append(dac).append(fi);
		binary.append(acbUtil.convertBin(niBo.getDeparturePort(), 1));
		binary.append(acbUtil.convertBin(niBo.getShipType(), 1));
		binary.append(acbUtil.convertBin(niBo.getPowerType(), 1));
		binary.append(acbUtil.convertBin(niBo.getHorsepower(), 1));
		binary.append(acbUtil.convertBin(niBo.getPersonnelTotal(), 1));
		binary.append(acbUtil.convertBin(niBo.getBerthMarina(), 1));
		binary.append(acbUtil.convertBin(niBo.getBerthTime(), 1));
		binary.append(acbUtil.convertBin(0, 1));
		List<String> vdmMessageList = new ArrayList<String>();
		vdmMessageList = serialDataServiceImpl.generationABM(messageHead
				+ binary.toString(), niBo.getMessageSix());
		vdmSocketImpl.sendMessage(vdmMessageList);
		return 0;
	}

}
