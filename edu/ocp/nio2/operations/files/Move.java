package edu.ocp.nio2.operations.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 *
 *	moves or rename files or directories
 *		move() on directory moves it with its contained elements
 *		- if directory is NOT-empty
 *			+ can be moved if destination is on the SAME drive
 *			+ throw Exception if destination is on DIFFERENT drive
 *
 *		* will follow links (NOFOLLOW_LINKS to not)
 *		* throw Exception if file/directory already exists (REPLACE_EXISTING to replace)
 *		* not atomic move (ATOMIC MOVE to do (throw exception if file system not supports atomic))
 *
 *		Throw Exception if the correspondent Paths not exists
 */
public class Move {
	public static void main(String[] args) throws IOException {
		Files.move(Paths.get("/user/dir"), Paths.get("/user/dirs/movedDir")); // move and rename dir with all its contained elements
		Files.move(Paths.get("/user/dir/file.txt"), Paths.get("/user/movedDir/file.txt")); // move file 
	}
}
