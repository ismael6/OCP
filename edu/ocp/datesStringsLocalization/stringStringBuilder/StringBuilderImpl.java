package edu.ocp.datesStringsLocalization.stringStringBuilder;

/**
 * @author IsmaSp6
 *
 */
public class StringBuilderImpl {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		sb1.append("cad");
		StringBuilder sb2 = new StringBuilder();
		sb2.append("cad");
		
		System.out.println(sb1 == sb2); // false
		System.out.println(sb1.equals(sb2)); // false (StringBuilder equals() compares references)
		
		StringBuilder sb3 = sb2.reverse(); // sb3 points to same sb2 instance
		System.out.println(sb3 == sb2); // true
	}
}
