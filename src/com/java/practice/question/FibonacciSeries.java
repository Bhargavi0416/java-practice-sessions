package com.java.practice.question;
// A series in which each number is the sum of two preceding numbers is known as fibonacci number.
public class FibonacciSeries {

	public static void main(String[] args) {
		int n =0, n1=1,n2=0;
		//System.out.println(n1+""+n2);
		for(int i =0;i<5;i++) 
		{    //1
			n2=n+n1; //0+1=1; 1+2
			System.out.println(n2);//1,
			n1=n;//1
			n=n2;//1
			
		}
		// TODO Auto-generated method stub

	}

}
