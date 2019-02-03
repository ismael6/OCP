package edu.ocp.datesStringsLocalization.internationalizationLocalization.resourceBoundles;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * @author IsmaSp6
 *
 */
public class UsingPropertiesClass {
	public static void main(String[] args) {
		String bundlesPath = "edu.ocp.datesStringsLocalization.internationalizationLocalization.resourceBoundles.Cinema";
		
//		get resource bundle
		ResourceBundle rs = 
				ResourceBundle.getBundle(bundlesPath, new Locale("esss"));

//		new Properties object
		Properties prop = new Properties();
		
//		filling Properties object
		rs.keySet().stream().forEach(k -> prop.put(k, rs.getString(k)));

//		printing Properties object
		prop.keySet().forEach(System.out :: println);
		
		
		System.out.println();
		System.out.println("getProperty() allows default if not exists");
		System.out.println(prop.getProperty("notExists")); // null 
		System.out.println(prop.getProperty("notExists", "another")); // another
	}
}
