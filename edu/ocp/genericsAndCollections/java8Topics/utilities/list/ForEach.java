package edu.ocp.genericsAndCollections.java8Topics.utilities.list;

import java.util.Arrays;
import java.util.List;

/**
 * @author IsmaSp6
 * 
 * void forEach(Consumer<? super E> action)
 * 
 **************************NOTE*******************************
 * consumer -> takes a T parameter and returns void
 *************************************************************

 */
public class ForEach {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		list.forEach(System.out :: println);
	}
}
