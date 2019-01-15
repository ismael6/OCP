package edu.ocp.advancedClassDesign.classes.innerClasses;

//import edu.ocp.classes.innerClasses.MemberInnerOuter.MemberInner.MemberInner2;

/**
 * @author IsmaSp6
 * 
 * Member Instance Inner Classes (MIIC) rules
 *
 */
class Outer {
	
	private String x = "outer";
	
	private static String staticX = "staticX";
	
//	Only at class scope level
	class MemberInner{ // can be abstract or final, CANNOT BE static (if static, it is a Member Static Inner Class (MSIC) and other rules apply)
	
		private String x = "inner";
		
		private class MemberInner2 extends Outer implements I{ // MIIC allows private, package-private, protected and public on class definition
		
			private String x = "inner2"; // MIIC allows private, package-private, protected and public allowed on fields and methods
			
			void printOuterX() {
				System.out.println(Outer.this.x); // MIIC can access to outer scope members
				System.out.println(Outer.staticX); 
			}
			
			void printInnerX() {
				System.out.println(MemberInner.this.x);
			}
			
			void printInner2X() {
				System.out.println(this.x);
			}
			
//			static void a() {} // MIIC doesn´t allow static elements
			
			static final String STATIC_FINAL_FIELD = ""; // little exception, MIIC allow STATIC FIELDS if they are final
		}
	}
	
	public static void main(String[] args) {
		Outer classesMemberInner = new Outer();
		Outer.MemberInner memberInner = classesMemberInner.new MemberInner();
		Outer.MemberInner.MemberInner2 memberInner2 = memberInner.new MemberInner2(); // Being MemberInner2 a MIIC, the instantiation of previous scopes is needed
		
		
		Outer.MemberInner.MemberInner2 inner2 =  // Canonical type name
				new Outer().new MemberInner().new MemberInner2();  // initialization in a single line
		
//		MemberInner2 inner2WithoutCanonical;  // with the import help, there is no need on Canonical type name, (take out private modifier of MemberInner2 class)
		
		Outer memberInnerOuter =  new Outer().new MemberInner().new MemberInner2(); // MIIC can extends any class of their outer context
		
		I i = new Outer().new MemberInner().new MemberInner2();  // MIIC can implements any interface of their outer context

		memberInner2.printOuterX();
		memberInner2.printInnerX();
		memberInner2.printInner2X();
	}
}

interface I{ }
