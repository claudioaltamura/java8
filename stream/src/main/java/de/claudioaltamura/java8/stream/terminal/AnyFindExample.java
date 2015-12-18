package de.claudioaltamura.java8.stream.terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import de.claudioaltamura.java8.stream.Person;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class AnyFindExample {

	public static void main(String[] args) {
		final List<Person> persons = new ArrayList<>();
		persons.add(new Person("T", 10));
		persons.add(new Person("W", 20));
		persons.add(new Person("Hannes", 30));
		persons.add(new Person("F", 40));
		
		final Predicate<Person> nameFilter = person -> person.getName().equals("Hannes");

		final boolean personFound = persons.stream().anyMatch(nameFilter);
		System.out.println(personFound);
		final Optional<Person> searchedPerson = persons.stream().filter(nameFilter).findFirst();
		System.out.println(searchedPerson);

	}
	
}
