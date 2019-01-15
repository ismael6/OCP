package edu.ocp.genericsAndCollections.bounds;

import java.util.ArrayList;
import java.util.List;

/**
 * @author IsmaSp6
 * 
 * <?> -> Unbounded wildcard (any element generic type allowed)
 *
 */
public class _1UnboundedWildcard {
	
//	Accepts any generic type list
	static void listUnbounded(List<?> unboundedWildcard) {
		for(Object o : unboundedWildcard) {System.out.println(o);}
		unboundedWildcard.remove(0); // Ok, can delete
//		unboundedWildcard.add(new Object()); //not compiles, cannot add elements 
											// (type safety, compiler doesnt know wich generic type is on the actual list)
	}

	public static void main(String[] args) {
		List<Number> numbers = new ArrayList<>();
		List<Integer> integers = new ArrayList<>();
		listUnbounded(numbers);
		listUnbounded(integers);

//		List<Object> list = new ArrayList<String>(); // not compiles, element generic types mismatch
		List<?> list1 = new ArrayList<String>(); // works fine (unbounded wildCard allow any element generic type)
	}
}
