package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Practise2 {
 
	static String name = "rahul"; 
	static String pass = "rahulshettyacademy";
	

		
	public static void main(String[] args) throws Exception {
	 System.setProperty("webdriver.chrome.driver","/Users/piyushbhatia/Downloads/chromedriver-mac-arm64/chromedriver");

		WebDriver driver = new ChromeDriver();
		//	 error message is appear . 
			driver.get("https://www.google.com");
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(name);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(pass);
		driver.findElement(By.xpath("//div/span/input[@id='chkboxOne']")).click();
		driver.findElement(By.xpath("//div/span/input[@id='chkboxTwo']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();

		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//div/p")).getText());
		//testing for confirmation message .
		
		Assert.assertEquals(driver.findElement(By.xpath("//p")).getText() , "You are successfully logged in.");
		
		System.out.println(driver.findElement(By.xpath("//div/h2")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div/h2")).getText() , "Hello "+name+",");

		
		
		

	}

}
