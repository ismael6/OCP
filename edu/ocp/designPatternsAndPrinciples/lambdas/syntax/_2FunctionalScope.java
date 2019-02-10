package edu.ocp.designPatternsAndPrinciples.lambdas.syntax;

import java.util.Random;
import java.util.function.Predicate;

/**
 * @author IsmaSp6
 *
 * The functional scope syntax is the simplest:
 * 
 * For parameters part rules.- 
 *		1.- Identifiers WITHOUT type (binding variable [https://en.wikipedia.org/wiki/Lambda_calculus_definition#Free_and_bound_variable])
 *		2.- Parentheses are optional if there is a single parameter
 *		3.- Parentheses are mandatory if there is zero or more than one parameter
 *		
 *	For function body part.- 
 *		1.- A single and only one EXPRESSION without the "return" reserved word
 *
 */
class _2FunctionalScope {
	public static void main(String[] args) {
		Predicate<Boolean> p = 
//				single and only one identifier -> single and only one statement
				parameter -> parameter;
				
//				System.out.println(p.test(5));
	}
}
