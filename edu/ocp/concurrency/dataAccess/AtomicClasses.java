package edu.ocp.concurrency.dataAccess;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/**
 * @author IsmaSp6
 *
 * Atomic -> a single unit of execution without the interference of other threads
 * 				(if another thread needs the resource, it waits to the release)
 * 
 * Atomic classes prevents race conditions  
 */
public class AtomicClasses {
	public static void main(String[] args) {

//		PROVIDED TYPES
		 AtomicBoolean atomicBoolean = new AtomicBoolean();
		 AtomicInteger atomicInteger = new AtomicInteger();
		 AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(5);
		 AtomicLong atomicLong = new AtomicLong();
		 AtomicLongArray atomicLongArray = new AtomicLongArray(5);
		 AtomicReference atomicReference = new AtomicReference<Integer>();
		 AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray<Integer>(5);

		 
//		 METHODS
		 atomicInteger.set(5);
		 System.out.println(atomicInteger.get()); // 5
		 
//		 returns 5 previous value and sets 6 on same operation
		 System.out.println(atomicInteger.getAndSet(6)); // 5
		 System.out.println(atomicInteger.get()); // 6
		 
		 System.out.println(atomicInteger.getAndIncrement()); //6
		 System.out.println(atomicInteger.incrementAndGet()); //8
		 
		 System.out.println(atomicInteger.getAndDecrement()); //8
		 System.out.println(atomicInteger.decrementAndGet()); //6
	}
}
