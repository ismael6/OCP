package edu.ocp.functionalProgramming.advancedStreamPipelines.predefinedCollectors;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author IsmaSp6
 *
 */
public class Grouping {
	public static void main(String[] args) {
		System.out.println(
			Stream
			.of("a", "bb", "cc", "dd", "cc")
			.collect( // {1=[a], 2=[bb, cc, dd, cc]}
				Collectors.groupingBy(
					(String a) -> a.length())) // group condition
//			.getClass()	//HashMap
		);
		
		System.out.println(
			Stream
			.of("a", "bb", "cc", "dd", "cc")
			.collect( // {1=[a], 2=[bb, cc, dd]}
				Collectors.groupingBy(
					String::length,      // group condition
					Collectors.toSet())) // collect groups on this mutable data structure
//			.getClass() //HashMap
		);

		System.out.println(
			Stream
			.of("a", "bb", "cc", "dd", "cc")
			.collect( // {1=[a], 2=[bb, cc, dd, cc]}
				Collectors.groupingBy(
					String::length,      // group condition
					TreeMap::new,		 // collect all in a TreeMap
					Collectors.toList())) // collect groups on this mutable data structure
			.getClass() //TreeMap
		);

		System.out.println(
			Stream
			.of("a", "bb", "cc", "dd", "cc").collect(
				Collectors.groupingBy(
					String::length,  // group condition
					Collectors.mapping(	// mapping for each partitioned group
						s -> s.charAt(0), // takes first character on every element of the group
						Collectors.maxBy(Comparator.naturalOrder())))) // picks the higher letter of each group
		);
	}
}
