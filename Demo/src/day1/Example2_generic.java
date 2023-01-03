package day1;
class data_prog2
{
	private Object str;
	public data_prog2(int i)//constructor
	{
		this.str=i;
	}

	public Object getStr()//getter
	{
		return str;
	}

	@Override
	public String toString()//overrideing the internal string
	{
		return "Data [str=" + str + "]";
	}

	
}

public class Example2_generic {

	public static void main(String[] args) 
	{
		data_prog2 obj=new data_prog2(1);
		String out =(String)obj.getStr();
		System.out.println(out);
		

	}

}
