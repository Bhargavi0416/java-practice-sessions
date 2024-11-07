package com.java.practice.Array;

public class StringArray2 {

	public static void main(String[] args) {
		String[]s1 = {"String","are","Immutable"};
		String[]s2 = {"Strings","in","java"};
		boolean s = s1.equals(s2);
		System.out.println (s);
		String s3= "racecar";
		String s4= ",";
		String str = ",";
		//for(int i =0;i<s3.length()-1;i++)
		for(int i=s3.length()-7;i>=0;i--)
		{
			s4 = s4+s3.charAt(0);
			str =str+s3.charAt(s3.length()-1);
		//	System.out.println(s3.charAt(i));
		  if(s4.equals(str)) {
			  System.out.println("the first and last character are same");
		  }else {
			  System.out.println("the first and last element are not same");
		  }
			
			
		// TODO Auto-generated method stub

	}

	
		// TODO Auto-generated method stub
		
	}

	
	}


