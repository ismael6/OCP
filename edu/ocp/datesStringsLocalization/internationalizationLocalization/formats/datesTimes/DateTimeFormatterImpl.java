package edu.ocp.datesStringsLocalization.internationalizationLocalization.formats.datesTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author IsmaSp6
 * 
 * Its allowed to format in both ways:
 * 	formatter.format(date)
 * 	date.format(formatter)
 *
 */
public class DateTimeFormatterImpl {
	public static void main(String[] args) {

		LocalDate localDate = LocalDate.of(2019, 2, 4);
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		
//		standard format for dates
		System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE)); //2019-02-04
		System.out.println(localTime.format(DateTimeFormatter.ISO_LOCAL_TIME)); //18:35:24.724
		System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));  //2019-02-04T18:35:24.724
		
//		System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_TIME)); // RUNTIME EXCEPTION (LocalDate vs LocalTime formatter)

		
//		----------------------------------formatting in both ways---------------------------------------------------------------
//		-------------------------------formatter.format(date) and date.format(formatter)----------------------------------------
		System.out.println();
		System.out.println("formatting in both ways");
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT); // (ofLocalizedTime)can format any element that have a TIME part
		
		System.out.println(dateTimeFormatter.format(localTime)); //00:00 AM
		System.out.println(dateTimeFormatter.format(localDateTime)); //00:00 AM
//		System.out.println(dateTimeFormatter.format(localDate)); // runtime exception (LocalDate do not have a time part)
		
		System.out.println();
		System.out.println(localTime.format(dateTimeFormatter)); //00:00 AM
		System.out.println(localDateTime.format(dateTimeFormatter)); //00:00 AM
//		System.out.println(localDate.format(dateTimeFormatter)); // runtime exception (LocalDate do not have a time part)
	}
}
