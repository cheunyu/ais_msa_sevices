/**   
 * @Title: ScanNetCdfFileImpl.java 
 * @Package com.scyb.rescue.netcdf.service.impl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cheunyu 
 * @date 2012-10-10 下午4:17:54 
 * @version V1.0   
 */
package com.scyb.aisweather.common.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.springframework.web.context.ServletContextAware;

import com.scyb.aisweather.common.service.IDecompressNetCdfService;
import com.scyb.aisweather.common.service.IScanNetCdfService;

/**
 * @ClassName: ScanNetCdfFileImpl
 * @Description: TODO 实现扫描NC文件接口类
 * @author cheunyu
 * @date 2012-10-10 下午4:17:54
 * 
 */
public class ScanNetCdfServiceImpl implements IScanNetCdfService, ServletContextAware {

	private Logger log = Logger.getLogger(this.getClass());
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	private ServletContext servletContext;
	/**
	 * @Fields decompressNetCdfFileImpl : TODO(解压实现类对象)
	 */
	private IDecompressNetCdfService decompressNetCdfServiceImpl;
	/**
	 * @Fields historyNcFileSize : TODO(三个GZ包上次巡检时的大小)
	 */
	private static int historyNcFileSize = 0;

	/**
	 * @param decompressNetCdfFileImpl
	 *            要设置的 decompressNetCdfFileImpl
	 */

	public void setDecompressNetCdfFileImpl(IDecompressNetCdfService decompressNetCdfServiceImpl) {
		this.decompressNetCdfServiceImpl = decompressNetCdfServiceImpl;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: scan
	 * </p>
	 * <p>
	 * Description: 扫描当日NC文件是否传送完毕
	 * </p>
	 * 
	 * @return
	 * @see com.scyb.rescue.netcdf.service.IScanNetCdfService#scan()
	 */
	@SuppressWarnings("resource")
	public boolean scan() {
		Calendar cal = Calendar.getInstance();
		if(cal.get(Calendar.HOUR_OF_DAY)<16) {
			cal.add(Calendar.DATE, -1);
		}
		String filePath = (String) servletContext.getAttribute("ncFilePath");
		File file = new File(filePath + "/" + sdf.format(cal.getTime()) + "/nc");
		if (!file.exists())
			file.mkdirs();
		File fileList[] = file.listFiles();
		FileInputStream fis = null;
		int ncFileCount = 0;
		int ncFileSize = 0;
		for (File f : fileList) {
			try {
				fis = new FileInputStream(f);
				if (f.getName().indexOf("gz") > 0) {
					ncFileCount++;
					ncFileSize += fis.available();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		log.info("NC巡检 ======> 文件数目：" + ncFileCount + " 文件大小：" + ncFileSize + " 上次巡检文件大小: " + historyNcFileSize);
		if (ncFileCount == 3 && historyNcFileSize == ncFileSize) {
//			log.info("今日NETCDF包上传完成。");
			if (decompressNetCdfServiceImpl.judgeUnGz(filePath + "/" + sdf.format(cal.getTime()) + "/nc")) {
//				log.info("解压过了");
				servletContext.setAttribute("netcdfDateTime", cal);
			} else {
				log.info("未解压,开始解压gz包======>");
				decompressNetCdfServiceImpl.unGzFile(filePath + "/" + sdf.format(cal.getTime()) + "/nc");
			}
		}
		historyNcFileSize = ncFileSize;
		return false;
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: setServletContext
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param arg0
	 * @see org.springframework.web.context.ServletContextAware#setServletContext(javax.servlet.ServletContext)
	 */
	public void setServletContext(ServletContext arg0) {
		// TODO Auto-generated method stub
		this.servletContext = arg0;
	}

}