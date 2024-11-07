package com.java.practice.functions;

public class Arrays {
	
	public static void main(String[] args) {
		
		int arr[] = new int[9];// {1,2,3,4,5,6,7,8,9,10};//	- Line breakpoint:Arrays [line: 5] - main(String[])
		//- Cannot define dimension expressions when an array initializer is provided
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		arr[5]=6;
		arr[6]=7;
		arr[7]=8;
		arr[8]=9;
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);		                     //i can not be resolved as a variable//

			//System.out.println(arr[]);// arr cannot be resolved to a type
			//- Syntax error, insert ". class" to complete ArgumentList//
			
		}
		
		
		// TODO Auto-generated method stub

	}
}


