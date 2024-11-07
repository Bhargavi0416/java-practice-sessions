package com.java.practice.MapInterface;

import java.util.Map;
import java.util.HashMap;
public class SampleMapEx {

	public static void main(String[] args) {
		Map<Integer,Character> hm = new HashMap<>();
		hm.put(1, 'a');
		hm.put(2, 'b');
		hm.put(3, 'c');
		hm.put(4, 'd');
		hm.put(5, 'e');
		System.out.println(hm);
		
		for(Map.Entry<Integer,Character> hm1 :hm.entrySet()) {
			System.out.println(hm1.getKey() + " :"+" "+ hm1.getValue());
		}
		
		System.out.println(hm.get(3));
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.values());
		
		System.out.println(hm.entrySet());
		
		System.out.println(hm.containsKey(7));
		
		System.out.println(hm.containsValue('d'));
		
		System.out.println(hm.size());
		
		System.out.println(hm.remove(3,'c'));
		// TODO Auto-generated method stub

	}

}
