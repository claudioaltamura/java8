package de.claudioaltamura.java.misc.executor;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExecutorServiceTest {
	
	private static final Log log = LogFactory.getLog(ExecutorServiceTest.class);
	
	private ExecutorService executorService;

	private Collection<Callable<Object>> tasks;
	
	@Before
	public void setUp() {
		executorService = Executors.newFixedThreadPool(10);
		tasks = new ArrayList<>();
	}
	
	@After
	public void tearDown() {
		executorService.shutdown();
	}

	@Test
	public void test() throws InterruptedException, ExecutionException {
		Collection<Throwable> execptionList = new ArrayList<>();

		tasks.add(new FailedCheckedCallable());
		tasks.add(new NormalExecutionCallable());

		//FailedCheckedCallable throws an exception when calling get()
		List<Future<Object>> futures = Collections.<Future<Object>>emptyList();
		try {
			futures = executorService.invokeAll(tasks, 100, TimeUnit.MILLISECONDS);
			for (Future<Object> future : futures) {
				if(!future.isCancelled()) {
					log.info("result is: " + future.get()); //get returns the outcome ;-)
				} else {
					log.info("task is cancelled");
				}
			}
		} catch (InterruptedException | ExecutionException e) {
			execptionList.add(e);
		}
		
		assertNotNull(futures.get(1).get()); //NormalExecutionCallable successfully executed
		assertTrue(execptionList.size()==1); //FailedCheckedCallable failed
	}
	
	@Test
	public void testExceptionCaught() throws InterruptedException {
		tasks.add(new FailedCheckedCallable());
		tasks.add(new NormalExecutionCallable());
		
		//Execute tasks
		List<Future<Object>> futures;
		try {
			futures = executorService.invokeAll(tasks, 100, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			throw e;
		}
		
		//Get result from Feature
		Object failedChecked = null;
		Future<Object> failedCheckedFuture = futures.get(0); 
		try {
			failedChecked = failedCheckedFuture.get();
		} catch (ExecutionException e) {
			//nothing
		}
		assertTrue(failedChecked == null);

		//Get result from Feature
		Future<Object> normalExecutionFuture = futures.get(1);
		String normalExecution = null;
		try {
			normalExecution = (String) normalExecutionFuture.get();
		} catch (ExecutionException e) {
			//normal
		}
		assertTrue(normalExecution != null);
	}
	
	@Test
	public void testTimeout() {
		int doneCounter = 0;
		int cancelledCounter = 0;
		
		tasks.add(new NormalExecutionCallable());
		tasks.add(new TimeoutCallable());

		//FailedCheckedCallable throws an exception when calling get()
		List<Future<Object>> futures = Collections.<Future<Object>>emptyList();
		try {
			futures = executorService.invokeAll(tasks, 100, TimeUnit.MILLISECONDS);
			for (Future<Object> future : futures) {
				if(!future.isCancelled()) { 
					log.info("result is: " + future.get()); //get returns the outcome ;-)
					doneCounter++;
				} else {
					log.info("task is cancelled");
					cancelledCounter++;
				}
			}
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

		assertEquals(doneCounter, 1);
		assertEquals(cancelledCounter, 1);

	}

	private static class NormalExecutionCallable implements Callable<Object> {

		@Override
		public String call() throws Exception {
			log.info("NormalExecutionCallable called");
			return "a string";
		}
		
	}
	
	private static class LongComputingCallable implements Callable<Object> {

		@Override
		public Integer call() throws Exception {
			log.info("LongComputingCallable called");
			return null;
		}
		
	}

	private static class FailedCheckedCallable implements Callable<Object> {

		@Override
		public String call() throws Exception {
			log.info("FailedCheckedCallable called");
			throw new Exception("an checked exception has occurred!");
		}
		
	}	

	private static class FailedUncheckedCallable implements Callable<Object> {

		@Override
		public String call() throws Exception {
			log.info("FailedUncheckedCallable called");
			throw new RuntimeException("an unchecked exception has occurred!");
		}
		
	}	

	private static class TimeoutCallable implements Callable<Object> {

		@Override
		public Long call() throws Exception {
			Long time = 200L;
			log.info("TimeoutCallable called");
			Thread.currentThread().sleep(time);
			return time;
		}
		
	}		
	
}
