package edu.ocp.datesStringsLocalization;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author IsmaSp6
 *
 * LocalDate -> year, months, day
 * LocalTime -> hour, minute, second, nano
 * LocalDateTime -> LocalDate + LocalTime (toString pull apart date from time with the letter T)
 * ZonedDateTime -> LocalDate + LocalTime + ZoneId (UTC date = (LocalDateTime) - (-1)(timeZoneOff))
 * 
 *  temporal data limits
 *  	years -> -999_999_999 - 999_999_999
 *  	month -> 1 - 12
 *  	day -> 1 - valid month day
 *  	hour -> 0-23
 *  	minute -> 0 - 59
 *  	second -> 0 - 59
 *  	nano -> 0 - 999_999_999
 *  	ZoneId -> existent ZoneId
 */
public class Creation {
	public static void main(String[] args) {

//		LocalDateTime ldt = new LocalDateTime(); not compiles, private constructors
		
//		LocalDate factories
		System.out.println("LocalDate factories");
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.of(2019, 04, 29)); //(int year, int month, int dayOfMonth)
		System.out.println(LocalDate.of(2019, Month.JANUARY, 29)); //(int year, Month month, int dayOfMonth)
		
		
//		LocalTime factories
		System.out.println("LocalTime factories");
		System.out.println(LocalTime.now());
		System.out.println(LocalTime.of(9, 00)); //(int hour, int minute)
		System.out.println(LocalTime.of(9, 2, 26)); //(int hour, int minute, second)
		System.out.println(LocalTime.of(9, 2, 26, 1999_999_999)); //(int hour, int minute, second, nano)
		
		
//		LocalDateTime factories
		System.out.println("LocalDateTime factories");
		System.out.println(LocalDateTime.now());
		//with int month
		System.out.println(LocalDateTime.of(2019, 01, 29, 9, 2)); //int year, int month, int dayOfMonth, int hour, int minute)
		System.out.println(LocalDateTime.of(2019, 01, 29, 9, 2, 26)); //int year, int month, int dayOfMonth, int hour, int minute), int second
		System.out.println(LocalDateTime.of(2019, 01, 29, 9, 2, 26, 655)); //int year, int month, int dayOfMonth, int hour, int minute), int second, int nano
		//with enum month
		System.out.println(LocalDateTime.of(2019, Month.JANUARY, 29, 9, 2)); //int year, Month month, int dayOfMonth, int hour, int minute)
		System.out.println(LocalDateTime.of(2019, Month.JANUARY, 29, 9, 2, 26)); //int year, Month month, int dayOfMonth, int hour, int minute), int second
		System.out.println(LocalDateTime.of(2019, Month.JANUARY, 29, 9, 2, 26, 655)); //int year, Month month, int dayOfMonth, int hour, int minute), int second, int nano		
		
		System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.now())); //(LocalDate, LocalTime) 
		
		
//		ZonedDateTime factories
		System.out.println("ZonedDateTime factories");
		System.out.println(ZonedDateTime.now());
		System.out.println(ZonedDateTime.of(2019, 01, 29, 9, 2, 26, 655, ZoneId.of("America/Mexico_City"))); //int year, int month, int dayOfMonth, int hour, int minute), int second, int nano, ZoneId zone
//		System.out.println(ZonedDateTime.of(2019, Month.JANUARY, 29, 9, 2, 26, 655, ZoneId.of("America/Mexico_City"))); //Month enum parameter not allowed on ZonedDateTime factories
		System.out.println(ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.of("America/Mexico_City"))); // (LocalDate date, LocalTime time, ZoneId zone)
		System.out.println(ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/Mexico_City"))); // (LocalDateTime dateTime, ZoneId zone)
	}
}
