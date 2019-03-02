package edu.ocp.nio2.pathOperations;

import java.nio.file.Paths;

/**
 * @author IsmaSp6
 *
 *	Many path methods returns a new Path, so the operations can be chained 
 */
public class Basics {
	public static void main(String[] args) {
//		chaining path methods
		Paths.get("files/text.txt").getParent().normalize().toAbsolutePath();
	}
}