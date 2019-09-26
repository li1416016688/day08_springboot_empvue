package com.li.day08_springboot_emp.utils;


import com.li.day08_springboot_emp.common.JsonBean;

public class JsonUtils {

	public static JsonBean createJsonBean(int code, Object info){
		JsonBean bean = new JsonBean();
		bean.setCode(code);
		bean.setInfo(info);
		
		return bean;
	}
}
