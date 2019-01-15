package edu.ocp.advancedClassDesign.classes.innerAnonymousClasses;

/**
 * @author IsmaSp6
 * 
 *  Anonymous Local Inner Classes (AIC) rules
 */
public class Outer {
	
//	Can be defined in static initializer
	static{
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("test");
			}
		};		
	}
	

//	Can be defined in instance initializer
	{
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("test");
			}
		};		
	}
	
//	Can be defined in constructor 
	Outer(){
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("test");
			}
		};
	}
	
//	Can be defined in methods
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("test");
			}
		};
		
		I o = new A() {void m () {System.out.println("modified");}};
	}
}

class A extends Outer implements I{
	void m() {
		System.out.println("m");
	}

	@Override
	public void i() {
		System.out.println("i");
	}
}

interface I{
	void i();
}
