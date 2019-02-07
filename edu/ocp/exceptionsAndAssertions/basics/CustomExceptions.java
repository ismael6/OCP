package edu.ocp.exceptionsAndAssertions.basics;

/**
 * @author IsmaSp6
 *
 */
public class CustomExceptions {
	public static void main(String[] args) {
		
	}
}


class customCheckedException extends Exception{}

class A extends customCheckedException{}

class customUncheckedException extends RuntimeException{}

class B extends RuntimeException{}