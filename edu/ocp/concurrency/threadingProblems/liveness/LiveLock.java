package edu.ocp.concurrency.threadingProblems.liveness;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author IsmaSp6
 *
 *	Threads active and running but can not finish because of mutual logic locking
 */
public class LiveLock {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(() -> a.executeA(b));
		es.execute(() -> b.executeB(a));
	}
}

class A{
	private boolean a;
	
	public void executeA(B b) {
		while (!b.getB()) {
			System.out.println("A running");				
		}
		System.out.println("A finished");
		a = true;
	}
	
	public boolean getA() {
		return a;
	}
}

class B{
	private boolean b;
	
	public void executeB(A a) {
		while (!a.getA()) {
			System.out.println("B running");				
		}
		System.out.println("B finished");
		b = true;
	}
	
	public boolean getB() {
		return b;
	}
}
