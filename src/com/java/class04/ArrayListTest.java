package com.java.class04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListTest {

	public static void main(String[] args) {
		System.out.println("java");
		List<Pair> list = new ArrayList<>();
		Pair<String, String> pair = new ArrayListTest().new Pair<>();
		pair.setKey("열쇠1");
		pair.setValue("1번 차키");
		list.add(pair);
		
		System.out.println(list);
		list.add(pair);
		Map<String, String> map = new HashMap<>();
		System.out.println("이전값 확인 - "+map.put("열쇠1", "1번 차키"));
		System.out.println(map.get("열쇠1"));
		System.out.println("이전값 확인 - "+map.put("열쇠1", "2번 차키"));
		System.out.println(map.get("열쇠1"));
		System.out.println(map);
		
		System.out.println("remove 이전값 - "+map.remove("열쇠1"));
		System.out.println("remove 이전값 - "+map.remove("열쇠1")); 
		System.out.println(map.get("열쇠1"));
		System.out.println(map);
		
		//map.remove(null);
		
	}
	
	class Pair<K, V>{
		K key;
		V value;
		
		public K getKey() {
			return key;
		}
		public void setKey(K key) {
			this.key = key;
		}
		public V getValue() {
			return value;
		}
		public void setValue(V value) {
			this.value = value;
		}
	}
	

}
