package edu.ocp.concurrency.singleThreadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author IsmaSp6
 *
 * Asynchronous methods
 *	void execute(Runnable) -> executes tasks on ThreadExecutor (returns void)
 *	Future<?> submit(Runnable) -> executes tasks on ThreadExecutor (returns Future)
 *	Future<T> submit(Callable<T>) -> executes tasks on ThreadExecutor (returns Future) 
 *	
 */
public class _3SubmitTasks {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newSingleThreadExecutor();
//		es.execute(()-> {});
		Future f = es.submit(()-> { for(int i = 0; i < 1000; System.out.println(i++));});
		while (!f.isDone()) {
			System.out.println("task still working");
		}
		System.out.println("task finished");
		es.shutdown();
	}
}
