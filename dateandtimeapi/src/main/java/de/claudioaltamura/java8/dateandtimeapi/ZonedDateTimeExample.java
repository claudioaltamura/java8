package de.claudioaltamura.java8.dateandtimeapi;

import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(final String[] args)
	{
	final ZonedDateTime now = ZonedDateTime.now();
	final ZonedDateTime nowButChangedTime = now.withHour(11).withMinute(44);
	final ZonedDateTime dateAndTime = nowButChangedTime.withYear(2008).withMonth(2).withDayOfMonth(2);
	final ZonedDateTime dateAndTime2 = nowButChangedTime.withYear(2008).withMonth(2).withDayOfMonth(2);

	System.out.println("now: " + now);

	System.out.println("-> 11:44: " + nowButChangedTime);

	System.out.println("-> 29.9.2008: " + dateAndTime);

	System.out.println("-> 29.9.2008: " + dateAndTime2);

	}
}
