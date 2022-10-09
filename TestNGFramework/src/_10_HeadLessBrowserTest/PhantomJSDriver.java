package _10_HeadLessBrowserTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class PhantomJSDriver {
	
	@Test
	public void phantomJs() {
		File file=new File("C:\\Users\\Pranay\\Downloads\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
		
		//WebDriver driver=new PhantomJSDriver();
		
		//driver.get("https://www.google.com/");
		
		//driver.findElement(By.name("q")).sendKeys("Selenium");
		
		//System.out.println(driver.getTitle());
	}
	
}

