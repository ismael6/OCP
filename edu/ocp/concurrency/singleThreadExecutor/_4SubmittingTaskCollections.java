package edu.ocp.concurrency.singleThreadExecutor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
 * 			+ executes the tasks in the provided Collection until one is completed
 * 			+ returns the completed task (not warranty it was the first completed task) 
 * 			+ return control to enclosing program until any task is completed canceling all unfinished tasks
 */
public class _4SubmittingTaskCollections {
	public static void main(String[] args) {
		ExecutorService es = Executors.newSingleThreadExecutor();
		List <Callable> callables = new ArrayList<>();
		callables.add(() -> {System.out.println();});
		
		
		es.invokeAll(Arrays.asList());
	}
}
