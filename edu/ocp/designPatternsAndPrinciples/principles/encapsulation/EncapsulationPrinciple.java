package edu.ocp.designPatternsAndPrinciples.principles.encapsulation;


/**
 * @author IsmaSp6
 *
 * The same class and only the same class can change his own values through his own methods (setters)
 * The same class and only the same class can return his own values through his own methods (getters)
 * 
 * 	This way, The same class checks for invariance and data access rules
 */
public class EncapsulationPrinciple {
	
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}
