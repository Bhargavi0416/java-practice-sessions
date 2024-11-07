package com.java.practice.functions.exampleprograms;

public class ArrayProgram {    //array is an object which contains elements of similar data type in contiguous memory location.arrays are mutable //

	public static void main(String[] args) {
		int arr[] = new int[3] ;
	
		String s = "Bhargavi";
		String s3 = "Bhargavi";
		s = "samrat";
		System.out.println(s + " "+s3);
		System.out.println(s == s3);
		String s1 = new String("Bhargavi");
		String s2 = new String("Bhargavi");
		System.out.println(s1 == (s2));
		System.out.println(s1.equals(s2));
	    System.out.println("Array size:"+arr.length);
		
		// TODO Auto-generated method stub

	}

}
