package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TC_002 {
	
	
   @Test
	public void testcase1() {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();  // Starting the Browser
	   driver.get("http://www.facebook.com");
	   driver.findElement(By.id("email")).sendKeys("Hello");
	   driver.findElement(By.id("pass")).sendKeys("Hello");
	   driver.quit();
	   
	  
		
	}
	
}
