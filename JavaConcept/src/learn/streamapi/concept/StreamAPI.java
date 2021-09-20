package learn.streamapi.concept;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {

		List<Integer> list = List.of(5, 6, 7, 7, 1, 2, 3, 4);
		System.out.println(list);

		// use of filter MEthod
		List<Integer> evenNumber = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println("even number : " + evenNumber);

		// use of map method
		List<Integer> square = list.stream().map(e -> e * e).collect(Collectors.toList());
		System.out.println("square: " + square);

		// use of min Method
		int min = list.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println("min:" + min);
		// use of min Method
		int max = list.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println("min:" + max);

		// use or sorted method
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List:" + sortedList);
	}

}
