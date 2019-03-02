package edu.ocp.nio2.operations.files;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 *
 *	returns true if the file/directory referenced by the Path exists on file system
 */
public class Exists {
	public static void main(String[] args) {
		System.out.println(Files.exists(Paths.get("/user/conf.txt")));
	}
}
