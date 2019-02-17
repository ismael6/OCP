package edu.ocp.concurrency.manageConcurrentProcesses.cyclicBarrier;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author IsmaSp6
 * 
 * Need threads execution by steps, do not take another step until all threads finished actual step
 *
 */
public class Motivation {
	public static void main(String[] args) {
		ExecutorService es = null;
		try {
			es = Executors.newFixedThreadPool(5);
			for(int i = 0; i < 5; i++) {
				es.execute(() -> doTasks());
			}
		}
		finally {
			if(es != null) es.shutdown();
		}
	}
	
	static void doTasks() {
		task1();
		task2();
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
