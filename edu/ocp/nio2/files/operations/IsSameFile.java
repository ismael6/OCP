package edu.ocp.nio2.files.operations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 *
 *	Determines if two Paths references to same file
 *		NOT checks content of files, checks Path location (follows symbolic links)
 *		1.- if PathA.equals(PathB) automatically return true (even if files not exists)
 *		2.- else locate each file and see if both have the same Path
 *		3.- if one file do not exists throws IOException
 *		
 */
public class IsSameFile {
	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("/user/files/file.txt");
		Path path2 = Paths.get("/user/files/file.txt");
		Path path3 = Paths.get("/user/files/spec/../file.txt");
		
		System.out.println(Files.isSameFile(path1, path2)); // true even files do not exists
		System.out.println(Files.isSameFile(path2, path3)); // throw Exception because files not exists (even if the Path normalized is the same)
	}
}
