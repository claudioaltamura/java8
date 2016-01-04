package de.claudioaltamura.java8.dateandtimeapi;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeDiffExample {

	public static void main(final String[] args) throws ParseException
	{
		final String startTimeAsString = "10:10:10";
		final String endTimeAsString = "11:20:30";
		final LocalTime startTime = LocalTime.parse(startTimeAsString);
		final LocalTime endTime = LocalTime.parse(endTimeAsString);
		final Duration duration = Duration.between(startTime, endTime);
		final long durationInSecs = duration.getSeconds();
		System.out.println("duration = " + duration + " / secs = "
				+ durationInSecs);
		final DateTimeFormatter dateFormat = DateTimeFormatter
				.ofPattern("HH:mm:ss");
		final LocalTime asLocalTime = LocalTime.ofSecondOfDay(durationInSecs);
		System.out.println("durationInHHmmss = "
				+ dateFormat.format(asLocalTime));
	}
}
