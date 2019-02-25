package edu.ocp.io.streams.console;

import java.io.Console;

/**
 * @author IsmaSp6
 *
 *	return and char[]
 */
public class ReadPassword {
	public static void main(String[] args) {
		Console console = System.console();
		if(console != null) {
			char[] userInput = console.readPassword();
			System.out.println(userInput);
		}

	}
}
