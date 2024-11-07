package com.java.practice.Array;

public class Output {

	
	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4, 5};
        for ( int i = 0; i < arr.length - 2; ++i)
        System.out.println(arr[i] + " ");
	
		
	   String c = "Hello i love java";
       boolean var;
       var = c.startsWith("Hello");
       //var = c.startsWith("hello");
       System.out.println(var);
		
		/*Integer i = new Integer(257);  
        byte x = i.byteValue();
        System.out.print(x);*/
		
		double x = 2.0;  
         double y = 3.0;
         double z = Math.pow( x, y );
         System.out.print(z);
     }
		// TODO Auto-generated method stub

	}


