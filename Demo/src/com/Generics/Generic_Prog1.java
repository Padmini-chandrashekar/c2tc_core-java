package com.Generics;
class data
{
	private Object str;

	public data(Object str) {
			this.str = str;
		}

	public Object getStr() {
		return str;
	}

	@Override
	public String toString() {
		return "data [str=" + str + "]";
	}
	
	
}

public class Generic_Prog1 {

	public static void main(String[] args) {
		data d=new data("hello all");// data d=new data(10);//it doesnot show compile time error so we need generics
	    String msg=(String)d.getStr();// your object should be type casted to string
	    System.out.println(msg);
	}

}
