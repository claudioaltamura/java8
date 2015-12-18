package de.claudioaltamura.java8.stream.terminal;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class FilterMapReduceExample {

	public static void main(String[] args) {
		final List<PersonDate> persons = Arrays.asList(
				new PersonDate("Sam", LocalDate.of(1971, Month.OCTOBER, 12)),
				new PersonDate("Lisa", LocalDate.of(1971, Month.NOVEMBER, 7)),
				new PersonDate("Bob", LocalDate.of(1968, Month.NOVEMBER, 17)));

		final BinaryOperator<String> stringCombiner = (str1, str2) -> {

			if (str1.isEmpty()) {
				return str2;
			}

			return str1 + ", " + str2;
		};

		final String bornInNovember = persons
				.stream()
				.filter(person -> person.getBirthday().getMonth()
						.equals(Month.NOVEMBER))
				.map(PersonDate::getName)
				.reduce("", stringCombiner);
		System.out.println(bornInNovember);
		
		final String bornInNovemberAnotherway = persons
				.stream()
				.filter(person -> person.getBirthday().getMonth()
						.equals(Month.NOVEMBER))
				.map(PersonDate::getName)
				.collect(Collectors.joining(", "));
		System.out.println(bornInNovemberAnotherway);
	}

}
