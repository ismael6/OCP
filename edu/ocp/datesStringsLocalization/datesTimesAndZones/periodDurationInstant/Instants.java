package edu.ocp.datesStringsLocalization.datesTimesAndZones.periodDurationInstant;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author IsmaSp6
 *
 * note: Instant operations only works with Days on lower ranges (see line 49)
 */
public class Instants {
	public static void main(String[] args) {
		
//		Construction
		Instant i1 = Instant.now();
		System.out.println(i1);
		Instant i2 = Instant.now();
		System.out.println(i2);

//		durations between instants
		System.out.println(Duration.between(i1, i2).toMillis());

		
//		get instant from ZonedDateTime
		System.out.println();
		LocalDate ld = LocalDate.of(2019, 1, 30);
		LocalTime lt = LocalTime.of(9, 46);
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("US/Eastern"));
		Instant instantFromZonedDateTime = zdt.toInstant();
		System.out.println(zdt); // with time zone 
		System.out.println(instantFromZonedDateTime); // GMT
		
//		get instant from epoch seconds
		System.out.println();
		Instant fromEpochSeconds = Instant.ofEpochSecond(60);
		System.out.println(fromEpochSeconds);
		
//		Instant operations
		System.out.println();
		System.out.println(fromEpochSeconds.plus(1, ChronoUnit.DAYS).plus(1, ChronoUnit.MINUTES));

//		System.out.println(fromEpochSeconds.plus(1, ChronoUnit.WEEKS)); // runtime Exception (Instant can´t operate with ranges higher than days)
	}
}
