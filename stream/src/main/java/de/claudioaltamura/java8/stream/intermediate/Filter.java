package de.claudioaltamura.java8.stream.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Filter {

	public static void main(String[] args) {
		final List<Person> persons = new ArrayList<>();
		persons.add(new Person("M", 43));
		persons.add(new Person("B", 40));
		persons.add(new Person("C", 5));
		// final Predicate<Person> isAdult = person -> person.getAge() >= 18;
		final Stream<Person> adults = persons.stream().filter(Person::isAdult);
		adults.forEach(System.out::println);


	}

}
