/**     
 * @Title: IVDMSocket.java    
 * @Package com.scyb.aisweather.socket.service   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月9日 下午2:58:47    
 * @version V1.0    
 */
package com.scyb.aisweather.socket.service;

import java.net.Socket;
import java.util.List;

import javax.websocket.Session;

/**   
 * @ClassName: IVDMSocket   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2014年9月9日 下午2:58:47      
 *    
 */
public interface IVDMSocket {

	public Socket openSocketServer(String ip, int port);
	
	public void receiveSocketServer(Session session);
	
	public void sendMessage(List<String> messageList);
	
	public void closeSocketServer(Socket socket);
}
