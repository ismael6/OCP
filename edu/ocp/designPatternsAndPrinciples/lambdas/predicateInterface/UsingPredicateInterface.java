package edu.ocp.designPatternsAndPrinciples.lambdas.predicateInterface;

import java.util.function.Predicate;

/**
 * @author IsmaSp6
 *
 * The predicate functional interface takes one instance parameter <T> 
 * and returns a boolean
 *
 */
public class UsingPredicateInterface {
	public static void main(String[] args) {

		Predicate<Object> paramObject = 
				(Object a) -> {a.hashCode(); return false;};
		
//		if predicate raw type is missed, by default the parameter type is Object
//		Predicate paramDownCast = 
//				(Integer a) -> {a.intValue(); return false;}; // not compiles
		
		Predicate<Integer> paramInteger =
				(Integer a) -> {a.intValue(); return false;};
		
//		Parameter type should be exactly the same than predicate raw type
//		Predicate<Number> paramDownCast = 
//				(Integer a) -> {a.intValue(); return false;}; // not compiles
	}
}
