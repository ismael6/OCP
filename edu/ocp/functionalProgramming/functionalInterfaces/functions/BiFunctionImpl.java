package edu.ocp.functionalProgramming.functionalInterfaces.functions;

import java.util.function.BiFunction;

/**
 * @author IsmaSp6
 *
 * parameters -> T, U
 * returns -> R
 * method name -> apply
 *
 */
public class BiFunctionImpl {
	public static void main(String[] args) {
		BiFunction<String, String, Boolean> f1 = String::endsWith;
		BiFunction<String, String, Boolean> f2 = (s, ends) -> s.endsWith(ends);
		
		System.out.println(f1.apply("string", "ng"));
	}
}
