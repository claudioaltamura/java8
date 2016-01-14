package de.claudioaltamura.java8.misc;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.function.Supplier;

public class CompletableFutureExample {

	public static void main(final String[] args) throws InterruptedException, ExecutionException
	{
		
	final Supplier<String> longRunningAction = () ->
	{
		System.out.println("Current thread: " + Thread.currentThread());

		return "101";
	};

	final CompletableFuture<String> step1 = CompletableFuture.supplyAsync(longRunningAction);

	final Function<String, Integer> complexConverter = Integer::parseInt;

	final CompletableFuture<Integer> step2 = step1.thenApply(complexConverter);
	final Function<Integer, Double> complexCalculation = value -> .75 * value;

	final CompletableFuture<Double> step3 = step2.thenApply(complexCalculation);
	System.out.println(step3.get());

	}
	
}
