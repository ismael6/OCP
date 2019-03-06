package edu.ocp.nio2.basics.path;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 *
 *	Path -> Interface (Entry point for working with NIO.2)
 *	Paths -> Class (Factory of Path)
 *
 *	URI -> Uniform resource identifier (constructor throws URISyntaxException)
 *		syntax
 *			schema -> [file://] | [http://] | [https://] | [ftp://] + Path
 */
public class Creation {
	public static void main(String[] args) throws URISyntaxException {
//		using String path
		Path path1 = Paths.get("/user/file.txt");
		Path path2 = Paths.get("/user,file.txt"); // places file separator automatically
		Path path3 = Paths.get("/user/../file.txt"); // allows '.'(this directory) AND '..'(parent directory)
		
//		using URI
//		Path pathURI1 = Paths.get(new URI("file://user/file.txt")); // runtime exception URIs must have absolute paths
		Path pathURI2 = Paths.get(new URI("file:///c:/user/files")); // ok, full path on URI (windows)
		Path pathURI3 = Paths.get(new URI("file:///user/files")); // ok, full path on URI (unix)
	
//		from a File Object
		File file = new File("file.txt");
		Path path = file.toPath(); // for onwards compatibility
		File file2 = path.toFile(); // for backwards compatibility
		
		System.out.println(path1.toUri());
		System.out.println(path2.toUri());
		System.out.println(path3.toUri());
		System.out.println(pathURI2.toUri());

//		Paths path3 = Paths.get("/user/file.txt"); // not compiles, path3 wrong type
//		Path path4 = Path.get("/user/file.txt"); // not compiles, factory wrong type
	}
}
