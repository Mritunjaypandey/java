package com.Mjay;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		hm.put("Mjay", 98);
		hm.put("Vijay",97);
		hm.put("ajay", 99);
		System.out.println(hm.get("Mjay"));
		
		//for(Map.Entry<String, Integer> entry:hm.entrySet()) {
		for(Map.Entry<String, Integer> entry:hm.entrySet()) {
			String ke=entry.getKey();
			Integer i=entry.getValue();
			System.out.println(ke+" : "+i);

	}
	}
}
