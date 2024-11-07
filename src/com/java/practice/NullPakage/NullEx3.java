package com.java.practice.NullPakage;

import java.util.*;
public class NullEx3 {

	public static void main(String[] args) {
		Map<Integer,Character> hashm = new HashMap<>();
		hashm.put(null, null);
		System.out.println(hashm);//{null=null}

		HashMap<String,Character> hm = new HashMap<>();
		hm.put(null, null);
		System.out.println(hm);//{null=null}
		
		LinkedHashMap<Byte,Boolean> lhm = new LinkedHashMap<>();
		lhm.put(null, null);
		System.out.println(lhm);////{null=null}
		
		SortedMap<Float,String> sm = new TreeMap<>();
		sm.put(null, null);
		System.out.println(sm);//Exception in thread "main" java.lang.NullPointerException
		
		TreeMap<String,String> tmap = new TreeMap<>();
		tmap.put(null, null);
		System.out.println(tmap);   //Exception in thread "main" java.lang.NullPointerException
		// TODO Auto-generated method stub

	}

}
