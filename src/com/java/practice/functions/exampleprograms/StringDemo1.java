package com.java.practice.functions.exampleprograms;

public class StringDemo1 {

	
	public static void main(String[] args) {
		String s = "I Like You";
		System.out.println(s.charAt(4));
		// TODO Auto-generated method stub
		String obj = new String ("5");
		System.out.println(1+10+obj+1+10);
		System.out.println(obj.toString());
		String s1 = "hello";
		String s2 = new String ("hello");
		s2 = s2.intern();
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));

		
	}

}
