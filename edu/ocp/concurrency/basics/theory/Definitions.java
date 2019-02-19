package edu.ocp.concurrency.basics.theory;

/**
 * @author IsmaSp6
 *
 *	Thread -> smallest unit of execution that can be scheduled by the operating system
 *	Process -> group of associated threads executing in the same shared environment
 *	Task -> single unit of work performed by a thread
 *	Shared environment -> same memory and threads can communicate directly each other
 *
 *	Concurrency -> property of executing multiple threads and processes at the same time
 * 	Thread scheduler -> determines which thread executes
 * 	Context switch -> Storing and retrieving a thread state when tasks stills not complete
 * 	Thread priority -> numeric value associated taken in consideration by the scheduler determining which thread to execute
 */
public class Definitions {
	public static void main(String[] args) {
		System.out.println(Thread.MIN_PRIORITY); // 1
		System.out.println(Thread.NORM_PRIORITY); // 5 (default)
		System.out.println(Thread.MAX_PRIORITY); // 10
	}
}
