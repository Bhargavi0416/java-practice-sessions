package com.java.practice.SetInterface;

import java.util.HashSet;
public class HashSetEx {

	public static void main(String[] args) {
		HashSet<Integer> num = new HashSet();
		num.add(4);
		num.add(6);
		num.add(8);
		num.add(2);
		num.add(10);
		System.out.println(num);
		num.add(18);
		num.add(20);
		System.out.println(num);
		System.out.println(num.contains("10"));
		System.out.println(num.contains("num"));
		System.out.println(num.contains(8));
		System.out.println(num.equals(num));
		System.out.println(num.remove(num));
		// TODO Auto-generated method stub

	}

}
