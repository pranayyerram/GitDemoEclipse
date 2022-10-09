package _12_DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class datePicker {

	WebDriver driver;
	
	@Test
	public void dateChoose() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Pranay\\\\Documents\\\\LearnSeleniumFiles\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		driver.findElement(By.xpath("//*[@class='imgdp']")).click();
		
		String curMonthYear="October 2021";
		String curDate="6";
		
		while(true) {
			String curtext=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
			
			if(curMonthYear.equals(curtext)) {
				driver.findElement(By.partialLinkText(curDate)).click();
				break;
			}
			else {
				Thread.sleep(100);
				driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
		}
		
	}
	
	
}
