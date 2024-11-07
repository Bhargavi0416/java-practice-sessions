package com.java.practice.Array;

public class TestArray {
	public static void printArray(int[]a,float[]f) {

		for(int j=0;j<f.length;j++)
		{
			System.out.println(f[j]);
		}
		for(int i=0;i<a.length;i++)              //ArrayIndexOutOfBoundsException
		{
			System.out.println(a[i]);
		}}
		public static void StringArray(String[]s1) {
			for(int j = 0;j<s1.length;j++)
			{
				System.out.println(s1[j]+"");
			}}
		
	   public static void main(String[] args) {
	   int []a = {2,4,6,8,10,15};
	   float f[]=new float[5];
	   TestArray.printArray(a, f);
	   String[]s1 = new String[] {"basic","java","programs"};
		A.StringArray(s1);
		
		
		

	}

}
