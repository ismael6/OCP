package edu.ocp.concurrency.collections.concurrentCollections;

import java.util.Deque;
import java.util.List;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author IsmaSp6
 *
 * if there are multiple threads, when to use concurrent collection ->
 * 		+multiple threads modify a collections outside a synchronized block
 * 
 * if there are multiple threads, when NOT to use a concurrent collection -> 
 * 		+multiple threads access an established immutable or read-only collection
 *
 */
public class Basic {
	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, Integer> cHashMap = new ConcurrentHashMap<>();
		ConcurrentMap<Integer,Integer> cm1 = cHashMap;

		ConcurrentSkipListMap<Integer, Integer> cslm = new ConcurrentSkipListMap<>();
		ConcurrentMap<Integer, Integer> cm2 = cslm;
		SortedMap<Integer, Integer> sortedMap = cslm;
		NavigableMap<Integer, Integer> navigableMap = cslm;
		
		ConcurrentSkipListSet<Integer> csls = new ConcurrentSkipListSet<>();
		SortedSet<Integer> sortedSet = csls;
		NavigableSet<Integer> navigableSet = csls;
		
		CopyOnWriteArrayList<Integer> cowal = new CopyOnWriteArrayList<>();
		List<Integer> list = cowal;
		
		CopyOnWriteArraySet<Integer> cowas = new CopyOnWriteArraySet<>();
		Set<Integer> set = cowas;
		
		ConcurrentLinkedDeque<Integer> cLinkedDeque = new ConcurrentLinkedDeque<>();
		Deque<Integer> deque = cLinkedDeque;
		
		LinkedBlockingDeque<Integer> lbd = new LinkedBlockingDeque<>();
		BlockingQueue<Integer> bq1 = lbd;
		BlockingDeque<Integer> bd = lbd;
		
		ConcurrentLinkedQueue<Integer> cLinkedQueue = new ConcurrentLinkedQueue<>();
		Queue<Integer> queue = cLinkedQueue;
		
		LinkedBlockingQueue<Integer> lbq = new LinkedBlockingQueue<>();
		BlockingQueue<Integer> bq2 = lbq;
		
	}
}
