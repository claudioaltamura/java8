package de.claudioaltamura.java8.lambda.parttwo;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		//setup
		Message message = new Message("Hallo Welt");
		Person person = new Person("Peter");
		
		Consumer<Message> messageConsumer = (t) -> System.out.println(t);
		messageConsumer.accept(message);
		
		Consumer<Person> personConsumer = (t) -> System.out.println(t);
		personConsumer.accept(person);
		
		//Consumer<T> genericConsumer = (t) -> System.out.println(t); geht leider nicht
	}

}
