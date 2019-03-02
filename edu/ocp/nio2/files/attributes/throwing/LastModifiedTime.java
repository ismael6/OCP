package edu.ocp.nio2.files.attributes.throwing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

/**
 * @author IsmaSp6
 *
 *	getLastModifiedTime: FileTime
 *	setLastModifiedTime(Path, FileTime)
 *	
 *	throws IOException
 */
public class LastModifiedTime {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/user/config.txt");
		
		System.out.println(Files.getLastModifiedTime(path).toMillis());
		
		System.out.println(Files.setLastModifiedTime(path, FileTime.fromMillis(System.currentTimeMillis())));
	}
}
