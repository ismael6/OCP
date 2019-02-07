package edu.ocp.exceptionsAndAssertions.basics;

/**
 * @author IsmaSp6
 *
 * try block -> potentially exception thrown piece of code
 * catch block -> executes when exception is thrown
 * finally block -> always executes after try block OR after catch block
 * 
 * A try is always required
 * a [catch()] OR [finally] is always required
 * 
 * 
 */
public class TryCatchFinallyCombinations {
	public static void main(String[] args) {
//		try with catch
		try {}
		catch(Exception e) {}

//		try with finally		
		try {}
		finally {}
		
//		try with catch and finally
		try {}
		catch(Exception e) {}
		finally {}
		
//		try with more than one catch
		try {}
		catch(RuntimeException e) {}
		catch(Exception e) {}
		
		try {}
		catch(Exception e) {}
//		catch(RuntimeException e) {} // unreachable code (catching order goes from more specific to more general)
		
//		try {}
//		catch(IOException e) {} // not compiles (unreachable code, CACHED exceptions should be potentially thrown on try block)
	}
}
