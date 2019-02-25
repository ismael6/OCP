package edu.ocp.io.streams.console;

import java.io.Console;
import java.io.IOException;

/**
 * @author IsmaSp6
 *
 *	Console object -> 
 *		singleton
 *		instance provided by JVM with System.console()
 *			+ returns null when text interactions are not allowed in environment
 *		
 */
public class ConsoleImpl {
	public static void main(String[] args) throws IOException {
		Console console = System.console();
		if(console != null) {
			String userInput = console.readLine();
			System.out.println(userInput);
		}
	}
}
