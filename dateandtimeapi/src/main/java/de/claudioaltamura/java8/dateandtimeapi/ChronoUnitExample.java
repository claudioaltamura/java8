package de.claudioaltamura.java8.dateandtimeapi;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class ChronoUnitExample {

	public static void main(String[] args) {
		final Instant departureTime = Instant.now();
		final Instant arrivalTime = departureTime.plus(5, ChronoUnit.HOURS);

		System.out.println("departure now: " + departureTime);
		System.out.println("arrival now + 5h: " + arrivalTime);

		final long inBetweenHours = ChronoUnit.HOURS.between(departureTime, arrivalTime);
		final long inBetweenMinutes = ChronoUnit.MINUTES.between(departureTime,arrivalTime);

		System.out.println("inBetweenHours: " + inBetweenHours);
		System.out.println("inBetweenMinutes: " + inBetweenMinutes);
	}

}
