package edu.ocp.advancedClassDesign.methods.ObjectCommon;

/**
 * @author IsmaSp6
 *
 */
class CommonObjectMethods {
	public static void main(String[] args) {
		System.out.println(new A().toString());
		System.out.println(new A().equals(new A()));
		System.out.println(new A().hashCode());
	}
}

class A {
//	toString -> Object by default returns getClass().getName() + "@" + Integer.toHexString(hashCode());
//	equals -> Object by default compares references (this == object)
//	hashcode -> prints the hashcode of the object
}

class OverrideCommonObjectMethods {
	public String toString() {
		return "state of the object (values of fields) (human friendly String)";
	}
	
	public boolean equals(Object compareObject) {
//		evaluates comparing object type and fields (if the state of this object is equals to the state of "compareObject")
		return true;
	}
	
	public int hashCode() {
//		returns a code that categorizes this object with other common objects (for similar objects)
//		(for example in a maze of cards, diamond card objects return the same hashCode)
		return 0;
	}
}