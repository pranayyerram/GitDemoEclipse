package _8_Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(ListenerClass.class)
public class TC1 {
	
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
