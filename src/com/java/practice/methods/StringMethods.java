package com.java.practice.methods;

public class StringMethods {

	public static void main(String[] args) {
		
		    
		        // Creating a string
		        String str = "Hello, World!";

		        // Length of the string
		        int length = str.length();
		        System.out.println("Length of the string: " + length);

		        // Character at a specific index
		        char charAt = str.charAt(7);
		        System.out.println("Character at index 7: " + charAt);

		        // Substring
		        String substring = str.substring(7, 12);
		        System.out.println("Substring from index 7 to 12: " + substring);

		        // String concatenation
		        String concatenatedString = str.concat(" Welcome to Java.");
		        System.out.println("Concatenated string: " + concatenatedString);

		        // Checking if string contains a substring
		        boolean contains = str.contains("World");
		        System.out.println("Contains 'World': " + contains);

		        // Replacing characters
		        String replacedString = str.replace("World", "Java");
		        System.out.println("Replaced string: " + replacedString);

		        // Converting to upper case
		        String upperCaseString = str.toUpperCase();
		        System.out.println("Upper case string: " + upperCaseString);

		        // Converting to lower case
		        String lowerCaseString = str.toLowerCase();
		        System.out.println("Lower case string: " + lowerCaseString);

		        // Trimming white spaces
		        String strWithSpaces = "   Hello, World!   ";
		        String trimmedString = strWithSpaces.trim();
		        System.out.println("Trimmed string: '" + trimmedString + "'");

		        // Splitting a string
		        String[] splitString = str.split(", ");
		        System.out.println("Split string:");
		        for (String s : splitString) {
		            System.out.println(s);
		        }
		    }
		
		// TODO Auto-generated method stub

	}


