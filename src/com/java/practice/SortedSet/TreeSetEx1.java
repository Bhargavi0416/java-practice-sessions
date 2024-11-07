package com.java.practice.SortedSet;

import java.util.TreeSet;
public class TreeSetEx1 {

	public static void main(String[] args) {
	TreeSet<Float> ts = new TreeSet<>();
	ts.add(20.0f);
	ts.add(12.0f);
	ts.add(25.0f);
	ts.add(32.0f);
	ts.add(11.0f);
	System.out.println(ts);
		
System.out.println(ts.ceiling(11.0f));//This method returns the least elem in this set greater than or equal to the given ele, or null 
	
System.out.println(ts.floor(25.0f));//floor method returns the greatest element in this set less than or equal to the given element, or null
   
System.out.println(ts.higher(10.0f));//higher  method returns the least element in this set  greater than the given element, or null 

System.out.println(ts.lower(32.0f));//This method returns the greatest element in this set strictly less than the given element, or null

System.out.println(ts.descendingSet());//it will return the ele in the descending order

System.out.println(ts.headSet(12.0f)); // it will return all the less than ele then the given ele in the set

System.out.println(ts.tailSet(20.0f));// it returns  all the highest elements then the given ele

System.out.println(ts.tailSet(25.0f, true));
	// TODO Auto-generated method stub

	}

}
