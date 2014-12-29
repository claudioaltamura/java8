package de.claudioaltamura.java8.lambda.parttwo.consumer;

import java.util.function.Consumer;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class ConsumerAndThenExample {

	public static void main(String[] args) {
		//setup
		Message message = new Message("Hallo Welt");
		
		Consumer<Message> messageConsumer = (t) -> System.out.println(t);
		Consumer<Message> endConsumer = (t) -> System.out.println("Ende: " + t);
		messageConsumer.andThen(endConsumer).accept((message));
		
	}

}
