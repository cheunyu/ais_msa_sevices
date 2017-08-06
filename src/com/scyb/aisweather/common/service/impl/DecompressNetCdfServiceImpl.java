/**   
 * @Title: DecompressNetCdfFileImpl.java 
 * @Package com.scyb.rescue.netcdf.service.impl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cheunyu 
 * @date 2012-10-11 下午2:04:21 
 * @version V1.0   
 */
package com.scyb.aisweather.common.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;

import com.scyb.aisweather.common.service.IDecompressNetCdfService;
import com.scyb.aisweather.common.util.DecompressNetCdfUtil;

/**
 * @ClassName: DecompressNetCdfFileImpl
 * @Description: TODO(解NC文件包实现类)
 * @author cheunyu
 * @date 2012-10-11 下午2:04:21
 * 
 */
public class DecompressNetCdfServiceImpl implements IDecompressNetCdfService {

	private Logger log = Logger.getLogger(this.getClass());

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: unTargzFile
	 * </p>
	 * <p>
	 * Description:把gz压缩包解压出nc文件。
	 * </p>
	 * 
	 * @param gzFilePath
	 *            指定日期文件夹
	 * @see com.scyb.rescue.netcdf.service.IDecompressNetCdfService#unTargzFile(String,
	 *      String, String)
	 */
	public void unGzFile(String gzFilePath) {
		File file = new File(gzFilePath);
		File fileList[] = file.listFiles();
		for (File f : fileList) {
			if (f.getName().indexOf("gz") > 0) {
				try {
					int nnumber;
					FileInputStream fin = new FileInputStream(gzFilePath + "/" + f.getName());
					DecompressNetCdfUtil MmGz = new DecompressNetCdfUtil(fin);
					FileOutputStream fout = new FileOutputStream(gzFilePath + "/" + f.getName().replace(".gz", ""));
					byte[] buf = new byte[1024];
					nnumber = MmGz.read(buf, 0, buf.length);
					while (nnumber != -1) {
						fout.write(buf, 0, nnumber);
						nnumber = MmGz.read(buf, 0, buf.length);
					}
					MmGz.close();
					fout.close();
					fin.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		log.info("nc文件解压完成。");
	}

	/**
	 * (非 Javadoc)
	 * <p>
	 * Title: judgeUnGz
	 * </p>
	 * <p>
	 * Description: 判断是否已解压过三个NC文件包
	 * </p>
	 * 
	 * @param gzFilePath
	 *            指定日期文件夹
	 * @return true解压过 false未解压
	 * @see com.scyb.rescue.netcdf.service.IDecompressNetCdfService#judgeUnGz(String)
	 */
	public boolean judgeUnGz(String gzFilePath) {
		File file = new File(gzFilePath);
		File fileList[] = file.listFiles();
		int ncFileCount = 0;
		for (File f : fileList) {
			if (f.getName().lastIndexOf(".nc") == f.getName().length() - 3)
				ncFileCount++;
		}
		if (ncFileCount == 3)
			return true;
		else
			return false;
	}

}
