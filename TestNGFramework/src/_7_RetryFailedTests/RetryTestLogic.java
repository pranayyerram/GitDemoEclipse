package _7_RetryFailedTests;

import java.util.ArrayList;

import org.testng.TestNG;
import org.testng.annotations.AfterTest;

public class RetryTestLogic {
	
	@AfterTest
	public void RunFailedTestLogic() {
		
		TestNG obj=new TestNG();
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Test output file path");
		
		obj.setTestSuites(list);
		
		obj.run();
		
	}
	
	
}
