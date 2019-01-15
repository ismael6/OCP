package edu.ocp.advancedClassDesign.operators.instanceOf;

/**
 * @author IsmaSp6
 * Instanceof operator rules
 *
 */
class InstanceOf {
	public static void main(String... args) {
		System.out.println(new B() instanceof A); //True (B is an A)
		System.out.println(new A() instanceof B); //False (A is not a B)
		
		System.out.println(null instanceof A);    //Always false

		System.out.println(new B() instanceof I); //False (even if the INTERFACE type isn´t in the same hierarchy, it compiles)
		
//		System.out.println(new B() instanceof InstanceOf()); //Not compiles, the CLASS isn´t in the same hierarchy tree
	}
}

class A{
	
}

class B extends A{
	
}

interface I{
	
}
