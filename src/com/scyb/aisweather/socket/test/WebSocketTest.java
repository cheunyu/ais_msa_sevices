/**     
 * @Title: WebSocketTest.java    
 * @Package com.scyb.aisweather.socket.test   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2015年1月23日 下午2:36:55    
 * @version V1.0    
 */
package com.scyb.aisweather.socket.test;

/**   
 * @ClassName: WebSocketTest   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2015年1月23日 下午2:36:55      
 *    
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.websocket.CloseReason;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.apache.log4j.Logger;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.ServletContextAware;

import com.scyb.aisweather.socket.service.IVDMSocket;
import com.scyb.aisweather.socket.service.impl.VDMSocketImpl;
import com.scyb.aisweather.socket.util.SocketThread;
import com.scyb.aisweather.vdl.request.bo.NavigationalInformationReqBo;
import com.scyb.aisweather.vdl.request.bo.PortStatusReqBo;
import com.scyb.aisweather.vdl.request.bo.RecommendeRouteReqBo;
import com.scyb.aisweather.vdl.request.bo.RouteWeatherReqBo;
import com.scyb.aisweather.vdl.service.IDecodeMessageService;
import com.scyb.aisweather.vdl.service.IResolveVDMService;
import com.scyb.aisweather.vdl.service.impl.DecodeMessageServiceImpl;
import com.scyb.aisweather.vdl.service.impl.ResolveVDMServiceImpl;

@ServerEndpoint(value = "/websocket")
public class WebSocketTest implements ServletContextAware{

	private Logger log = Logger.getLogger(this.getClass());
	private IVDMSocket vdmSocketImpl;
	private IResolveVDMService resolveVDMServiceImpl;
	private IDecodeMessageService decodeMessageServiceImpl;
	private ServletContext servletContext;

    public void setVdmSocketImpl(IVDMSocket vdmSocketImpl) {
        this.vdmSocketImpl = vdmSocketImpl;
    }

    public void setResolveVDMServiceImpl(IResolveVDMService resolveVDMServiceImpl) {
        this.resolveVDMServiceImpl = resolveVDMServiceImpl;
    }

    public void setDecodeMessageServiceImpl(IDecodeMessageService decodeMessageServiceImpl) {
        this.decodeMessageServiceImpl = decodeMessageServiceImpl;
    }

    @OnMessage
	public void onMessage(String message, Session session) {
		// Print the client message for testing purposes
		// while (sentMessages < 30) {
		// Thread.sleep(500);
		// session.getBasicRemote().sendText("This is an intermediate server message. Count: "
		// + sentMessages);
		// sentMessages++;
		// }

		// Send a final message to the client
		/*
		 * Socket socket = vdmSocketImpl.openSocketServer("127.0.0.1", 3422);
		 * char b[] = { 0x01, 0x77, 0x73, 0x6D, 0x00, 0x36, 0x30, 0x31, 0x32,
		 * 0x30, 0x32, 0x00 }; try { PrintWriter pw = new
		 * PrintWriter(socket.getOutputStream()); BufferedReader br = new
		 * BufferedReader(new InputStreamReader(socket.getInputStream()));
		 * pw.println(b); pw.flush(); String reply = null; HashMap<Integer,
		 * String> messageMap = new HashMap<Integer, String>(); while (!((reply
		 * = br.readLine()) == null)) { System.out.println("接收服务器的信息：" + reply);
		 * session.getAsyncRemote().sendText(reply); // 判断是否是VDM语句 if
		 * (resolveVDMServiceImpl.checkVDM(reply)) { String binaryStr = null; //
		 * 拼接多条语句 String messageVDM = resolveVDMServiceImpl.splitVDM(reply,
		 * messageMap); if (messageVDM != null) { binaryStr =
		 * resolveVDMServiceImpl.resolveVDM(messageVDM); Object obj =
		 * decodeMessageServiceImpl.decodeMessage(binaryStr); if (obj instanceof
		 * RecommendeRouteReqBo) { // log.info("收到航线推荐请求报文。"); } } } } } catch
		 * (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		// System.out.println(this.getClass().hashCode());
		
		/*
		Socket socket = vdmSocketImpl.openSocketServer("127.0.0.1", 3422);
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String reply = null;
			HashMap<Integer, String> messageMap = new HashMap<Integer, String>();
			while (!((reply = br.readLine()) == null)) {
				log.info(reply);
				if (resolveVDMServiceImpl.checkVDM(reply)) {
					String binaryStr = null;
					// 拼接多条语句
					String messageVDM = resolveVDMServiceImpl.splitVDM(reply, messageMap);
					if (messageVDM != null) {
						binaryStr = resolveVDMServiceImpl.resolveVDM(messageVDM);
						Object obj = decodeMessageServiceImpl.decodeMessage(binaryStr);
						if (obj instanceof RecommendeRouteReqBo) {
						} else if (obj instanceof RouteWeatherReqBo) {
						} else if (obj instanceof PortStatusReqBo) {
						} else if (obj instanceof NavigationalInformationReqBo) {
						}
					}
				}
				for (Session openSession : session.getOpenSessions()) {
					if (openSession.isOpen()) {
						// openSession.getBasicRemote().sendText(reply.replace("<",
						// "&lt;"));
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}

	@OnOpen
	public void onOpen(Session session) {
		log.info("Connected ... " + session.getId());
	}

	@OnClose
	public void onClose(Session session, CloseReason closeReason) {
		log.info(String.format("Session %s closed because of %s", session.getId(), closeReason));
	}

	/** (非 Javadoc)   
	 * <p>Title: setServletContext</p>  
	 * <p>Description: </p>  
	 * @param arg0   
	 * @see org.springframework.web.context.ServletContextAware#setServletContext(javax.servlet.ServletContext)   
	 */
	@Override
	public void setServletContext(ServletContext arg0) {
		// TODO Auto-generated method stub
		servletContext = arg0;
	}

}