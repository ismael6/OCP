package edu.ocp.exceptionsAndAssertions.tryWithResources.supressedExceptions;

import java.io.IOException;

/**
 * @author IsmaSp6
 *
 */
public class OnManyClosingResourcesExceptions {
	public static void main(String[] args) {
		
//		The first one exception is the primary, the other ones are supressde exceptions
		try(ResourceToClose rtc1 = new ResourceToClose();
				ResourceToClose rtc2 = new ResourceToClose();
				ResourceToClose rtc3 = new ResourceToClose()){
			//to do code
		}
		catch(IOException e) {
			System.out.println("primary: "+e.getMessage()); // primary: on close method
			for(Throwable supressed : e.getSuppressed()) {
				System.out.println(supressed.getMessage()); //on close method, on close method
			}
		}
	}
}

class ResourceToClose implements AutoCloseable{
	@Override
	public void close() throws IOException {
		throw new IOException("on close method");
	}
}
