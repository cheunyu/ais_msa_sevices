/**     
 * @Title: SocketThread.java    
 * @Package com.scyb.aisweather.socket.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年10月31日 下午4:14:41    
 * @version V1.0    
 */
package com.scyb.aisweather.socket.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;
import javax.websocket.Session;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.scyb.aisweather.vdl.request.bo.NavigationalInformationReqBo;
import com.scyb.aisweather.vdl.request.bo.PortStatusReqBo;
import com.scyb.aisweather.vdl.request.bo.RecommendeRouteReqBo;
import com.scyb.aisweather.vdl.request.bo.RouteWeatherReqBo;
import com.scyb.aisweather.vdl.service.IDecodeMessageService;
import com.scyb.aisweather.vdl.service.IResolveVDMService;

/**
 *      @ClassName: SocketThread     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年10月31日 下午4:14:41      
 *     
 */
public class SocketThread extends Thread {

	private Socket socket = null;
	private IResolveVDMService resolveVDMServiceImpl = null;
	private IDecodeMessageService decodeMessageServiceImpl = null;
	private Logger log = Logger.getLogger(this.getClass());
	private ServletContext servletContext;


	/**
	 * @param resolveVDMServiceImpl the resolveVDMServiceImpl to set
	 */
	public void setResolveVDMServiceImpl(IResolveVDMService resolveVDMServiceImpl) {
		this.resolveVDMServiceImpl = resolveVDMServiceImpl;
	}

	/**
	 * @param decodeMessageServiceImpl the decodeMessageServiceImpl to set
	 */
	public void setDecodeMessageServiceImpl(IDecodeMessageService decodeMessageServiceImpl) {
		this.decodeMessageServiceImpl = decodeMessageServiceImpl;
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 */
	public SocketThread(Socket socket, IResolveVDMService resolveVDMServiceImpl, IDecodeMessageService decodeMessageServiceImpl, ServletContext sce) {
		this.socket = socket;
		this.resolveVDMServiceImpl = resolveVDMServiceImpl;
		this.decodeMessageServiceImpl = decodeMessageServiceImpl;
		this.servletContext = sce;
	}

	public void run() {
		// TODO Auto-generated method stub
		char b[] = { 0x01, 0x77, 0x73, 0x6D, 0x00, 0x36, 0x30, 0x31, 0x32, 0x30, 0x32, 0x00 };
		try {
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw.println(b);
			pw.flush();
			String reply = null;
			HashMap<Integer, String> messageMap = new HashMap<Integer, String>();
			List<String> socketMessageList = new ArrayList<String>();
			socketMessageList.add("test message");
			servletContext.setAttribute("socketMessageList", socketMessageList);
			log.info((List)servletContext.getAttribute("socketMessageList"));
			while (!((reply = br.readLine()) == null)) {
//				System.out.println("接收服务器的信息：" + reply);
				// 判断是否是VDM语句
				/*
				if (resolveVDMServiceImpl.checkVDM(reply)) {
					String binaryStr = null;
					// 拼接多条语句
					String message = resolveVDMServiceImpl.splitVDM(reply, messageMap);
					socketMessageList.add(message);
					if(message != null) {
						binaryStr = resolveVDMServiceImpl.resolveVDM(message);
						Object obj = decodeMessageServiceImpl.decodeMessage(binaryStr);
						if (obj instanceof RecommendeRouteReqBo) {
						} else if (obj instanceof RouteWeatherReqBo) {
						} else if (obj instanceof PortStatusReqBo) {
						} else if (obj instanceof NavigationalInformationReqBo) {
						}
					}
				}
				*/
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
