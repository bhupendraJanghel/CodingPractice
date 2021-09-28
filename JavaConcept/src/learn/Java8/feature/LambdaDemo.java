package learn.Java8.feature;

import java.util.function.BiConsumer;

public class LambdaDemo {

	public static void main(String[] args) {
	
		//functional interface
		BiConsumer<Integer, Integer> biConsumer = (a,b)-> System.out.println(a+b);
		
		biConsumer.accept(5, 2);
	
	}

}
