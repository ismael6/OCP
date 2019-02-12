package edu.ocp.concurrency.collections.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;	

/**
 * @author IsmaSp6
 *
 * MemoryConsistencyError -> two or more 'agents' have (different) views of the same data
 */
public class MemoryConsistencyError {
	public static void main(String[] args) {

//		runtime exception (MemoryConsistencyError)
//		Map<Integer,Integer> map = new HashMap<>();
//		map.put(1, 2);
//		map.put(3, 4);
//		for(Integer key : map.keySet()) { //MemoryConsistencyError (https://docs.oracle.com/javase/7/docs/api/java/util/ConcurrentModificationException.html) 
//			map.remove(key);   			  //cannot delete while iterating this Map element (keySet() iterator have a different view of data existence)
//		}
		
//		solved using concurrent hashmap
		Map<Integer,Integer> concurrentMap = new ConcurrentHashMap<>();
		concurrentMap.put(1, 2);
		concurrentMap.put(3, 4);
		for(Integer key : concurrentMap.keySet()) {  
			concurrentMap.remove(key);   			 // OK, ConcurrentHashMap updates the keySet() iterator on each remove
		}
		
		System.out.println("finished");
	}
	
	public static void deleteElements(Map<Integer,Integer> map) {
		System.out.println("deleted");
	}
}
