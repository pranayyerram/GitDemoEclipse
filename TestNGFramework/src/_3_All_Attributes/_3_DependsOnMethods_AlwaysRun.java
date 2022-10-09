package _3_All_Attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _3_DependsOnMethods_AlwaysRun {
	@Test
	public void testcase1() {
		System.out.println("Testcase - 1");
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods= {"testcase1"})
	public void testcase2() {
		System.out.println("Testcase - 2");
	}
	@Test(alwaysRun=true)
	public void testcase3() {
		System.out.println("Testcase - 3");
	}
	@Test(dependsOnMethods= {"testcase5","testcase3"})
	public void testcase4() {
		System.out.println("Testcase - 4");
	}
	@Test(priority=-1,alwaysRun=false)
	public void testcase5() {
		System.out.println("Testcase - 5");
	}
}
