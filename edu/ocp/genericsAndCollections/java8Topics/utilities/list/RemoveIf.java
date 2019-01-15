package edu.ocp.genericsAndCollections.java8Topics.utilities.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author IsmaSp6
 * 
 * boolean removeIf(Predicate<? super E> filter)
 * 
 */
public class RemoveIf {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("AAA", "BBB"));
		System.out.println(list);
		list.removeIf(s -> s.isEmpty()); //takes a predicate and applies the comparison on every element on the list
		System.out.println(list);
	}
}
