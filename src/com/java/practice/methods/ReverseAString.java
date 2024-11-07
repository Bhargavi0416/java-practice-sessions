package com.java.practice.methods;

public class ReverseAString {

	public static void main(String[] args) {
		String s = "hello java";
		String rev = "";
		//System.out.print(s);//
		for(int i= s.length()-1;i>=0;i--)
		{
			//System.out.println((i));
			System.out.println((s.charAt(i)));
			rev=rev+s.charAt(i);
		}
		
		System.out.println("Reverse a String:"+rev);  // TODO Auto-generated method stub

	}

}
