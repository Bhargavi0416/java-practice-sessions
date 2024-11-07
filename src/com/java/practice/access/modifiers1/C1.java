package com.java.practice.access.modifiers1;

public class C1 {
	public static int sum(int a,int b)  //public will support in all class and it will support all packages also//
	{
		int c = a+b;
		return c;
	}
  public static int mul (int a,int b)
  {
	  int m1 = a*b;
	  return m1;
  }
  private static float sub(float f1, float f2) // private access modifier support only within the same class //
  {
	  float f = f1-f2;
	  return f;
  }
  private static int digits(int num)
  {
	  
			 int count = 0;
			 while(num>0) 
			 {	 
				 
			 num = num/10;
			 count++;
			 }
			 return count;
  }
  protected static int reverse(int num)
  {
	
		int rem = 0;
		int rev = 0;
		while(num>0)
		{
		    rem = num%10;
			rev = rev*10+rem;
			num = num/10;
			
		}
		return rev;
	}
  protected static String district(String village,String mandal)  //protected access modifier support the class within the class and it support another package class by using extend class
  {
	  return village+mandal;
  }
  static int  display(int  num) //default access modifier support class from another class within same package
  {
	 
	 return num;
	  
  }
  
	public static void main(String[] args) {
		int num = 1234;
		float f1 = 5.0f;
		float f2 = 3.0f;
		float f = sub(f1,f2);
		System.out.println("the subtraction number is:"+f);
		int count = digits(num);
		System.out.println("the digit number is:"+count);
		
		// TODO Auto-generated method stub

	}

}
