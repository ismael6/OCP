package edu.ocp.nio2.operations.path;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 *
 *	isAbsolute -> tells if path is absolute (File system dependent)
 *	toAbsolutePath -> returns absolute path; if already absolute, returns a copy
 */
public class PathAbsolute {
	public static void main(String[] args) {
		Path absoluteUnixSyntax = Paths.get("/files/file.txt");
		System.out.println(absoluteUnixSyntax.isAbsolute());
		System.out.println(absoluteUnixSyntax.toAbsolutePath());
		
		Path absoluteWinSyntax = Paths.get("C:/files/file.txt");
		System.out.println(absoluteWinSyntax.isAbsolute());
		System.out.println(absoluteWinSyntax.toAbsolutePath());
	}
}
