package edu.ocp.io.streams.printStreamWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author IsmaSp6
 *
 */
public class PrintWriterImpl {
	public static void main(String[] args) throws FileNotFoundException {
		String parentPath = System.getProperty("user.dir");
		File file = new File(parentPath, "src/edu/ocp/io/file.txt");
		try(PrintWriter out = new PrintWriter(file)){
				
			out.print(2);
			out.write(String.valueOf(100));
				
			out.print(new PrintWriterImpl());
			out.write(new PrintWriterImpl().toString());
		}
	}
}
