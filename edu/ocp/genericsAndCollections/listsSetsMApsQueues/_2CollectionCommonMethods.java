package edu.ocp.genericsAndCollections.listsSetsMApsQueues;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author IsmaSp6
 *
 */
public class _2CollectionCommonMethods {
	public static void main(String[] args) {
		Collection<Object> list = new ArrayList<>();

//		boolean add(E)
		System.out.println(list.add(new Object())); // on list always return true
//		boolean remove(E)
		System.out.println(list.remove(new Object())); 
//		clear()
		list.clear(); // discard all elements in collection
//		boolean contains(E)
		System.out.println(list.contains(new Object())); // checks if the elements exists in the collection (compares with equals method)
//		boolean isEmpty()
		System.out.println(list.isEmpty()); // returns true/false
//		size()
		System.out.println(list.size()); //number of elements in the collection
	}
}
