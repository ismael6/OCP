package edu.ocp.nio2.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author IsmaSp6
 * 
 *	traverses on a depth-first way
 *
 *	Files.walk(Path):Stream<Path> throws IOException
 *		maximum search depth -> Integer.MAX_VALUE by default
 *
 *	Files.walk(Path, int):Stream<Path> throws IOException
 *		maximum search depth -> int value provided
 *		0 search depth -> only this directory
 *
 *
 *	+ take care of using FOLLOW_LINKS not carrying circular paths!!! ( detect it and advise with FileSystemLoopException )
 */
public class Walk {
	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("./").toRealPath();
		Stream<Path> paths = Files.walk(path1);
		paths
			.filter(p -> p.toString().endsWith(".java"))
			.forEach(System.out::println);
	}
}
