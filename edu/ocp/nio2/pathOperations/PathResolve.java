package edu.ocp.nio2.pathOperations;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 *
 *	PathA.resolve(PathB)
 *		when PathB is relative, joins PathA with PathB
 *		when PathB is absolute, returns copy of PathB
 *
 */
public class PathResolve {
	public static void main(String[] args) {
		Path absoultePath1 = Paths.get("/user");
		Path absoultePath2 = Paths.get("/system");
		Path relativePath1 = Paths.get("../file.txt");
		Path relativePath2 = Paths.get("docs/doc.txt");
		System.out.println(absoultePath1.resolve(relativePath1)); // absolute.resolve(relative) -> join paths
		System.out.println(relativePath1.resolve(relativePath2)); // relative.resolve(relative) -> join paths
		System.out.println(relativePath1.resolve(absoultePath1)); // relative.resolve(absolute) -> keeps with root path
		System.out.println(absoultePath1.resolve(absoultePath2)); // absolute.resolve(absolute) -> keeps with second root path
	}
}
