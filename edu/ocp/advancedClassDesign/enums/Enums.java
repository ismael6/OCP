package edu.ocp.advancedClassDesign.enums;

/**
 * @author IsmaSp6
 *
 * The base class of Every enum is Enum<E>
 * 
 * Enums can implement interfaces
 */
public class Enums {
	
	public static void main(String[] args) {
		
		I e = NUMBERS.ONE; // The constructor is called only one time by every enum element ("constructor call" 4 times)
		
		I another = NUMBERS.ONE; // The constructor isn´t called again
		
		System.out.println(NUMBERS.ONE); // the Enum.toString() method returns Enum.name
		
		System.out.println(e == NUMBERS.ONE); // True
		
		for(NUMBERS number : NUMBERS.values()) { // enums can be iterated
			System.out.println(number.name() + " " + number.ordinal()); // ordinal begins in zero
		}
		
		
		NUMBERS number = NUMBERS.ONE;	
		switch (number) { // Switch variable can be an enum
			case ONE:
			case TWO:
	//		case NUMBERS.THREE: // only unqualified values of the enum allowed
		}

//		NUMBERS.ONE == 0; not compiles, invalid assignment opperator (types incompatibles)
		
//		e = NUMBERS.valueOf("FiVe"); // Runtime exception, enum not found (case sensitive)
	}
}

enum NUMBERS implements I{  
	
	ONE(1) {public void m(){}},  
	TWO("two") {public void m(){}}, 
	THREE("three") {public void m(){}}, 
//	FOUR() {public void m(){}}, // not compiles, should match with one of the constructors
	FIVE("five") {public void m(){}},
//	SIX("seis") {} // not compiles, if there are abstract methods, every enum should implement any of them
	; 
	
	public abstract void m();

	NUMBERS(String s) {System.out.println("String constructor call "+s);} //	ONLY PRIVATE OR DEFAULT PACKAGE CONSTRUCTORS ALLOWED

	private NUMBERS(int s) {System.out.println("int constructor call "+s);} //	ONLY PRIVATE OR DEFAULT PACKAGE CONSTRUCTORS ALLOWED
}

interface I{
	
}