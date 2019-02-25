package edu.ocp.io.streams.characteres.bufferedReaderWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author IsmaSp6
 *
 *	BufferedReader have the readLine() method that returns the file line as a String or null if EOF
 *	BufferedWriter have the writeLine() method that returns a String representing the line read
 *	BufferedWriter have the newLine() method that inserts a line break
 */
public class Impl {
	public static void main(String[] args) {
		
	}
	
	public static void readWrite(File in, File out) throws FileNotFoundException, IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(in));
				BufferedWriter bw = new BufferedWriter(new FileWriter(out))){
			String lineRead;
			while((lineRead = br.readLine()) != null) {
				bw.write(lineRead);
				bw.newLine();
			}
		}
	}
}
