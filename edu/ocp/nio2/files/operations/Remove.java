package edu.ocp.nio2.files.operations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 *
 *	delete()
 *		removes a file/directory
 *		throws IOException if the file not exists
 *	
 *	deleteIfExists()
 *		removes a file/directory (if not exists return false)
 *
 *
 *	+ if the target is a symbolic link, only the link is deleted
 *	+ throws IOException if its a non-empty directory
 *
 */
public class Remove {
	public static void main(String[] args) throws IOException {
		Files.delete(Paths.get("/user/dirs"));
		Files.deleteIfExists(Paths.get("/user/dirs"));
	}
}
