package com.java.practice.MapInterface;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class MapMethodEx {

	public static void main(String[] args) {
		Map<String,Integer> lhm = new LinkedHashMap();
		lhm.put("s", 1);
		lhm.put("t", 2);
		lhm.put("r", 3);
		lhm.put("i", 4);
		lhm.put("n", 5);
		lhm.put("g", 6);
		lhm.putIfAbsent("s", 3);
		System.out.println(lhm);
		
		System.out.println(lhm.remove("s",3));
		
		System.out.println(lhm.containsKey("x"));
		
		System.out.println(lhm.containsValue(4));
		
		System.out.println(lhm.keySet());
		
		System.out.println(lhm.values());
		
		System.out.println(lhm.entrySet());
		
		System.out.println(lhm.size());
		
		System.out.println(lhm.isEmpty());
		
		lhm.clear();
		System.out.println(lhm);
		
		lhm.put("interface", 2);
		System.out.println(lhm);
		System.out.println(lhm.replace("String", 2));                             //.replace("string", 7, 8));
		// TODO Auto-generated method stub

	}

}
