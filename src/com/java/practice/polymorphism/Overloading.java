package com.java.practice.polymorphism;


public class Overloading {
	public float Squareofanumber(float f1,float f2,float f3,String s,String s1,String s2 )
	{
		int len = s.length();int Len  = s1.length();int leng = s2.length();
		System.out.println("Length of the string: "+len+Len+leng);
		System.out.println(f2*f2);
		System.out.println(f3*f3);
		//System.out.println(f1*f1);
		return f1*f1; 
	}
   int Squareofanumber(float f1,float f2,float f3 ,int x,int y,int z)
   {
	   System.out.println(f1*f2*f3);
	   return x+y+z;
   }
   short Squareofanumber(short a,short b,byte b1,byte b2,byte b3)
   {
	   System.out.println(b1+b2+b3);
	   return (short)(a+b);
   }
   long Squareofanumber(long L1,long L2,double d1,double d2, double d3,double d4)
   {
	   System.out.println(d4+d2+d3+d1);
	   return L1/L2;
   }
  void  Squareofanumber(char ch,char chr,char cha, String str, String st,String sr)
   {
	 
	 System.out.println(str+st+sr) ; 
	
	 
	 
   }
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		String s ="basic";String s1 = "java";String s2="program";
		//int len = s.length();int Len  = s1.length();int leng = s2.length();
		float f = obj.Squareofanumber(5.0f,25.0f,625.0f,"basic","java","program");
		System.out.println("square of a number 5 is:"+f);
		int n = obj.Squareofanumber(4.0f,6.0f,8.0f,44,44,44);
		System.out.println("addition three numbers:"+n);
		short a = 123;short b = 456;byte b1 = 33; byte b2 = 44;byte b3 = 66;
		System.out.println("sum of numbers a and b:"+obj.Squareofanumber(a,b,b1,b2,b3));
		long L1 = 654321l;
		long L2 = 654l; double d1 = 765.987;double d2 = 9876.1234; double d3 = 345.12;double d4= 23.45;
		System.out.println("output of L1and L2:"+obj.Squareofanumber(L1, L2, d1, d2, d3, d4));
		String str = "example of "; String st = "java"; String sr = "programs";
		
		// TODO A0u)to-generated method stub


}
}

