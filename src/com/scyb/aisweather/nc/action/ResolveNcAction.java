/**     
 * @Title: ResolveNcAction.java    
 * @Package com.scyb.aisweather.nc.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2013-11-4 上午11:57:08    
 * @version V1.0    
 */
package com.scyb.aisweather.nc.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.IOUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 *      @ClassName: ResolveNcAction     @Description: TODO(这里用一句话描述这个类的作用)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2013-11-4 上午11:57:08           
 */
public class ResolveNcAction implements Action {

	/**
	 *      @Fields netcdfFile : TODO(上传文件)   
	 */
	private File[] netcdfs;

	/**
	 *      @Fields netcdfFileName : TODO(上传文件名)   
	 */
	private String[] netcdfsFileName;

	/**
	 *      @Fields netcdfContentType : TODO(上传文件类型)   
	 */
	private String[] netcdfsContentType;

	/**
	 *      @Fields savePath : TODO(保存路径)   
	 */
	private String savePath;
	
	private String process;
	
	/**
	 * @return the process
	 */
	public String getProcess() {
		return process;
	}

	/**
	 * @param savePath
	 *            the savePath to set
	 */
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	/**
	 * @return the netcdfs
	 */
	public File[] getNetcdfs() {
		return netcdfs;
	}

	/**
	 * @param netcdfs
	 *            the netcdfs to set
	 */
	public void setNetcdfs(File[] netcdfs) {
		this.netcdfs = netcdfs;
	}

	/**
	 * @return the netcdfFileName
	 */
	public String[] getNetcdfsFileName() {
		return netcdfsFileName;
	}

	/**
	 * @param netcdfFileName
	 *            the netcdfFileName to set
	 */
	public void setNetcdfsFileName(String[] netcdfsFileName) {
		this.netcdfsFileName = netcdfsFileName;
	}

	/**
	 * @return the netcdfContentType
	 */
	public String[] getNetcdfsContentType() {
		return netcdfsContentType;
	}

	/**
	 * @param netcdfContentType
	 *            the netcdfContentType to set
	 */
	public void setNetcdfsContentType(String[] netcdfsContentType) {
		this.netcdfsContentType = netcdfsContentType;
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: execute
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @return  @throws Exception     @see
	 * com.opensymphony.xwork2.Action#execute()   
	 */
	@Override
	public String execute() throws Exception {
		/*
		 * try { InputStream in = new FileInputStream(netcdf); File savePathFile
		 * = new File(savePath); if (!savePathFile.exists())
		 * savePathFile.mkdirs(); File uploadFile = new File(savePath,
		 * this.getNetcdfFileName()); OutputStream out = new
		 * FileOutputStream(uploadFile); byte[] buffer = new byte[1024 * 1024];
		 * int length; while ((length = in.read(buffer)) > 0) {
		 * out.write(buffer, 0, length); } in.close(); out.close(); } catch
		 * (FileNotFoundException ex) { ex.printStackTrace(); } catch
		 * (IOException ex) { ex.printStackTrace(); }
		 */
		// 这里是上传文件,可做具体处理
		File savePathFile = new File(savePath);
		if (!savePathFile.exists())
			savePathFile.mkdirs();
		for (int i = 0; i < this.getNetcdfs().length; i++) {
			IOUtils.copy(new FileInputStream(this.getNetcdfs()[i]), new FileOutputStream(new File(savePath, this.getNetcdfsFileName()[i])));
		}
		return this.SUCCESS;
	}

	/**
	 * Ajax get current process info
	 * 
	 * @return
	 * @author Administrator
	 * @date 2012-6-3
	 */
	public String process() {
		process = (String) ActionContext.getContext().getSession().get("currentUploadStatus");
		return SUCCESS;
	}

}
