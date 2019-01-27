package edu.ocp.functionalProgramming.primitiveStreams;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * @author IsmaSp6
 *
 * provides the result of all end operations without discarding the stream pipeline
 */
public class SummaryStatistics {
	public static void main(String[] args) {
		
		IntStream finitePrimitiveStream = IntStream.of(0,1,2,3,4);
		IntSummaryStatistics statics = finitePrimitiveStream.summaryStatistics();
		System.out.println(statics.getCount());
		System.out.println(statics.getMax());
		System.out.println(statics.getMin());
		System.out.println(statics.getSum());
		System.out.println(statics.getAverage());
		
//		empty stream
		System.out.println("\nempty stream");
		IntStream emptyPrimitiveStream = IntStream.empty();
		IntSummaryStatistics staticsEmpty = emptyPrimitiveStream.summaryStatistics();
		System.out.println(staticsEmpty.getCount());
		System.out.println(staticsEmpty.getMax()); // if stream is empty, returns T.MIN_VALUE
		System.out.println(staticsEmpty.getMin()); // if stream is empty, returns T.MAX_VALUE
		System.out.println(staticsEmpty.getSum()); 
		System.out.println(staticsEmpty.getAverage());
		
//		infinite stream		
		IntStream infiniteStream = IntStream.iterate(1, n -> n/2);
//		IntSummaryStatistics statics2 = infiniteStream.summaryStatistics(); //never ends
		
	}
}
