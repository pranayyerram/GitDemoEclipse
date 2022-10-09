package _3_All_Attributes;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore //at class
//Ignore at package level- open package-info.java
public class _4_Ignore_Enabled_True_False {
	
	@Test
	public void testcase1() {
		System.out.println("Testcase - 1");
		
	}
	@Test(enabled=true)
	public void testcase2() {
		System.out.println("Testcase - 2");
	}
	
	@Ignore //Ignore at method
	@Test
	public void testcase3() {
		System.out.println("Testcase - 3");
	}
	@Test
	public void testcase4() {
		System.out.println("Testcase - 4");
	}
	@Test(enabled=false)
	public void testcase5() {
		System.out.println("Testcase - 5");
	}
}
