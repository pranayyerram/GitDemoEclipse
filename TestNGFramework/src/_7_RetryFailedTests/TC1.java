package _7_RetryFailedTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1 {
	
	//Method:1 - Automatic file testng-failed created
	//Method:2
	
	
	@Test
	public void tc1() {
		System.out.println("Testcase: 1");
	}
	@Test
	public void tc2() {
		System.out.println("Testcase: 2");
	}
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
