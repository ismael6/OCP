package edu.ocp.genericsAndCollections.listsSetsMApsQueues.set.treeSet;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author IsmaSp6
 *
 * ************************NOTE*******************************
 *  Ordered ->  ordered by index of data structure
 *  Sorted -> ordered by element property
 * ***********************************************************
 * 
 * Elements SORTED in a tree structure
 * read and write -> O(log n)
 * 
 * When to use: handle unique and sorted elements
 */
public class TreeSetImpl {
	public static void main(String[] args) {
		Set<Integer> treeSet = new TreeSet<>();
		System.out.println(treeSet.add(66));
		System.out.println(treeSet.add(10));
		System.out.println(treeSet.add(66)); // false, Set not allows duplicates
		System.out.println(treeSet.add(8));
		for(Integer i : treeSet) {
			System.out.println(i); // printed in their natural order (sorted)
		}
	}
}
