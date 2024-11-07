package com.java.practice.question;


/*public class Quiz {

	public static void main(String[] args) {
		/*int a= 64;
		float b = 97.0f;
		char c = 'a';
		System.out.println((a==b)+""+(b==c));*/
	/*	String a = "hello";
		String b = "world";
		String c = "java";
		System.out.println(c=b=a);
		
		
		// TODO Auto-generated method stub

	}

}*/
public class T1 implements Test {
    @Override
    public void mul() {
        //// Implementation of mul method
        System.out.println("Multiplication method");
    }

    @Override
    public void add() {
        // Implementation of add method
        System.out.println("Addition method");
    }

    public static void main(String[] args) {
        T1 test = new T1();
        test.mul();
        test.add();
    }
