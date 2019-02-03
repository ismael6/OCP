package edu.ocp.datesStringsLocalization.internationalizationLocalization.resourceBoundles;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author IsmaSp6
 *
 */
public class OnPropertiesFile {
	public static void main(String[] args) {
		
		String bundlesPath = "edu.ocp.datesStringsLocalization.internationalizationLocalization.resourceBoundles.Cinema";
		
//		get resource bundle
		ResourceBundle rs = 
				ResourceBundle.getBundle(bundlesPath, new Locale("esss"));
		
//		get specific element from resource bundle
		System.out.println(rs.getString("test"));
		
//		get all key values from resource bundle
		System.out.println();
		rs.keySet()
			.stream()
			.map(key -> key + " - " + rs.getString(key))
			.forEach(System.out :: println);
	}
}
