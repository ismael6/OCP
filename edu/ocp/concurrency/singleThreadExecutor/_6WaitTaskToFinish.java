package edu.ocp.concurrency.singleThreadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author IsmaSp6
 * 
 * awaitTermination method
 * 	returns -> boolean
 * 	parameters -> long timeout, TimeUnit unit
 * 	throws -> InterruptedException
 * 
 * 	+ If executor do not call shutdown method, the awaitTermination method simply returns false 
 * 
 */
public class _6WaitTaskToFinish {
	public static void main(String[] args) throws InterruptedException {
		Runnable task = () -> {
				for(int i=0;i<60 && !Thread.currentThread().isInterrupted();i++){
					System.out.println(i);
								}
							  };
		ExecutorService es = null;
		try {
			es = Executors.newSingleThreadExecutor();
			es.execute(task);
		} finally {
			if(es!=null)es.shutdown();
		}
		if(es != null) {
//			Gets true or false until the parameter time elapsed, or Thread tasks ends 
			boolean terminated = es.awaitTermination(1, TimeUnit.NANOSECONDS);
//			boolean terminated = es.awaitTermination(1, TimeUnit.SECONDS);
			if(terminated) {
				System.out.println("tasks finished");
			}
			else {
				System.out.println("tasks still NOT finished when timeout elapsed");
			}
		}
	}
}
