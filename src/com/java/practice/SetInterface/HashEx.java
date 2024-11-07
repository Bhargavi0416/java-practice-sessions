package com.java.practice.SetInterface;

import java.util.HashSet;
public class HashEx {

	public static void main(String[] args) {
		HashSet<Float> f1 = new HashSet();
		f1.add(1.0f);
		f1.add(2.0f);
		f1.add(3.0f);
		f1.add(4.0f);
		f1.add(5.0f);
		System.out.println(f1);
		System.out.println(f1.size());
		System.out.println(f1.remove(2.0f));
		System.out.println(f1.contains(3.0f));
		System.out.println(f1.equals(5.0f));
		System.out.println(f1.isEmpty());
		System.out.println(f1.hashCode());
		System.out.println(f1.retainAll(f1));
		// TODO Auto-generated method stub

	}

}
