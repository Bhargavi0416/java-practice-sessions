package com.java.practice.Array;

public class StringArray1 {

	public static void main(String[] args) {
		
		String str = "string";
		char c[]= str.toCharArray();
		
		for(int i = 0;i<c.length;i++) {
			System.out.print(c[i]+",");
		}	
		
		for(int i=c.length-1;i>=0;i--) {
			System.out.println(c[i]);
		}
		
		String str1 = "String";
		char c1[]= str.toCharArray();
		int s = str.compareTo(str1);
		System.out.print(s+",");
		boolean n = str.equals(str1);
		System.out.println(n);
		
		String[] s1 = {"m","a","d","a","m"};
		for(int i=0;i<s1.length-4;i++) {

        System.out.println(s1[0].equals(s1[s1.length-1]));
		}
		String[] St = {"hello","radar","level","String","in","java","Strings","Immutable","rader","Hello"};
			System.out.println(St[1].equals(St[St.length-1]));
			System.out.println(St[3].equals(St[St.length-2]));
			System.out.println(St[2].equals(St[St.length-3]));
		
		   
	   }
//		int ch=s1.length;
//		System.out.print(ch);
//		for(String elements:s1) {
//			S
//			
//		}
		
		
		
		// TODO Auto-generated method stub

	}


