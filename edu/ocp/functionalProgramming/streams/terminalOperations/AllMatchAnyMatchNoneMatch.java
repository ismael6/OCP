package edu.ocp.functionalProgramming.streams.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author IsmaSp6
 * 
 * NOTE.- if condition not satisfied on any moment, 
 * 			immediately circuit breaks evaluation and returns corresponding result
 * 
 * checks:
 * 	+allMatch -> if all elements match with predicate
 *  +anyMatch -> if some element match with predicate
 *  +noneMatch -> if no one element match with predicate
 * 
 * parameters -> Predicate<? super T>
 * 
 * returns boolean
 * 
 * on infinite stream -> may terminate and may not (depending data)
 * 
 */
public class AllMatchAnyMatchNoneMatch {
	public static void main(String[] args) {
		Predicate<String> predicateSize1 = s -> s.length() == 1;

//		finite streams
		List<String> list = Arrays.asList("11","12","3");
		System.out.println(list.stream().allMatch(predicateSize1)); //false
		System.out.println(list.stream().anyMatch(predicateSize1)); //true
		System.out.println(list.stream().noneMatch(predicateSize1)); //false
		
//		infinite streams
		System.out.println(Stream.generate(() -> "sdf").allMatch(predicateSize1)); //false(first element evaluated not match, then circuit breaker applies)
		System.out.println(Stream.generate(() -> "sdf").anyMatch(predicateSize1)); //keeps working (until circuit breaker)
		System.out.println(Stream.generate(() -> "sdf").noneMatch(predicateSize1));//keeps working (until circuit breaker)
	}
}
