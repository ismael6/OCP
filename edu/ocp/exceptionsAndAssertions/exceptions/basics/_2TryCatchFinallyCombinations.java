package edu.ocp.exceptionsAndAssertions.exceptions.basics;

/**
 * @author IsmaSp6
 *
 * try block -> potentially exception thrown piece of code
 * catch block -> executes when exception is thrown
 * finally block -> always executes after  end of try block OR after end of catch block
 * 
 * A try is always required
 * if is try without resources, a [catch()] OR [finally] is always required
 * 
 * 
 */
public class _2TryCatchFinallyCombinations {
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
//		catch(IOException e) {} // not compiles (unreachable code, CHECKED exceptions should be potentially thrown on try block)
	}
}
