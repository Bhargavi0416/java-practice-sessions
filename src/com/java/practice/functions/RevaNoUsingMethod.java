package com.java.practice.functions;

public class RevaNoUsingMethod {

	public static void main(String[] args) {
		int num = 2345;
		int res = reverse(num);
		System.out.println("the reverse number is:"+res);
	}
	public static int reverse(int num)
	{
		int rem = 0;
		int res = 0;
		while(num>0)
		{
		    rem = num%10;
			res = res*10+rem;
			num = num/10;
		}
		return res;
		// TODO Auto-generated method stub

	}

}
