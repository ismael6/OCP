package edu.ocp.exceptionsAndAssertions.basics;

import java.io.IOException;

/**
 * @author IsmaSp6
 *
 * syntax-> ExceptionA + [| ExceptionB] + [|ExceptionN] + identifier
 */
public class MultiCatch {
	public static void main(String[] args) {
		try {} 
		catch (NullPointerException | ArithmeticException | NumberFormatException e) {}
		
//		try {} 
//		catch (NullPointerException e1 | ArithmeticException e2 | NumberFormatException e3) {} // not compiles (bad sintax)
		
//		try {} 
//		catch (NullPointerException |RuntimeException e) {} // not compiles (NullPointerException IS A RuntimeException (redundancy))
		

		
//		--------------multi catch requires effectively final argument-------------------------------------------
		
//		try {} 
//		catch (NullPointerException | ArithmeticException | NumberFormatException e) {
//			e = new RuntimeException(); // not compiles, multicatch requires effectively final
//		}
		
		try {} 
		catch (RuntimeException e) {
			e = new RuntimeException(); // ok, is not multicatch
		}
	}
}
