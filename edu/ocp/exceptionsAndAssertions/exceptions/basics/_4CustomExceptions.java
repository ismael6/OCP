package edu.ocp.exceptionsAndAssertions.exceptions.basics;

/**
 * @author IsmaSp6
 *
 */
public class _4CustomExceptions {
	public static void main(String[] args) {
		
	}
}


class customCheckedException extends Exception{}

class A extends customCheckedException{}

class customUncheckedException extends RuntimeException{}

class B extends RuntimeException{}