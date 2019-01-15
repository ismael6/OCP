package edu.ocp.designPatternsAndPrinciples.interfaces;

/**
 * @author IsmaSp6
 *
 */
interface FatherInterface{
	void m1();
	void m2();
}

interface InterfaceRelationships extends FatherInterface, Runnable{ // interface vs interfaces, can only extend
	void m3();
	default void m1() { // it inherits all methods from father interface and even can change their scope
	}
}

class FatherClass implements InterfaceRelationships, Runnable{ // classes vs interfaces, can only implement
	@Override
	public void run() {	}

	@Override
	public void m2() { }

	@Override
	public void m3() { }

}