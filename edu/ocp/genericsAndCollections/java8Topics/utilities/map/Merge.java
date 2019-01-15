package edu.ocp.genericsAndCollections.java8Topics.utilities.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * @author IsmaSp6
 * 
 * merges correspondent key value with the new value following the merge rules
 * 
 * V merge(K key, V newValue, BiFunction<? super V, ? super V, ? extends V> mergeRules) 
 *
 **********************NOTE*******************************
 * bifunction -> takes two parameters and returns a value
 *********************************************************
 *
 */
public class Merge {
	public static void main(String[] args) {
		
		BiFunction<String, String, String> takesLonger = 
							(v1, v2) -> 
								v1.length() > v2.length()? v1 : v2;
		
		BiFunction<String, String, String> returnNull = (v1, v2) -> null;
								
		Map<String, String> map = new HashMap<>();
		map.put("1", "uno");
		map.put("2", null);
		map.put("3", "tres");
		System.out.println(map);

		System.out.println(map.merge("1", "longer", takesLonger)); // set the return of mapper function as value of the key 
		System.out.println(map.merge("2", "lo", takesLonger)); // if original value is null, simply update with new value (and don´t call mapper function)
		System.out.println(map.merge("2", null, takesLonger)); // throws null pointer exception
		System.out.println(map.merge("3", "longer", returnNull)); // if mapper function returns null, pair is removed
		System.out.println(map.merge("4", "noKey", takesLonger)); // if key not exists, simply add pair value (and don´t call mapper function)
		System.out.println(map);
	}
}
