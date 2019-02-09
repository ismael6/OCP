package edu.ocp.concurrency.singleThreadExecutor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author IsmaSp6
 *	Future class provide methods for the task executed
 *	+ boolean isDone() -> true if the tasks is complete, threw exception or was cancelled
 *	+ boolean isCancelled() -> true if the task was cancelled before complete normally
 *	+ boolean cancel() -> ATTEMPS to cancel execution of the task
 *	+ V get() -> obtains the result of a task, if not available yet, waits for it
 *	+ V get(long timeOut, Timeunit unit) -> obtains the result of a task, 
 *											if not available waits the specified time
 *											if not available throws TimeOutException (checked)
 */
public class _5TakingResults {
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		ExecutorService es = null;
		try {
			es = Executors.newSingleThreadExecutor();
			Future f = es.submit(() -> {
			for(int i = 0; i<999; System.out.println(i++)) {}});
			f.get(1, TimeUnit.SECONDS);
//			f.get(1, TimeUnit.MILLISECONDS);
			System.out.println("finished on time");
		} catch (TimeoutException e) {
			System.out.println("timeout!!!");
		}
		finally {
			if(es != null) {
				es.shutdown();
			}
		}
	}
}
