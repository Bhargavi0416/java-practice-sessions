package com.java.practice.MapInterface;

import java.util.HashMap;
public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Float,Character> hm = new HashMap<>();
		hm.put(1.0f, 'A');
		hm.put(2.0f, 'B');
		hm.put(3.0f, 'c');
		hm.put(4.0f, 'D');
		hm.put(5.0f, 'E');
		hm.put(6.0f, 'F');
		System.out.println(hm);
		
		System.out.println(hm.containsKey(2.0f));
		
		System.out.println(hm.containsValue('x'));
		
	    System.out.println(hm.remove(6.0f, 'F'));
	    
	    System.out.println(hm.replace(1.0f, 'A', 'a'));
	    
	    System.out.println(hm.size());
	   
		System.out.println(hm.get(3.0f));
		
		System.out.println(hm.getOrDefault(4.0f, 'D'));
		
		//System.out.println(hm.merge(3.0f, 'C',null));
		
		
		System.out.println(hm.putIfAbsent(4.0f, 's'));
		
		System.out.println(hm.entrySet());
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.values());
		
		System.out.println(hm.equals(hm));
		
		
		HashMap<Float, Character> hm1 = new HashMap<>();
		
		hm1.putAll(hm);
		
		System.out.println(hm1);
		
		hm1.remove(1.0f, 'a');
		System.out.println(hm1);
		
		hm1.clear();
		System.out.println(hm1.isEmpty());
		
	//	System.out.println(hm.)
		
		// TODO Auto-generated method stub

	}

}
