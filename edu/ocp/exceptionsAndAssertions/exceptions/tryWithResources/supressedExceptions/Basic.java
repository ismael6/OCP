package edu.ocp.exceptionsAndAssertions.exceptions.tryWithResources.supressedExceptions;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author IsmaSp6
 *
 */
public class Basic {
	public static void main(String[] args){
		try(ResourceType rt = new ResourceType()){
			throw new IOException("on try block"); // the first exception happening is taken as the primary exception
												   // exceptions happening on the close() are part of the primary as SupressedExceptions
		}
		catch(IOException primaryException) {
			System.out.println(primaryException.getMessage());
			for(Throwable supressed : primaryException.getSuppressed()) {
				System.out.println(supressed.getMessage());
			}
		}
	}
}

class ResourceType implements Closeable{
	@Override
	public void close() throws IOException {
		throw new IOException("on close method");
	}
}
