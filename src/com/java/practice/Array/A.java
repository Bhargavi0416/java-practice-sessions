package com.java.practice.Array;

public class A {
	
	public static void printarray(int[]arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
			}}
	public static void StringArray(String[]s1) {
		for(int j = 0;j<s1.length;j++) {
			System.out.println(s1[j]+"");
		}}
	public static void main(String[]args) {
		int arr[]=new int[4];
		A.printarray(arr);
		String[]s = new String[5];
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		String[]s1 = new String[] {"basics","of","java","programs"};
		A.StringArray(s1);
		
		
	}
}