package com.accp.springmvc.util;

import java.lang.reflect.Field;
import java.util.Map;

import org.apache.poi.ss.formula.functions.T;

public class DbPoi {
	
	public static int DBexcel(Class<T> clazz, Map<T,Object> list,String path){
		
		Field[] fields=clazz.getClass().getDeclaredFields();
		list.get(fields[0]);
		
		
		return 0;
	}
}
