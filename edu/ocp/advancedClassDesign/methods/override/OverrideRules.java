package edu.ocp.advancedClassDesign.methods.override;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author IsmaSp6
 * Override rules
 *
 */
class OverrideRules extends Father{
	public static void main(String[] args) {
		System.out.println(3);
	}
	
	/**
	 * 1.- Exactly same signature (method name and parameters type and order) (if not, is overloading)
	 * 2.- Equal or more permissive modifier than the father method (or not compiles)
	 * 3.- Same or Covariant return type (or not compiles)
	 * 4.- Subset of the exceptions thrown off by the father (or not compiles) (only for checked exceptions)
	 * 5.- Methods should be instance scope (one static and one instance not compiles) (both static results in hiding)
	 */
	public Integer overrides(int a) throws FileNotFoundException, NullPointerException{
		return null;
	}
}

class Father{
	Number overrides(int bx) throws IOException, SQLException{
		return null;
	}
}