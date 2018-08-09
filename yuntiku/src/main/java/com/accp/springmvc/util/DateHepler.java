package com.accp.springmvc.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHepler {

	public static String date() {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}
	
	public static String dateTime() {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sdf.format(date);
	}
}
