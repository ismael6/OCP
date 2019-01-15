package edu.ocp.genericsAndCollections.java8Topics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author IsmaSp6
 * 
 * Returns the specified method on deferred execution as a Functional interface
 * 
 * Methods deferred can be static, instance or constructors
 * 
 * Syntax.-  Type :: method
 * 
 */
public class MethodReferences {
	public static void main(String[] args) {

	// static method reference
		// The Collections.sort method is overloaded, the correct method is chosen by context (Consumer signature uses one parameter)
		Consumer<List<Integer>> staticMethodReference = Collections :: sort;
		Consumer<List<Integer>> consumerLambda = l -> Collections.sort(l);

	//	BiPredicate<String, String> typeMethodReference = String::isEmpty; // NOT COMPILES!! number of parameterized type must exactly match instance + number of arguments
																			// (Parameterized types = 2 VS instance + method arguments = 1)
		
	// On instance method references, the instance itself can be used as part of the functional interface parameterized elements
	// So carefully match parameterized types on functional interface with instance + argument valuess		
		Predicate<String> methodReference = String :: isEmpty; //the only one parameterized value is used for the instance
		

	// instance access (functional interface have 1 parameterized type while method have one argument (instance + argument = 2 parameterized types needed))
		String str = "b";
		Predicate<String> instanceMethodReference = str::startsWith; 
		// Predicate<String> instanceMethodReferenceFails = String::startsWith; // not compiles, predicate have 1 parameterize type and method call 1 argument + the instance needed
		Predicate<String> predicateLambda = s -> s.startsWith("");
		
	
	// type access (functional interface uses two parameterized types (one is used for instance and one is used for method argument))
		String strB = "b";
		BiPredicate<String, String> typeMethodReference = String::startsWith; // uses type access
		BiPredicate<String, String> typepredicateLambda = (s,t) -> s.startsWith(t);


	// Constructor reference
		// 'new' refers to constructors, constructor returns its class type
		Supplier<ArrayList<Integer>> supplierMethodReference = ArrayList::new;
		Supplier<ArrayList<Integer>> supplierLambda = () -> new ArrayList();
	}
}
