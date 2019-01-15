package edu.ocp.functionalProgramming.optional;

import java.util.Optional;

/**
 * @author IsmaSp6
 *
 */
public class OptionalImpl {
	public static void main(String[] args) {
//		System.out.println(Optional.of(null)); //throws null pointer exception
		System.out.println(Optional.ofNullable(null));
		
		System.out.println(sum()); //Optional as itself
		System.out.println(sum(1,2)); //Optional as itself

		//	Optional methods
		System.out.println(sum().isPresent()); // false (Optional is empty)
//		System.out.println(sum().get()); // throws NoSuchElementException if Optional.isPresent = false
		System.out.println(sum(1,2).get()); //obtains value contained by the Optional
		sum().ifPresent(System.out :: println); // only calls consumer when Optional.isPresent = true
		
		System.out.println(sum(2).orElse(5)); //2
		System.out.println(sum().orElse(5)); //5
		
		System.out.println(sum().orElseGet(() -> 8)); // only calls Supplier when Optional.isPresent = false (Supplier should return same type of optional element)
		
		System.out.println(sum().orElseThrow(() -> new RuntimeException())); // only calls Supplier when Optional.isPresent = false
	}
	
	static Optional<Integer> sum(Integer... integers){
		if(integers.length == 0) {
			return Optional.empty();
		}
		int sum = 0;
		for(int i : integers) {
			sum = sum + i;
		}
		return Optional.of(sum);
	}
}
