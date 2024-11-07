package com.java.practice.Threads;

public class NewThread extends Thread {
	Thread t;
   String name;
   public NewThread(String threadname)
   {
	   name=threadname;
	   t=new Thread(this.name);
	   t.start();
   }
   public void run() {
	   
   }
	public static void main(String[] args) {
		NewThread obj1 = new NewThread("one");
		NewThread obj2 = new NewThread("two");
		try
		{
			Thread.sleep(1000);
			System.out.println(obj1.t.isAlive());
		}
		catch(InterruptedException e){
			System.out.println("main thread Interrupted")
			
		}
		// TODO Auto-generated method stub

	}

}
