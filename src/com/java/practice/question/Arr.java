package com.java.practice.question;

public class Arr {

	public static void main(String[] args) {
		int ar[] = new int[]{10,5,3,8,20};
		int addition = 0;
		int mul = 1;
		////for(int i = 0; i<=ar.length;i++) {
			//System.out.println(ar[i]);
	//	}
		for(int i:ar) {
			System.out.println(i);
			}
		for(int i :ar) {
			addition = addition+i;
			mul = mul*i;
			System.out.println(mul);
			
			//System.out.println(addition);
			
		}
		// TODO Auto-generated method stub

	}

}
