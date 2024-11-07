package com.java.practice.question;
import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("enter the size of array");
		int size = sc.nextInt();
		System.out.println("enter the integers:"+size);
		int[] n = new int[size];
		for(int i = 0;i<n.length;i++) {
		n[i]=sc.nextInt();
		}
		for(int i =0;i<n.length;i++) {
			System.out.println(n[i]);
		}
		// TODO Auto-generated method stub

	}

}
