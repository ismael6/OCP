package edu.ocp.concurrency.threadingProblems.liveness;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author IsmaSp6
 *
 *	Two or more threads are blocked forever, each waiting on the other
 *
 *	To prevent: order threads request on resources
 */
public class DeadLock {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(() -> m1());
		es.execute(() -> m2());
	}
	
	static void m1() {
		synchronized (R1.class) {
			System.out.println("m1 using R1");
			synchronized (R2.class) {
				System.out.println("m1 using R2");
			}
		}
	}
	
	static void m2() {
		synchronized (R2.class) {
			System.out.println("m2 using R2");
			synchronized (R1.class) {
				System.out.println("m2 using R1");
			}
		}		
	}
	
	class R1{}
	class R2{}
}
