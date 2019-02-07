package edu.ocp.exceptionsAndAssertions.tryWithResources.supressedExceptions;

import java.io.IOException;

/**
 * @author IsmaSp6
 *
 */
public class EvenIfSuppresedNeedsHandle {
	public static void main(String[] args) {
		
		// the primary exception is RuntimeException;
		// but the suppresed checked exception needs to be handled
		// even if its correspondent catch block will not be used
		try(BB bb = new BB()){
			throw new RuntimeException();
		}
		catch(RuntimeException rte) { 
			System.out.println("for primary exception");
		} 
		catch (IOException e) {
			System.out.println("for supressed checked exception, not used but compiler rules requires it");
		}
	}
}

	
class BB implements AutoCloseable{
	
	@Override
	public void close() throws IOException {
		
	}
}