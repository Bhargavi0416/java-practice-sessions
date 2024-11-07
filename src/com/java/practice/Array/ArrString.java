package com.java.practice.Array;

public class ArrString {

	public static void main(String[] args) {
		String s[]=new String[] {"s","t","r","i","n","g"};
		for(int i = 0;i<s.length;i++)
		{
			System.out.print(s[i]+",");
		}
		for(int i =s.length-1;i>=0;i--) {
			System.out.println(s[i]+",");
		}
		String st[]=new String[] {"split","String"};
		for(String str:st) {
			System.out.println(str);
			
		}
		String[] t= {"Split method in java","strings in java","String method"};
		for(String t1:t) 
		{
			String[]str = t1.split(",");
			System.out.println(t1);
			
		}
		String[]s1 = {"String"};
		
		for(String St:s1) {
			String[]Sr = St.split(",");
			System.out.println(St);
		}
		
		String str = "string";
		char c[]= str.toCharArray();
		
	for(int i = 0;i<c.length;i++) {
			System.out.println(c[i]);
//			
	}
//		String[] sr=""
		
		// TODO Auto-generated method stub

	}
}

