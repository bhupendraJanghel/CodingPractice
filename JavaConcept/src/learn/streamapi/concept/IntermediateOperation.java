package learn.streamapi.concept;

import java.util.List;

//Operation which returns another stream  as a result are called Intermediat operations.

//E.g : filter(), map(), distinct(), sorted(), limit(), skip(), peek()

public class IntermediateOperation {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
		
		list.stream().filter(i -> i%2==0).peek(System.out::println).map(x -> x*x).count();  //  peek exists mainly to support debugging	
		
		
		// limit() -  It returns the stream not longer than the requested size. Also, parameter can not be negative
		
		System.out.print("Limited list : ");
		list.stream().limit(5).forEach(System.out::print);
		
		//skip() - It discards the first n element of the stream. Parameter can not be negative
		
		System.out.print("\nSkip the list : ");
		list.stream().skip(5).forEach(System.out::print);
		
		System.out.println("\nSorted List : ");
		list.stream().sorted((x,y)-> y.compareTo(x)).forEach(System.out::print);
	}

}
