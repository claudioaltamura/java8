package de.claudioaltamura.java8.lambda.parttwo.predicate;

import java.util.function.Predicate;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> prime = (value) -> {
		      if (value <= 2) { 
		            return (value == 2); 
		        } 
		        for (long i = 2; i * i <= value; i++) { 
		            if (value % i == 0) { 
		                return false; 
		            } 
		        } 
		        return true; 
		};
		
		System.out.println("Primzahl 1: " + prime.test(1));
		System.out.println("Primzahl 1: " + prime.test(3));
	}

}
