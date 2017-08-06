/**     
 * @Title: ResourceProgressListener.java    
 * @Package com.scyb.aisweather.nc.action   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2013-11-7 下午12:57:33    
 * @version V1.0    
 */
package com.scyb.aisweather.nc.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.ProgressListener;

import com.opensymphony.xwork2.ActionContext;

/**
 *      @ClassName: ResourceProgressListener   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2013-11-7 下午12:57:33           
 */
public class ResourceProgressListener implements ProgressListener {

	public ResourceProgressListener(HttpServletRequest request) {
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: update
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @param arg0  @param arg1  @param arg2     @see
	 * org.apache.commons.fileupload.ProgressListener#update(long, long, int)   
	 */
	@Override
	public void update(long readedBytes, long totalBytes, int currentItem) {
		String process = readedBytes * 1.0 / totalBytes * 100 + "";
		ActionContext.getContext().getSession().put("currentUploadStatus", process);
	}

}
