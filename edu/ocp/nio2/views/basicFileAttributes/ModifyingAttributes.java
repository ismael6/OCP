package edu.ocp.nio2.views.basicFileAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/**
 * @author IsmaSp6
 *
 *	Files.getFileAttributeView(Path, Class<A extends BasicFileAttributeView>): BasicFileAttributeView
 *		gets a view of file attributes
 *		with this view, dates data of file can be modified
 *
 *	BasicFileAttributeView.readAttributes(): BasicFileAttributes
 *		+ only read
 *
 *	BasicFileAttributeView.setTimes(lastModified, lastAccess, create)
 *		+ modifies non null correspondent values
 */
public class ModifyingAttributes {
	public static void main(String[] args) throws IOException {
		String pathValue = ".";
		Path path = Paths.get(pathValue).toRealPath();
		
		BasicFileAttributeView view = 
				Files.getFileAttributeView(path, BasicFileAttributeView.class);

		BasicFileAttributes data = view.readAttributes();
		
		System.out.println(data.creationTime());
		System.out.println(data.lastModifiedTime());
		System.out.println(data.lastAccessTime());
		
		FileTime lastModified = FileTime.fromMillis(0);
		FileTime lastAccess = FileTime.fromMillis(0);
		FileTime create = FileTime.fromMillis(0);
		
		view.setTimes(lastModified, lastAccess, create);
		
		System.out.println(data.creationTime());
		System.out.println(data.lastModifiedTime());
		System.out.println(data.lastAccessTime());
	}
}
