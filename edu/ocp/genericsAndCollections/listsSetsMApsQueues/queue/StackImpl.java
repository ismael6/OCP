package edu.ocp.genericsAndCollections.listsSetsMApsQueues.queue;

import java.util.ArrayDeque;

/**
 * @author IsmaSp6
 *
 **************************NOTE************************************
 * ArrayDeque.- 
 * 	Pure double ended queue (can access first and last elements)
 * 	Stores elements in a resizable array
 * 
 * When to use: on needed of stack/heap data structures 
 ******************************************************************
 *
 *  STACK -> Last In, First Out
 */
public class StackImpl {
	
	public static void main(String[] args) {
		ArrayDeque<Object> stack = new ArrayDeque<>();
		stack.push(10);
		stack.push(4);
		System.out.println(stack.peek()); // get last element 
		System.out.println(stack.poll()); // get and remove last element
		System.out.println(stack.poll()); // get and remove last element
		System.out.println(stack.peek()); // return null if stack is empty
	}
}
