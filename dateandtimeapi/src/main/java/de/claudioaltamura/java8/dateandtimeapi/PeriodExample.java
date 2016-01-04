package de.claudioaltamura.java8.dateandtimeapi;

import java.time.Period;

public class PeriodExample {

	public static void main(final String[] args)
	{
	final Period oneYear_sixMonths_ThreeDays = Period.ofYears(1).withMonths(6).withDays(3);

	final Period twoMonths_TenDays = Period.ofMonths(2).withDays(10);

	final Period sevenWeeks = Period.ofWeeks(7);

	final Period threeDays = Period.ofDays(3);

	System.out.println("1 year 6 months ...: " + oneYear_sixMonths_ThreeDays);
	System.out.println("2 months 10 days: " + twoMonths_TenDays);

	System.out.println("sevenWeeks: " + sevenWeeks);

	System.out.println("threeDays: " + threeDays);

	}
}
