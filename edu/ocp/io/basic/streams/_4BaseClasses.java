package edu.ocp.io.basic.streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * @author IsmaSp6
 *
 *	There are four abstract classes parents of all stream classes
 *		InputStream
 *		OutputStream
 *		Reader
 *		Writer
 *
 *	In most cases the name of the abstract parent class is suffix of the child class
 *		+ ObjectInputStream -> IS AN InputStream
 *		+ FileWriter -> IS A Writer
 *
 *	Constructors of high-level streams commonly take reference of this abstract classes
 *		+ BufferedWriter(Writer)
 *		+ InputStreamReader(InputStream)
 *
 */
public class _4BaseClasses {
	public static void main(String[] args) {
//		----------BASE ABSTRACT CLASSES-------------
		InputStream is; // read binary data
		OutputStream us; // write binary data
		Reader r; // read characters or Strings
		Writer w; // write characters or Strings
		
//		-------------------LOW LEVEL----------------
//		STREAMS (bytes)
		FileInputStream fis; //reads file data as bytes
		FileOutputStream fos; //writes file data as bytes
		
//		READER/WRITERS (characters)
		FileReader fr; //Reads file data as characters
		FileWriter fw; //Writes file data as characters
		
//		-----------------HIGH LEVEL------------------
//		BUFFEREDS
		BufferedReader br; //Reads character data from an existing writer in a buffered manner
		BufferedWriter bw; //Writes character data from an existing writer in a buffered manner

//		STREAMS (bytes)
		ObjectInputStream ois; //Deserializes primitive java data types and graphs of java objects from an InputStream
		ObjectOutputStream ous; // Serializes primitive java data types and graphs of java objects to an OutputStream

//		Readers/Writers (characters)
		InputStreamReader isr; // Reads character data from an existing InputStream
		OutputStreamWriter osw; // Writes character data to an existing OutputStream

//		OBJECT writers
		PrintStream ps;//Writes java Objects to a binary stream
		PrintWriter pw;//Writes java Objects to a text-based output stream
	}
}
