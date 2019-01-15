package edu.ocp.designPatternsAndPrinciples.polymorphism;

/**
 * @author IsmaSp6
 * 
 * DownCasting needs explicit casting
 */
public class _2Cast {
	public static void main(String[] args) {
		Son classReference = new Son();
		
//		UpCasting does not need explicit cast
		FatherClass father = classReference;

//		DownCasting REQUIRES EXPLICIT cast
//		Son downCastNotExplicit = father; // not compiles
		Son classReferenceAgain = (Son)father;
		
//		Compiler allows cast operator only between types on the same inheritance hierarchy
//		FatherClass castWithDifferentHierarchy = (I)father; // not compiles
		
		
		FatherClass f = new FatherClass();
//		ClassCastException at runtime
		Son c = (Son) f; // "f" points to an instance of Father (the instances is not a Son type)
	}
}

class Son extends FatherClass {}

class FatherClass{}

interface I{}
