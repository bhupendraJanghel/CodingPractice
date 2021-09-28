package learn.streamapi.concept;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

//The operations which return non-stream values like primitive or object or collection or return nothing are called terminal operation.

//E.g. : forEach(), toArray(), reduce(), collect(), min(), max(), count(), anyMatch(), allMatch(), noneMatch(), finndFirst(), findAny();

public class TerminalOperator {

	public static void main(String[] args) {

		/*
		 * reduce() : a stream reduces to single resultant value, for example, maximum,
		 * minimum, sum, product, etc. Reducing is the repeated process of combining all
		 * elements.
		 */

		List<String> words = Arrays.asList("GeeksforGeeks", "GFG", "Geeks", "for", "GeeksQuiz");

		List<Integer> numbers = Arrays.asList(-2, 0, 4, 6, 8);

		Optional<String> longestWord = words.stream().reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2);

		Optional<String> stringCombine = words.stream().reduce((w1, w2) -> w1 + "-" + w2);

		int sumOfNumbers = numbers.stream().reduce(0, (x, y) -> x + y); // or numbers.stream().reduce(0,Integer::sum);

		int product = IntStream.range(2, 8).reduce((x, y) -> x * y).orElse(-1);

		longestWord.ifPresent(System.out::println);
		stringCombine.ifPresent(System.out::println);
		System.out.println(sumOfNumbers);
		System.out.println(product);

	}

}
