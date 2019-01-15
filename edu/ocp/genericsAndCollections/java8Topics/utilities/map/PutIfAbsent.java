package edu.ocp.genericsAndCollections.java8Topics.utilities.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author IsmaSp6
 *
 * If key don´t exists -> inserts
 * If key exists and value null -> updates value
 * otherwise -> ignores statement
 */
public class PutIfAbsent {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("1", "uno");
		map.put("2", null);
		System.out.println(map);
		
		map.putIfAbsent("1", "put");
		map.putIfAbsent("2", "put");
		map.putIfAbsent("3", "put");
		System.out.println(map);
	}
}
