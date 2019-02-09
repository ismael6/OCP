package edu.ocp.concurrency.basics.runnable;

/**
 * @author IsmaSp6
 *
 * abstract method signature -> void run()
 */
public class RunnableImpl {
	public static void main(String[] args) {
//		implementation using a type
		Runnable r1 = new Runner();
		
//		implementation using lambdas
		Runnable r2 = () -> {};
		Runnable r3 = () -> System.out.println("runnning");
		Runnable r4 = () -> {int i = 10;};
		Runnable r5 = () -> {return;};
	}
}

class Runner implements Runnable{

	@Override
	public void run() {
		System.out.println("running");
	}
}