package edu.ocp.nio2.files.attributes.noThrowing;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 * 
 * 
 * 	NOT throws Exception, simply returns false
 *
 */
public class IsReadableExecutable {
	public static void main(String[] args) {
		System.out.println(Files.isReadable(Paths.get("/user/play")));
		System.out.println(Files.isExecutable(Paths.get("/user/play")));
	}
}
