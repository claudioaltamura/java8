package de.claudioaltamura.java8.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		Person p1 = new Person("Petra", 40);
		Person p2 = new Person("Hans", 4);

		List<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(p2);
		
		//comparator usage
		final Comparator<Person> byName = (person1, person2) ->
		{
		return person1.getName().compareTo(person2.getName());
		};

		Collections.sort(persons, byName);
		System.out.println(persons);
		
		//Comparing
		Comparator<Person> byAge = Comparator.comparing(person -> person.getAge());
		//Comparator<Person> byAge2 = Comparator.comparing(Person::getAge);

		Collections.sort(persons, byAge);
		System.out.println(persons);
		
		//thenComparing
		Comparator<Person> byNameAndAge = byName.thenComparing(byAge);
		Collections.sort(persons, byNameAndAge);
		System.out.println(persons);
		
		//primitive types comparingInt etc
		Comparator<Person> byAgeInt = Comparator.comparingInt(Person::getAge);
		Collections.sort(persons, byAgeInt);
		System.out.println(persons);

		//special order naturalOrder, reverseOrder
		final Comparator<Person> byNameDescending = byName.reversed();
		Collections.sort(persons, byNameDescending);
		System.out.println(persons);
		
		
		final List<String> names = Arrays.asList("A", null, "B", "C", null, "D");
		final Comparator<String> naturalOrder = Comparator.naturalOrder();
		final Comparator<String> nullsFirst = Comparator.nullsFirst(naturalOrder);
		final Comparator<String> nullsLast = Comparator.nullsLast(naturalOrder);

		names.sort(nullsFirst);
		System.out.println("nullsFirst: " + names);
		names.sort(nullsLast);
		System.out.println("nullsLast: " + names);
		
	}

}
