package edu.ocp.io.streams.console;

import java.io.Console;
import java.io.Reader;
import java.io.Writer;

/**
 * @author IsmaSp6
 *
 *	console.reader() -> returns a Reader object
 *	console.writer() -> returns a Writer object
 */
public class ReaderAndWriter {
	public static void main(String[] args) {
		Console console = System.console();
		Reader reader = console.reader();
		Writer writer = console.writer();
	}
}
