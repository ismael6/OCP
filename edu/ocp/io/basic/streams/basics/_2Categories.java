package edu.ocp.io.basic.streams.basics;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author IsmaSp6
 * 
 *	Distinguished by its postfix
 *		*stream -> read all types of binary data (FileInputStream)
 *		*writer/reader -> read/write characters and String data (FileReader)
 *
 *	Distinguished by its direction (In most cases if there is an output, there is an input)
 *		input* (FileInputStream)
 *		output* (FileOuputStream)
 *
 *	Distinguished by its abstraction level
 *		low-level stream -> process the raw data and accesed on a direct and unfiltered manner (FileReader)
 *		high-level stream -> wraps low-level or high-level streams (BufferedReader)
 *
 */
public class _2Categories {
	public static void main(String[] args) throws IOException {
//		low-level stream
		FileInputStream fis = new FileInputStream("file.txt");
		
//		high-level stream (wraps low-level stream)
		BufferedInputStream bis = new BufferedInputStream(fis);

//		high-level stream (wraps high-level stream)		
		ObjectInputStream ois = new ObjectInputStream(bis);
	}
}
