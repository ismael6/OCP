package edu.ocp.functionalProgramming.functionalInterfaces;

import java.util.function.BiFunction;

/**
 * @author IsmaSp6
 *
 */
public class FunctionalInterfacesWithoutGenerics {
	
	public static void main(String[] args) {
		
		BiFunction f1 = (s, t) -> new Object(); //omitting all parameterized types is allowed but takes Object by default
		
//		BiFunction<String> f2 = (s, ends) -> s.endsWith(ends); //omitting some parameterized types not compiles
	}
}
