package com.tns.thread;

public class myRunnable  implements Runnable {
	public void run()
	{
		System.out.println("thread started from::"+Thread.currentThread().getName());
		for(int i=0;i<5;i++)
		{
			System.out.println("the thread is"+i);
		}
		System.out.println("thread ended from::"+Thread.currentThread().getName());
		
	}

}
