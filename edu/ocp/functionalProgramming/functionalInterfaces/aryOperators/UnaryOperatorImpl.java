package edu.ocp.functionalProgramming.functionalInterfaces.aryOperators;

import java.util.function.UnaryOperator;

/**
 * @author IsmaSp6
 *
 * parameters -> T
 * returns -> T
 * method name -> apply
 * 
 * IMPORTANT.- this functional interface declares only one generic type
 *
 */
public class UnaryOperatorImpl {
	public static void main(String[] args) {
		UnaryOperator<String> u1 = String::toUpperCase;
		UnaryOperator<String> u2 = s -> s.toString();
		
		System.out.println(u1.apply("sda"));
	}
}
