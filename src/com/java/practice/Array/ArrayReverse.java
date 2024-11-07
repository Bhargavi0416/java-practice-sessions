package com.java.practice.Array;

public class ArrayReverse {
	static void reverse(int arr[])
	{
		
		int i = 0, j=arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
	}

	public static void main(String[] args) {

		int []arr = new int[] {1,2,3,4,5,6,};
		for(int a = 0; a<arr.length;a++) {
		System.out.print(arr[a] + " ");
		}
		reverse(arr);
		System.out.println();
		for(int a = 0; a<arr.length;a++) {
			System.out.print(arr[a] + " ");
		
		// TODO Auto-generated method stub

	}

}
}