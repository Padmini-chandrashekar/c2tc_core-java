package com.Generics;
/*class data
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
	
	
}*/
class data_gen<T>//diamond operator to create template
{
	private T obj;//pass the object of data class to generic class to create a link

	public data_gen(T obj) {
			this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "data1 [obj=" + obj + "]";
	}
	
	
}

public class Generic_Prog2 {

	public static void main(String[] args) {
		data_gen<String> d1=new data_gen<String>("hello");//change string to double all the places u need to change also show compile time error
		String out=d1.getObj();
		System.out.println(out);
		
		
	}

}
