package de.claudioaltamura.java8.methodreferences;

/**
 * @author Claudio Altamura
 * @see http://www.claudioaltamura.de
 */
@FunctionalInterface
public interface PersonPredicate<T> {

	boolean evaluate(T t);
}
