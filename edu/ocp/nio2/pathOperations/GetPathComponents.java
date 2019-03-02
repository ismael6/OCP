package edu.ocp.nio2.pathOperations;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 * 
 *	All of the return Path
 *		getFileName -> get last element of the Path
 *		getRoot -> get root element of the Path OR null if its a relative Path 
 *		getParent -> get Path with all elements except last element of this Path OR null if there is no parent
 */
public class GetPathComponents {
	public static void main(String[] args) {
		getPathComponents(Paths.get("/user/docs/files/file.txt"));
		System.out.println();
		getPathComponents(Paths.get("docs/files/file.txt"));
	}
	
	public static void getPathComponents(Path path) {
		System.out.println("name: "+path.getFileName());
		System.out.println("root: "+path.getRoot());
		Path parent = path;
		while((parent = parent.getParent())!=null) {
			System.out.println("parent: "+parent);
		}
	}
}
