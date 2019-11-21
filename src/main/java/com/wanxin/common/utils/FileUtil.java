package com.wanxin.common.utils;

/**
 * @author 926474
 * 
 * 		文件工具类
 *
 */
public class FileUtil {
	
	/**
	 * @param fileName
	 * 
	 * @return
	 * 		截取文件后缀
	 */
	public static String getExtendName(String fileName) {
		int lastIndexOf = fileName.lastIndexOf(".");
		String string = fileName.substring(lastIndexOf+1);
		return string;
	}

}
