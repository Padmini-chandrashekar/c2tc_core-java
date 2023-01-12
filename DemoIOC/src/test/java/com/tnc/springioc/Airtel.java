package com.tnc.springioc;

public class Airtel implements Sim {

	public Airtel()
	{
		System.out.println(" calling from airtel constructor");
	}
	public void calling() {
		System.out.println(" calling using airtel sim");
		
	}

	public void data() {
		System.out.println(" data using airtel sim");
	}

}
