package com.java.practice.Array;

public class EvenOdd {

	public static void main(String[] args) {
		int number[]=new int[] {1,2,3,4,5};
		for(int n:number)
		{
			if(n%2==0)
			{
				System.out.println("even:"+n+" ");
			}
			else {
				System.out.println("odd:"+n+" ");
			}
			if(n%2!=0) {
				System.out.println("odd:"+n+" ");
			}else {
				System.out.println("even:"+n+" ");
			}
		}
		// TODO Auto-generated method stub

	}

}
