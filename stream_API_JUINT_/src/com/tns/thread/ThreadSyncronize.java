package com.tns.thread;

class Table
{
    synchronized static public void printvalue(int n)
    {
    for(int i=0;i<n;i++)
    System.out.println(n);
   		 
	}
}
class Mythread extends Thread
{
    Table t;
    public Mythread(Table t)
    {
   	 this.t = t;
    }
    public void run()
    {
    t.printvalue(3);
    }
}
class Mythread1 extends Thread
{
    Table t1;
    public Mythread1(Table t1)
    {
   	 this.t1 = t1;
    }
    public void run()
    {
    t1.printvalue(4);
    }
}

public class ThreadSyncronize{
public static void main(String[] args) {
    Table t1=new Table();
    Mythread th1=new Mythread(t1);
    Table t2=new Table();
    Mythread1 th2=new Mythread1(t2);
    th1.start();
    th2.start();
}
}
