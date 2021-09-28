package learn.streamapi.concept;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollector {

	public static void main(String[] args) {

		Stream<Integer> list = Stream.generate(() -> (new Random()).nextInt(100)).limit(20);

		// System.out.println(list.collect(Collectors.toList()));

		// List<Integer> evenNumber= list.filter(e->e%2==0).collect(Collectors.toList());

		Integer[] evenNumber = list.filter(e -> e % 2 == 0).toArray(Integer[]::new);
		System.out.println(evenNumber);
	
	}

}
