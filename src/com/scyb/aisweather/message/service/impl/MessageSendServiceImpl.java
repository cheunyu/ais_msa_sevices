/**     
 * @Title: MessageSendServiceImpl.java    
 * @Package com.scyb.aisweather.message.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2013-11-22 上午10:49:45    
 * @version V1.0    
 */
package com.scyb.aisweather.message.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import org.apache.log4j.Logger;

import com.scyb.aisweather.message.service.IMessageSendService;

/**
 *      @ClassName: MessageSendServiceImpl   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2013-11-22 上午10:49:45           
 */
public class MessageSendServiceImpl implements IMessageSendService {

	private Logger log = Logger.getLogger(this.getClass());

	@Override
	public void message6Send(String context, String stationId) {
		// TODO Auto-generated method stub
		try {
			// char b[] =
			// {0x01,0x73,0x64,0x68,0x73,0x6A,0x74,0x68,0x63,0x00,0x73,0x64,0x68,0x73,0x6A,0x74,0x68,0x63,0x00};
			// Start-Of-Heading  wsm null 601202 null
			char b[] = { 0x01, 0x77, 0x73, 0x6D, 0x00, 0x36, 0x30, 0x31, 0x32,
					0x30, 0x32, 0x00 };
			String ip = "192.168.114.8";
			int port = 8040;
			Socket socket = new Socket(ip, port);
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(socket
					.getInputStream()));
			pw.println(b);
			pw.flush();
	//		String saabMsg = "!ECABM,1,1,1," + stationId + ",0,12," + context + ",0";
			//!ECABM,1,1,1,000000101,0,06,IhDJe36HvhP@@0000000000,2
			pw.println("!ECABM,1,1,0,987654321,0,06,Ih<HJr`q8a10P@240;7I=T0,4");
//			log.info("SAAB MESSAGE => " + saabMsg);
			pw.flush();
			pw.close();
			String reply = null;
		/*	while (!((reply = br.readLine()) == null)) {
					System.out.println("接收服务器的信息：" + reply);
			}*/
			// while(true) {
			// System.out.println(br.readLine());
			// }
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		MessageSendServiceImpl msServiceImpl = new MessageSendServiceImpl();
		for(int i=0;i<100;i++) {
			msServiceImpl.message6Send("TE", "000000101");
		}
		
	}

}
