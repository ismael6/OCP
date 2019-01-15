package edu.ocp.genericsAndCollections.java8Topics.utilities.list;

import java.util.Arrays;
import java.util.List;

/**
 * @author IsmaSp6
 *
 * void replaceAll(UnaryOperator<E> o)
 * 
 **************************NOTE*******************************
 * unaryOperator -> takes a T parameter and returns a T value
 *************************************************************
 */
public class ReplaceAll {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		System.out.println(list);
		list.replaceAll(i -> i+1); // Applies function to all elements
		System.out.println(list);
	}
}
