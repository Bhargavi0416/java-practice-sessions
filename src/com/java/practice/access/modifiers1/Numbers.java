package com.java.practice.access.modifiers1;

public class Numbers {
	public static int natural(int n)
	{
	 //x = 7;
	int sum = 0;
	for(int i=0;i<=n;i++) {
		sum = sum+i;
	}
	return sum;
	}
	public static void main (String args[]) {
		int n = 7;
		int sum = natural(n);
		int s =sum;
		System.out.println("the sum of n natural number is:"+s);
        
        
		
	// TODO Auto-generated method stub


}
}