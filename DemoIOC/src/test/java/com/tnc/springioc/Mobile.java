package com.tnc.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		/*Airtel a=new Airtel();
		a.calling();
		a.data();

		Jio b=new Jio();
		b.calling();
		b.data();*/
		
		
		
		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");//loose cupling
		System.out.println("config loaded");
		/*
		Jio a=(Jio) con.getBean("jio");
		a.calling();
		a.data();*/
		
		Sim s=con.getBean("sim",Sim.class);
		s.calling();
		s.data();
	}

}
