package edu.ocp.functionalProgramming.functionalInterfaces.aryOperators;

import java.util.function.BinaryOperator;

/**
 * @author IsmaSp6
 *
 * Parameterized types -> T
 * parameters -> T, T
 * returns -> T
 * method name -> apply
 * 
 * IMPORTANT.- this functional interface declares only one generic type
 *
 */
public class BinaryOperatorImpl {
	public static void main(String[] args) {
		BinaryOperator<String> b1 = String::concat;
		BinaryOperator<String> b2 = (s,t) -> s.concat(t);
		
		System.out.println(b1.apply("sda", "gf"));
	}

}
