package edu.ocp.concurrency.singleThreadExecutor.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author IsmaSp6
 * 
 * abstract method
 * 	V call() throws Exception
 *	
 *	the Runnable.run() method do not return a value and do not throws Exceptions
 *
 */
public class Basics {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = null;
		try {
			es = Executors.newSingleThreadExecutor();	
			
			Callable callable = () -> 5; // callable lambda implementation
			Future<Integer> future = es.submit(callable); // submit method runs a Callable object
			System.out.println(future.get());
			
			callable = () -> null; // callable implementation can return null with no problem
			future = es.submit(callable);
			System.out.println(future.get());
			
		} finally {
			es.shutdownNow();
		}
	}
}
