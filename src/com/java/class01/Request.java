package com.java.class01;

import java.util.HashMap;
import java.util.Map;

public class Request {
	Map<String, String> parameter;
	
	public Request(String requestUrl) {
		String[] params = requestUrl.split("\\?")[1].split("\\&");
		parameter = new HashMap<>();
		for(int i=0; i < params.length ; i++) {
			String[] strMap = params[i].split("\\=");
			
			parameter.put(strMap[0], strMap[1]);
		}
	}
	
	public String getParameter(String key) {
		return parameter.get(key);
	}
	
}
