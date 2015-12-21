package de.claudioaltamura.java8.dateandtimeapi;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantExample {

	public static void main(String[] args) {
		final Instant departureTime = Instant.now();
		final Instant expectedArrivalTime = departureTime.plus(5, ChronoUnit.HOURS);

		final Instant realArrival = expectedArrivalTime.plus(7, ChronoUnit.MINUTES);

		final Instant realArrival2 = expectedArrivalTime.plus(Duration.ofMinutes(7));

		System.out.println(departureTime); 
		System.out.println(expectedArrivalTime); 
		System.out.println(realArrival); 
		System.out.println(realArrival2); 
	}

}
