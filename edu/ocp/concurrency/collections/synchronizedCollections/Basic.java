package edu.ocp.concurrency.collections.synchronizedCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author IsmaSp6
 * 
 * wrappers that adds synchronize blocks on all of his operations EXCEPT FOR ITERATORS
 * be careful, this wrappers keeps throwing the ConcurrentModificationException
 *
 */
public class Basic {
	public static void main(String[] args) {
		
		Collection collections = Collections.synchronizedCollection(new ArrayList<>());
		
		List<Integer> synchronizedList = Collections.synchronizedList(Arrays.asList(1,2,3));
		
		Map<Integer,Integer> synchronizedMap = Collections.synchronizedMap(new HashMap<>());
//		SortedMap<Integer,Integer> sortedMap = Collections.synchronizedSortedMap(null);
		NavigableMap<Integer, Integer> navigableMap = Collections.synchronizedNavigableMap(new TreeMap<>());

		NavigableSet<Integer> navigableSet = Collections.synchronizedNavigableSet(new TreeSet<>());
		Set<Integer> set = Collections.synchronizedSet(new TreeSet<>());
//		SortedSet<Integer> sortedSet = Collections.synchronizedSortedSet(null);
		
		
//		synchronized block still required on synchronized collections!!! 
		synchronized (synchronizedList) {
			for(Integer i : synchronizedList) {
				System.out.println(i);
			}
		}
		
		
		synchronizedMap.put(1, 2);
		synchronizedMap.put(4, 4);
		for(Integer i : synchronizedMap.keySet()) {
			synchronizedMap.remove(1); // ConcurrentModificationException (https://docs.oracle.com/javase/7/docs/api/java/util/ConcurrentModificationException.html)
		}
		
	}
}
