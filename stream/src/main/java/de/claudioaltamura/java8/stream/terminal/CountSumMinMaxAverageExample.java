package de.claudioaltamura.java8.stream.terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import de.claudioaltamura.java8.stream.Person;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class CountSumMinMaxAverageExample {

	public static void main(String[] args) {
		final List<Person> persons = new ArrayList<>();
		persons.add(new Person("T", 10));
		persons.add(new Person("W", 20));
		persons.add(new Person("H", 30));
		persons.add(new Person("F", 40));

		final int count = (int) persons.stream()
				.filter(person -> person.getName().startsWith("T")).count();
		System.out.println("count: " + count);

		final int sum = persons.stream()
				.filter(person -> person.getName().startsWith("T"))
				.mapToInt(Person::getAge).sum();
		System.out.println("sum: " + sum);

		final OptionalDouble avg = persons.stream()
				.filter(person -> person.getName().contains("X"))
				.mapToInt(Person::getAge).average();
		System.out.println("avg: " + avg);
	}

}
