package edu.ocp.functionalProgramming.functionalInterfaces.predicates;

import java.util.function.Predicate;

/**
 * @author IsmaSp6
 *
 * parameters -> T
 * returns -> boolean (IMPORTANT.- it returns the primitive)
 * method name -> test
 *
 */
public class PredicateImpl {
	public static void main(String[] args) {
		Predicate<String> p1 = String :: isEmpty;
		Predicate<String> p2 = s -> s.isEmpty();
		
		System.out.println(p1.test("p1"));
		System.out.println(p2.test("p2"));
	}
}
