package edu.ocp.nio2.views.basicFileAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author IsmaSp6
 *
 *	readAttributes(Path, Class<A extends BasicFileAttributes>): BasicFileAttributes
 *		+ only read
 */
public class ReadingAttributes {
	public static void main(String... egfd) throws IOException {
		
		String pathValue = ".";
		
		Path path = Paths.get(pathValue).toRealPath();
		
		BasicFileAttributes attributes = 
				Files.readAttributes(path, BasicFileAttributes.class);

		System.out.println("path -> "+path);
		System.out.println("isDirectory -> "+attributes.isDirectory());
		System.out.println("isRegularFile -> "+attributes.isRegularFile());
		System.out.println("isSymbolicLink -> "+attributes.isSymbolicLink());
		System.out.println("isOther -> "+attributes.isOther());
		
		System.out.println("size on bytes -> "+attributes.size());
		
		System.out.println("creationTime -> "+attributes.creationTime());
		System.out.println("lastAccessTime -> "+attributes.lastAccessTime());
		System.out.println("lastModifiedTime -> "+attributes.lastModifiedTime());
		System.out.println("fileKey -> "+attributes.fileKey());
	}
}
