package edu.ocp.genericsAndCollections.generics.clasesAndInterfaces;

/**
 * @author IsmaSp6
 *
 *	There are three different ways of implementing from a super type with generics
 *  a.- Keeping with the FORMAL generic type
 *  b.- Defining the ACTUAL generic type
 *  c.- Ignoring the generic type
 *
 */
public class UseGenericsFromParent<A> 
	extends Parent<A> 		//a.- Keeping with the FORMAL generic type  
	implements I<Integer>,  //b.- Defining the ACTUAL generic type
	J						//c.- Ignoring the generic type 
	{

//	****************a, b and c implementations***************************
	@Override public void mParent(A t) {}

	@Override public void mI(Integer t) {}

	//	Ignoring generic type forces to use Object by default
	@Override public void mJ(Object t) {}
//	**********************************************************************
}


class Parent<T>{
	public void mParent(T t) {}
}

interface I<T>{
	public void mI(T t);
}

interface J<T>{
	public void mJ(T t);
}