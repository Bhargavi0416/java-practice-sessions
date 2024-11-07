package com.java.practice.SetInterface;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> lh = new LinkedHashSet<>();
		lh.add("L");
		lh.add("i");
		lh.add("n");
		lh.add("k");
		lh.add("e");
		lh.add("d");
		lh.add("H");
		lh.add("a");
		lh.add("s");
		lh.add("h");
		lh.add("S");
		lh.add("e"); //here e is a duplicate elements so it is nt print in the set because set doesn't accept the duplicate elements 
		lh.add("t");
		System.out.println(lh.toString());
		
		boolean b = lh.remove("s");
		System.out.println(b);
		
		
		// TODO Auto-generated method stub

	}

}
