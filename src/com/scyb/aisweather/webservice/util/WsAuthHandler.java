/**     
 * @Title: WsAuthHandler.java    
 * @Package com.scyb.aisweather.webservice.util   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月5日 下午2:54:58    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.util;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.ws.security.WSPasswordCallback;

public class WsAuthHandler implements CallbackHandler {

	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		for (int i = 0; i < callbacks.length; i++) {
			WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];
			int usage = pc.getUsage();
			if (usage == WSPasswordCallback.USERNAME_TOKEN) {// 密钥方式USERNAME_TOKEN
				pc.setPassword("2a2Q]jj");
				System.out.println("用户" + pc.getIdentifier() +"调用了服务");
			} else if (usage == WSPasswordCallback.SIGNATURE) {// 密钥方式SIGNATURE
				pc.setPassword("2a2Q]jj");
			}
		}
	}
}
