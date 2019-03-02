package edu.ocp.nio2.files.operations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author IsmaSp6
 *
 *	glues Buffered Reader/Writer with NIO2 Path 
 *
 *
 *	newBufferedReader: BufferedReader (Path, Charset)
 *	newBufferedWriter: BufferedWriter (Path, Charset)
 *
 */
public class NewBufferedReaderWriter {
	
	static void read() throws IOException {
		try(BufferedReader br = 
				Files.newBufferedReader(
						Paths.get("/user/file.txt"),
						Charset.defaultCharset())){
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
	}
	
	static void write() throws IOException{
		try(BufferedWriter bw = 
				Files.newBufferedWriter(
						Paths.get("/user/file.txt"),
						Charset.defaultCharset())){
			bw.write("fasdasg");
		}
	}
}
