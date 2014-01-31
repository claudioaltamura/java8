package de.claudioaltamura.java8.defaultmethods;

public class Client implements DefaultMethodInterface{

	public static void main(String[] args) {
		Client client = new Client();
		client.old();
		client.defaultMethod();
	}

	@Override
	public void old() {
		System.out.println("old");
	}

}
