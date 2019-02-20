package edu.ocp.io.basic.file;

import java.io.File;

/**
 * @author IsmaSp6
 *
 *	Represents the pathname of a particular file or directory on the fileSystem
 *
 *	Used to:
 *		+ read metadata about files and directories
 *		+ create/rename/delete files and directories
 */
public class FileCreation {
	public static void main(String[] args) {
		File fileFromAbsolutePath = new File("absolute/path/file.txt");
		System.out.println(fileFromAbsolutePath+" "+fileFromAbsolutePath.exists());
		
		File parentPath = new File("parent/path");
		File childPath = new File(parentPath, "files/file.txt");
		System.out.println(childPath+" "+childPath.exists());
		
		File parentNull = null;
		File childPathParentNull = new File(parentNull, "files/file.txt");
		System.out.println(childPathParentNull);
		
	}
}
