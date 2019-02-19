package edu.ocp.concurrency.threadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @author IsmaSp6
 *
 *	
 */
public class Creation {
	public static void main(String[] args) {
//		creates a new thread every time is needed or if all other threads are busy 
//		(Recommended for short-time tasks, long-lived tasks carry a gross growing number of threads created) 
		ExecutorService cached = Executors.newCachedThreadPool(); // pool creating threads as needed
		
//		if there are more tasks than threads available, tasks queue and wait to released threads
		ExecutorService fixedNumberOfThreads = Executors.newFixedThreadPool(5); // pool using 5 threads
		
//		each thread on the pool can be scheduled
		ScheduledExecutorService schedule = Executors.newScheduledThreadPool(5); // pool using 5 threads with capability of schedule
	}
}
