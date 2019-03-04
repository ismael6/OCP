package edu.ocp.nio2.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 *
 *	Files.list(Path):Stream<Path>
 *	
 *	same behavior of File.listFiles but returning Stream<Path>
 *	exactly same behavior of calling Files.walk(1)
 */
public class List {
	public static void main(String[] args) throws IOException{
		Files
			.list(Paths.get(".").toRealPath()).
			forEach(System.out::println);
	}
}
