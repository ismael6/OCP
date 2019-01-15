package edu.ocp.genericsAndCollections.bounds;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author IsmaSp6
 *
 * <? extends T> -> Upper Bound Wildcard (allows any generic that "IS A" T)
 */
public class _1UpperBoundWildcard {

//	Accepts any generic type that "IS AN" Exception
	static void listUpperBounded(List<? extends Exception> upperBoundWildcard) {
		for(Object o : upperBoundWildcard) {System.out.println(o);}
		
		upperBoundWildcard.remove(0); // Ok, can remove
//		upperBoundWildcard.add(new IOException()); //not compiles, cannot add any elements 
									// (type safety, compiler doesnt know which generic type is on the actual list)
	}

	public static void main(String[] args) {
		List<IOException> iOExceptions = new ArrayList<>();
		List<FileNotFoundException> fileNotFoundExceptions = new ArrayList<>();
		List<Throwable> throwables = new ArrayList<>();
		listUpperBounded(iOExceptions);
		listUpperBounded(fileNotFoundExceptions);
//		listUpperBounded(throwables); //not compiles, "IS NOT AN" Exception
		
		List<? extends Exception> exceptions = new ArrayList<RuntimeException>(); // works fine (upper bound wildCard)
	}
}
