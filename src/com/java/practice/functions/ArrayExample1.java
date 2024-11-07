package com.java.practice.functions;

public class ArrayExample1 {

	
	public static void main(String[] args) {
		//int[] a1 = new int []{ 10,20,30,40,50,60,70,80,90};//{50,60,70,80,90,100,110,120,130,};//	- Line breakpoint:Arrays [line: 5] - main(String[])
		//- Cannot define dimension expressions when an array initializer is provided
		//int[]  = {10,20,30,40,50,60,70,80,90};//Duplicate local variable arr
		int[] arr = new int[]{10,15,20,30,40,50,60,70,80,90};
		for (int y =0;y<arr.length;y++) {
			System.out.print(arr[y]);
		}
		for(int x=0; x<arr.length; x++) {
		
			arr[x] = x+10;//
			System.out.println(arr[x]+" ");
		}
		// TODO Auto-generated method stub

	}


}