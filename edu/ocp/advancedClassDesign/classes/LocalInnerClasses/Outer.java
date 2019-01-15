package edu.ocp.advancedClassDesign.classes.LocalInnerClasses;

/**
 * @author IsmaSp6
 * 
 * Local Inner Classes (LIC) rules
 *
 * Can be defined at static initializer, instance initializer, constructor or method
 *
 */
public class Outer {
	
	public String outer = "outer";
	
	void m1(final String finalVariable) {
		
		String effectivellyFinal = "effectivellyFinal"; // Is "effectivelly final" if its value isn´t modified on the code  
		
//		effectivellyFinal = ""; // if uncomment, it`s no more effectively final 
		
		final class LocalInner{ // CANNOT use static, private, package-private, protected or public modifiers
			abstract class LocalInner2{ // final and abstract modifiers allowed
				void m1() {
					
					System.out.println(outer); // can access the outer CLASS context elements
					
					System.out.println(finalVariable); // can access to the outer METHOD context elements if FINAL
					System.out.println(effectivellyFinal); // can access to the outer METHOD context elements if EFFECTIVELY FINAL
				}
			}
		}
//		static class staticInnerLocal{} // STATIC MODIFIER NOT ALLOWED
	}
}
