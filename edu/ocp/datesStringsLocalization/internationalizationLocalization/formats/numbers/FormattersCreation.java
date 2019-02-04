package edu.ocp.datesStringsLocalization.internationalizationLocalization.formats.numbers;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author IsmaSp6
 *
 */
public class FormattersCreation {
	public static void main(String[] args) {
		
//		general purpose formatters
		NumberFormat generalNf1 = NumberFormat.getInstance();
		NumberFormat generalNf2 = NumberFormat.getInstance(new Locale("es", "MX"));
		
		NumberFormat generalNf3 = NumberFormat.getNumberInstance();
		NumberFormat generalNf4 = NumberFormat.getNumberInstance(new Locale("es", "MX"));
		
		
//		monetary formatters
		NumberFormat monetaryNf1 = NumberFormat.getCurrencyInstance();
		NumberFormat monetaryNf2 = NumberFormat.getCurrencyInstance(new Locale("es", "MX"));
		
		
//		percentages formatters
		NumberFormat percentageNf1 = NumberFormat.getPercentInstance();
		NumberFormat percentageNf2 = NumberFormat.getPercentInstance(new Locale("es", "MX"));
	}
}
