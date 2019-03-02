package edu.ocp.nio2.files.operations.copy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 *	copy only the element referenced by the Path into the specified Path destination
 *		* throw Exception when Paths do not exist on file system OR file cannot be read
 *		* not copy inner files or directories
 *		* traverse symbolic links (NOFOLLOW_LINKS to not)
 *		* not override if already exist on destination (REPLACE_EXISTING to do)
 *		* not copy file attributes (COPY_ATTRIBUTES to do)
 */
public class FullNIO2 {
	public static void main(String[] args) throws IOException {
		Files.copy(Paths.get("user"), Paths.get("user-copied")); // copy just the directory
		Files.copy(Paths.get("user/file.txt"), Paths.get("user-copied/file.txt")); // copy just the file
	}
}
