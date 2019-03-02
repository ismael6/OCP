package edu.ocp.nio2.files.operations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author IsmaSp6
 *
 *	read all lines o the file and saves them in a List<String>
 *
 *	throws IOException if file not exists
 *
 */
public class ReadAllLines {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/user/file.txt");
		List<String> lines = Files.readAllLines(path);
		for(String line: lines) {
			System.out.println(line);
		}
		
	}
}
