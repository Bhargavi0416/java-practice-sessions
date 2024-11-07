package com.java.practice.SortedSet;

import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetEx3 {

	public static void main(String[] args) {
		TreeSet<Double> d = new TreeSet();
		d.add(123.00);
		d.add(456.00);
		d.add(987.00);
		d.add(321.00);
		d.add(111.00);
		d.add(33.00);
		Iterator<Double> itr =d.iterator();
		System.out.println("double element set :");
		while(itr.hasNext()) {
			System.out.print(itr.next()+",");
		}
		
		// TODO Auto-generated method stub

	}

}
