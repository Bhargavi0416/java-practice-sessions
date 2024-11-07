package com.java.practice.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;
public class SortedSetEx1 {

	public static void main(String[] args) {
		SortedSet<String> str = new TreeSet<>();
		str.add("SortedSet");
		str.add("extend");
		str.add("navigable set");
		str.add("implements");
		str.add("treeset");
		System.out.println(str);
		
	System.out.println(str.contains("set"));
//		
		SortedSet<String> str1 = new TreeSet<>();
		str1.add("string");
		
//		
		str.addAll(str1);
		System.out.println(str);
		
		System.out.println(str.retainAll(str1));
		
		System.out.println(str1.removeAll(str1));
		
		System.out.println(str1.size());
		
		System.out.println(str1.isEmpty());
		// TODO Auto-generated method stub



}
}