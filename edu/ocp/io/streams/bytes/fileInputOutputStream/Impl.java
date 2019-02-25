package edu.ocp.io.streams.bytes.fileInputOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author IsmaSp6
 *
 *	Read or Write BYTES to a file
 *	
 *	Constructor parameters -> File or String representing the path
 *	input.read():int -> return next byte element data (-1 if end of file)
 *	output.write(int) -> write bytes into the element data
 */
public class Impl {
	public static void main(String[] args) throws IOException {
		File in = new File("in.txt");
		File out = new File("out.txt");
		readWrite(in, out);
	}
	
	private static void readWrite(File in, File out) throws IOException {
		try(InputStream is = new FileInputStream(in);
				OutputStream os = new FileOutputStream(out)){
			int b;
			while((b = is.read()) != -1){
				os.write(b);
			}
		}
	}
}
