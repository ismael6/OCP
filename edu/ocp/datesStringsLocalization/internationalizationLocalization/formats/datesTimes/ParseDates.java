package edu.ocp.datesStringsLocalization.internationalizationLocalization.formats.datesTimes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author IsmaSp6
 *
 *	String -> Date
 */
public class ParseDates {
	public static void main(String[] args) {
		DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("MM dd yyyy");
		
		LocalDate parseFromCustom = LocalDate.parse("02 04 2019", customFormat);
//		LocalDate parseFromDefault = LocalDate.parse("02 04 2019"); // runtime exception (not match with default format)
		
		System.out.println(parseFromCustom);
	}
}
