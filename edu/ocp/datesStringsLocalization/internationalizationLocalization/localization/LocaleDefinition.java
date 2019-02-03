package edu.ocp.datesStringsLocalization.internationalizationLocalization.localization;

import java.util.Locale;

/**
 * @author IsmaSp6
 *
 * Localization (l10n): A specific geographical, political or cultural region
 * 
 * 
 * Locale: language - country pairing
 * Locale syntax: languagecode + [ _+COUNTRYCODE ]
 */
public class LocaleDefinition {
	public static void main(String[] args) {

		//	current locale
		Locale current = Locale.getDefault();
		System.out.println(current); //es_MX
		
//		change default locale
		System.out.println();
		System.out.println("change default locale");
		System.out.println(Locale.getDefault());
		Locale.setDefault(new Locale("fr", "FR"));
		System.out.println(Locale.getDefault());
		
//	wrong locale formats
//			MX (language code is required)
//			esMX (missing underscore)
//			ES (language code must lowercase)
//			ES_mx (language code must lowercase, country code must upper case)
		
		
	}
}
