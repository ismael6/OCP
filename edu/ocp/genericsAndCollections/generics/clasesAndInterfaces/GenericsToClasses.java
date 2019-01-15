package edu.ocp.genericsAndCollections.generics.clasesAndInterfaces;

/**
 * @author IsmaSp6
 * 
 * Class generic types are defined AFTER THE NAME of the class
 * Class generic types are visible on all instance elements of the class
 */
class GenericsToClasses <GenericTypeA, GenericTypeB, GenericTypeC> {
	
	public static void main(String[] args) {
		GenericsToClasses<Number, Object, Integer> a = new GenericsToClasses<>();
	}
	
	public static void staticM1() {
//		GenericTypeA g; //not compiles (CLASS GENERICS ARE ONLY INSTANCE SCOPE)
	}

//	visible on instanceInitilizer
	{ 
		GenericTypeA onInstanceInitilizer; 
	}

	
//	visible on fieldDefinition
	private GenericTypeA onFieldDefinition;

//	visible on method return type, signature and body
	public GenericTypeA m1(GenericTypeA genericTypeA) {
		GenericTypeA onMethodBody;
		return genericTypeA;
	}
}