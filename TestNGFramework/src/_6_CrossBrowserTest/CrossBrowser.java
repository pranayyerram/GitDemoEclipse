package _6_CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;
	
	@Test @Parameters({"browser"})
	public void launchBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdrive.edge.driver", "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\edgedriver_win64 (1)\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
}
