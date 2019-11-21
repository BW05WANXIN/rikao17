package com.wanxin.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 926474
 * 		
 * 		日期工具类
 *
 */
public class DateUtil {
	
	/**
	 * 给定时间对象，初始化到该月初的30日23时59分59秒59毫秒
	 * @param date
	 * @return
	 */
	public static Date getDateByFullMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, 1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.add(Calendar.SECOND, -1);
		return calendar.getTime();
	}
	
	
	/**
	 * 给定时间对象，初始化到该月初的1日0时0分0秒0毫秒
	 * @param date
	 * @return
	 * @throws ParseException 
	 */
	public static Date getDateByInitMonth(Date date) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
		String format = simpleDateFormat.format(date);
		String monthStart = format + "-01 00:00:00";
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return simpleDateFormat.parse(monthStart);
	}

}
