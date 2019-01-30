package edu.ocp.datesStringsLocalization.datesTimesAndZones.datesTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author IsmaSp6
 *
 * Dates and Times are immutable (operations always return a new object)
 */
public class ManipulatingDatesAndTimes {
	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		ld.plusDays(1); // lost return value
		System.out.println(ld); // not reflecting the sum because of the lost returned value

		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		lt = lt.minusMinutes(2).plusSeconds(2).plusNanos(2); // chaining operations are ok, just catch the returned value
		System.out.println(lt);
		
//		ld.minusMinutes(2); // not compiles, minusMinutes is not a LocalDate operation
//		lt = lt.plusDays(1); // not compiles, plusDays is not a LocalTime operation
		
		LocalDateTime ldt = LocalDateTime.now();
		ldt = ldt.plusHours(2).minusDays(3); // LocalDateTime and ZonedDateTime can perform LocalDate and LocalTime operations indistinctly
	}
}
