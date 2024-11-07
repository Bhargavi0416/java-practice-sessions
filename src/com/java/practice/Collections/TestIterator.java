package com.java.practice.Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class TestIterator {

	public static void main(String[] args) {
		
		List<String> name = new ArrayList<>();
		name.add("java");
		name.add("collections");
		
		Iterator<String> s = name.iterator();
		for(String s1 :name)
		{
			System.out.println(s1);
		}

		// TODO Auto-generated method stub

	}

}
