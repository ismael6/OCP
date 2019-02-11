package edu.ocp.concurrency.dataAccess;

/**
 * @author IsmaSp6
 *
 * static and instance methods can be synchronized (just syntactic sugar)
 */
public class SynchronizedMethods {
	
//	all static method block synchronized
	static void staticM1() {
		synchronized (SynchronizedMethods.class) {
			
		}
	}
//	syntactic sugar
	synchronized static void staticM2() {
		
	}
	
	
//	all instance method block synchronized
	void m1() {
		synchronized (this) {
			
		}
	}
//	syntactic sugar
	synchronized void m2() {
		
	}
}
