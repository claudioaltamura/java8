package de.claudioaltamura.java8.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalUsageExample {

	public static Optional<Person> findByName(final String name,
			final List<Person> persons) {

		for (final Person currentPerson : persons) {
			if (currentPerson.getName().equals(name))
				return Optional.of(currentPerson);
		}
		return Optional.empty();
	}

	public static void main(final String[] args) {
		final String desiredName = "Unknown";
		List<Person> persons = new ArrayList<>();
		Person person1 = new Person("Peter", 22);
		persons.add(person1);
		
		final Optional<Person> optionalPerson = findByName(desiredName, persons);
		if (optionalPerson.isPresent())
		{
			printPersonDetails(optionalPerson.get());
		}
		else
		{
			System.out.println("No such person with name ‘" + desiredName + "’");
		}
	}

	private static void printPersonDetails(Person person) {
		System.out.println(person);
	}

}
