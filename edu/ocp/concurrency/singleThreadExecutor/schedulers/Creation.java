package edu.ocp.concurrency.singleThreadExecutor.schedulers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @author IsmaSp6
 *
 */
public class Creation {
	public static void main(String[] args) {
		ScheduledExecutorService scheduled = Executors.newSingleThreadScheduledExecutor();

//		ScheduledExecutorService IS AN ExecutorService 
		ExecutorService executorService = scheduled;
	}
}
