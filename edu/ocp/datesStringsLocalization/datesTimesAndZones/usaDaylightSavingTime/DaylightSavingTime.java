package edu.ocp.datesStringsLocalization.datesTimesAndZones.usaDaylightSavingTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author IsmaSp6
 *
 */
public class DaylightSavingTime {
	public static void main(String[] args) {
		
		ZoneId zone = ZoneId.of("US/Eastern");
		LocalTime lt = LocalTime.of(1, 30);

//		March DaylightSavingTime
		LocalDate ldMarch = LocalDate.of(2016, Month.MARCH, 13);
		ZonedDateTime marchDaylightSavingDate = ZonedDateTime.of(ldMarch, lt, zone);
		System.out.println(marchDaylightSavingDate); 						   //2016-03-13T01:30-05:00[US/Eastern]
		System.out.println(marchDaylightSavingDate.plus(1, ChronoUnit.HOURS)); //2016-03-13T03:30-04:00[US/Eastern]

//		November DaylightSavingTime
		System.out.println();
		LocalDate ldNov = LocalDate.of(2016, Month.NOVEMBER, 6);
		ZonedDateTime novDaylightSavingDate = ZonedDateTime.of(ldNov, lt, zone);
		System.out.println(novDaylightSavingDate);							 //2016-11-06T01:30-04:00[US/Eastern]
		System.out.println(novDaylightSavingDate.plus(1, ChronoUnit.HOURS)); //2016-11-06T01:30-05:00[US/Eastern]
		
		System.out.println();
		LocalDate ldForInexistent = LocalDate.of(2016, Month.MARCH, 13); // 2016-03-13
		LocalTime ltForInexistent = LocalTime.of(2, 30);				 // 02:30
		ZonedDateTime inexistentDate = ZonedDateTime.of(ldForInexistent, ltForInexistent, zone); // 2016-03-13T03:30-04:00[US/Eastern]
		System.out.println(inexistentDate); // 2016-03-13T02:30 dont exists because daylight saving time
	}
}
