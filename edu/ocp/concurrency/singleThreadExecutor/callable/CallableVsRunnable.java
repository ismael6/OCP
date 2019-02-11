package edu.ocp.concurrency.singleThreadExecutor.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author IsmaSp6
 *
 */
public class CallableVsRunnable {
	public static void main(String[] args) {
		ExecutorService es = null;
		try {
			es = Executors.newSingleThreadExecutor();
			es.submit(() -> {Thread.sleep(1); return 5;}); // OK, return value ('<T> Future<T> submit(Callable<T>) throws Exception' is called)
//			es.submit(() -> {Thread.sleep(1);}); // not compiles, there is no return value ('Future<?> submit(Runnable)' is called)
		} finally {
			if(es != null) es.shutdown();
		}
	}
}
