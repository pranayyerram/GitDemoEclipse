package _7_RetryFailedTests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class _2_IRetryAnalyzer implements IRetryAnalyzer{
	
	int count=0;
	int maxRun=2;
	
	
	public boolean retry(ITestResult result) {
		
		if(count<maxRun) {
			System.out.println("Running test again");
			count++;
			return true;
			
		}
		return false;
	}

	
	
}
