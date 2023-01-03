package day1;
class Data
{
	private String str;
	public Data(String str)//constructor
	{
		this.str=str;
	}

	public String getStr()//getter
	{
		return str;
	}

	@Override
	public String toString()//overrideing the internal string
	{
		return "Data [str=" + str + "]";
	}

	
}

public class Prog_Gen1 {

	public static void main(String[] args) 
	{
		Data obj=new Data("hello");
		String out =obj.getStr();
		System.out.println(out);
		

	}

}
