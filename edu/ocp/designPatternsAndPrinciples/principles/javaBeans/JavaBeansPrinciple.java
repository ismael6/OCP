package edu.ocp.designPatternsAndPrinciples.principles.javaBeans;

/**
 * @author IsmaSp6
 *
 * JavaBeans are Simple Objects for storing/retrieving information at runtime
 */
public class JavaBeansPrinciple {
	
//	Properties always private
	private boolean b;
	private Boolean bWrapper;
	
	public boolean getB() {
		return b;
	}
	
//	if getter of boolean property, its ok to use "is" prefix
	public boolean isB() {
		return b;
	}
	
	public boolean getBWrapper() {
		return bWrapper;
	}

//	if getter of Boolean property, is wrong to use "is" prefix (not the standard)
	public boolean isBWrapper() {
		return bWrapper;
	}
}
