package de.claudioaltamura.java8.stream.terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import de.claudioaltamura.java8.stream.intermediate.Person;

public class CollectExample {
	
	public static void main(final String[] args) {
		final List<Person> persons = new ArrayList<>();
		persons.add(new Person("Berta", 40));
		persons.add(new Person("Cloudette", 5));
		persons.add(new Person("Jimmy", 5));
		
		final Stream<Integer> agesStream = persons.stream().map(Person::getAge);
		List<Integer> ages = agesStream.distinct().collect(Collectors.toList());
		System.out.println(ages);

		final Stream<String> nameStream = persons.stream().map(Person::getName);
		List<String> names = nameStream.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(names);
	}

}
