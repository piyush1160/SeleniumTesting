package selenium;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Udemy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		// invoking the chrome driver. 
		// Chrome driver -> methods. like close();
		// firefox driver -> methods.
		// all functinality accross each browser is same .
		
	// here webdriver is nothing but interface . and chromedriver implements webdriver.	
	//	ChromeDriver driver1 = new ChromeDriver();
		// by default SELENIUM BROWSER invoking the Chrome browser.
		WebDriver driver = new ChromeDriver() ;
	 System.setProperty("webdriver.chrome.driver","/Users/piyushbhatia/Downloads/chromedriver-mac-arm64/chromedriver");

		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		  //driver.close(); // instantly bnd.
		// driver.quit(); //Quits this driver, closing every associated window.
		
		driver.findElement(By.className("theme-btn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	//	driver.findElement(By.id("allow_marketing_emails")).click();
	    driver.findElement(By.xpath("//*[@id=\"allow_marketing_emails\"]")).click();	
		

	}

}
