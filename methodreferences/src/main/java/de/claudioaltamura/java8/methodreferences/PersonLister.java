package de.claudioaltamura.java8.methodreferences;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class PersonLister {

	public static void main(String[] args) {
		PersonLister lister = new PersonLister();
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Peter", 65, Person.Gender.MALE));
		persons.add(new Person("Kevin", 5, Person.Gender.MALE));		
		persons.add(new Person("Mandy", 19, Person.Gender.FEMALE));

		//Method Reference
		Collection<Person> eighteen = lister.list(persons, (Person p) -> p.getAge() >= 18);
		System.out.println(eighteen);
		
		//Method Reference static
		Collection<Person> malePersons = lister.list(persons, Person::isMale);
		System.out.println(malePersons);
		
		//Method Reference non static
		Person a = new Person("a", 1, Person.Gender.MALE);
		Collection<Person> femalePersons = lister.list(persons, a::isFemale);
		System.out.println(femalePersons);
	}
	
	public Collection<Person> list(Collection<Person> persons, PersonPredicate<Person> predicate)
	{
		List<Person> matchedPersons = new ArrayList<Person>();
		for(Person p: persons)
		{
			if(predicate.evaluate(p))
			{
				matchedPersons.add(p);
			}
		}
		return matchedPersons;
	}


}
