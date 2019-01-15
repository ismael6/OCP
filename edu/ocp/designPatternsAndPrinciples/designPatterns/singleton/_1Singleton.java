package edu.ocp.designPatternsAndPrinciples.designPatterns.singleton;

/**
 * @author IsmaSp6
 */
public class _1Singleton {
		
//	Always private constructor, grants responsibility only to this class on object creation and being effectively final
	private _1Singleton() {}
	
//	Always a method for returning the singleton instance
	public static _1Singleton getInstance() {
		return singleton;
	}
	
//	*****************Instantiation on field definition*******************
//	private static final Singleton singleton = new Singleton();
//	****************************************************************
	
//	*****************Instantiation on static block***********************
	private static final _1Singleton singleton;

	static{
//		can use try catch or another sentences
		singleton = new _1Singleton();
	}
//	****************************************************************
	
	private int a;
	
//	*******synchronized methods grants 1 client access per time*****
	public synchronized int getA() {
		return a;
	}
	
	public synchronized void setA(int a) {
		this.a = a;
	}
//	****************************************************************
}
