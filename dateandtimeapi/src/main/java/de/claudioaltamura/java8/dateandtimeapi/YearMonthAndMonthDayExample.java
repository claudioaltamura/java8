package de.claudioaltamura.java8.dateandtimeapi;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class YearMonthAndMonthDayExample {

	public static void main(final String[] args)
	{
		final YearMonth yearMonth = YearMonth.of(2014, 2);
		final YearMonth february2014 = YearMonth.of(2014, Month.FEBRUARY);

		final int dayOfBirthday = 7;
		final MonthDay monthDay1 = MonthDay.of(2, dayOfBirthday);
		final MonthDay monthDay2 = MonthDay.of(Month.FEBRUARY, dayOfBirthday);

		final Year year = Year.of(2012);

		System.out.println("YearMonth: " + february2014);
		System.out.println("MonthDay: " + monthDay2);
		System.out.println("Year: " + year + " / isLeap? " + year.isLeap());
	}
}
