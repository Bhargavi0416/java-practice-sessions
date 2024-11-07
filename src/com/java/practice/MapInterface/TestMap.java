package com.java.practice.MapInterface;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class TestMap {

	public static void main(String[] args) {
		Map<String,Integer> st = new HashMap<>();
		st.put("bananas", 2);
		st.put("Apples", 2);
		st.put("oranges", 2);
		st.put("guavas", 2);
		System.out.println(st);
		System.out.println(st.entrySet());
		
		Map<Integer,String> stm = new LinkedHashMap<>();
		stm.put(1,"one");
		stm.put(2, "two");
		stm.put(4, "four");
		stm.put(8,"eight");
        stm.put(6,"six");
        System.out.println(stm);
				
		
		// TODO Auto-generated method stub

	}

}
