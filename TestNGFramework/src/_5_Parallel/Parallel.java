package _5_Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
	WebDriver driver;
	
	@Test
	public void tc1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	public void tc2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("https://google.com");
		driver.manage().window().maximize();
	}
}
