package edu.ocp.datesStringsLocalization.stringStringBuilder;

/**
 * @author IsmaSp6
 *
 * Strings are immutable, operations create a new String and returns it
 */
public class StringImpl {
	public static void main(String[] args) {

		String onPool1 = "cad"; // goes to pool String, if already exists, points to it
		String onPool2 = "cad"; // goes to pool String, if already exists, points to it 
		String onHeap1 = new String("cad"); // goes to all objects heap
		System.out.println(onPool1 == onPool2); // true
		System.out.println(onPool1.equals(onPool2)); // true
		System.out.println(onPool1 == onHeap1); // false 
		System.out.println(onPool1.equals(onHeap1)); // true
		
//		concatenation
		System.out.println();
		System.out.println("concatenation");
		System.out.println(1+2+"3");// 33
		System.out.println("1"+2+3);// 123
	}
}
