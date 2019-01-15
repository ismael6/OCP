package edu.ocp.designPatternsAndPrinciples.interfaces;

/**
 * @author IsmaSp6
 *
 */
public interface InterfaceElements {
	
	String CONSTANT = "CONSTANT"; // implicit public static final modifiers and initialization on same line is mandatory
	
	void abstractMethod(); // implicit public abstract modifiers and without body
	
	static void staticMethod() {} // implicit public modifier and with body
	
	default void defaultMethod() {} // implicit public modifier and with body
}
