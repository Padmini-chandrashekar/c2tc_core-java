package com.tns.thread;

public class ProgramHello {

	public static void main(String[] args) {
		 HelloThread h1=new HelloThread();
		Thread t1=new Thread(new myRunnable());
		t1.start();
		myRunnable th1=new myRunnable();
		th1.run();
		
			

	}

}
