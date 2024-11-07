package com.java.practice.Array;
public class ReverseArray {
  public static void main(String[] args) {
		int a[]=new int[5] ;
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[4]=4;
		a[5]=5;
		int i = 0,j =a.length,temp; 
		while(i<j) {
		 temp = a[i];
		 a[i] = a[j];
		 a[j] = temp;
		 i++;
		 j--;
		}
		System.out.println(a[i]);
}
}
