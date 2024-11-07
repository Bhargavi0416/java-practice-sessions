package com.java.practice.MapInterface;


import java.util.SortedMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.HashMap;
public class SortedMapEx1 {

	public static void main(String[] args) {
		SortedMap<Integer,String> sm = new TreeMap<>();
		sm.put(5, "map interface");
		sm.put(4, "hashmap");
		sm.put(3, "Linkedhashmap");
		sm.put(2, "sortedmap");
		sm.put(1, "treemap");
		System.out.println(sm);
		
		System.out.println(sm.entrySet());
		
		System.out.println(sm.firstKey());
		
		System.out.println(sm.lastKey());
		
		System.out.println(sm.headMap(5));
		
		System.out.println(sm.tailMap(3));
		
		System.out.println(sm.subMap(1, 3));
		
		Map<Character,Float> m = new HashMap<>();
		m.put('x', 24.0f);
		m.put('v', 22.0f);
		m.put('s', 20.0f);
		m.put('z',26.0f);
		m.put('r', 18.0f);
		System.out.println(m);
		
		
		LinkedHashMap<Integer,Float> lhm = new LinkedHashMap();
		lhm.put(1,20.0f);
		lhm.put(2,100.0f);
		//lhm.put(3, 40.0f);
		lhm.put(3, 60.0f);
		lhm.put(4, 80.0f);
		System.out.println(lhm);
		// TODO Auto-generated method stub

	}

}
