package com.java.practice.question;

public interface Test {
	void mul();
	void add();
	
}
class Testclass implements Test {
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


}

