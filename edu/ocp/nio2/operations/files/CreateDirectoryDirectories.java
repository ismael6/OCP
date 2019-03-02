package edu.ocp.nio2.operations.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 *
 *	createDirectory -> creates directory, throw Exception if parent directories not exists
 *	createDirectories -> creates directory, create needed parents if not exists
 */
public class CreateDirectoryDirectories {
	public static void main(String[] args) throws IOException {
//		Files.createDirectory(Paths.get("docs/files")); runtime exception, parent 'docs' directory not exists
		Files.createDirectories(Paths.get("docs/files.txt")); //ok, create needed parents too
	}
}
