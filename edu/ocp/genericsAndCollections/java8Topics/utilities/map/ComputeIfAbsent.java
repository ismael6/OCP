package edu.ocp.genericsAndCollections.java8Topics.utilities.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @author IsmaSp6
 *
 * If the key don`t exists, sets the Function return to the corresponding value with the specified key
 */
public class ComputeIfAbsent {
	public static void main(String[] args) {

		Function<String, Integer> function = k -> 10;
		
		Function<String, Integer> nullFunction = k -> null;
		
		Map<String, Integer> map = new HashMap<>();
		map.put("1", 1);
		map.put("2", null);
		System.out.println(map);
		
		map.computeIfAbsent("2", function); //if corresponding value is null, sets function result into value
		System.out.println(map);
		
		map.computeIfAbsent("3", nullFunction); //if function returns null, the pair isnt added
		System.out.println(map);
	}
}
