package edu.ocp.concurrency.basics.runnable.threadsExecution;

/**
 * @author IsmaSp6
 * 
 * start() -> creates a new thread for executing the required tasks
 * run() do not create a new thread, the actual thread executes the required tasks
 */
public class ExecutingThread {
	public static void main(String[] args) {
		
		// 3 new threads
		new Thread(new ISARunnable()).start(); //executing thread from a runnable object
		new Thread(()->{System.out.println("running from lambda");}).start(); //executing thread from a lambda
		new ISAThread().start(); //executing thread from a Thread object
		
		// No new threads (actual thread executing run this tasks)
		new Thread(new ISARunnable()).run();
		new Thread(()->{System.out.println("running from lambda");}).run();
		new ISAThread().run();
	}
}

class ISARunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("running from a runnable");
	}
}

class ISAThread extends Thread{
	@Override
	public void run() {
		System.out.println("running from a Thread");
	}
}
