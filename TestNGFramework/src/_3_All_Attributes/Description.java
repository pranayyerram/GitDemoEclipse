package _3_All_Attributes;

import org.testng.annotations.Test;

public class Description {
	
		@Test(description="testcase 1")
		public void testcase1() {
			System.out.println("Testcase - 1");
		}
		@Test
		public void testcase2() {
			System.out.println("Testcase - 2");
		}
		@Test(description="testcase 3")
		public void testcase3() {
			System.out.println("Testcase - 3");
		}
		@Test
		public void testcase4() {
			System.out.println("Testcase - 4");
		}
		@Test(description="testcase 5")
		public void testcase5() {
			System.out.println("Testcase - 5");
		}
	}



