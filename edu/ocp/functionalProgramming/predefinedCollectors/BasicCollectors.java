package edu.ocp.functionalProgramming.predefinedCollectors;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author IsmaSp6
 *
 * 
 */
public class BasicCollectors {
	public static void main(String[] args) {
		
		System.out.println(
					Stream
						.of(1,2,3,4,5)
						.collect(Collectors.averagingInt(t -> t)) // 3
						.doubleValue());
		
		System.out.println(
				Stream
					.of(1,2,3,4,5)
					.collect(Collectors.counting()) // 5
					.doubleValue());
		
		
		System.out.println(
				Stream
					.of(1,2,3,4,5)
					.map(v -> v.toString())
					.collect(Collectors.joining())); // 12345
		
		System.out.println(
				Stream
					.of(1,2,3,4,5)
					.map(v -> v.toString())
					.collect(Collectors.joining(", "))); // 1, 2, 3, 4, 5
		
		System.out.println(
				Stream
					.of(1,2,3,4,5)
					.map(v -> v.toString())
					.collect(Collectors.joining(", ", "before ", " after"))); // -1, 2, 3, 4, 5k
		
		System.out.println(
				Stream
					.of(1,2,3,4,5)
					.collect(Collectors.maxBy((a,b) -> a-b))); // Optional[5]

		System.out.println(
				Stream
					.of(1,2,3,4,5)
					.collect(Collectors.minBy(Comparator.naturalOrder()))); // Optional[1]
		
		DoubleSummaryStatistics dss = Stream
										.of(1,2,3,4,5)
										.collect(Collectors.summarizingDouble(t -> t)); // DoubleSummaryStatistics
		System.out.println(dss.getAverage()+" "+dss.getCount()+" "+dss.getMax()+" "+dss.getMin()+" "+dss.getSum());
		
		System.out.println(
				Stream
					.of(1,2,3,4,5)
					.collect(Collectors.summingInt(t -> t)) // 15
					.doubleValue()); 
		
		System.out.println(
				Stream
					.of(1,2,3,4,5)
					.collect(Collectors.toList())); // [1,2,3,4,5]
		
		System.out.println(
				Stream
					.of(1,2,3,4,5)
					.collect(Collectors.toSet()));  // [1,2,3,4,5]

		System.out.println(
				Stream
					.of(1,2,3,4,5)
					.collect(Collectors.toCollection(LinkedList :: new)));  // [1,2,3,4,5]
	}
}
