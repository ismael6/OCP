package edu.ocp.concurrency.streams.behavior.parallelReductions.collectMethod.usingCollectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author IsmaSp6
 *
 *	To collect() on parallel stream using the one argument parameter
 *		1) The stream should be parallel
 *		2) The parameter of the Collector operation has the 
 *			Collector.Characteristics.CONCURRENT characteristic
 *		3) The stream is unordered or the collector operation has the
 *			Collector.Characteristics.UNORDERED characteristic
 *				- Create unordered stream Stream.of(1,2,3).unordered()
 *
 *	CONCURRENT and UNORDERED collectors:
 *		Collectors.toConcurrentMap()
 *		Collectors.groupingByConcurrent()
 *
 */
public class Rules {
	public static void main(String[] args) {
		
//		Collectors.toSet() operations has the Collector.Characteristics.UNORDERED
//		but do NOT have the Collector.Characteristics.CONCURRENT,
//		therefore THIS IS NOT A CONCURRENT REDUCTION
		Set<Integer> set1 = 
				Stream.iterate(1, n -> n+1)
				.limit(100)
				.parallel()
				.collect(Collectors.toSet()); 
			
			System.out.println(set1);
			
			
//			CONCURRENT REDUCTIONS

//			toConcurrentMap
			Map<Integer, String> map1 = 
					Stream.iterate(1, n -> n+1)
					.limit(100)
					.parallel()
					.collect(Collectors.toConcurrentMap(
										n -> ((Integer)(n/10)),
										n -> n.toString(),
										(n,m) -> n+","+m)); 
			System.out.println(map1);

				
//			groupingByConcurrent
			Map<Integer, List<Integer>> map2 = 
					Stream.iterate(1, n -> n+1)
					.limit(100)
					.parallel()
					.collect(Collectors.groupingByConcurrent(
										n -> n/10)); 
			System.out.println(map2);
	}
}
