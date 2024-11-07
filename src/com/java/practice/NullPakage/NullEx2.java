package com.java.practice.NullPakage;

import java.util.*;
public class NullEx2 {

	public static void main(String[] args) {
		Set<Byte> hs = new HashSet<>();
		hs.add(null);
		System.out.println(hs);//[null]
		
		HashSet<Boolean> bl = new HashSet<>();
		bl.add(null);
		bl.add(true);
		bl.add(false);
		System.out.println(bl);////[null] [null, false, true]
		// TODO Auto-generated method stub

		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs); //                 [null]  
		
		SortedSet<Integer> sset = new TreeSet<>();
		sset.add(10);
		sset.add(null);
		//System.out.println(sset); //java.lang.NullPointerException
		
		TreeSet<Float> ts = new TreeSet<>();
		ts.add(null);
		System.out.println(ts);//java.lang.NullPointerException
		
	}
	

}
