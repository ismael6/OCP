package edu.ocp.datesStringsLocalization.datesTimesAndZones.periodDurationInstant;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * @author IsmaSp6
 *
 */
public class Periods {
	public static void main(String[] args) {

		Period p1 = Period.of(20000, 1200, 30000000);//(int year, int month, int day)
		Period days = Period.ofDays(100);//(int)
		Period weeks = Period.ofWeeks(100);//(int)
		Period months = Period.ofMonths(100);//(int)
		Period years = Period.ofYears(100);//(int)
		
		System.out.println(Period.of(2019, 01, 30)); //P2019Y1M30D -> P + ['yearValue'+Y] + ['MonthValue'+M] + ['DayValue'+D]

		Period pChained = Period.ofDays(1).ofMonths(3); // cannot build Periods chaining (only takes the last method call) (3 months)
		System.out.println(pChained); //P3M

		System.out.println(LocalDateTime.now().minus(Period.ofYears(10)).plus(Duration.ofHours(2))); // chain plus and minus operations with periods/durations is ok

//		System.out.println(LocalTime.now().plus(Period.ofYears(10))); // runtime exception Period incompatible with LocalTime
	}
}
