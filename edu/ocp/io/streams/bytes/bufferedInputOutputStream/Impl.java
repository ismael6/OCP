package edu.ocp.io.streams.bytes.bufferedInputOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author IsmaSp6
 * 
 * WRAPS FileInputStream / FileOutputStream
 * 
 * BufferedInputStream read(byte[]) method reads number into provided array and returns number of bytes readed, returns -1 on EOF
 * BufferedInputStream write(byte[] data, int off, int length) method writes into the stream the data with the specified offset and length
 *
 */
public class Impl {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File in = new File("in.txt");
		File out = new File("out.txt");
		readWrite(in, out);
	}
	
	private static void readWrite(File in, File out) throws FileNotFoundException, IOException {
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(in));  //FIS wrapped
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(out))){ //FOS wrapped
			byte[] buffer = new byte[1024];
			int bytesRead; //number of bytes readed
			while((bytesRead = bis.read(buffer)) > 0) {
				bos.write(buffer, 0, bytesRead);
				bos.flush();
			}
		}
	}
}
