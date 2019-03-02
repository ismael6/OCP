package edu.ocp.nio2.pathOperations;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 * 
 *  + All of them return String
 *		toString -> string view of path
 *		getNameCount -> number of levels in path tree (FILE SYSTEM ROOT EXCLUDED!!!)
 *		getName -> element at n position of the path tree (FILE SYSTEM ROOT EXCLUDED!!!)
 *
 */
public class PathView {
	public static void main(String[] args) {
		Path path = Paths.get("/user/files/file.txt");
		
		System.out.println(path.toString()); // string representation of the path
		System.out.println(path.getNameCount()); // number of elements on path tree
		for(int i = 0; i < path.getNameCount(); i++) {
			System.out.println(path.getName(i)); // string representation of a path tree node
		}											//(FILE SYSTEM ROOT EXCLUDED)
	}
}
