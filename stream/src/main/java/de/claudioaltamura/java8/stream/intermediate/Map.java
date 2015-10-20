package de.claudioaltamura.java8.stream.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Map {

	public static void main(String[] args) {
			final List<Person> persons = new ArrayList<>();
			persons.add(new Person("B", 40));
			persons.add(new Person("Y", 5));

			final Stream<Person> adults = persons.stream().filter(Person::isAdult);
			final Stream<String> namesStream = adults.map(person -> person.getName());

			final Stream<Integer> agesStream = persons.stream().map(Person::getAge).
			filter(age -> age >= 18);
			namesStream.forEach(System.out::println);
			agesStream.forEach(System.out::println);

	}

}
