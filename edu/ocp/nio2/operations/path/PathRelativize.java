package edu.ocp.nio2.operations.path;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 *
 *	returns the relative 'ResultantPath' from 'PathA' to 'PathB' (How to go from A to B)
 *		'PathA' and 'PathB' should be both relative OR both absolute, 
 *			if not Exception at runtime
 *		On windows, if 'PathA' and 'PathB' are absolute, both must have the same root directory
 *			if not Exception at runtime
 *	
 *	
 */
public class PathRelativize {
	public static void main(String[] args) {
//		for relative paths, relativize works as both are on the same directory
		Path relative1 = Paths.get("files/file.txt");
		Path relative2 = Paths.get("docs/document.txt");
		System.out.println(relative1.relativize(relative2));
		System.out.println(relative2.relativize(relative1));

//		absolute paths
		System.out.println();
		Path absolute1 = Paths.get("c:/files/file.txt");
		Path absolute2 = Paths.get("c:/info.txt");
		System.out.println(absolute1.relativize(absolute2));
		System.out.println(absolute2.relativize(absolute1));
		
//		absolute vs relative RUNTIME EXCEPTION
//		Path absolute3 = Paths.get("c:/files/file.txt");
//		Path relative3 = Paths.get("info.txt");
//		System.out.println(absolute3.relativize(relative3));

//		absolutes with diferent root RUNTIME EXCEPTION
		Path absolute4 = Paths.get("c:/files/file.txt");
		Path absolute5 = Paths.get("info.txt");
		System.out.println(absolute4.relativize(absolute5));
		
	}
}
