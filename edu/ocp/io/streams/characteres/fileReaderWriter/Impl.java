package edu.ocp.io.streams.characteres.fileReaderWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author IsmaSp6
 *
 *	FileReader.read() -> reads the next character, returns -1 on EOF
 *	FileReader.write() -> writes the character read
 */
public class Impl {
	public static void main(String[] args) throws FileNotFoundException, IOException {
	}
	
	private static void readWrite(File in, File out) throws FileNotFoundException, IOException {
		try(FileReader fr = new FileReader(in);
				FileWriter fw = new FileWriter(out)){
			int read;
			while((read = fr.read()) > 0) {
				fw.write(read);
			}
		}
	}
}
