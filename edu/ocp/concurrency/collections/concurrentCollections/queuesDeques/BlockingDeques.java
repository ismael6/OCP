package edu.ocp.concurrency.collections.concurrentCollections.queuesDeques;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * @author IsmaSp6
 *
 * Concurrent methods
 * 		offerFirst
 * 			+ arguments -> E e, long timeout, Timeunit unit
 * 			+ returns -> boolean (false if time elapses)
 * 			+ throws -> InterruptedException
 * 
 *  	offerLast
 * 			+ arguments -> E e, long timeout, Timeunit unit
 * 			+ returns -> boolean (false if time elapses)
 * 			+ throws -> InterruptedException
 * 
 * 		pollFirst
 * 			+ arguments -> long timeout, Timeunit unit
 * 			+ returns -> E (null if time elapses)
 * 			+ throws -> InterruptedException
 * 
 * 		pollLast
 * 			+ arguments -> long timeout, Timeunit unit
 * 			+ returns -> E (null if time elapses)
 * 			+ throws -> InterruptedException
 *
 */
public class BlockingDeques {
	public static void main(String[] args) {
		try {
			BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();

			
			boolean res1 = blockingDeque.offer(0); // standard method
			
//			concurrent methods
			boolean res2 = blockingDeque.offer(1, 1, TimeUnit.SECONDS);
			boolean res3 = blockingDeque.offerFirst(2, 1, TimeUnit.SECONDS);
			boolean res4 = blockingDeque.offerLast(3, 1, TimeUnit.SECONDS);
			
			
			Integer i1 = blockingDeque.poll(); // standard method
			
//			concurrent methods
			Integer i2 = blockingDeque.poll(1, TimeUnit.SECONDS);
			Integer i3 = blockingDeque.pollFirst(1, TimeUnit.SECONDS);
			Integer i4 = blockingDeque.pollLast(1, TimeUnit.SECONDS);
			
			System.out.println(i1);
			System.out.println(i2);
			System.out.println(i3);
			System.out.println(i4);
			
		} catch (InterruptedException e) {
			System.out.println("interruptedException throwed");
		}
	}
}
