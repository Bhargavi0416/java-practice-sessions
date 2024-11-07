
package com.java.practice.functions;
//write a program to print addition of two numbers using Method
public class Method1 {

	
	public static void main(String[] args) { 
		//int a = 5; 
		// b = 9;
		float num1 = 0.5f;
		float num2 = 0.5f;
		float sum = add(num1,num2);
		   System.out.println(sum);
		//int c = add(a,b);//The method ;add(int, int) is undefined for the type Method
		 // System.out.println(c) ;
		
		// TODO Auto-generated method stub

	}
	
	//public static int add (int a, int b) {
         //Multiple markers at this line
//return(a+b); 
   public static float add (float num1,float num2) {
return(num1+num2);   
	                               //	- Illegal modifier for parameter add; only final is permitted
   }
            //- Syntax error, insert "RecordBody" to complete RecordDeclaration
         //- Syntax error on token " int", record expecte

}

//}
