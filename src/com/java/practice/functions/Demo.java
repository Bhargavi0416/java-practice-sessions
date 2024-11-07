package com.java.practice.functions;

public class Demo {

	public static void main(String[] args) {
		//int a= 10;
		int x = 10;
		int y = x;
		
		//System.out.println(x+""+y);
		//y = 20;
		//Integer a = 15;
		//Integer b = a;
		//system.out.println(a+""+b);
		 //b = 10;
		//System.out.println(a+""+b);
		//b = 20;
		//System.out.println(a+""+b);
		System.out.println(x+""+y);
		
		int arr1[] = new int[] {2,4,7,8};
		int arr2[] = new int[4];
			arr2 = arr1;
			System.out.println(arr2[0]);
			System.out.println(arr1[0]);
			
			arr2[0] = 20;
			
			System.out.println(arr2[0]);
			System.out.println(arr1[0]);
			
		
		
		// TODO Auto-generated method stub

	}

}
