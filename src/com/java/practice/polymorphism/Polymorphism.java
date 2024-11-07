package com.java.practice.polymorphism;

public class Polymorphism {
	public String touppercase(String s,float x,float y)
	{
		System.out.println(x+y);
		return s;
	}
public String  touppercase(String s1,String s2,String s3,String s4) {
	
	String str = s1.toUpperCase();String S = s2.toUpperCase();String St = s3.toUpperCase();String st = s3.toUpperCase();
    System.out.println(str+""+S+""+St+""+st);
	return s1+s2+s3+s4;
	
}
	public static void main(String[] args) {
		float x = 3.0f;
		float y = 5.0f;
		 String s = "polymorphism";
		 String str = s.toUpperCase();
		 System.out.println("Upper case string: " + str);
		 Polymorphism obj = new Polymorphism();
		 obj.touppercase("Strings","are","immutable","in java");
		//String str = s1.toUpperCase();String S = s2.toUpperCase();String St = s3.toUpperCase();String st = s3.toUpperCase();
		//System.out.println(str+""+S+""+St+""+st);
		/*String s1 ="String";String s2 = "are";String s3="immutable";String s4="in java";
		String str = s1.toUpperCase();
		String S = s2.toUpperCase();
		String St = s3.toUpperCase();
		String St = s3.toUpperCase();*/
	    obj.touppercase("polymorphism",3.0f,5.0f);
	    //System.out.println();
				
		// TODO Auto-generated method stub

	}

}
 