package edu.ocp.designPatternsAndPrinciples.polymorphism;

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
class _1ApplyingPolymorphism {
	public static void main(String[] args) {
		Instance instanceVar = new Instance();
		
//		Polymorphism comes from the capability of upcasting/downcasting.
//		The same instance can be referenced by their "IS A" types without explicit cast
		Father fatherVar = instanceVar;
		Interface interfaceVar = instanceVar;
		
//		Here passing the same instance but wrapped in another reference type (polymorphism)
		m1(interfaceVar);
		m2(fatherVar);
		
//		Automatic upcasting (polymorphism)
		m1(instanceVar);
		m2(instanceVar);
				
//		fatherVar can only access to Father elements type and his super types elements
//		(even the object being of Instance type)
//		fatherVar.mInterface();
	}
	
	private static void m1(Interface i) {}
	
	private static void m2(Father f) {}
	
}

class Instance extends Father implements Interface{
	
	@Override
	public void mInterface() {
		System.out.println("mImplementation");
	}
	
	void mInstance() {}
}

class Father{
	protected int value = 9;
}

interface Interface{
	public void mInterface();
}
