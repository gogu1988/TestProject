package b_ParallelExecution;

import org.testng.annotations.Test;

public class TestA {
	
	/*
	 * In TestNG xml file we need to write parallel="tests" for parallel execution, if it is mentioned as false or true then no parallel execution
	 */

	@Test
	public void testA() throws InterruptedException{
		System.out.println("Test A start");
		Thread.sleep(2000);
		System.out.println("Test A end");

	}
}
