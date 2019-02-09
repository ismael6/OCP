package edu.ocp.concurrency.singleThreadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author IsmaSp6
 *
 *	ExecutorService gives a higher abstraction level to Thread into a more expressive an easy-to-control operations
 *	SingleThreadExecutor have one working Thread
 *	execute() runs the specified task on the working Thread for this SingleThreadExecutor
 *	each execute() call waits to work on queue until the current execution ends
 *	
 */
public class _1Basics {
	public static void main(String[] args) {
		ExecutorService executor = null;
		try {
//			creation
			executor = Executors.newSingleThreadExecutor();
			System.out.println("begin of execution calls");
//			using executor
			executor.execute(() -> System.out.println("executing  a lambda on new Thread"));
			executor.execute(new ARun());
			executor.execute(() -> System.out.println("executing a lambda on the same new Thread"));
			System.out.println("end of execution calls");
		} finally {
			if(executor != null) {
//				terminates executor 
				executor.shutdown();
			}
		}
	}
}

class ARun implements Runnable{

	@Override
	public void run() {
		System.out.println("executing on the same new Thread a Runnable object");
	}
}