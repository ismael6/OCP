package edu.ocp.nio2.operations.files.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 *
 *	Files.copy(InputStream, Path, CopyOptions...)
 *	
 *	Files.copy(Path, OutputStream)
 *
 */
public class NIO2AndIO {
	public static void main(String[] args) throws IOException {
		try(InputStream	is = new FileInputStream("/user/file.txt");
				OutputStream os = new FileOutputStream("/user/file.txt")){
			
			Files.copy(is, Paths.get("/user-copied/file.txt"));
			
			Files.copy(Paths.get("/user-copied/file.txt"), os);
		}
	}
}
