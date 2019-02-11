package edu.ocp.concurrency.singleThreadExecutor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
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
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Runnable runnable = () -> {};
		Callable<Integer> callable = () -> 5;
		
		ExecutorService es = null;
		try {
			es = Executors.newSingleThreadExecutor();

//			EXECUTE METHOD
			es.execute(()-> {}); // passing a Runnable

//			SUBMIT METHOD
			Future fRunnable = es.submit(runnable); // passing a Runnable
			Future fCallable = es.submit(callable); // passing a Callable
			
			while (!fCallable.isDone()) {
				System.out.println("task still working");
			}
			System.out.println("task finished with result: "+fCallable.get());
		} finally {
			if (es!= null) es.shutdown();
		}
	}
}
