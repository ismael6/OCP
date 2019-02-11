package edu.ocp.concurrency.dataAccess;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author IsmaSp6
 *
 * monitor -> 
 * 	structure that supports exclusive execution of code for a single thread at once
 * 
 * synchronized block -> block executed for a single thread at once
 * 		+Only a Thread with lock can execute the block of code 
 *  	+The Thread executing the block of code have the lock
 *  	+Another threads wait for the lock to release
 *  	+When the Thread completes the block of code, releases the lock
 *  	+Another Thread get the lock and executes the block of code
 *  
 */
public class SynchronizedBlocks {

	
	private static int counter = 0;

	void runnable() {
//		solves race condition, giving access to resource to one Thread at once
		synchronized (this) {
			Object lock = new Object();
			synchronized (lock) {
				try {
					Thread.sleep(300);
					System.out.println(Thread.currentThread().getName());
				} 
				catch (InterruptedException e) {e.printStackTrace();}
				System.out.println(++counter);
			}
		}
	}
	
	public static void main(String[] args) {
		
		ExecutorService es = null;
		
		try {
			es = Executors.newFixedThreadPool(20);
			SynchronizedBlocks sb = new SynchronizedBlocks();
			for(int i = 0; i < 10; i++) {
				es.submit(() -> sb.runnable()); // with many threads acceding same element, race condition happens
			}
		} finally {
			if(es != null) es.shutdown();
		}
	}
}
