package edu.ocp.genericsAndCollections.listsSetsMApsQueues.map;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author IsmaSp6
 *
 * Stores keys in a SORTED tree structure
 * 
 * Advantage: Elements SORTED
 * Disadvantage: read / write -> O(log n)
 * 
 * When to use: handle and looking up by key and sorted elements
 */
public class TreeMapImpl {
	Map<Object, Object> treeMap = new TreeMap<>();
}
