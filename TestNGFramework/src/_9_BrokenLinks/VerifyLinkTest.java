package _9_BrokenLinks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyLinkTest {
	
	 WebDriver driver;
	 List<WebElement> activeLinkImage = new ArrayList<WebElement>();

	 @BeforeTest
	 public void launchApp() {
	  System.setProperty("webdriver.chrome.driver",
	    "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://css-tricks.com/thispagedoesntexist");
	 }
	 
	 @Test
	 public void getLinks() {
		 
		 //Get all links and images
		 List<WebElement> LinkImgList=driver.findElements(By.tagName("a"));
		 LinkImgList.addAll(driver.findElements(By.tagName("img")));
		 
		 //Total Links and images before
		 int totalCount=LinkImgList.size();
		 System.out.println("Total Number of links: "+totalCount);
		 
		 for (int i = 0; i < LinkImgList.size(); i++) {
			   if (LinkImgList.get(i).getAttribute("href") != null &&(!LinkImgList.get(i).getAttribute("href").contains("javascript"))) {
			    activeLinkImage.add(LinkImgList.get(i));
			   }
			  }
			  // Total Links and Images After
			  int total1 = activeLinkImage.size();
			  System.out.println("Total Active Links and Images: " + total1);
			 }
		 
	 
	 @Test(priority = 2)
	 public void VerifyBrokenLinks() throws IOException {
		 VerifyBrokenLink obj= new VerifyBrokenLink();
		 for(int j=0;j<activeLinkImage.size();j++)
		 {
			 WebElement ele= activeLinkImage.get(j);
			 String url=ele.getAttribute("href");
			  obj.verifyBrokenLinks(url);
		 }
		 System.err.println("Total Valid Links: "+obj.validLink);
		 System.err.println("Total Invalid Links: "+obj.invalidLink);
	}
	@AfterTest
	public void tearDown() {
	 driver.close();
	}
	}
