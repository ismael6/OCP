package edu.ocp.concurrency.threadingProblems.liveness;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author IsmaSp6
 * 
 * One or more threads cant execute their tasks 
 *
 */
public class Starvation {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(() -> m1());
		es.execute(() -> m1());
		
	}
	
	static void m1() {
		synchronized (Starvation.class){
			while(true){
				System.out.println(Thread.currentThread().getName()+" is working");
			}
		}
	}
}
