package edu.ocp.genericsAndCollections.generics;

/**
 * @author IsmaSp6
 *
 * ************************NOTE***************************
 * FORMAL parameter -> void m1(String formalParameter) {}
 * ACTUAL parameter -> m1("actualParameter");
 * *******************************************************
 *
 * FORMAL generic types are defined using a valid identifiers surrounded by angle brackets,
 * ACTUAL generic types are defined using valid existing types surrounded by angle brackets
 * 
 * *********************NOTE 2*****************************
 * TYPE ERASURE -> the compiler don`t use generics,
 *  everything is Object being automatically casted to the generic specific type
 * 
 */
								//FORMAL generic types
public class _1GenericsBasics <GenericTypeA, GenericTypeB>{
	public static void main(String[] args) {
						//ACTUAL generic types											// explicitly specifying types (error prone)
		_1GenericsBasics<Object, Number> explicitActualGenericTypes = new _1GenericsBasics<Object, Number>();
//		_1GenericsBasics<Object, Number> explicitActualGenericTypes = new _1GenericsBasics<Long, Long>(); // not compiles (actual generic types mismatch)
		
						//ACTUAL generic types											// Diamond operator (infers actual generic types)
		_1GenericsBasics<Object, Number> inferredActualGenericTypes = new _1GenericsBasics<>();
	}
}
