package _7_RetryFailedTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2 {
	
	//Method:1 - Automatic file testng-failed created
	//Method:2 - IRetryAnalyzer
	
	
	@Test
	public void tc1() {
		System.out.println("Testcase: 1");
	}
	@Test(retryAnalyzer=_2_IRetryAnalyzer.class)
	public void tc2() {
		System.out.println("Testcase: 2");
	}
	//@Test(retryAnalyzer=_2_IRetryAnalyzer.class)
	@Test
	public void tc3() {
		System.out.println("Testcase: 3");
		Assert.assertTrue(false);
	}
	@Test
	public void tc4() {
		System.out.println("Testcase: 4");
	}
}
