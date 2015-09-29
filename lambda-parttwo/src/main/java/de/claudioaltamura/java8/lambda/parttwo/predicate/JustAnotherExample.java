package de.claudioaltamura.java8.lambda.parttwo.predicate;

import java.util.function.Predicate;

import de.claudioaltamura.java8.lambda.parttwo.Person;

public class JustAnotherExample {

	public static void main(String[] args) {
		// Prädikate formulieren
		final Predicate<String> isNull = str -> str == null;
		final Predicate<String> isEmpty = String::isEmpty;
		final Predicate<Person> isAdult = person -> person.getAge() >= 18;
		System.out.println("isNull(’’):  " + isNull.test(""));
		System.out.println("isEmpty(’’): " + isEmpty.test(""));
		System.out.println("isEmpty(’Pia’):	" + isEmpty.test("Pia"));
		System.out.println("isAdult(Pia): " + isAdult.test(new Person("Pia", 55)));


	}
}
