package edu.ocp.functionalProgramming.functionalInterfaces.predicates;

import java.util.function.BiPredicate;

/**
 * @author IsmaSp6
 *
 * Parameterized types -> T, U
 * parameters -> T, U
 * returns -> boolean (IMPORTANT.- it returns the primitive)
 * method name -> test
 *
 */
public class BiPredicateImpl {
	public static void main(String[] args) {
		BiPredicate<String, String> p1 = String :: endsWith;
		BiPredicate<String, String> p2 = (s, t) -> s.endsWith(t);
		
		System.out.println(p1.test("string", "ing"));
		System.out.println(p1.test("string", "g"));
	}
}
