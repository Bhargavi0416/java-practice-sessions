package com.java.practice.question;
//A string which remains same String value when its characters are reversed is known as palindrome String.

	
import java.util.Scanner;	
public class PalindromeString {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		String reverse = s;
		String str = "";
	    for(int i = s.length()-1; i>=0;i--) {
	    	
	    	str = str+s.charAt(i);
		    System.out.println(s.charAt(i));
			}
	    if(reverse.equals(str)) {
	    	System.out.println(reverse+"is a palindrome String");
	    	}
	    else {
	    	System.out.println(reverse+"is not a palindrome string");
	    }
		
		// TODO Auto-generated method stub

	}

}
