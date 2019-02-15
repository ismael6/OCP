package edu.ocp.concurrency.streams.behavior;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author IsmaSp6
 *
 *	There is no warranty that using parallel streams improves performance
 *	It can be that performance reduces due to overhead of creating parallel processing structures
 */
public class ParallelStreamsPerformance {
	public static void main(String[] args) {
		
		Function<Integer, Integer> f = 
				(a) -> {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						System.out.println("InterruptedException catched");
					} 
					return a;
					};
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i<600; list.add(i++)) {} 
		long start = System.currentTimeMillis();
		
		list.stream().map(f).count();
		System.out.println("serial stream: "+(System.currentTimeMillis()-start)/1000);
		
		list.parallelStream().map(f).count();
		System.out.println("parallel stream: "+(System.currentTimeMillis()-start)/1000);
	}
}
