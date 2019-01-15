package edu.ocp.genericsAndCollections.bounds;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author IsmaSp6
 *
 * <? super T> -> Lower Bound Wildcard (allows any generic that "IS A SUPER TYPE" of T or T itself)
 */
public class _1LowerBoundWildcard {
	
//	Accepts any generic type that "IS A SUPER TYPE" of Exception
	static void listUpperBounded(List<? super IOException> upperBoundWildcard) {
		for(Object o : upperBoundWildcard) {System.out.println(o);}
		
		upperBoundWildcard.remove(0); // Ok, can remove
		
		upperBoundWildcard.add(new FileNotFoundException()); //OK, can add "IS A" types of bound limit typess
		
//		upperBoundWildcard.add(new Exception()); //not compiles, cannot add super type elements of bound limit type(IOException)
												// (type safety, considers case when list contains bound limit type, implicit downcasting not allowed)
	}

	
	public static void main(String[] args) {
		List<Exception> exceptions = new ArrayList<>();
		List<Object> objects = new ArrayList<>();
		List<FileNotFoundException> fileNotFOundExceptions = new ArrayList<>();
		listUpperBounded(exceptions);
		listUpperBounded(objects);
//		listUpperBounded(fileNotFOundExceptions); // not compiles, isnt a super type of IOException
	
		List<? super IOException> list = new ArrayList<Exception>();
	}
}
