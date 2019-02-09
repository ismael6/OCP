package edu.ocp.exceptionsAndAssertions.exceptions.tryWithResources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author IsmaSp6
 *
 */
public class Basics {
	public static void main(String[] args) throws IOException {
		Path path = null;
		
//		try with resources allows initializing resources on try init block (resources must implement Autocloseable interface)
		try(BufferedReader reader = Files.newBufferedReader(path);
				BufferedWriter writer = Files.newBufferedWriter(path)) {
			writer.write(reader.readLine());
		} // RESOURCES CLOSED AUTOMATICALLY AT THE END OF TRY BLOCK
		
//		try with resources allows 0-N catch blocks and 0-1 finally blocks
		try(BufferedReader reader = Files.newBufferedReader(path)) {
			reader.readLine();
		} // RESOURCES CLOSED AUTOMATICALLY AT THE END OF TRY BLOCK
		catch(IOException e) {
//			System.out.println(reader); // resources are try scope only
		}
		finally {
//			System.out.println(reader); // resources are try scope only
		}
	}
}
