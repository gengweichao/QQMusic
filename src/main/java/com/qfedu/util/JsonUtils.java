package com.qfedu.util;


import com.qfedu.content.JsonBean;

public class JsonUtils {

	public static JsonBean createJsonBean(int code, String msg,Object data) {
		JsonBean bean = new JsonBean();
		bean.setCode(code);
		bean.setMsg(msg);
		bean.setData(data);
		return bean;
	}
}
