/**     
 * @Title: VDMSocketImpl.java    
 * @Package com.scyb.aisweather.socket.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月9日 下午3:00:05    
 * @version V1.0    
 */
package com.scyb.aisweather.socket.service.impl;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;
import java.util.List;

import javax.websocket.Session;

import org.apache.log4j.Logger;
import org.springframework.web.context.ContextLoader;

import com.scyb.aisweather.socket.service.IVDMSocket;

/**
 *      @ClassName: VDMSocketImpl     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年9月9日 下午3:00:05           
 */
public class VDMSocketImpl implements IVDMSocket {

	private Logger log = Logger.getLogger(this.getClass());
	private Socket socket = null;

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: sendMessage
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param messageList     @see
	 * com.scyb.aisweather.socket.service.IVDMSocket
	 * #sendMessage(java.util.List)   
	 */
	@Override
	public void sendMessage(List<String> messageList) {
		// TODO Auto-generated method stub
		String baseStationIp = (String) ContextLoader.getCurrentWebApplicationContext().getServletContext().getAttribute("baseStationIp");
		String baseStationPort = (String) ContextLoader.getCurrentWebApplicationContext().getServletContext().getAttribute("baseStationPort");
		// Socket socket = this.openSocketServer(baseStationIp,
		// Integer.parseInt(baseStationPort));
		try {
			Socket socket = new Socket(baseStationIp, Integer.parseInt(baseStationPort));
			char b[] = { 0x01, 0x77, 0x73, 0x6D, 0x00, 0x36, 0x30, 0x31, 0x32, 0x30, 0x32, 0x00 };
			// 向服务器端发送数据
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.println(b);
			pw.flush();
			for (String s : messageList) {
				pw.println(s);
//				System.out.println("sendmessage = " + s);
				pw.flush();
			}
//			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: getSocketConnect
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param ip  @param port     @see
	 * com.scyb.aisweather.socket.service.IVDMSocket
	 * #getSocketConnect(java.lang.String, int)   
	 */
	@Override
	public Socket openSocketServer(String ip, int port) {
		// TODO Auto-generated method stub
		try {
			if(socket==null) {
				// 创建一个流套接字并将其连接到指定主机上的指定端口号
				this.socket = new Socket(ip, port);
			}
		} catch (Exception e) {
			System.out.println("客户端异常:" + e.getMessage());
		}
		return socket;
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: receiveSocketServer
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *          @see
	 * com.scyb.aisweather.socket.service.IVDMSocket#receiveSocketServer()   
	 */
	@Override
	public void receiveSocketServer(Session session) {
		// TODO Auto-generated method stub
		char b[] = { 0x01, 0x77, 0x73, 0x6D, 0x00, 0x36, 0x30, 0x31, 0x32, 0x30, 0x32, 0x00 };
		try {
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw.println(b);
			pw.flush();
			String reply = null;
			while (!((reply = br.readLine()) == null)) {
				session.getBasicRemote().sendText(reply);
//				System.out.println("接收服务器的信息：" + reply);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: closeSocketServer
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param socket     @see
	 * com.scyb.aisweather.socket.service.IVDMSocket#closeSocketServer
	 * (java.net.Socket)   
	 */
	@Override
	public void closeSocketServer(Socket socket) {
		// TODO Auto-generated method stub
		try {
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
