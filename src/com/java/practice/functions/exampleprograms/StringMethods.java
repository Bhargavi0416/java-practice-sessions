package com.java.practice.functions.exampleprograms;

public class StringMethods {

	
	public static void main(String[] args) {
		String s1 = "bhargavi";
	    String s2 = "s1";
		String s3 = new String ("Bhargavi");
		String s4 = new String ("Bhargavi");
		String s5 = new String ("null");
		System.out.println(s1==s2);
		System.out.println(s3.equals(s4));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.charAt(1));
		System.out.println(s1.codePointAt(0));
		System.out.println(s1.codePointCount(0, 0));
		//System.out.println(s1.compareTo(s4));
		System.out.println(s1.concat(s1));
		System.out.println(s1.contains(s5));
		System.out.println(s1.contentEquals(s1));
		//System.out.println(s1.contentEquals(null));
		System.out.println(s1.endsWith(s3));
		System.out.println(s1.toCharArray());
		System.out.println(s1.startsWith(s3, 0));
		System.out.println(s1.translateEscapes());
		System.out.println(s1.length());
		System.out.println(s1.trim());
		System.out.println(s1.chars());
		System.out.println(s1.stripIndent());
		//System.out.println(s2.toLowerCase(null));
		//System.out.println(s1.);
		//System.out.println(s2);
		//System.out.println(s5.valueOf(5));
		System.out.println(s2.codePoints());
		System.out.println(s2.compareTo(s4));
		System.out.println(s2.getBytes());
		// TODO Auto-generated method stub

	}

}
