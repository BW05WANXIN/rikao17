package com.wanxin.common.test;

import org.junit.Test;

import com.wanxin.common.utils.FileUtil;

/**
 * @author 926474
 *
 */
public class FileTest {
	
	/**
	 * 给定一个文件名，返回该文件名的扩展名
	 */
	@Test
	public void test1() {
		String extendName = FileUtil.getExtendName("add.jpg");
		System.err.println(extendName);
	}

}
