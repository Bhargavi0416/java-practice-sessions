package com.java.practice.SetInterface;

import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedSetEx1 {

	public static void main(String[] args) {
		
		Set<String> lhs = new LinkedHashSet();
		lhs.add("set interface");
		lhs.add("methods are");
		lhs.add("add()");
		lhs.add("addAll()");
		lhs.add("remove()");
		lhs.add("removeAll()");
		lhs.add("retains()");
		lhs.add("contains()");
		System.out.println(lhs);
		lhs.add("retains");
		System.out.println(lhs);
		System.out.println(lhs.remove("retains()"));
		System.out.println(lhs.size());
		lhs.remove("retains()");
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.removeAll(lhs));
		System.out.println(lhs.isEmpty());
		
		LinkedHashSet<String> lhs1 = new LinkedHashSet();
		lhs1.add("LinkedHshset");
		lhs1.add("set");
		lhs1.addAll(lhs);
		System.out.println(lhs1);
		System.out.println(lhs.addAll(lhs1));
		
		System.out.println(lhs);
		// TODO Auto-generated method stub

	}

}
