package edu.ocp.concurrency.dataAccess;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author IsmaSp6
 *	Threads run in shared environment and shared memory space
 *
 *	Thread safety -> guarantees safe execution even on multiple threads working at same time
 *	Race condition -> threads access shared data and change it at the same time
 *
 *	Synchronization -> capability that allows for a Thread at once, the exclusive execution of a segment of code
 *		synchronization may result on lack of performance, one Thread at a time VS a lot of threads in queue waiting for the lock 
 *
 */
public class _1Basics {
	private static int counter = 0;

	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			try {
				Thread.currentThread().sleep(300);
			} 
			catch (InterruptedException e) {e.printStackTrace();}
			System.out.println(++counter);
		};
		
		ExecutorService es = null;
		
		try {
			es = Executors.newFixedThreadPool(20);
			for(int i = 0; i < 10; i++) {
				es.submit(runnable); // with many threads acceding same element, race condition happens
			}
		} finally {
			if(es != null) es.shutdown();
		}
	}
}
