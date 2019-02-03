package edu.ocp.datesStringsLocalization.internationalizationLocalization.resourceBoundles;

/**
 * @author IsmaSp6
 *
 * 1.- goes for requested locale resource name
 * 2.- takes most specific match 
 * 3.- when java resource and properties file tie, prefers java resource
 * 4.- if not found, takes out country and do 2, 3 again
 * 5.- if not found, takes out language and do 2, 3 again
 * 6.- if not found, search for user default locale as 4, 5
 * .- if not, throw MissingResourceException
 */
public class ResourceBundlePriorityCheck {
	// searching steps for resource Cinema with Locale("es", "MX") with default locale "en", "US"
		// as requested	
			//	a) Cinema_es_MX.java //exactly requested, priority on java resource
			//	b) Cinema_es_MX.properties //exactly requested on properties file
			//	c) Cinema_es.java 	//taked out country on java resource
			//	d) Cinema_es.properties //taked out country on properties file
		// as defaut locale
			//	e) Cinema_en_US.java //exactly default locale, priority on java resource
			//	f) Cinema_en_US.properties //exactly default locale on properties file
			//	g) Cinema_en.java 	//taked out country on java resource
			//	h) Cinema_en.properties //taked out country on properties file
		//	as default bundle
			//	i) Cinema.java //priority on java resource
			//	j) Cinema.properties //properties file
		// if not found throw MissingResourceException
}
