package edu.ocp.concurrency.singleThreadExecutor.callable;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

/**
 * @author IsmaSp6
 *
 */
public class CallableVsSupplier {
	public static void main(String[] args) {
//		overloaded(() -> 5); // not compiles (ambiguous method call, both takes zero parameters and return a type)
		
		callable(() -> {throw new Exception();}); // OK, callable signature throws Exceptions
//		supplier(() -> {throw new Exception();}); // not compiles without Exception handler (supplier signature do not throws Exceptions)
	}
	
	static void overloaded(Callable<Object> callable){}
	static void overloaded(Supplier<Object> supplier){}
	
	static void callable(Callable<Object> callable){}
	static void supplier(Supplier<Object> supplier){}
}
