package com.java.practice.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class IteratorEx {

	public static void main(String[] args) {
		
		List<Integer> obj = new ArrayList<>();
		obj.add(30);
		obj.add(40);
		obj.add(20);
		obj.add(60);
		System.out.println(obj);
		
		Iterator<Integer> itr =  obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
			itr.remove();
		System.out.println(itr);
		}
		}
		// TODO Auto-generated method stub

	


