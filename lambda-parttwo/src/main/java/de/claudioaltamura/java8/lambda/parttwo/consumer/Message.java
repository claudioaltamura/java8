package de.claudioaltamura.java8.lambda.parttwo.consumer;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class Message {

	private String msg;
	
	public Message(String msg) {
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}
	
	public String toString() {
		return getMessage();
	}
}
