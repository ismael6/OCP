package edu.ocp.concurrency.manageConcurrentProcesses.forkJoin.recursiveTask;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * @author IsmaSp6
 *
 *	compute method
 *		parameters -> ()
 *		return -> T
 *
 *	IMPORTANT TO GET MULTI THREADED PERFORMANCE
 *		call fork() before current thread begins a subtask (line 62)
 *		and call join() after the current thread subtask finishes retrieving the results (line 67)
 *
 *		If fork and join calls are both before or after the current subtask execution, there is only one thread working
 */
public class RecursiveTaskImpl extends RecursiveTask<Integer>{

	public static void main(String[] args) {
		int[] ops = new int[10];

//		define task
		ForkJoinTask<Integer> task = new RecursiveTaskImpl(0, ops.length, ops);
//		create pool
		ForkJoinPool pool = new ForkJoinPool();
//		invoke task on the pool
		Integer sum = pool.invoke(task);
		
		System.out.print(sum);
	}

	
	private int start;
	private int end;
	private int[] operations;
	
	public RecursiveTaskImpl(int start, int end, int[] operations) {
		this.start = start;
		this.end = end;
		this.operations = operations;
	}
	@Override
	protected Integer compute() {
//		Base case (elements received equals or less than 2, work on them)
		if(end-start <=2) {
			int sum = 0;
			for(int i = start; i < end; i++) {
				operations[i] = new Random().nextInt(10);
				System.out.println("operation on position " + i);
				sum+=operations[i];
			}
			return sum;
		}
//		Recursive case	(elements received greater than 2, split them and run a task for each half)
		else {
			int middle = start+((end-start)/2);
			System.out.println("start = " +start+", middle = "+middle+", end = "+end);
//			creates new task with first half
			RecursiveTask<Integer> otherTask =
					new RecursiveTaskImpl(start, middle, operations);
//			run the new task on new thread
			otherTask.fork();
//			run another task with the second half in this thread
			return new RecursiveTaskImpl(middle, end, operations).compute()
//					sum with the result of first half
					+ otherTask.join();
		}
	}
}
