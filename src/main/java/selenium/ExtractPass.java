package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ExtractPass extends Practise{

               public static void enterDetails(WebDriver driver) throws Exception{
				   driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
				   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
				   Thread.sleep(1000);
				   driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Test@piyush.com");
				   Thread.sleep(1000);
				   driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
				   Thread.sleep(2000);
				   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

				   driver.findElement(By.cssSelector("input[type=\"text\"]:nth-child(3)")).sendKeys("piyu@bhatia.com");
				   Thread.sleep(2000);
				   driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
				   driver.findElement(By.cssSelector("input[type=\"text\"]:nth-child(3)")).sendKeys("Pi@bhaa.com");

				   // try to enter wrong phone number.
				   Thread.sleep(2000);
				   driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456787");

				   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
				   //driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("Test");
				   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

			   }

    public  static String passExtractor(WebDriver driver) throws Exception{

        		Thread.sleep(1000);
      driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);

		enterDetails(driver);

		Thread.sleep(1000);
	  driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		Thread.sleep(3000);
		String pass = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		 String[] passarr = pass.split("'");
		 String passwrd = passarr[1].split("'")[0];

	 return passwrd;
    }
}
