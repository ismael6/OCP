package edu.ocp.functionalProgramming.functionalInterfaces.consumers;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @author IsmaSp6
 *
 * Parameterized types -> T, U
 * parameters -> T, U
 * returns -> void
 * method name -> accept
 *
 */
public class BiConsumerImpl {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		BiConsumer<String, Integer> c1 = map :: put;
		BiConsumer<String, Integer> c2 = (x,y)-> map.put(x,y);
		
		c1.accept("testC1",1);
		c2.accept("testC2",2);
		
		System.out.println(map);
	}
}
