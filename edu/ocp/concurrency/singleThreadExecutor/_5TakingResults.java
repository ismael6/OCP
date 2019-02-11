package edu.ocp.concurrency.singleThreadExecutor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author IsmaSp6
 *	Future class provide methods for the task executed
 *	+ boolean isDone() -> true if the task: is complete, threw exception or was cancelled
 *	+ boolean isCancelled() -> true if the task was cancelled before complete normally
 *	+ boolean cancel() -> ATTEMPS to cancel execution of the task
 *	+ V get() throws InterruptedException, ExecutionException -> obtains the result of a task, if not available yet, waits for it
 *	+ V get(long timeOut, Timeunit unit) throws InterruptedException, ExecutionException, TimeoutException 
 *											-> obtains the result of a task, 
 *											if not available waits the specified time
 *											if not available throws TimeOutException (checked)
 */
public class _5TakingResults {
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		Callable<Integer> callable = 
					() -> {
							for(int i = 0; i<9999 && !Thread.currentThread().isInterrupted(); i++) {
								System.out.println(i++);
							}
							return 5;
						  }; 
		ExecutorService es = null;
		try {
			es = Executors.newSingleThreadExecutor();
			Future<Integer> f = es.submit(callable);
			System.out.println("is Done: "+f.isDone());
			System.out.println("is Cancelled: "+f.isCancelled());
//			IF UNCOMMENT, THREADS NOT CANCELLS UNTIL RESULT VALUE IS OBTAINED
//			Integer result = f.get(1, TimeUnit.SECONDS); System.out.println("result -> "+ result);
			System.out.println("Cancelled: "+f.cancel(true));
			System.out.println("is Cancelled: "+f.isCancelled());
			System.out.println("is Done: "+f.isDone());
			System.out.println("main thread ending");
		}
//		catch (TimeoutException e) {
//			System.out.println("timeout!!!");
//		}
		finally {
			if(es != null) {
				es.shutdown();
			}
		}
	}
}
