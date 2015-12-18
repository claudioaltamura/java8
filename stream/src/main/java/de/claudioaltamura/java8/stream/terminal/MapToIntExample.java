package de.claudioaltamura.java8.stream.terminal;

import static java.util.stream.Collectors.joining;

import java.util.ArrayList;
import java.util.List;

import de.claudioaltamura.java8.stream.Person;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class MapToIntExample {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		Person johnny = new Person("Johnny", 33);
		persons.add(johnny);

		Person kid = new Person("Kid", 5);
		persons.add(kid);
		
		final String joined = persons.stream()
				.mapToInt(Person::getAge)
				.mapToObj(Integer::toString)
				.collect(joining(", "));
		
		System.out.println(joined);

	}

}
