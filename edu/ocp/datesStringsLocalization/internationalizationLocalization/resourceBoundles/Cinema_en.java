package edu.ocp.datesStringsLocalization.internationalizationLocalization.resourceBoundles;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author IsmaSp6
 *
 *	locale properties defined in class file, Class name syntax: {ResourceBundle_locale} and extends ListResourceBundle 
 * 
 */
public class Cinema_en extends ListResourceBundle {
	public static void main(String[] args) {
		String path = "edu.ocp.datesStringsLocalization.internationalizationLocalization.resourceBoundles.Cinema";
		
		ResourceBundle rb = ResourceBundle.getBundle(path, new Locale("en"));
		System.out.println(rb.getObject("cinema"));
//		System.out.println(rb.getString("cinema")); // runtimeException ('cinema' value is not a String)
	}

//	Extending ListResourceBundle allows to define locale properties on this class
	@Override
	protected Object[][] getContents() {
		return new Object[][] {
//			{8, 999}, //runtime exception (all keys must be String)
			{"8", 999},
			{"cinema", new Object()},
			{"movies", "Películas"}
		};
	}
}
