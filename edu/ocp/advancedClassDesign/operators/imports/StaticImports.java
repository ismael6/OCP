package edu.ocp.advancedClassDesign.operators.imports;

import static java.lang.Math.*; // Allows using STATIC ELEMENTS without the Math class canonical name
import static java.lang.System.out; // Allows using a SPECIFIC STATIC ELEMENT without the System class canonical name

/**
 * @author IsmaSp6
 *
 */
public class StaticImports {
	
	void m1() {
		out.println(sqrt(3));
	}
}
