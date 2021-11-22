package learn.streamapi.concept;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class demo {

	public static void main(String[] args) {

		int ar[]=new int[] {1,2,3,4};
		
		IntStream  stream = Arrays.stream(ar);
		//stream.forEach(i->System.out.println(i));
		
		OptionalInt result=stream.filter(e->e>=3).map(m->m*m).reduce((a,b)->a+b);

		System.out.print(result.getAsInt());
	}
}
