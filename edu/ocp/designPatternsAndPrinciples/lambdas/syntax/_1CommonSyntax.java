package edu.ocp.designPatternsAndPrinciples.lambdas.syntax;

import java.util.Random;
import java.util.function.Predicate;

/**
 * @author IsmaSp6
 *
 * Every lambda expression contains the next elements:
 * 	+ Parameters 
 * 	+ Arrow operator
 * 	+ Function body
 */
public class _1CommonSyntax {
	
	public static void main(String[] args) {

		Predicate functionalScope = 
				//functional syntax parameter -> functional syntax body
				parameter -> new Random().nextInt() > .5;
		
		Predicate<Integer> imperativeScope = 
				//imperative syntax parameter -> imperative syntax body
				(Integer parameter) -> 
					{
						int a = new Random().nextInt(); 
						return a > .5;
					};
									
		Predicate<Integer> mixedScopes = 
				//imperative syntax parameter -> functional syntax body
				(Integer parameter) -> new Random().nextInt() > .5;
		
//		careful with the variables on parameter list, they have scope too!
//		Predicate parameter = 
//				parameter -> {int parameter = 0; return false;}; // not compiles
				
		// Syntax rules allows empty parameters and empty body for lambdas 
		I i = ()->{};
		
//		"t" and "tt" are high order functions (lambda returning a lambda)
		T t = () -> () -> {};
		T tt = () -> i;
	}
}

interface I{
	void m1();
}

interface T {
	I m1();
}
