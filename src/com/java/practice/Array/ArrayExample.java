package com.java.practice.Array;

public class ArrayExample {
	
	public static void printarray1(int[]a,float[]f,double[]d,String[]s)
	{
		for(int i =0;i<a.length;i++) {
		System.out.print(a[i]+", ");
		}
		for(int i =0;i<f.length;i++)
		{
		System.out.println(f[i]+", ");
		}
		for(int i =0;i<d.length;i++)
		{
		System.out.print(d[i]+", ");
		}
		for(int i=0;i<s.length;i++) {
		System.out.println(s[i]+", ");
	}}
	public static void reversearray(int[]a,float[]f,double[]d,String[]s)
   {
	for(int i=a.length-1;i>=0;i--) {
	System.out.print(a[i]+", ");
	}  
	for(int i =f.length-1; i>=0;i--) {
	System.out.println(f[i]+", ");
	}
	for(int i=d.length-1;i>=0;i--) {
		System.out.print(d[i]+", ");
	}
	for(int i=s.length-1;i>=0;i--) {
	 System.out.println(s[i]+", ");
		}}
	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4};
		float f[]=new float[] {5,10,15,20,30,40,50,60};
		double d[]=new double[]{1,3,5,7,9,11,13,15};
		 
		String s[]=new String[] {"basic","program","in","java"};
		printarray1(a,f,d,s);
		reversearray(a,f,d,s);
		// TODO Auto-generated method stub

	}

}
