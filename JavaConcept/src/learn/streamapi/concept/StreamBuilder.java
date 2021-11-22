package learn.streamapi.concept;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBuilder {
	
	public static void main(String arg[]) {
		
		//create a stream of of integers
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,6);      //using of(), we can create any group as stream
		stream.forEach(e->System.out.print(e+","));
		
		//generate random numbers using generate()
		Stream<Integer> randomNumeber= Stream.generate(()->(new Random()).nextInt(10));
		System.out.println("\nRandom no.");
		randomNumeber.limit(20).forEach(e->System.out.print(e+","));
		
		
		IntStream intStream = "12345_abcdefg".chars();
		intStream.forEach(e->System.out.println(e));
		
		Stream<String> streams = Stream.of("A$B$C".split("\\$"));
        streams.forEach(p -> System.out.println(p));
        
        int ar[]=new int[] {1,2,3};
       IntStream arr= Arrays.stream(ar);
       
	}

}
