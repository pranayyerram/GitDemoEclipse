package _2_Asserts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	WebDriver driver;

	/*
	 * assertEquals
	 * assertNotEquals
	 * assertTrue
	 * assertFalse
	 * assertNull
	 * assertNotNull
	 * assertSame
	 * assertNotSame
	 * 
	 */
	
	@BeforeTest
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void LoginToApplication() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test
	public void VerifyTitle() {
		SoftAssert s=new SoftAssert();
		
		String expTitle="OrangeHRM";
		String accTitle=driver.getTitle();
		Assert.assertEquals(expTitle, accTitle);
		s.assertEquals("orangeHRM", accTitle);
	}
	
	@AfterClass
	public void Logout() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		WebElement LogoutBtn=driver.findElement(By.linkText("Logout"));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3000));
		wait.until(ExpectedConditions.visibilityOf(LogoutBtn));
		
		driver.close();
	}
	
}
