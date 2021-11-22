package learn.Java8.feature;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class TestDemo implements FunctionalInterfaceDemo {

	public static void main(String[] args) {
	
		
		
		BiPredicate<String,Integer> checkLength = (str,i)->str.length()>5 && i==8;
		
		System.out.println(checkLength.test("bhupendra",9));
		
		
		
	}

	@Override
	public void apply() {
	
		System.out.println("hllel,lsdf");
	}

}
