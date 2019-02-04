package edu.ocp.datesStringsLocalization.internationalizationLocalization.formats.numbers;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * @author IsmaSp6
 *
 * String -> number
 * 
 * 
 * parses until there is an invalid token or the string ends
 */
public class ParseNumberImpl {
	public static void main(String[] args) throws ParseException {
//		parsing numbers
		String cad1 = "50.50";
		String cad2 = "50,50";
		
		NumberFormat usFormat = NumberFormat.getInstance(Locale.US); //'.' decimal separator
		NumberFormat frFormat = NumberFormat.getInstance(Locale.GERMAN); //',' decimal separator
		
		System.out.println(usFormat.parse(cad1)); //50.5
		System.out.println(frFormat.parse(cad1)); //5050
		
		System.out.println(usFormat.parse(cad2)); //5050
		System.out.println(frFormat.parse(cad2)); //50.5

		
//		parsing currency
		System.out.println();
		System.out.println("currency");
		NumberFormat usCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat grCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.GERMAN);
		System.out.println(usCurrencyFormat.parse("$656556.65")); //656556.65
		System.out.println(grCurrencyFormat.parse("$656556.65")); // throws exception, '$' symbol is not a valid currency German symbol 
		
		
		System.out.println();
		System.out.println(usFormat.parse("32asdfsdf")); // 32
//		System.out.println(usFormat.parse("a65")); // throws exception (nothing to parse on the beginning of String)
	}
}
