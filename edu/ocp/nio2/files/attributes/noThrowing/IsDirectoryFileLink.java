package edu.ocp.nio2.files.attributes.noThrowing;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 *
 *	isDirectory -> if its directory or link to directory 
 *	isRegularFile -> if its file or link to file
 *	isSymbolicLink -> if its a link
 *
 *
 *	NOT throws exception, if element not exists simply return false
 *
 */
public class IsDirectoryFileLink {
	public static void main(String[] args) {
		System.out.println(Files.isDirectory(Paths.get("/user")));
		System.out.println(Files.isRegularFile(Paths.get("/user")));
		System.out.println(Files.isSymbolicLink(Paths.get("/user")));
	}
}
