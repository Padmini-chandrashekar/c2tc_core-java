


import java.util.Arrays;
import java.util.List;

public class Mapping {

	public static void main(String[] args) {
		List<String> list=Arrays.asList(new String[] {"Apple","Mango","banana","grapes"});
		list.stream().map(String::length).forEach(System.out::println);
	}

}
