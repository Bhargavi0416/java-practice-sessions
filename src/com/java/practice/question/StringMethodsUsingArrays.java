package com.java.practice.question;

public class StringMethodsUsingArrays {

	public static void main(String[] args) {
		String s =  new String("basic java programs");
		String S1 = new String("   in Strings");
		String S2 = "   And String Methods";
		System.out.println(s.length());  //length 
		System.out.println(S1.length());//concatenated
		System.out.println(s.equals(S1)); //equals method
		System.out.println(s.concat(S1).concat(S2));
		String S3 = "  trim method removes extra space from right and left side of a String    ";
		System.out.println(S3.trim().length());
		System.out.println(S1.trim() +S2.trim() +S3.trim());
		String S4 = "charAt method return the character index of a String";
		System.out.println(S4.charAt(25));
		String S5 ="contains method return the boolean value of a String and it checks the whether the given data is present r not";
		System.out.println(S5.contains("return"));
		String S6 = "equalIgnorecase"; //compares to strings
		String S7 = "Equalignorecase";
		System.out.println(S6.equals(S7));
		System.out.println(S7.equalsIgnoreCase(S6));
		String S8 = "replace method";
		System.out.println(S8.replace('r','R'));
		System.out.println(S8.replace("replace method", "Replace Method"));
		System.out.println(S8.substring(1,8));
		System.out.println(S8.toLowerCase());
		System.out.println(S8.toUpperCase());
		String Str = "abcdefghijklmn opqrstuvwxy";
		System.out.println(Str.split(","));
		String st ="12345";
		System.out.println(String.valueOf(st));
		String str = " ";
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		String r = "Startwith";
		System.out.println(r.startsWith("str"));
		System.out.println(r.endsWith("k"));
		String I = "String";
		System.out.println(I.indexOf("g"));
		System.out.println(I.toCharArray());
		System.out.println(I.lastIndexOf("t"));
		
		// TODO Auto-generated method stub

	}

}
