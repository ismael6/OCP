package edu.ocp.datesStringsLocalization.internationalizationLocalization.formats.datesTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author IsmaSp6
 *
 */
public class DateTimeFormatterCompatibility {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2019, 02, 04);
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Z"));
		
		DateTimeFormatter ofLocalizedDate = 
				DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter ofLocalizedTime = 
				DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		DateTimeFormatter ofLocalizedDateTime = 
				DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

//		ofLocalizedDate compatibility
		System.out.println("ofLocalizedDate compatibility");
		System.out.println(ofLocalizedDate.format(localDate)); // shows whole object
//		System.out.println(ofLocalizedDate.format(localTime)); //THROW RUNTIME EXCEPTION
		System.out.println(ofLocalizedDate.format(localDateTime)); //shows date part
		System.out.println(ofLocalizedDate.format(zonedDateTime)); //shows date part
		
//		ofLocalizedTime compatibility
		System.out.println("ofLocalizedTime compatibility");
//		System.out.println(localDate.format(ofLocalizedTime)); //THROW RUNTIME EXCEPTION
		System.out.println(localTime.format(ofLocalizedTime)); //shows whole object
		System.out.println(localDateTime.format(ofLocalizedTime)); //shows time part
		System.out.println(zonedDateTime.format(ofLocalizedTime)); //shows time part
		
//		ofLocalizedDateTime compatibility
		System.out.println("ofLocalizedDateTime compatibility");
//		System.out.println(localDate.format(ofLocalizedDateTime)); //THROW RUNTIME EXCEPTION
//		System.out.println(localTime.format(ofLocalizedDateTime)); //THROW RUNTIME EXCEPTION
		System.out.println(localDateTime.format(ofLocalizedDateTime)); //shows whole object
		System.out.println(zonedDateTime.format(ofLocalizedDateTime)); //shows whole object without time zone
	}
}
