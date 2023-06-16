package com.java.class01;

import java.util.HashMap;
import java.util.Map;

public class ParameterParsingTest {

	public static void main(String[] args) {
		
		String requestUrl = "file:///C:/vs-code/workspace/front-end/html/html04_form.html?id=docute&pwd=112233";
		Request request = new Request(requestUrl);
		System.out.println(request.getParameter("id"));
		System.out.println(request.getParameter("pwd"));

	}

}
