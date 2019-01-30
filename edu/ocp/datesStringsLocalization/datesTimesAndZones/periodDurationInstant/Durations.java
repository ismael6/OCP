package edu.ocp.datesStringsLocalization.datesTimesAndZones.periodDurationInstant;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author IsmaSp6
 *
 */
public class Durations {
	public static void main(String[] args) {
		Duration days = Duration.ofDays(100);//(long) 
		Duration hours = Duration.ofHours(100);//(long)
		Duration minutes = Duration.ofMinutes(100);//(long)
		Duration seconds = Duration.ofSeconds(100);//(long)
		Duration millis = Duration.ofMillis(100);//(long)
		Duration nanos = Duration.ofNanos(100);//(long)
		
		Duration daysChrono = Duration.of(100, ChronoUnit.DAYS);
		Duration hoursChrono = Duration.of(100, ChronoUnit.HOURS);//(long)
		Duration minutesChrono = Duration.of(100, ChronoUnit.MINUTES);//(long)
		Duration secondsChrono = Duration.of(100, ChronoUnit.SECONDS);//(long)
		Duration millisChrono = Duration.of(100, ChronoUnit.MILLIS);//(long)
		Duration nanosChrono = Duration.of(100, ChronoUnit.NANOS);//(long)
		
		System.out.println(Duration.ofNanos(100)); //P2019Y1M30D -> PT + ['HourValue'+H] + ['MinuteValue'+M] + ['SecondValue'+S]
		
		
		System.out.println(ChronoUnit.MINUTES.between(LocalTime.of(5, 20, 1), LocalTime.of(6, 20))); //59 minutes
//		System.out.println(ChronoUnit.YEARS.between(LocalTime.of(5, 20, 1), LocalTime.of(6, 20))); //reuntime exception cannot get years from LocalTime
//		System.out.println(ChronoUnit.MINUTES.between(LocalTime.of(5, 20, 1), LocalDate.now())); // runtime exception cannot get minutes from LocalDate
		
		
		Duration dChained = Duration.ofMinutes(1).ofNanos(3); // cannot build Durations chaining (only takes the last method call) (3 months)
		System.out.println(dChained); //PT0.000000003S
		
		System.out.println(ZonedDateTime.now().minus(Period.ofYears(10)).plus(Duration.ofHours(2))); // chain plus and minus operations with periods/durations is ok
		
//		System.out.println(LocalDate.now().plus(Duration.ofDays(10))); // runtime exception Duration incompatible with LocalDate
	}
}
