package edu.ocp.functionalProgramming.primitiveStreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author IsmaSp6
 *
 *	3 types of primitive streams
 *		A) IntStream -> int and lower values
 *		B) LongStream -> long values
 *		C) DoubleStream -> double and float values
 */
public class CreatingPrimitiveStreams {
	public static void main(String[] args) {
		
//		Same behavior of objects Stream
		IntStream.empty();
		LongStream.of(1,2,3,4,5);
		DoubleStream.iterate(0, d -> d+1);
		
		
//		Some utility factories
		IntStream.range(0, 10); // 0 to 9 values
		LongStream.rangeClosed(0, 9); // 0 to 9 values
//		DoubleStream.range(0,10); RANGE NOT EXISTS ON DoubleStream
		
//		Can obtain primitive streams with mapTo* methods
		Stream.of("one", "two", "three")
				.mapToInt(s -> s.length()) // mapToInt obtains an IntStream using a ToIntFunction
				.map(i -> i) // map keeps as an int stream using an IntUnaryOperator
				.mapToLong(i -> i) // mapToLong obtains a LongStream using an IntToLongFunction
				.mapToDouble(l -> l) // mapToDouble obtains a DoubleStream using a LongToDoubleFunction 
				.mapToObj(d -> d); // mapToObj obtains an Object stream using a DoubleFunction
	}
}
