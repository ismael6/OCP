package edu.ocp.genericsAndCollections.java8Topics.utilities.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * @author IsmaSp6
 *
 * If the key exists, sets the Bifunction return to the corresponding value
 * 
 * ****************NOTE**********************************
 * BiFunction -> takes two parameters and return a value
 * ******************************************************
 */
public class ComputeIfPresent {
	public static void main(String[] args) {

		BiFunction<String, Integer, Integer> plusOne = (k,v) -> ++v;
		
		BiFunction<String, Integer, Integer> nullValue = (k,v) -> null;
		
		Map<String, Integer> map = new HashMap<>();
		map.put("1", 1);
		System.out.println(map);
		
		map.computeIfPresent("1", plusOne);
		System.out.println(map);
	
		//if BiFunction returns null, corresponding key-value is removed  
		map.computeIfPresent("1", nullValue);
		System.out.println(map);
	}
}
