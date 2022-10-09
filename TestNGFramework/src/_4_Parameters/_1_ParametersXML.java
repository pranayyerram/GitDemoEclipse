package _4_Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _1_ParametersXML {
	WebDriver driver;
	
	@BeforeTest
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	@Parameters({"username","password"})
	@Test
	public void LoginToApplication(String uname,String pass) throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
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
		wait.until(ExpectedConditions.elementToBeClickable(LogoutBtn));
		
		LogoutBtn.click();
		
		driver.close();
	}
	
	
}
