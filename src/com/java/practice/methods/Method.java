package com.java.practice.methods;


public class Method {

	public static void main(String[] args) {
		int num = 2345;
		//int count = 0;
		int rev = reverse(num);
		System.out.println("the reverse number is:"+rev);
		int count = digits (num);
		System.out.println("the count number is:"+count);
		int res = sum(num);
		System.out.println("the sum of digits is:"+res);
		int m1 = mul(num);
		System.out.println("the multiple of digits is:"+m1);
	
	//int n = 7;
	int sum = natural(7);
	int s = sum ;
	System.out.println("the sum of n natural number is:"+s);
	}
	public static int reverse(int num)
	//public static int digits(int num
	{
		//int count  = 0;
		int rem = 0;
		int rev = 0;
		while(num>0)
		{
		    rem = num%10;
			rev = rev*10+rem;
			num = num/10;
			
		}
		return rev;
		//return count;
	}
		public static int digits (int num)
		{
			 int count = 0;
			 while(num>0) 
			 {	 
				 
			 num = num/10;
			 count++;
			 }
			 return count;
		}
		public static int sum (int num)
		{
			int rem = 0;
			int res = 0;
			while(num>0)
			{
				rem = num%10;
				res = res+rem;
				num = num/10;
			}
			return res;
		}
		public static int mul (int num)
		{
			int rem =0;
			int m1 = 1;
			while(num>0)
			{
				rem = num%10;
				m1  = m1*rem;
				num = num/10;
			}
			return m1;
		}
		public static int natural(int n)
		{ 
			int sum = 0;
			for(int i=0;i<=n;i++)
			{
				sum = sum+i;
			}
			return sum;
		}
		// TODO Auto-generated method stub

	}


