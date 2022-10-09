package _11_Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {
	
	WebDriver driver;
	
	public void takesScreenshot() throws IOException {
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File SourceFile=screenshot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(SourceFile, new File("C:\\Users\\Pranay\\LearnSeleniumWebDriverEclipse\\TestNGFramework\\Screenshots\\MySS.png"));
		
	}
	
	@Test
	public void TC() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Pranay\\\\Documents\\\\LearnSeleniumFiles\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		takesScreenshot();
	}
	
}
