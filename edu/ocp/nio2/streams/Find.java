package edu.ocp.nio2.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author IsmaSp6
 *
 *
 */
public class Find {
	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get(".").toRealPath();
		Files
			.find(path1, // path
				5, 		// max depth
				(Path path, BasicFileAttributes attributes) -> //search condition (Bipredicate <Path, BasicFileAttributes>)
					path.toString().endsWith(".java") && attributes.isRegularFile())
			.forEach(System.out::println);
	}
}
