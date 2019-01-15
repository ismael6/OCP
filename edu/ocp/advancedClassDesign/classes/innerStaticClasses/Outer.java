package edu.ocp.advancedClassDesign.classes.innerStaticClasses;

import edu.ocp.advancedClassDesign.classes.innerStaticClasses.Outer.MemberStaticInner.MemberStaticInner2;

/**
 * @author IsmaSp6
 * 
 * Member Static Inner Classes (MSIC) rules
 *
 */
public class Outer {
	
	static String outer = "outer";
	String outerInstance = "outerInstance";

//	Only at class scope level
	static class MemberStaticInner { // can be abstract or final, should be static (if not, it is Member Instance Inner Class (MIIC) and other rules apply)
		
		private static String memberStaticInner = "memberStaticInner"; 
			
		static class MemberStaticInner2 extends Outer implements I{ // MSIC allows private, package-private, protected and public on class definition
			
			public static String memberStaticInner2 = "memberStaticInner2";	
			protected String a = "instance member";
			private static String b = "static member";
			
			void m() {
				String outer = Outer.outer; // MSIC can access outer scope members
				String outerInstance = new Outer().outerInstance;  
			} 
			
//			Can contain MIIC (Member Instance Inner Classes)
			class Inner{
				
			}
		}
	}
	
	public static void main(String[] args) {
		Outer.MemberStaticInner.MemberStaticInner2 memberStaticInner2 = new MemberStaticInner2(); // Being memberStaticInner2 a MSIC, there is NO NEED of instantiation of previous scopes
		
		Object b = MemberStaticInner.MemberStaticInner2.b; // Outer classes can access to MSIC static elements 
		Object a = memberStaticInner2.a; // Outer classes can access to MSIC instance elements 
		
		Outer outer = new MemberStaticInner2(); // MSIC can extends any class of their outer context
		I i = new MemberStaticInner2(); // MSIC can implement any interface of their outer context
		
	}
	
	interface I{
		
	}
}
