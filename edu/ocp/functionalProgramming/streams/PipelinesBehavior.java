package edu.ocp.functionalProgramming.streams;

import java.util.stream.Stream;

/**
 * @author IsmaSp6
 *
 *	
 */
public class PipelinesBehavior {
	public static void main(String[] args) {
		
//		Stream.generate(() -> "a")
//			.filter(s -> s.length() > -0) // never ends, keeps filtering elements forever
//			.sorted() // sorted awaits until filter ends
//			.limit(2)
//			.forEach(System.out :: print);
		
		Stream.generate(() -> "a")
			.filter(s -> s.length() > 0) 
			.limit(2) // limit interrupts previous operations when it counts two elements, so next operation starts working
			.sorted()
			.forEach(System.out :: print);
		
		System.out.println();

//		Stream.generate(() -> "a")
//			.filter(s -> s.length() > 1) 
//			.limit(2) // never ends, as limit never counts two elements
//			.sorted()
//			.forEach(System.out :: print);

		Stream.iterate(1, n -> n+1)
			.limit(4)
			.peek(System.out :: print)   	//1234
			.filter(n -> n%2 == 0)
			.forEach(System.out :: print);  // 2 4
		
		System.out.println();
		
		Stream.iterate(1, n -> n+1)
			.filter(n -> n%2 == 0)
			.limit(4)
			.forEach(System.out :: print); //2468
		
		System.out.println();
		
		Stream.iterate(1, n -> n+1)
			.filter(n -> n%2 == 0)
			.peek(System.out :: print) 		//2468
			.limit(4)
			.forEach(System.out :: print); 	//2468
	}
}
