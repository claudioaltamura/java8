package de.claudioaltamura.java8.dateandtimeapi;

import java.time.Clock;

public class ClockExample {

	public static void main(final String[] args) {
		final Clock clockUTC = Clock.systemUTC();
		System.out.println(clockUTC);
		printClockMillis(clockUTC);

		final Clock clockDefaultZone = Clock.systemDefaultZone();
		System.out.println(clockDefaultZone);
		printClockMillis(clockDefaultZone);
	}

	private static void printClockMillis(final Clock clock) {
		final long currentTime = clock.millis();
		System.out.println(currentTime);
	}
}
