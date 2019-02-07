package edu.ocp.exceptionsAndAssertions.tryWithResources.supressedExceptions;

/**
 * @author IsmaSp6
 *
 */
public class DrowingExceptions {
	public static void main(String[] args) {
		try(AA aa = new AA()){
			throw new IllegalStateException("on try"); 
		}
		finally {
			throw new RuntimeException("on finally"); // primary and drowned exception lost
		}
	}
}

class AA implements AutoCloseable{

	@Override
	public void close() throws NullPointerException{
		throw new NullPointerException("on close");
	}
	
}
