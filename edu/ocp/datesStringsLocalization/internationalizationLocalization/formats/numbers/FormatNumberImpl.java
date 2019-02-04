package edu.ocp.datesStringsLocalization.internationalizationLocalization.formats.numbers;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author IsmaSp6
 * 
 *	number -> String
 */
public class FormatNumberImpl {
	public static void main(String[] args) {
		BigDecimal number = new BigDecimal("123465");
		
		System.out.println("formatting numbers");
		NumberFormat usFormatNumber = NumberFormat.getInstance(Locale.US);
		System.out.println(usFormatNumber.format(number)); // ',' separator

		NumberFormat grFormatNumber = NumberFormat.getInstance(Locale.GERMAN);
		System.out.println(grFormatNumber.format(number)); // '.' separator
		
		NumberFormat caFormatNumber = NumberFormat.getInstance(Locale.CANADA_FRENCH);
		System.out.println(caFormatNumber.format(number)); // ' ' separator
		

		
		System.out.println();
		System.out.println("formatting currency");
		NumberFormat usFormatCurrency = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(usFormatCurrency.format(number)); // '$' symbol prefix
		
		NumberFormat grFormatCurrency = NumberFormat.getCurrencyInstance(Locale.GERMAN);
		System.out.println(grFormatCurrency.format(number)); // '¤' symbol prefix
		
		NumberFormat caFormatCurrency = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
		System.out.println(caFormatCurrency.format(number)); // '$' symbol suffix
	}
}
