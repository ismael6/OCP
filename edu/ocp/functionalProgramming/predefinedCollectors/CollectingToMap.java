package edu.ocp.functionalProgramming.predefinedCollectors;

import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author IsmaSp6
 *
 */
public class CollectingToMap {
	public static void main(String[] args) {
		
		System.out.println(
			Stream
			.of("a", "bb", "cc", "dd")
			.collect(
				Collectors.toMap(	// {dd=2, cc=2, bb=2, a=1}
					Function.identity(), //key
					String::length))     //value
		);
		
//		System.out.println(
//			Stream
//			.of("a", "bb", "cc", "dd")
//			.collect(
//				Collectors.toMap(		// runtime exception (duplicate keys) 
//					String::length,			//key
//					Function.identity())) //value
//		);
		
		System.out.println(
			Stream
			.of("a", "bb", "cc", "dd")
			.collect(
				Collectors.toMap(		// {1=a, 2=bb, cc, dd}  
					String::length,			//key
					Function.identity(),	//value
					(a,b) -> a+", "+b))     //values behavior on repeated keys
		);

		System.out.println(
			Stream
			.of("a", "bb", "cc", "dd")
			.collect(
				Collectors.toMap(		// {1=a, 2=dd, cc, bb}
					(String s) -> s.length(),//key
					Function.identity(),	 //value
					(a,b) -> b+", "+a,		 //repeated key values behavior
					TreeMap::new)) 			 //collect on this mutable data structure
			.getClass() //TreeMap
		);		
	}
}
