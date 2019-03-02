package edu.ocp.nio2.pathOperations;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 *
 *	subpath(int,int) -> get path from including first element and excluding last element
 */
public class SubpathsFromPath {
	public static void main(String[] args) {
		Path path1 = Paths.get("/zero/one/two.txt");
		System.out.println(path1);
		
		System.out.println("from 0 to 2: "+path1.subpath(0, 3)); // max node = 2, max value allowed 3 (excluding = 2)
		System.out.println("from 0 to 1: "+path1.subpath(0, 2));
		System.out.println("from 1 to 2: "+path1.subpath(1, 3));
		
//		System.out.println("from 1 to 2: "+path1.subpath(0, 4)); // IllegalArgumentException, there is not node 3
//		System.out.println("from 1 to 2: "+path1.subpath(1, 1)); // IllegalArgumentException, it says take node 1 and until node 1(excluding)
	}
}
