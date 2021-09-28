package learn.streamapi.concept;

import java.util.List;

public class StreamOperation {

	public static void main(String[] args) {

		List<String> names = List.of("Amitabh", "Shekhar", "Aman", "Rahul", "Shahrukh", "Salman", "Yana", "Lokesh");
		
		//filter the list whose name start with A
		System.out.println("Name Starts with 'A':");
		names.stream().filter((p) -> p.startsWith("A")).forEach(System.out::println);

		
		//map the list with uppercase
		System.out.println("\nName in upperCase");
		//names.stream().map(String::toUpperCase).forEach(System.out::println);				//map
		
		names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);    // sorted
	
		
		//using anyMatch, noneMatch, allMatch
		
		boolean allMatched = names.stream().allMatch(p->p.startsWith("A"));           
		boolean anyMatched = names.stream().anyMatch(p->p.startsWith("A"));
		boolean noneMatched = names.stream().noneMatch(p->p.startsWith("A"));
		
		System.out.println("\n"+ allMatched+" "+anyMatched+" "+noneMatched);
		
		System.out.println(names.stream().findFirst().orElse(null));     //findFirst
		}

}
