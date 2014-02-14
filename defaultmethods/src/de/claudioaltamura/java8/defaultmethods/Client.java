package de.claudioaltamura.java8.defaultmethods;

public class Client implements DefaultMethodInterface{

	public static void main(String[] args) {
		//classic way
		MethodInterface classicWay = new MethodSimple();
		classicWay.method();

		//default method
		Client client = new Client();
		client.method();
	}
}
