package edu.ocp.io.basic.concepts;

import java.io.File;

/**
 * @author IsmaSp6
 *
 *	FileSystem -> Reads and writes data within a computer
 *	
 *	File -> A record within a fileSystem that stores user and system data
 *	
 *	Directory -> A record within a fileSystem that contains files and directories
 *	Root directory -> Topmost directory on fileSystem
 *	
 *	Path -> String representation of a file or directory within a file system
 *	Absolute path -> full path from the root directory to the file or directory
 *	Relative path -> path from the current working directory to the file or directory
 *
 *	Separator character -> token to separate hierarchical elements on the path name
 *	
 */
public class BasicConcepts {
	public static void main(String[] args) {
		System.out.println(System.getProperty("file.separator"));
		System.out.println(File.separator);
	}
}
