package edu.ocp.io.streams.console;

import java.io.Console;

/**
 * @author IsmaSp6
 *
 *	returns an String
 */
public class ReadLine {
	public static void main(String[] args) {
		Console console = System.console();
		if(console != null) {
			String userInput = console.readLine();
			System.out.println(userInput);
		}
	}
}
