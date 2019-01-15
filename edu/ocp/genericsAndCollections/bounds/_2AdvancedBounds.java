package edu.ocp.genericsAndCollections.bounds;

import java.util.ArrayList;

public class _2AdvancedBounds {
	
//******************IMPORTANT!!!! -> INSTANCES CANNNOT DEFINE BOUND GENERIC TYPES, ONLY CONCRETE GENERIC TYPES*********************
	void m1() {
		new ArrayList<String>(); //OK, concrete generic type 
//		new ArrayList<? extends String>(); //NOT COMPILES, ONLY CONCRETE GENERIC TYPES ALLOWED ON INSTANCE DEFINITION
	}
//*********************************************************************************************************************************

	
//	<T>	<? extends T> m1(List <? extends T> list) { // not compiles (return type must be a concrete type)
//		return list.get(0);
//	}
	
//	<B extends A> B m2(List<B> list) {
//		B b = new B(); //not compiles (B Formal generic type hides B class in all method body)
//		return new B(); //not compiles (B Formal generic type hides B class in all method body)
		// NOTE: only return type truly refers on type B, and not the B Formal generic
//	}
	
//	<X> void m3(List<X super B> list) {} //not compiles, identifiers are allowed on left side of "extends"/super ONLY on the definition of generic
}


class A{}

class B extends A{}

class C extends B{}