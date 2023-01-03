

import java.util.stream.Stream;

public class JavaStreamIterator {

	public static void main(String[] args) {
	Stream.iterate(1, ele->ele+1)
	.filter(ele->ele%2==0)
	.limit(5)
	.forEach(System.out::println);
	

	}

}
