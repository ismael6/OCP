package edu.ocp.advancedClassDesign.methods.overload;

/**
 * @author IsmaSp6
 * Overloading method rules selection for object parameters
 *
 */
public class OverloadMethodSelectionRulesObjectArgument {
	
	/**
	 * Overload Rules method choices priority:
	 * 
	 */
	public static void main(String... strings) {
		a(new Integer(0));
	}
	
	/**
	 * 1.- Exact match
	 */
	static void a(Integer a) {
		System.out.println("Integer");
	}
	
	/**
	 * 2.- Upcasting
	 */
	static void a(Number a) {
		System.out.println("Number");
	}
	
	/**
	 * 3.- Unboxing
	 */
	static void a(int a) {
		System.out.println("int");
	}
	
	/**
	 * 4. varg-args exact array type
	 */
	static void a(Integer... integers) {
		System.out.println("Integer...");
	}
	
	/**
	 * 5.- varg-args Upcasting array type
	 */
	static void a(Number... numbers) {
		System.out.println("Number...");
	}
	
	/**
	 * 6.- var-args Upcasting from specific until general types
	 */
	static void a(Object... objects) {
		System.out.println("Object...");
	}
}
