package edu.ocp.concurrency.singleThreadExecutor;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author IsmaSp6
 *
 * There are two types of shutting down a ThreadExecutor
 * 	shutdown() -> 
 * 		* quietly shutdowns (not allow new tasks but finish pending tasks)
 * 		* if a new task is submitted, a RejectedExecutionException is thrown
 * 		isShutdown() -> true
 * 		isTerminated() -> false(if there are pending tasks) | true(if all tasks finished)
 * 	shutdownNow()
 * 		* Forcedly shutdown (ATTEMPS to stop all running tasks and discard not started tasks)
 * 		* There is no warranty of all tasks stopping (some Threads by nature, never ends)
 * 		* returns a List<Runnable> of not started tasks 
 */
public class _2ShutDown {
	public static void main(String[] args) {
		ExecutorService es = Executors.newSingleThreadExecutor();
		if(es != null) {
			es.shutdown(); // quietly shutdown
			List<Runnable> notRunnedTasks = es.shutdownNow(); // forcedly shutdown
		}
	}
}
