package com.java.class05;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonTypeTest {

	
	public String toJson(JsonObject jsonObj) {
		return null;
	}
	
	
	public static void main(String[] args) {
		JsonObject jsonObj1 = new JsonObject();
		
		JsonArray list = new JsonArray();
		JsonObject person = new JsonObject();
		person.addProperty("name", "박지호");
		person.addProperty("age", 123);
		list.add(person);
		
		person = new JsonObject();
		person.addProperty("name", "김영호");
		person.addProperty("age", 31);
		list.add(person);
		
		jsonObj1.add("list", list);
		
		System.out.println( new Gson().toJson(jsonObj1) );
		
	}

}
