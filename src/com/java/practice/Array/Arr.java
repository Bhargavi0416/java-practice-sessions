package com.java.practice.Array;

public class Arr {

	public static void main(String[] args) {
		//static int  = 5;
		int arr[] = new int[9];  // Syntax; int arr[] = new int[]//
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		arr[5]=6;
		arr[6]=7;
		arr[7]=8;
		arr[8]=9;
		for(int i=0;i<arr.length; i++)
		{
			//System.out.println(arr.length);
			System.out.println(arr[i]);
		}
		for(int i= arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		for(int i= arr.length-1;i>=5;i--)	{
			System.out.println(arr[i]);
		}
		}

	}

