package edu.ocp.nio2.pathOperations;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 *
 *	takes out '..' and '.' wildcards and do its corresponding operations
 */
public class PathNormalize {
	public static void main(String[] args) {
		Path path1 = Paths.get("F:/data");
		Path path2 = Paths.get("F:/user/docs");
		Path path3 = Paths.get("F:/user/../docs/./file/../../home.txt");
		
		Path relativized = path1.relativize(path2); // ../user/docs
		System.out.println(relativized);
		System.out.println(path1.resolve(relativized)); // F:/data/../user/docs
		
//		NORMALIZE
		System.out.println(path1.resolve(relativized).normalize()); // F:/user/docs
		System.out.println(path3.normalize()); // F:\home.txt
	}
}
