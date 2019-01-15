package edu.ocp.designPatternsAndPrinciples.interfaces.functionalInterface;

/**
 * @author IsmaSp6
 *
 */
@FunctionalInterface // it applies only to interface with one abstract method
interface FunctionalInterfaceA {   
	void m1(); // abstract method
	static void m2() {}
	default void m3() {}
}

@FunctionalInterface
interface A extends FunctionalInterfaceA{ // Still having one abstract method (inherited)
	
}

//@FunctionalInterface // not compiles, it have 2 abstract methods (m1() and m4())
interface B extends A{
	void m4(); // abstract method
}