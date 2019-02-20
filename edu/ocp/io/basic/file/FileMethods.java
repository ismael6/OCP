package edu.ocp.io.basic.file;

import java.io.File;
import java.io.IOException;

/**
 * @author IsmaSp6
 *
 */
public class FileMethods {
	public static void main(String[] args) throws IOException {
		String parentPath = System.getProperty("user.dir");
		File file = new File(parentPath, "src/edu/ocp/io/file.txt");
		System.out.println(file +" "+ file.exists());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.length());
		System.out.println(file.lastModified());
		System.out.println(file.getParent());
//		file.delete();
//		file.renameTo(new File("new/path/renamed.txt"));

		File directory = new File(parentPath, "src/edu/ocp/io/directory");
//		directory.mkdir(); // creates directory only if parent path exists
//		directory.mkdirs(); // creates directory including parent path if needed
		for(File f : directory.listFiles()) {
			System.out.println(f);
		}
		
	}
}
