package com.wanxin.common.utils;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;

/**
 * @author 926474
 * 
 * 		流工具类
 *
 */
public class StreamUtil {
	
	
	
	
	/**
	 * 		关闭流
	 * @param closeables
	 * @throws IOException
	 */
	public static void readTextFile(Closeable ... closeables) throws IOException {
		for (Closeable closeable : closeables) {
			closeable.close();
		}
		
	}

}
