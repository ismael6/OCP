package edu.ocp.concurrency.manageConcurrentProcesses.forkJoin;

/**
 * @author IsmaSp6
 *
 *	+ 'RecursiveAction' and 'RecursiveTask' extends from 'ForkJoinTask'
 *	+ To apply the forkJoin framework, needs to extend RecursiveAction or RecursiveTask
 *	+ RecursiveAction method: void compute()
 *	+ RecursiveTask method: T compute()
 *	+ invokeAll() takes two instances of ForkJoinTask and returns void
 *	+ fork() submits a new task to the pool
 *	+ join() calls after the fork() and causes the current thread to wait for the results of a subtask
 *	+ calling compute() within a compute() causes task to wait for the results of the subtask
 *	+ to get multithreading, 'fork()' should be called before the current thread performs a 'compute()' operation and 'join()' called to read results afterward
 *
 */
public class Topics {

}
