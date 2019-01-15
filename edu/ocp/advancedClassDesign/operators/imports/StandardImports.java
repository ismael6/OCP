package edu.ocp.advancedClassDesign.operators.imports;

import java.math.*; // Allows using Types of java.util package without its canonical names
import java.util.List; // Allows using Type java.util.List without its canonical name
import java.sql.Date;
//import java.util.Date; // same name class on import section not allowed 

/**
 * @author IsmaSp6
 *
 */
public class StandardImports {
	
	private List<BigDecimal> a;
	
	private Date sqlDate;
	
	private java.util.Date utilDate; // If same name class, solve it using canonical name
}
