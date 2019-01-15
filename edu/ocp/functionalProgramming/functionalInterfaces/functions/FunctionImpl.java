package edu.ocp.functionalProgramming.functionalInterfaces.functions;

import java.util.function.Function;

/**
 * @author IsmaSp6
 *
 * parameters -> T
 * returns -> R
 * method name -> apply
 *
 */
public class FunctionImpl {
	public static void main(String[] args) {
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = s -> s.length();
		
		System.out.println(f1.apply("size"));
	}
}
