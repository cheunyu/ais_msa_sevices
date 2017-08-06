/**     
 * @Title: FtpUtil.java    
 * @Package com.scyb.aisweather.common.util   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2013-11-26 下午4:00:43    
 * @version V1.0    
 */
package com.scyb.aisweather.common.util;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPListParseEngine;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *      @ClassName: FtpUtil     @Description: TODO(FTP工具类)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2013-11-26 下午4:00:43           
 */
public class FtpUtil {

	// private Logger log = Logger.getLogger(this.getClass());
	private static FTPClient ftpClient;

	/**
	 *  @Title: getFtpClient     @Description: TODO(得到FTP客户端对象)   
	 *  @param @return    设定文件    @return FtpClient    返回类型    @throws   
	 */
	public FtpUtil() {
		this.ftpClient = new FTPClient();
	}

	/**
	 *  @Title: login     @Description: TODO(登陆FTP服务器)     @param @param
	 * ipAddress  @param @param ipPort  @param @param username  @param @param
	 * password    设定文件    @return void    返回类型    @throws   
	 */
	public void login(String ipAddress, int ipPort, String username, String password) {
		try {
			ftpClient.connect(ipAddress, ipPort);
            ftpClient.login(username, password);
			System.out.println("成功登录FTP服务器" + ipAddress);
			// log.info("成功登录FTP服务器" + ipAddress);
		} catch (IOException e) {
			// log.error("FtpClient login error!");
			e.printStackTrace();
		}
	}

	/**
	 *  @Title: logout     @Description: TODO(登出FTP服务器)     @param @param
	 * ipAddress    设定文件    @return void    返回类型    @throws   
	 */
	public void logout(String ipAddress) {
		try {
			ftpClient.logout();
			// log.info("登出FTP服务器" + ipAddress);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 *  @Title: getFileNameList     @Description: TODO(返回目录下文件列表)   
	 *  @param @param folderPath  @param @return    设定文件  
	 *  @return List<String>    返回类型    @throws   
	 */
	public List<String> getFileNameList(String folderPath) throws IOException {
        List<String> nlist = new ArrayList<String>();
        FTPListParseEngine engine = ftpClient.initiateListParsing(folderPath);
        List<FTPFile> ftpfiles = Arrays.asList(engine.getNext(25));

        return getFTPServerFileList(nlist,ftpfiles);
	}

    /**
     * 列出FTP服务器文件列表信息
     * @param nlist
     * @param ftpFiles
     * @return
     */
    public List<String> getFTPServerFileList(List<String> nlist,List<FTPFile> ftpFiles){
        if(ftpFiles==null || ftpFiles.size()==0)
            return nlist;
        for (FTPFile ftpFile : ftpFiles) {
            if (ftpFile.isFile()) {
                nlist.add(ftpFile.getName());
            }
        }
        return nlist;
    }

    /**
     * 检查文件是否存在
     *
     * @param filePath
     * @return
     * @throws Exception
     */
    public boolean checkFileExist(String filePath) throws Exception {
        boolean flag = false;
        File file = new File(filePath);
        if (!file.exists()) {
            throw new Exception("文件不存在,请检查!");
        } else {
            flag = true;
        }
        return flag;
    }

    public void download(String remoteFilePathName, String localFilePathName) throws Exception {
        OutputStream output = null;
        try {
            File file = null;
            if (checkFileExist(localFilePathName)) {
                file = new File(localFilePathName);
            }
            output = new FileOutputStream(file);
            boolean result = ftpClient.retrieveFile(remoteFilePathName, output);
            if (!result) {
                throw new Exception("文件下载失败!");
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (output != null) {
                output.close();
            }
        }
	}

}