package edu.ocp.io.streams.console;

import java.io.Console;

/**
 * @author IsmaSp6
 *
 *	
 *	console.format(String, Object...);
 *	console.printf(String, Object...);
 *
 *	format and printf both are the same
 */
public class FormatAndPrintf {
	public static void main(String[] args) {
		Console console = System.console();
		console.format("p","test");
		console.printf("p","test");
	}
}
