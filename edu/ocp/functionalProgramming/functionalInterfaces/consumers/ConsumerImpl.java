package edu.ocp.functionalProgramming.functionalInterfaces.consumers;

import java.util.function.Consumer;

/**
 * @author IsmaSp6
 *
 * Parameterized types -> T
 * parameters -> T
 * returns -> void
 * method name -> accept
 *
 */
public class ConsumerImpl {
	public static void main(String[] args) {
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);
		
		c1.accept("testC1");
		c2.accept("testC2");
	}
}
