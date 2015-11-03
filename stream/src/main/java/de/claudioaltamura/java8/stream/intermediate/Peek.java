package de.claudioaltamura.java8.stream.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Peek {

	public static void main(String[] args) {
		final List<Person> persons = new ArrayList<>();
		persons.add(new Person("Berta", 43));
		persons.add(new Person("Michi", 42));
		
		final Stream<Person> adults = persons.stream().filter(Person::isAdult);
		final Stream<Person> adultsPeek = adults.peek(System.out::println);
		// Weitere Filterung auf dem Stream vornehmen
		final Stream<Person> michi = adultsPeek.filter(person ->
			person.getName().equals("Michi"));
		System.out.println(michi.count());

	}

}
