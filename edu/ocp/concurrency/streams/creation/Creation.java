package edu.ocp.concurrency.streams.creation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author IsmaSp6
 *
 *  Serial stream -> results are ordered, with only one entry being processed at a time
 * 
 *  Parallel stream -> processing results concurrently, using multiple threads
 *  
 *  Number of threads available in a parallel stream is related to the number of CPUs
 *  In order to increase the thread count, a custom class is needed
 *  
 */
public class Creation {
	public static void main(String[] args) {
		
//		parallel()
		Stream.of(1,2,3,4,5).parallel(); // converts serial Stream into parallel Stream
		
//		parallelStream()
		new ArrayList<>().parallelStream(); // converts any Collection into a parallel Stream
	}
}
