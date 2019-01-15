package edu.ocp.genericsAndCollections.listsSetsMApsQueues.set.treeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * @author IsmaSp6
 * TreeSet implements NavigableSet interface providing useful methods:
 * 	E lower(E e) -> returns greatest element < e or null if no such element
 *  E floor(E e) -> returns greatest element <= e or null if no such element
 *  E higher(E e) -> returns smallest element > e or null if no such element
 *  E ceiling(E e) -> returns smallest element >= e or null if no such element
 * 
 */
public class NavigableSetImpl {
	public static void main(String[] args) {
		NavigableSet<Integer> treeSet = new TreeSet<>();
		for(int i = 1; i< 11; i++) {
			treeSet.add(i);
		}
		System.out.println(treeSet.lower(5)); //4 (immediate lower than 5, excluding 5)
		System.out.println(treeSet.floor(5)); //5 (immediate lower than 5, including 5)
		System.out.println(treeSet.ceiling(5)); //5 (immediate greatest than 5, including 5)
		System.out.println(treeSet.higher(5)); //6 (immediate greatest than 5, excluding 5)
		System.out.println(treeSet.higher(10)); // null, no such element higher than 10
	}
}
