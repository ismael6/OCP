package edu.ocp.exceptionsAndAssertions.assertions;

/**
 * @author IsmaSp6
 *
 * Assertion -> Boolean expression, that checks for correctness on business model 
 * 		if assertions enabled and any assertion is false, an AssertionError is thrown
 * 
 * Allowed syntax:
 *  1) assert 'expression' (expression part can be surrounded by parenthesis)
 * 	1) assert 'expression' : 'message' (expression part can be surrounded by parenthesis)
 *  
 * Assertions are disabled by default 
 * If Assertions are not enabled, program execution ignores assertions
 * 
 * Its highly recommended assertions being nullpotent
 */
public class Definition {
	public static void main(String[] args) {
		assert 1 == 2;
		assert (1 == 2);
		assert 1 == 2: "sfd";
		assert (1 == 2): "sfd";
	}
}
