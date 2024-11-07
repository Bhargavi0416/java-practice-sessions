package com.java.practice.ExceptionHandling;

public class ExceptionHandlingSample {

	public static void main(String[] args) {
		
		
		try { //try block will followed by catch block and finally block if there is no catch block also the program will run by finally block
		System.out.println("exception handling"); //we use  multiple catch blocks also if needed
		String s = "Exception";
		int x = 1/0;
		System.out.println("program completed");
		
			
		}
		catch(Exception ex){ //catch block will handle all type of exceptions 
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		finally{  // these finally block will excuted complusory after the catch when there is also an  exception occured in catch block
			System.out.println("finally block");
			
		}
			
		}

	}


