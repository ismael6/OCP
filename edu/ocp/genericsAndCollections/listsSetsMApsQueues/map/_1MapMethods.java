package edu.ocp.genericsAndCollections.listsSetsMApsQueues.map;

import java.util.HashMap;
import java.util.Map;

public class _1MapMethods {
	
	public static void main(String[] args) {
		Map<Object, Object> hashMap = new HashMap<>();
		
		System.out.println(hashMap.put(2, "two")); // returns null if key pair is new
		System.out.println(hashMap.put(2, "dos")); // returns previous value if key existed
		System.out.println(hashMap.put(3, "three"));
		System.out.println(hashMap.size()); // 1
		
		System.out.println(hashMap.get(2)); // dos
		System.out.println(hashMap.get(30)); // return null if key not exists
		System.out.println(hashMap.keySet()); // returns the SET of keys
		System.out.println(hashMap.values()); // returns the Collection of values
		
		System.out.println(hashMap.containsKey(2)); // true
		System.out.println(hashMap.containsKey(30)); // false
		System.out.println(hashMap.containsValue("dos")); // true
		System.out.println(hashMap.containsValue(5)); // false
		
		System.out.println(hashMap.isEmpty()); // false
		System.out.println(hashMap.remove(3)); // remove by key
		System.out.println(hashMap);
		hashMap.clear(); // remove all
		System.out.println(hashMap);
	}
}
