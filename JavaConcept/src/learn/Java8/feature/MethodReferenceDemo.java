package learn.Java8.feature;

class Test {
	public static void testFun() {
		System.out.println("this is testFun() method from Test Class");
	}
}

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		FunctionalInterfaceDemo functioDemo = Test::testFun;		//this is example of method reference into functional interface

		
		//if there is no test class than use following for lambda expression
		//FunctionalInterfaceDemo functioDemo = () -> System.out.println("hello, this is method");
		
		
		functioDemo.apply();

	}

}


//when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference.
//Method reference is a replacement of lambda expressions.It is used to refer method of functional interface to an existing method