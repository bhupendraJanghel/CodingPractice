package learn.Java8.feature;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*---------Functional Interface--------
 * 1. Predicate<T> 	- test()	 -- return Boolean result
 * 2. Consumer<T> 	- apply() 	 -- No result
 * 3. Function<T, R>- accept()	 -- Input and oputput
 * 4. Supplier<R> 	- get() 	 -- No input only supply
*/

//only BiPredicate, BiFuncition
//There are no TriPredicate or TriFunction or quad function Interface

class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class FunctionInterfaceTypeDemo {

	public static void main(String[] args) {

		// 1. Predicate - boolean result
		Predicate<String> checkLength = str -> str.length() > 5;

		System.out.println(checkLength.test("bhupendra")); // return true, if length is greater than 5

		// ----------------------------------------------------------------------------------------------

		// 2. Consumer - modifies the data - no output
		Person person = new Person();
		Consumer<Person> setName = t -> t.setName("Bhuppi");
		setName.accept(person);

		System.out.println(person.getName());

		// ----------------------------------------------------------------------------------------------

		// 3. Function -- both input and output
		Function<Integer, String> getInt = t -> t * 10 + "- data multiplied by 10"; // take input as integer and output
																					// as string

		System.out.println(getInt.apply(4));

		// ----------------------------------------------------------------------------------------------

		// 4. Supplier -- only output
		Supplier<Double> getRandomDouble = () -> Math.random();
		System.out.println(getRandomDouble.get());

		// --------------------------Bi-xyz functional interface------------------------------------------------------------------

		//Bipredicate 
		BiPredicate<Integer, Integer> checkSumOfTwo = (a, b) -> a + b > 5;
		System.out.println(checkSumOfTwo.test(4, 3));
		
		//Bifunction 
		BiFunction<Integer, Integer, Integer> multiply=(x,y) -> x*y;
		System.out.println(multiply.apply(4, 5));
	
		
		
		//---------------------------------Predicate Joning------------------------------------------------------------------------------------
		
		/* 
		 * 3 ways to join
		 *  > And
		 *  > Or
		 *  > Negate
		 *  
		 *  */
	
		Predicate<String> checkStrLength = (s)->s.length()>=5;
		Predicate<String> checkEvenLength = (s) -> s.length()%2 == 0;
		System.out.println(checkStrLength.and(checkEvenLength).test("Bhupendra"));
		System.out.println(checkStrLength.or(checkEvenLength).test("Bhupendra"));
		System.out.println(checkStrLength.negate().test("Bhupendra"));
		
		
		//---------------------------------Function Chaining------------------------------------------------------------------------------------
		
				/* 
				 * 2 ways to combine function
				 *  > f1.andThan(f2).apply(input)   -- first f1 than f2
				 *  > f1.compose(f2).apply(input)   -- first f2 than f1
				 *  
				 * ---Multiple funnction canbe chain together---
				 * 
				 * f1.andThan(f2).andThan(f3).....andThan(f4).apply(input) 
				 *  
				 *  */
		
		Function<Integer, Integer> doubleIt = i -> i*2;
		Function<Integer, Integer> cubeIt = i -> i*i*i;
		
		System.out.println(doubleIt.andThen(cubeIt).apply(4));
		System.out.println(doubleIt.compose(cubeIt).apply(4));
	}

	
}
