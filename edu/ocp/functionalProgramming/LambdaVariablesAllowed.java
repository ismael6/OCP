package edu.ocp.functionalProgramming;

/**
 * @author IsmaSp6
 *
 * instance fields
 * static fields
 * final or EFFECTIVELY FINAL parameter variables
 * final or EFFECTIVELY FINAL local variables
 * 
 * ********************NOTE*****************************************
 *  Effectively final.- its value is assigned one and only one time
 * *****************************************************************
 */
public class LambdaVariablesAllowed {
	
	private String instanceField;
	
	private static String staticField; 
	
	public void m1(String[] args) {
		String localVariable = "";

		instanceField = "redefining";
		staticField = "redefining";
//		args = "redefining"; //not compiles, local variable is not more effectively final
//		localVariable = "redefining"; //not compiles, local variable is not more effectively final
		
		I i1 = () -> instanceField;
		I i2 = () -> staticField;
		I i3 = () -> args[0] ;
		I i4 = () -> localVariable;
	}
}

interface I{
	String m();
}
