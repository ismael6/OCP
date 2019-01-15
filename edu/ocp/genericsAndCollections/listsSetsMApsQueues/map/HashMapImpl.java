package edu.ocp.genericsAndCollections.listsSetsMApsQueues.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author IsmaSp6
 *
 * Stores the keys in a hash table using hashcode of the keys
 * 
 * Advantage: read / write -> O(1)
 * Disadvantage: elements unordered
 * 
 * When to use: handle and looking up by key and unordered elements
 */
public class HashMapImpl {
	Map<Object, Object> hashMap = new HashMap<>();
}
