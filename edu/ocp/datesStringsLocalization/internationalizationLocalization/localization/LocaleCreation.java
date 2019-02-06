package edu.ocp.datesStringsLocalization.internationalizationLocalization.localization;

import java.util.Locale;

/**
 * @author IsmaSp6
 *
 */
public class LocaleCreation {
	public static void main(String[] args) {
		
//		using constant
		Locale withEnum = Locale.FRENCH;
		System.out.println(withEnum); //fr
		
		
//		using constructor
		System.out.println();
		Locale withConstructor = new Locale("fR", "cA"); //it solves upper/lower case typos
		System.out.println(withConstructor); //fr_CA
		
		Locale withConstructorWrongString = new Locale("ASD", "ASDF"); // compiles and runs, but not match any real locale
		System.out.println(withConstructorWrongString); //asd_ASDF
		
		
//		using builder
		System.out.println();
		Locale withBuilder = new Locale.Builder()
								.setRegion("FR")
								.setLanguage("fr")
								.build();
		System.out.println(withBuilder);
	}
}
