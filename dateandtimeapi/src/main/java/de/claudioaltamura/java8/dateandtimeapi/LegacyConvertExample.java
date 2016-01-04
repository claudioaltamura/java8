package de.claudioaltamura.java8.dateandtimeapi;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.GregorianCalendar;

public class LegacyConvertExample {

	public static void main(final String[] args)
	{
	final Date now = new Date();
	final Instant nowAsInstant = now.toInstant();
	final ZoneId systemZone = ZoneId.systemDefault();
	final LocalDateTime localDateTime = LocalDateTime.ofInstant(nowAsInstant, systemZone);

	final ZoneId zoneCalifornia = ZoneId.of("America/Los_Angeles");
	final ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(nowAsInstant, zoneCalifornia);

	System.out.println("LocalDateTime: " + localDateTime);
	System.out.println("ZonedDateTime: " + zonedDateTime);

	final GregorianCalendar nowAsCalendar = new GregorianCalendar();
	final ZonedDateTime nowAszonedDateTime = nowAsCalendar.toZonedDateTime();
	final Instant instant = nowAszonedDateTime.toInstant();

	System.out.println("Instant: " + instant);

	}
}
