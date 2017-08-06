/**     
 * @Title: DownloadNcServiceImpl.java    
 * @Package com.scyb.aisweather.nc.service.impl   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2013-11-27 下午1:21:43    
 * @version V1.0    
 */
package com.scyb.aisweather.nc.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.scyb.aisweather.common.util.FtpUtil;
import com.scyb.aisweather.nc.service.IDownloadNcService;
import com.scyb.aisweather.nc.service.IResolveNcService;

/**   
 * @ClassName: DownloadNcServiceImpl   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author cheunyu xiaoyuuii@hotmail.com
 * @date 2013-11-27 下午1:21:43      
 *    
 */
public class DownloadNcServiceImpl implements IDownloadNcService {

	private Logger log = Logger.getLogger(this.getClass());
	
	private IResolveNcService resolveNcServiceImpl;
	
	/**
	 * @param resolveNcServiceImpl the resolveNcServiceImpl to set
	 */
	public void setResolveNcServiceImpl(IResolveNcService resolveNcServiceImpl) {
		this.resolveNcServiceImpl = resolveNcServiceImpl;
	}

	/** (非 Javadoc)   
	 * <p>Title: downloadNc</p>  
	 * <p>Description: </p>  
	 *    
	 * @see com.scyb.aisweather.nc.service.IDownloadNcService#downloadNc()   
	 */
	@Override
	public void downloadNc() {
		// TODO Auto-generated method stub
		String configFilePath = new File(DownloadNcServiceImpl.class.getResource("/").getPath()).getParent()+"/config/ftp.properties";
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(configFilePath));
			String localFolderPath = props.getProperty("localfolderpath");
			String url = props.getProperty("url");
			String port = props.getProperty("port");
			String userName = props.getProperty("username");
			String passWord = props.getProperty("password");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			String dateFolder = sdf.format(new Date());
			File localFolder = new File(localFolderPath+dateFolder);
			if(!localFolder.exists()) {
				log.info("创建文件夹" + localFolder);
				localFolder.mkdirs();
			}
			FtpUtil ftpUtil = new FtpUtil();
			ftpUtil.login(url, Integer.parseInt(port), userName, passWord);
			List<String> fileList = ftpUtil.getFileNameList("/"+dateFolder+"/nc/");
			for(String fileName:fileList) {
				try {
					log.info(fileName);
					ftpUtil.download("/"+dateFolder+"/nc/"+fileName, localFolder.getPath()+"/"+fileName);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			resolveNcServiceImpl.resolveWind(localFolder.getPath());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param @param args    设定文件  
	 * @return void    返回类型  
	 * @throws   
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FtpUtil ftpUtil = new FtpUtil();
		ftpUtil.login("218.92.22.181", 7000, "hyybzx", "%eZQGb5h");
		List<String> fileList = ftpUtil.getFileNameList("/20131125/nc/");
		for(String fileName:fileList) {
			System.out.println(fileName);
			try {
//				ftpUtil.download(fileName, "d:"+fileName);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
