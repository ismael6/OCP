package edu.ocp.nio2.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 *
 *	Files.lines(Path): Stream<String>
 *
 *	same than Files.readAllLines but returing a Stream<String> (lazyness)
 *	
 */
public class Lines {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\ismael\\Documents\\estudio\\Java\\OCP\\Examples\\src\\edu\\ocp\\genericsAndCollections\\DiamondOperator.java").toRealPath();
		Files.lines(path).forEach(System.out::println);
	}
}
