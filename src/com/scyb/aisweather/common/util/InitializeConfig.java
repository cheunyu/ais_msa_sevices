/**     
 * @Title: InitializeConfig.java    
 * @Package com.scyb.aisweather.common.util   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年7月29日 下午3:58:16    
 * @version V1.0    
 */
package com.scyb.aisweather.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.scyb.aisweather.common.service.IScanNetCdfService;
import com.scyb.aisweather.socket.service.IVDMSocket;
import com.scyb.aisweather.socket.util.SocketThread;
import com.scyb.aisweather.vdl.service.IDecodeMessageService;
import com.scyb.aisweather.vdl.service.IResolveVDMService;

/**
 *      @ClassName: InitializeConfig     @Description: TODO(初始化加载配置文件)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年7月29日 下午3:58:16           
 */
public class InitializeConfig implements ServletContextListener {

	private Logger log = Logger.getLogger(this.getClass());
	private static WebApplicationContext springContext;
	private IVDMSocket vdmSocketImpl;
	private IScanNetCdfService scanNetCdfServiceImpl;
	private IResolveVDMService resolveVDMServiceImpl;
	private IDecodeMessageService decodeMessageServiceImpl;

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: contextDestroyed
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param arg0     @see
	 * javax.servlet.ServletContextListener#contextDestroyed
	 * (javax.servlet.ServletContextEvent)   
	 */
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: contextInitialized
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param arg0     @see
	 * javax.servlet.ServletContextListener#contextInitialized
	 * (javax.servlet.ServletContextEvent)   
	 */
	@Override
	public void contextInitialized(ServletContextEvent sce) {
        springContext = WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
		this.initializedApp(sce);
		this.initializedNetCdf(sce);
		this.initializedSixBitBinary(sce);
		this.initializedBaseStation(sce);
		scanNetCdfServiceImpl = (IScanNetCdfService) springContext.getBean("scanNetCdf");
		scanNetCdfServiceImpl.scan();
	}

	/**
	 *  @Title: initializedApp     @Description: TODO(初始化报文应用配置文件)   
	 *  @param @param sce    设定文件    @return void    返回类型    @throws   
	 */
	public void initializedApp(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		Properties props = new Properties();
		String appConfigPath = new File(InitializeConfig.class.getResource("/").getPath()).getParent() + "/config/app_config.properties";
		log.info("app_config.properties loading......");
		try {
			props.load(new FileInputStream(appConfigPath));
			List oefBohaiCurrentLonList = Arrays.asList(props.getProperty("oef_bohai_current_lon").split(","));
			List oefBoHaiCurrentLatList = Arrays.asList(props.getProperty("oef_bohai_current_lat").split(","));
			sce.getServletContext().setAttribute("oefBohaiCurrentLonList", oefBohaiCurrentLonList);
			sce.getServletContext().setAttribute("oefBohaiCurrentLatList", oefBoHaiCurrentLatList);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 *  @Title: initializedNetCdf     @Description: TODO(初始化NETCDF文件路径)   
	 *  @param @param sce    设定文件    @return void    返回类型    @throws   
	 */
	public void initializedNetCdf(ServletContextEvent sce) {
		Properties props = new Properties();
		String netcdfConfigPath = new File(this.getClass().getResource("/").getPath()).getParent() + "/config/netcdf.properties";
		log.info("netcdf.properties loading......");
		try {
			props.load(new FileInputStream(netcdfConfigPath));
			String ncFilePath = props.getProperty("filepath");
			sce.getServletContext().setAttribute("ncFilePath", ncFilePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void initializedBaseStation(ServletContextEvent sce) {
		Properties props = new Properties();
		String baseStationConfigPath = new File(this.getClass().getResource("/").getPath()).getParent() + "/config/basestation.properties";
		log.info("basestation.properties loading.......");
		try {
			props.load(new FileInputStream(baseStationConfigPath));
			String baseStationIp = props.getProperty("base_station_ip");
			String baseStationPort = props.getProperty("base_station_port");
			sce.getServletContext().setAttribute("baseStationIp", baseStationIp);
			sce.getServletContext().setAttribute("baseStationPort", baseStationPort);
			if (springContext != null) {
				vdmSocketImpl = (IVDMSocket) springContext.getBean("vdmSocketImpl");
				resolveVDMServiceImpl = (IResolveVDMService) springContext.getBean("resolveVDMServiceImpl");
				decodeMessageServiceImpl = (IDecodeMessageService) springContext.getBean("decodeMessageServiceImpl");
			} else {
				System.out.println("获取应用程序上下文失败!");
				return;
			}
			Socket socket = vdmSocketImpl.openSocketServer(baseStationIp, Integer.parseInt(baseStationPort));
			new Thread(new SocketThread(socket, resolveVDMServiceImpl, decodeMessageServiceImpl, sce.getServletContext())).start();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void initializedSixBitBinary(ServletContextEvent sce) {
		Map<String, String> sixbitMap = new HashMap<String, String>();
		sixbitMap.put("0", "000000");
		sixbitMap.put("1", "000001");
		sixbitMap.put("2", "000010");
		sixbitMap.put("3", "000011");
		sixbitMap.put("4", "000100");
		sixbitMap.put("5", "000101");
		sixbitMap.put("6", "000110");
		sixbitMap.put("7", "000111");
		sixbitMap.put("8", "001000");
		sixbitMap.put("9", "001001");
		sixbitMap.put(":", "001010");
		sixbitMap.put(";", "001011");
		sixbitMap.put("<", "001100");
		sixbitMap.put("=", "001101");
		sixbitMap.put(">", "001110");
		sixbitMap.put("?", "001111");
		sixbitMap.put("@", "010000");
		sixbitMap.put("A", "010001");
		sixbitMap.put("B", "010010");
		sixbitMap.put("C", "010011");
		sixbitMap.put("D", "010100");
		sixbitMap.put("E", "010101");
		sixbitMap.put("F", "010110");
		sixbitMap.put("G", "010111");
		sixbitMap.put("H", "011000");
		sixbitMap.put("I", "011001");
		sixbitMap.put("J", "011010");
		sixbitMap.put("K", "011011");
		sixbitMap.put("L", "011100");
		sixbitMap.put("M", "011101");
		sixbitMap.put("N", "011110");
		sixbitMap.put("O", "011111");
		sixbitMap.put("P", "100000");
		sixbitMap.put("Q", "100001");
		sixbitMap.put("R", "100010");
		sixbitMap.put("S", "100011");
		sixbitMap.put("T", "100100");
		sixbitMap.put("U", "100101");
		sixbitMap.put("V", "100110");
		sixbitMap.put("W", "100111");
		sixbitMap.put("`", "101000");
		sixbitMap.put("a", "101001");
		sixbitMap.put("b", "101010");
		sixbitMap.put("c", "101011");
		sixbitMap.put("d", "101100");
		sixbitMap.put("e", "101101");
		sixbitMap.put("f", "101110");
		sixbitMap.put("g", "101111");
		sixbitMap.put("h", "110000");
		sixbitMap.put("i", "110001");
		sixbitMap.put("j", "110010");
		sixbitMap.put("k", "110011");
		sixbitMap.put("l", "110100");
		sixbitMap.put("m", "110101");
		sixbitMap.put("n", "110110");
		sixbitMap.put("o", "110111");
		sixbitMap.put("p", "111000");
		sixbitMap.put("q", "111001");
		sixbitMap.put("r", "111010");
		sixbitMap.put("s", "111011");
		sixbitMap.put("t", "111100");
		sixbitMap.put("u", "111101");
		sixbitMap.put("v", "111110");
		sixbitMap.put("w", "111111");
		sce.getServletContext().setAttribute("sixbitMap", sixbitMap);
	}
}
