package edu.ocp.exceptionsAndAssertions.basics;

import java.io.IOException;

/**
 * @author IsmaSp6
 * 
 * throws -> declarative (on method signature (the method maybe throw an exception))
 * throw -> imperative (on body (throw an exception))
 *
 */
public class ThrowVsThrows {
	public static void main(String[] args) throws IOException{
		throw new RuntimeException();
	}
}
