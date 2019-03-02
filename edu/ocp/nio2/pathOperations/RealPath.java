package edu.ocp.nio2.pathOperations;

import java.io.IOException;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 *
 *	normalizes and return the real Path instance if it exists on fileSystem
 *		if its a symbolic link, the returning Path is the Path pointed by this symbolic link
 *		throws IOException if file not exists on fileSystem 
 */
public class RealPath {
	public static void main(String[] args) throws IOException {
		System.out.println(Paths.get(".").toRealPath());
	}
}