package edu.ocp.nio2.basics.fileSystem;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * @author IsmaSp6
 *
 *	FileSystem -> abstraction representing a FileSystem agent on a operative system(local or remote)
 *	FyleSystems -> factory methods for FileSystem
 *
 */
public class Creation {
	public static void main(String[] args) throws URISyntaxException {
		
//		gets default fileSystem
		FileSystem currentUserFileSystem = FileSystems.getDefault();
		Path path1 = currentUserFileSystem.getPath("/user/file.txt");
		Path path2 = currentUserFileSystem.getPath("/,user,file.txt");
		
//		gets remote fileSystem		
		FileSystem remoteFileSystem = FileSystems.getFileSystem(new URI("http://www.fileSystemRemote.net"));
		Path remotePath1 = remoteFileSystem.getPath("/user/file.txt");
		Path remotePath2 = remoteFileSystem.getPath("/,user,file.txt");
	}
}
