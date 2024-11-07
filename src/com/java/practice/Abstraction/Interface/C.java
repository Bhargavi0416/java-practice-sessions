package com.java.practice.Abstraction.Interface;

public class C implements C5{

	
	    public int methodC1(int i)
	    {
	        return i =+ i * i;
	    }

		@Override
		public int methodC(int i) {
			// TODO Auto-generated method stub
			return i*i;
		}
	}
	 
	interface C5
	{
	    int methodC(int i);
	}
	
	 
/*	public class MainClass 
	{
	    public static void main(String[] args)
	    {
	        //B b = new A();
	    	//C c = new A();
	    	C1 c = new C();
	         
	        System.out.println(c.methodC(2));
	    }
	}*/



