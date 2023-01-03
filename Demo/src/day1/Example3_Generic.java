package day1;

class Data_Generics<T>
{
	private T obj;//connect template eith calss object
 	public Data_Generics(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	//@Override
	//public String toString() {
	//	return "Data_Generics [str=" + str + "]";
	//}
	
	
}

public class Example3_Generic {

	public static void main(String[] args) 
	{
		data_prog2 obj=new data_prog2(1);
		String out =(String)obj.getStr();
		System.out.println(out);
		

	}

}
