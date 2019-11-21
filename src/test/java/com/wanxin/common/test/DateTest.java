package com.wanxin.common.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.wanxin.common.utils.DateUtil;

/**
 * @author 926474
 *
 */
public class DateTest {
	
	/**
	 * 		给一个时间对象，返回该时间所在月的1日0时0分0秒。
	 * @throws ParseException
	 */
	@Test
	public void test1() throws ParseException {
		Date start = DateUtil.getDateByInitMonth(new Date());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
		System.err.println(format.format(start));
	}
	
	/**
	 * 	给任意一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况	
	 */
	@Test
	public void test2() {
		Date end = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
		System.err.println(format.format(end));
	}
	
	/**
	 * 		利用dateUtil工具类拼接sql语句
	 * @throws ParseException
	 */
	@Test
	public void test3() throws ParseException {
		Date initMonth = DateUtil.getDateByInitMonth(new Date());
		SimpleDateFormat initDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
		
		Date fullMonth = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat fullDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
		String sql="select * from t_order where create_time>='"+initDateFormat.format(initMonth)+"' and create_time<='"+fullDateFormat.format(fullMonth)+"'";
		System.err.println(sql);
	}

}
