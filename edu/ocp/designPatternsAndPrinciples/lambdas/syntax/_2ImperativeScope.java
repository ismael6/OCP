package edu.ocp.designPatternsAndPrinciples.lambdas.syntax;

/**
 * @author IsmaSp6
 *
 * Imperative scope syntax is more-like java standar sintax
 * 	
 * Parameter part rules.- 
 * 		1.- Explicit type on every parameter is mandatory
 * 		2.- Surrounded by parentheses (if not, evaluates as functional scope syntax)
 * 		3.- Allows zero or more parameters
 * 		
 * Function body part rules.-
 * 		1.- Surrounded by curly brackets (if not, evaluates as functional scope syntax)
 * 		2.- Allows zero or more statements/expressions
 * 
 */
class _2ImperativeScope {
	public static void main(String[] args) {
	
		ManyParametersVoidReturn lambda = 
				(Integer i, Object o, _2ImperativeScope is) -> 
						{
							System.out.println("zero or more sentences and expressions allowed");
							int a = 4;
							//return 9; // cannot return because the functional interface contract establishes void return type
						};
						
		NonParametersWithTypeReturn lambda1 = 
				//For the body part, at least one expressions needed (the return value)
				//the semicolon at the return statement and at the end of the lambda expression are mandatory by java syntax language
				() ->
					{return 3;};
	}
}

interface ManyParametersVoidReturn{
	void m1(Integer integer, Object object, _2ImperativeScope imperativeScope);
}

interface NonParametersWithTypeReturn{
	int m1();
}