package edu.ocp.concurrency.collections.concurrentCollections.queuesDeques;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * @author IsmaSp6
 *
 *	Concurrent methods
 *		offer
 *			+ arguments -> E e, long timeout, Timeunit unit
 *			+ returns -> boolean (false if time elapses)
 *			+ throws -> InterruptedException
 *
 *		poll 
 *			+ arguments -> long timeout, Timeunit unit
 *			+ returns -> E (null if time elapses)
 *			+ throws -> InterruptedException
 */
public class BlockingQueues {
	public static void main(String[] args) {
		try {
			BlockingDeque<Integer> blockingQueue = new LinkedBlockingDeque<Integer>();
			
			boolean res1 = blockingQueue.offer(1); // standard offer
			boolean res2 = blockingQueue.offer(2, 1, TimeUnit.SECONDS); // offer with a waiting time of 1 second
			
			Integer i1 = blockingQueue.poll(); // standard poll
			Integer i2 = blockingQueue.poll(1, TimeUnit.SECONDS); // poll with a wating time of 1 second
			
			System.out.println(i1);
			System.out.println(i2);
			
		} catch (InterruptedException e) {
			System.out.println("InterruptedException throwed");
		}
	}
}
