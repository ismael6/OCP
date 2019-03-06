package edu.ocp.nio2.files.attributes.throwing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;

/**
 * @author IsmaSp6
 *
 *	getOwner: UserPrincipal
 *	setOwner()
 *
 *	throws Exception
 */
public class Owner {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/user/config.txt");
		System.out.println(Files.getOwner(path));
		UserPrincipal user = path.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName("isma");
		Files.setOwner(path, user);
	}
}
