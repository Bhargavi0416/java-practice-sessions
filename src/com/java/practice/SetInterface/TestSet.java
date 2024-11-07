package com.java.practice.SetInterface;

import java.util.Set;
import java.util.HashSet;

public class TestSet {

	public static void main(String[] args) {
		Set<Integer> number = new HashSet<>();
		number.add(10);
		number.add(12);
		number.add(14);
		number.add(98);
		number.add(34);
		number.add(55);
		System.out.println(number);
		Set<String> str = new HashSet<>();
		str.add("java");
		str.add("string");
		str.add("are");
		str.add("immutable");
		System.out.println(str);
		// TODO Auto-generated method stub

	}

}
