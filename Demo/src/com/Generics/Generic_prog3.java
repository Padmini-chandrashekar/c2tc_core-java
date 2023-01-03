package com.Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Info<T>
{
	T msg;

	public Info(T msg) {
		this.msg = msg;
	}

	public T getMsg() {
		return msg;
	}

	@Override
	public String toString() {
		return "Info [msg=" + msg + "]";
	}
	
	
}
public class Generic_prog3 {

	public static void main(String[] args) {
		/*
		List<Info<Object>> l1=new LinkedList<>();
		l1.add(new Info<Object>("hello") );
		l1.add(new Info<Object>(10) );
		l1.add(new Info<Object>('r') );
		System.out.println(l1);
	*/
		
	}

}
