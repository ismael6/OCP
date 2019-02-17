package edu.ocp.concurrency.manageConcurrentProcesses.forkJoin.basics;

/**
 * @author IsmaSp6
 *
 *	Recursion -> A task calls itself to solve a problem
 *
 *		Base case -> non recursive call that is used to end the recursive path
 *		Recursive case -> call itself one or more times
 */
public class Recursion {
	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
	
	static int factorial(int n) {
		if(n < 2) return 1;
		else return n * factorial(n-1);
	}
}
