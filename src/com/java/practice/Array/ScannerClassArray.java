package com.java.practice.Array;
import java.util.Scanner;

public class ScannerClassArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = sc.nextInt();
		//sc.nextLine();
		String s[] = new String[size];
		
		System.out.println("input the elements into the String array");
		for(int i = 0;i<s.length;i++) {
			s[i]=sc.nextLine();
		}
		for(int i =0;i<s.length;i++) {
			System.out.print( s[i]);
		}
		// TODO Auto-generated method stub

	}

}
