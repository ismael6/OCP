package edu.ocp.genericsAndCollections.listsSetsMApsQueues.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author IsmaSp6
 *
 **************************NOTE************************************
 * ArrayDeque.- 
 * 	Pure double ended queue (can access first and last elements)
 * 	Stores elements in a resizable array
 * 
 *  When to use: on needed of FIFO/LIFO data structures
 ******************************************************************
 *
 * QUEUE -> First In, First Out
 */
public class QueueImpl {
		
	public static void main(String[] args) {
		Queue<Object> arrayDeque = new ArrayDeque<>();
		System.out.println(arrayDeque.offer(10)); // insert in the end of queue
		System.out.println(arrayDeque.offer(4)); // insert in the end of queue
		System.out.println(arrayDeque.peek()); // get head of queue
		System.out.println(arrayDeque.poll()); // get and remove head from queue
		System.out.println(arrayDeque.poll()); // get and remove head from queue
		System.out.println(arrayDeque.peek()); // returns null if queue empty 
	}
}
