package edu.ocp.advancedClassDesign.methods.virtualInvocation;

/**
 * @author IsmaSp6
 * 
 * Note:
 * -----------------------------------------------------------
 * A a = new B();
 * (Reference type is on the left side of the equals sign) (A)
 * (Instance type is on the right side of the equals sign) (B)
 * ------------------------------------------------------------
 */
public class MethodsVirtualInvocation {
	
	public static void main(String[] args) {
		A a = new B(); 
		a.m1(); // "m1() B" (on methods, invokes the method of the INSTANCE TYPE (virtual method invocation))
		System.out.println(a.getValue()); // "Value B" (Virtual invocation again)
		
		System.out.println(a.value); // "Value A" (on fields, it simply invokes the REFERENCE TYPE value) 
									 // (fields doesn´t override, they hides)
	}
}

class A{
	
	String value = "value A";
	
	public void m1() {
		System.out.println("m1() A");
	}
	
	public String getValue() {
		return value;
	}
}

class B extends A{
	
	String value = "value B";
	
	public void m1() {
		System.out.println("m1() B");
	}
	
	public String getValue() {
		return value;
	}
}
