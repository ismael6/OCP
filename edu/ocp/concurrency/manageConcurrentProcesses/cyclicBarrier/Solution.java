package edu.ocp.concurrency.manageConcurrentProcesses.cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author IsmaSp6
 *
 */
public class Solution {
	public static void main(String[] args) {
		ExecutorService es = null;
		try {
			es = Executors.newFixedThreadPool(5);
//			CyclicBarrier c1 = new CyclicBarrier(5); //barrier holds for 5 threads crashing on it
			CyclicBarrier c1 = new CyclicBarrier(7); //DEAD LOCK barrier holds for 7 threads crashing on it and there will be at much 5, 
			CyclicBarrier c2 = 
					new CyclicBarrier(5, () -> System.out.print("all waited")); // runnable argument executes at termination of barrier
			for(int i = 0; i < 5; i++) {
				es.execute(() -> doTasks(c1,c2));
			}
		}
		finally {
			if(es != null) es.shutdown();
		}
	}
	
	static void doTasks(CyclicBarrier c1, CyclicBarrier c2) {
		try {
			task1();
			c1.await();
			task2();
//			c1.await(); // barriers can be reused
			c2.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			System.out.println("exception handled");
		}
		task3();
	}
	
	static void task1() {
		System.out.print("-");
	}

	static void task2() {
		System.out.print(">");
	}

	static void task3() {
		System.out.print("!");
	}
}
