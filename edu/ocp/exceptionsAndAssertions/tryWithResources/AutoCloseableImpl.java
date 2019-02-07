package edu.ocp.exceptionsAndAssertions.tryWithResources;

import java.io.IOException;

/**
 * @author IsmaSp6
 *
 * As recommendation, close() method should be Idempotent and throw a subset of Exception (nothing is a valid subset)
 */
public class AutoCloseableImpl {
	public static void main(String[] args) {

//		try(A a = new A()) {} //not compiles (A do not implements AutoCloseable)
		
		try(B b = new B()) {} //ok, B implements AutoCloseable
		
		try(C c = new C()) {} // needs to handle or delegate IOException thrown by C.close()
		catch(IOException e) {}  
	}
}

class A{}

class B implements AutoCloseable{ @Override public void close(){} }

class C implements AutoCloseable{ @Override public void close() throws IOException{} }