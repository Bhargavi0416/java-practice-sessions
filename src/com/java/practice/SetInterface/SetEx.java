package com.java.practice.SetInterface;

import java.util.Set;
import java.util.HashSet;
public class SetEx {

	public static void main(String[] args) {
		Set<String> str = new HashSet();
		str.add("Set");
		str.add("interface");
		str.add("implement");
		str.add("hashset");
		str.add("LinkedHashSet");
		str.add("sorted set interface");
		str.add("extends");
		str.add("set");
		
		System.out.println(str);
		
		Set<String> st = new HashSet();
		st.add("collection");
		st.add("interface");
		st.addAll(str);
		System.out.println(st);
		
		System.out.println(st.size());
		System.out.println(st.contains("extends"));
		System.out.println(st.remove("collection interface"));
		
		System.out.println(st.retainAll(str));
		System.out.println(st.removeAll(st));
		System.out.println(st);
		System.out.println(st.isEmpty());
		// TODO Auto-generated method stub

	}

}
