package com.java.practice.MapInterface;

import java.util.Map;
import java.util.HashMap;
public class MapEx {

	public static void main(String[] args) {
		Map<Integer,String> m1 = new HashMap<>();
		m1.put(1, "map interface");
		m1.put(2, "implements");
		m1.put(3, "hashmap");
		m1.put(4, "sortedmap");
		System.out.println(m1);
		
		for(Map.Entry<Integer,String> m:m1.entrySet()) {
			
			System.out.print(m.getKey() + " : ");
			System.out.println(m.getValue());
		}
		// TODO Auto-generated method stub

	}

}
