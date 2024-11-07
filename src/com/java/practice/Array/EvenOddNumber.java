package com.java.practice.Array;

public class EvenOddNumber {

	public static void main(String[] args) {
		int[] number = new int[] {1,2,3,4,5,6,7,8,9,10};
		for(int i = 0;i<number.length;i++) {
			number[i]=i;
			System.out.print(number[i]+",");
			i++;
		
		}
		
		for(int i=number.length-1;i>=0;i--) {
			number[i]=i;
			System.out.println(number[i]+",");
			i--;
			
		}
		
			
			// TODO Auto-generated method stub
		}

	}


