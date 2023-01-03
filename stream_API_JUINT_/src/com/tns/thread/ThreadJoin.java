package com.tns.thread;

public class ThreadJoin {
	public static void main(String[] args) {
	       // TODO Auto-generated method stub
	 //main thread
	  
	       Thread thread1 = new Thread(new myRunnable(), "First");
	       Thread thread2 = new Thread(new myRunnable(), "Second");
	       Thread thread3 = new Thread(new myRunnable(), "Third");
	       
	       thread1.start();
	       
	       //start second thread after waiting for 10 seconds or if it's dead
	       try {
	    	   
	           thread1.join(10000);
	       } catch (InterruptedException exp) {
	          System.err.println(exp.getMessage());
	       }
	       
	       thread2.start();
	       
	       //start third thread only when first thread is dead
	       try {
	           thread1.join();
	       } catch (InterruptedException exp) {
	           System.err.println(exp.getMessage());
	       }
	       
	       thread3.start();
	       
	       //let all threads finish execution before finishing main thread
	       try {
	           thread1.join();
	           thread2.join();
	           thread3.join();
	       } catch (InterruptedException exp) {
	           System.err.println(exp.getMessage());
	       }
	       
	       System.out.println("All threads are dead, exiting main thread");
	  
	  
	  
	   }
	 
	}


