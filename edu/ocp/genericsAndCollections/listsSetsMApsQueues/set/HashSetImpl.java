package edu.ocp.genericsAndCollections.listsSetsMApsQueues.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author IsmaSp6
 *
 * Stores elements in a hash table
 * read and write -> O(1)
 * Unordered elements
 * 
 * When to use: handle unique and unordered elements
 */
public class HashSetImpl {
	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<>();
		System.out.println(hashSet.add(66));
		System.out.println(hashSet.add(10));
		System.out.println(hashSet.add(66)); // false, Set not allows duplicates
		System.out.println(hashSet.add(8));
		for(Integer i : hashSet) {
			System.out.println(i); // output order 1
		}
	}
}
