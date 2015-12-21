package de.claudioaltamura.java8.dateandtimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		final LocalDate michasBirthday = LocalDate.of(1971, Month.FEBRUARY, 7);

		final LocalDate barbarasBirthday = michasBirthday.plusYears(2)
				.plusMonths(1)
				.plusDays(17);

		final LocalDate lastDayInFebruary = michasBirthday
				.with(TemporalAdjusters.lastDayOfMonth());
		
		System.out.println("michasBirthday: " + michasBirthday);

		System.out.println("barbarasBirthday: " + barbarasBirthday);

		System.out.println("lastDayInFebruary: " + lastDayInFebruary);

		final LocalTime atTen = LocalTime.of(10, 00, 00);

		final LocalTime tenFifteen = atTen.plusMinutes(15);

		final LocalTime breakfastTime = tenFifteen.minusHours(2);

		System.out.println("atTen: " + atTen);

		System.out.println("tenFifteen: " + tenFifteen);

		System.out.println("breakfastTime: " + breakfastTime);

		final LocalDateTime jdk8Release = LocalDateTime.of(2014, 3, 18, 8, 30);

		System.out.println("jdk8Release: " + jdk8Release);

		System.out.printf("jdk8Release: %s.%s.%s\n",
				jdk8Release.getDayOfMonth(),
				jdk8Release.getMonthValue(), jdk8Release.getYear());
	}

}
