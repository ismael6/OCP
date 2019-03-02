package edu.ocp.nio2.files.attributes.throwing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 * 
 * if its an element with the property hidden
 * 
 * 	Throw IOException if element is not accesible or not exist
 *
 */
public class IsHidden {
	public static void main(String[] args) throws IOException {
		System.out.println(Files.isHidden(Paths.get("user/config.txt")));
	}
}
