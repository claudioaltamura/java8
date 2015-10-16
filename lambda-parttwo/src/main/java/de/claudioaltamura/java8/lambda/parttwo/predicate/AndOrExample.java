package de.claudioaltamura.java8.lambda.parttwo.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import de.claudioaltamura.java8.lambda.parttwo.Gender;
import de.claudioaltamura.java8.lambda.parttwo.Person;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class AndOrExample {

	public static void main(String[] args) {
		final List<Person> persons = createDemoData();
		// Einfache Prädikate formulieren
		final Predicate<Person> isAdult = person -> person.getAge() >= 18;
		final Predicate<Person> isMale = person -> person.getGender() == Gender.MALE;
		// Negation einzelner Prädikate
		final Predicate<Person> isYoung = isAdult.negate();
		final Predicate<Person> isFemale = isMale.negate();
		// Kombination von Prädikaten mit AND
		final Predicate<Person> boys = isMale.and(isYoung);
		final Predicate<Person> women = isFemale.and(isAdult);
		// Kombination von Prädikaten mit OR
		final Predicate<Person> boysOrWomen = boys.or(women);
		removeAll(persons, boysOrWomen);
		System.out.println(persons);
	}

	private static void removeAll(List<Person> persons,
			Predicate<Person> boysOrWomen) {
		persons.removeIf(boysOrWomen);
	}

	private static List<Person> createDemoData() {
		List<Person> list = new ArrayList<>();
		Person johnny = new Person("Johnny", 33);
		johnny.setGender(Gender.MALE);
		list.add(johnny);

		Person kid = new Person("Kid", 5);
		kid.setGender(Gender.MALE);
		list.add(kid);
		
		Person jenny = new Person("Jenny", 20);
		jenny.setGender(Gender.FEMALE);
		
		return list;
	}

}
