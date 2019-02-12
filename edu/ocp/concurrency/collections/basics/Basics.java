package edu.ocp.concurrency.collections.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author IsmaSp6
 *
 */
public class Basics {

	static void standardCollection() {
		Map<Integer, Integer> standardMap = new HashMap<>();
		synchronized(Basics.class) { // synchronized block needed to avoid race conditions
			standardMap.put(1, 2);
			standardMap.get(1);
		}
	}
	
	static void synchronizedCollection() {
		Map<Integer, Integer> concurrentMap = new ConcurrentHashMap<>(); // ConcurrentHashMap implements Map 
		concurrentMap.put(1, 2); // No synchronized block needed
		concurrentMap.get(1);
	}
}
