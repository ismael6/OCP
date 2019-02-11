package edu.ocp.concurrency.singleThreadExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author IsmaSp6
 *
 * Synchronous methods (wait until results are available returning control to enclosing program)
 * 	<T> List<Future<T>> invokeAll(Collection<? extends Callable<T>>) throws InterruptedException
 * 			+ executes all tasks in the provided Collection
 * 			+ returns a list of Future corresponding with each of the task executed in the same order of the provided Collection
 * 			+ Future.isDone() returning true do not warrants the task ends successfully
 * 			+ return control to enclosing program until all tasks are complete
 * 	<T> T invokeAny(Collection<? extends Callable<T>>) throws InterruptedException, ExecutionException
 * 			+ executes the tasks in the provided Collection until one is completed SUCCEFULLY
 * 			+ returns the completed task (not warranty it was the first completed task) 
 * 			+ return control to enclosing program until any task is completed canceling all unfinished tasks
 */
public class _4SubmittingTaskCollections {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService es = null;
		
		try {
			es = Executors.newSingleThreadExecutor();

			List <Callable<Integer>> callables1 = new ArrayList<>();
			callables1.add(() -> 1);
			callables1.add(() -> 2);
			callables1.add(() -> 3);
			callables1.add(() -> 4);
			callables1.add(() -> 5);
			List<Future<Integer>> futures = es.invokeAll(callables1);
			for(Future<Integer> future : futures) {
				System.out.println(future.get());
			}
			
			List<Callable<String>> callables2 = new ArrayList<>();
			callables2.add(()->"a");
			callables2.add(()->"b");
			callables2.add(()->"c");
			callables2.add(()->"d");
			callables2.add(()->"e");
			String result = es.invokeAny(callables2);
			System.out.println(result);
			
		} finally {
			if(es!= null) es.shutdown();
		}
	}
}
