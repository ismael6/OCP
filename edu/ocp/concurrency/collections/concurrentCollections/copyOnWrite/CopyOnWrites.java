package edu.ocp.concurrency.collections.concurrentCollections.copyOnWrite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author IsmaSp6
 *
 *	+ CopyOnWriteArrayList
 *	+ CopyOnWriteArraySet
 *
 *	The elements are copied into a new underlying data structure every time an element is added, removed or his reference chances
 *	(on intensive write cases turns really slow)
 *	(recommended on situations where read operations are commonly used)
 *
 */
public class CopyOnWrites {
	public static void main(String[] args) {
	
//		ConcurrentModificationException (https://docs.oracle.com/javase/7/docs/api/java/util/ConcurrentModificationException.html)
//		List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3));
//		for(Integer i : arrayList) {
//			System.out.println(i);
//			arrayList.add(10);
//		}
		
		
		List<Integer> copyOnWrite = new CopyOnWriteArrayList<>(Arrays.asList(1,2,3));
		for(Integer i : copyOnWrite) { // iterator simply works with the original data structure
			copyOnWrite.add(10);  // each add() call means a new underlying data structure created and referenced
			System.out.print(i); // 1 2 3 
		}
		System.out.println();
		System.out.println(copyOnWrite); // 1 2 3 10 10 10
	}
}
