/**     
 * @Title: SocketTest.java    
 * @Package com.scyb.aisweather.socket.test   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年9月9日 下午3:44:05    
 * @version V1.0    
 */
package com.scyb.aisweather.socket.test;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

/**
 *      @ClassName: SocketTest     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年9月9日 下午3:44:05           
 */
public class SocketTest {

	public static void main(String args[]) throws Exception {
		// 为了简单起见，所有的异常都直接往外抛
		String host = "127.0.0.1"; // 要连接的服务端IP地址
		int port = 8888; // 要连接的服务端对应的监听端口
		// 与服务端建立连接
		Socket client = new Socket(host, port);
		// 建立连接后就可以往服务端写数据了
		Writer writer = new OutputStreamWriter(client.getOutputStream());
		writer.write("!AIABM,2,1,0,123456789,0,6,6>qc9whMKkADIh9H3h?PO51BD?01h7hCP0a=7f0t403l0HK3,2*53\r\n");
		writer.flush();
		// 写完以后进行读操作
		Reader reader = new InputStreamReader(client.getInputStream());
		char chars[] = new char[64];
		int len;
		StringBuffer sb = new StringBuffer();
		while ((len = reader.read(chars)) != -1) {
			sb.append(new String(chars, 0, len));
		}
		System.out.println("from server: " + sb);
		writer.close();
		reader.close();
		client.close();
	}

}
