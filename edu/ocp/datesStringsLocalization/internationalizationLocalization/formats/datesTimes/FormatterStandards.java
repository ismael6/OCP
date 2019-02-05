package edu.ocp.datesStringsLocalization.internationalizationLocalization.formats.datesTimes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author IsmaSp6
 * 
 * pattern format
 * 	month
 * 		M -> 2
 * 		MM -> 02
 * 		MMM -> Feb
 * 		MMMM -> February
 *  day
 *  	d -> 1
 *  	dd -> 01
 *  year
 * 		y -> 2019
 * 		yy -> 19
 * 		yyy -> 2019
 * 		yyyy -> 2019
 *  hour
 *  	h -> 2	
 *  	hh -> 02
 *  minute
 *  	m -> 3
 *  	mm -> 03
 *  , -> separator (can be in any place, date or time even between numbers (20.19 year 2019))
 *  : -> separator (can be in any place, date or time even between numbers (20.19 year 2019))
 */
public class FormatterStandards {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		
//		short and medium formats
		DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		
		System.out.println(localDateTime.format(shortFormat)); // 4/02/19 09:32 PM
		System.out.println(mediumFormat.format(localDateTime)); // 4/02/2019 09:32:24 PM
		
		System.out.println();
		System.out.println("creating custom formats");
		DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(customFormat.format(localDateTime));
		
	}
}
