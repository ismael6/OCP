package edu.ocp.functionalProgramming.advancedStreamPipelines.predefinedCollectors;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author IsmaSp6
 *
 * partitioningBy returns elements in two categories: true and false
 */
public class Partitioning {
	public static void main(String[] args) { 
		Stream<String> stream1 = Stream
			.of("a", "bb", "cc", "dd", "cc");
		Map<Boolean, List<String>> partitioned =
			stream1.collect(
				Collectors.partitioningBy(
					s -> s.length() > 1)); //partition condition
		System.out.println(partitioned); //{false=[a], true=[bb, cc, dd, cc]}
		
		
		Stream<String> stream2 = Stream
				.of("a", "bb", "cc", "dd", "cc");
		Map<Boolean, Set<String>> partitionedAsSet =
			stream2.collect(
				Collectors.partitioningBy(
					s -> s.length() > 1,  // partition condition
					Collectors.toSet())); // collect partitioned elements into a Set
		System.out.println(partitionedAsSet); //{false=[a], true=[bb, cc, dd]}
		
		
		Stream<String> stream3 = Stream
				.of("a", "bb", "cc", "dd", "cc");
		Map<Boolean, Long> aggregationOperationOnPartitions =
			stream3.collect(
				Collectors.partitioningBy(
					s -> s.length() > 1,  // partition condition
					Collectors.counting())); // applying aggregation operation on each partitioned group
		System.out.println(aggregationOperationOnPartitions); //{false=1, true=4}
	}
}
