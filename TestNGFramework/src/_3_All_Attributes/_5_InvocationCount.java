package _3_All_Attributes;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class _5_InvocationCount {
	@Test
	public void testcase1() {
		System.out.println("Testcase - 1");
		
	}
	@Test
	public void testcase2() {
		System.out.println("Testcase - 2");
	}
	

	@Test
	public void testcase3() {
		System.out.println("Testcase - 3");
	}
	@Test(invocationCount=5)
	public void testcase4() {
		System.out.println("Testcase - 4");
	}
	@Test
	public void testcase5() {
		System.out.println("Testcase - 5");
	}
}
