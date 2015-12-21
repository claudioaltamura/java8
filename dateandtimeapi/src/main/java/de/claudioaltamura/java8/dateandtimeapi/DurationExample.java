package de.claudioaltamura.java8.dateandtimeapi;

import java.time.Duration;
import java.time.Instant;

public class DurationExample {

	public static void main(String[] args) {
		final Duration durationFromSecs = Duration.ofSeconds(15);
		final Duration durationFromMinutes = Duration.ofMinutes(30);
		final Duration durationFromHours = Duration.ofHours(45);
		final Duration durationFromDays = Duration.ofDays(60);

		System.out.println("From Secs: " + durationFromSecs);
		System.out.println("From Minutes: " + durationFromMinutes);
		System.out.println("From Hours: " + durationFromHours);
		System.out.println("From Days: " + durationFromDays);

		final Instant now = Instant.now();
		final Instant silvester2013 = Instant.parse("2013-12-31T00:00:00Z");
		final Instant myBirthday2015 = Instant.parse("2015-02-07T00:00:00Z");
		final Duration duration1 = Duration.between(now, silvester2013);
		final Duration duration2 = Duration.between(now, myBirthday2015);

		System.out.println(now + " -- " + silvester2013 + ": " + duration1);
		System.out.println(now + " -- " + myBirthday2015 + ": " + duration2);
	}

}
