package _3_All_Attributes;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class _6_Groups {
	
	@Test(groups="Smoke")
	public void testcase1() {
		System.out.println("Testcase - 1");
		
	}
	@Test(groups="Sanity")
	public void testcase2() {
		System.out.println("Testcase - 2");
	}
	

	@Test(groups={"Sanity","Smoke"})
	public void testcase3() {
		System.out.println("Testcase - 3");
	}
	@Test(groups= {"Regression","Smoke"})
	public void testcase4() {
		System.out.println("Testcase - 4");
	}
	@Test(groups="Regression")
	public void testcase5() {
		System.out.println("Testcase - 5");
	}
	
}
