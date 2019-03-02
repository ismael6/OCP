package edu.ocp.nio2.files.attributes.throwing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 *
 *	its the conceptual size, not the size occupied on storage device
 *	result is system-dependent called on a directory
 *	
 *	Throws IOException
 *	
 */
public class Size {
	public static void main(String[] args) throws IOException {
		System.out.println(Files.size(Paths.get("user/file.txt")));
	}
}
