package edu.ocp.exceptionsAndAssertions.exceptions.tryWithResources.supressedExceptions;

import java.io.IOException;

/**
 * @author IsmaSp6
 *
 */
public class CatchBlocksGoForPrimaryException {
	public static void main(String[] args) {
		
//		primary exception is the first one happening, and the one visible by catch blocks
		try(ResourceClose rc = new ResourceClose()){
			throw new ArrayIndexOutOfBoundsException("on try block");
		}
		catch(IOException e) { // not cached, primary Exception is ArrayIndexOutOfBoundsException 
			System.out.println("cached");
		}
	}
}

class ResourceClose implements AutoCloseable{
	@Override
	public void close() throws IOException {
		throw new IOException("on close method");
	}
}