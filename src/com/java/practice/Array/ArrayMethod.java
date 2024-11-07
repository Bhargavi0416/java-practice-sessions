package com.java.practice.Array;

public class ArrayMethod {
	public static void PrintArray(int[]x)//float[]f)//String[]s)
	{
		
		System.out.println(x.length);
		for(int i = 0;i<x.length;i++)
		{
//			System.out.print(a[i]+", ");
			
			System.out.print(java.util.Arrays.toString(x));
			//System.out.println(a[i]);
		//	System.out.println(s[i]);
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5};
		int b[]=new int[] {10,20,30,40,50,60};
		//float f[]=new float[] {1,2,3,4,5,6,7,8,9};
	//	String s[]=new String[5];
		ArrayMethod.PrintArray(a);
		PrintArray(b);
		// TODO Auto-generated method stub

	}

}
