package edu.ocp.concurrency.singleThreadExecutor.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author IsmaSp6
 *
 */
public class Methods {
	public static void main(String[] args) throws InterruptedException {
		
		Runnable runnable = () -> System.out.println("runnable");
		Runnable runnable2 = () -> System.out.println("runnable2");
		Callable<Integer> callable = () -> {System.out.println("callable"); return 5;};
		ScheduledExecutorService scheduled = Executors.newSingleThreadScheduledExecutor();

		
		//executes the runnable after 1 second from this time
		ScheduledFuture<?> sFuture1 = scheduled.schedule(runnable, 10, TimeUnit.SECONDS);
		System.out.println("time to start runnable " +sFuture1.getDelay(TimeUnit.MILLISECONDS)); // how many time to start the task 
		
		
		//executes the callable after 1 second from this time
		ScheduledFuture<Integer> sFuture2 = scheduled.schedule(callable, 5, TimeUnit.SECONDS);
		System.out.println("time to start callable " +sFuture2.getDelay(TimeUnit.MILLISECONDS)); // how many time to start the task
		
		
		// executes this runnable repeated times 
		// first time waits 100 seconds to start, each next repetition waits 1 second from the PREVIOUS EXECUTION STARTED TIME
		// (there is no concurrently execution, even if task time of execution > waiting repetition time (in this case, repetitions starts late))
		scheduled.scheduleAtFixedRate(runnable, 10, 1, TimeUnit.SECONDS);
		
		
		// executes this runnable repeated times
		// first time waits 100 seconds to start, each next repetition waits 1 second from the COMPLETITION OF THE PREVIOUS EXECUTION
		scheduled.scheduleWithFixedDelay(runnable2, 10, 1, TimeUnit.SECONDS);

		
		// schedulers may not start if interrupted before
		Runnable runnable3 = () -> System.out.println("not started");
		ScheduledExecutorService scheduleToInterrumpt = Executors.newSingleThreadScheduledExecutor();
		
		scheduleToInterrumpt.scheduleWithFixedDelay(runnable3, 10, 1, TimeUnit.SECONDS);
		scheduleToInterrumpt.shutdown(); // shutdowns before started, so this task never starts
	}
}
