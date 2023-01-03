package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> listOfVowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y');

		Function<Character, Boolean> isVowel = c -> listOfVowels.contains(c);
		System.out.println(isVowel.apply('a') + " " + 'a');
		System.out.println(isVowel.apply('b') + " " + 'b');

	}

}
