package com.java.practice.MapInterface;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap<Character,Integer> lhm = new LinkedHashMap();
		lhm.put('z', 26);
		lhm.put('y', 25);
		lhm.put('x', 24);
		lhm.put('w', 23);
		lhm.put('v', 22);
		lhm.put('u', 21);
		System.out.println(lhm);
		
		System.out.println(lhm.containsKey('s'));
		
		System.out.println(lhm.containsValue(23));
		
		System.out.println(lhm.remove('z', 25));
		
		System.out.println(lhm.replace('x', 24, 24));
		
		System.out.println(lhm);
		
		System.out.println(lhm.get('v'));
		
		System.out.println(lhm.entrySet());
		
		System.out.println(lhm.keySet());
		
		System.out.println(lhm.values());
		
	    System.out.println(lhm.isEmpty());
	    
	    lhm.clear();
	    System.out.println(lhm);
	    
	    LinkedHashMap<Character,Integer> lhm1 = new LinkedHashMap<Character, Integer>();
	    
	    lhm1.put('X', 24);
	    lhm1.put('Y', 25);
	    lhm1.put('Z', 26);
	    
	    for(Entry<Character, Integer> lhm2 : lhm1.entrySet()) {
	    	
	    	System.out.println(lhm2);
	    	//System.out.println(lhm1.getKey() + " :"+" "+ lhm1.getValue());
	    }
	    
		// TODO Auto-generated method stub

	}

}
