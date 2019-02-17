package edu.ocp.concurrency.manageConcurrentProcesses.forkJoin.recursiveAction;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

/**
 * @author IsmaSp6
 *
 *	compute method
 *		parameters -> ()
 *		return -> void
 */
public class RecursiveActionImpl extends RecursiveAction{

	public static void main(String[] args) {
		int[] ops = new int[10];

//		define task
		ForkJoinTask<?> task = new RecursiveActionImpl(0, ops.length, ops);
//		create pool
		ForkJoinPool pool = new ForkJoinPool();
//		invoke task on the pool
		pool.invoke(task);
		
		for (int i : ops) {
			System.out.print(i+", ");
		}
	}
	
	private int start;
	private int end;
	private int[] operations;
	
	public RecursiveActionImpl(int start, int end, int[] operations) {
		this.start = start;
		this.end = end;
		this.operations = operations;
	}
	
	@Override
	protected void compute() {
//		Base case (elements received equals or less than 2, work on them)
		if(end-start <=2) {
			for(int i = start; i < end; i++) {
				operations[i] = new Random().nextInt(100);
				System.out.println("operation on position " + i);
			}
		}
//		Recursive case	(elements received greater than 2, split them and recall itself with each part)
		else {
			int middle = start+((end-start)/2);
			System.out.println("start = " +start+", middle = "+middle+", end = "+end);
			invokeAll(new RecursiveActionImpl(start, middle, operations),
					new RecursiveActionImpl(middle, end, operations));
		}
	}
}
