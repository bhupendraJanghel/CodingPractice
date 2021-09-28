package learn.Java8.feature;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

	void apply();
	
	static void staticTest() {
		System.out.println("inside static method of interface");
	}
	
}


//funtional interface can have only 1 abstract method and multiple static and default method