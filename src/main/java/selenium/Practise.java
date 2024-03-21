package selenium;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static selenium.ExtractPass.passExtractor;

public class Practise {
	static String name = "sam";
	static String pass = "rahulshettyacademy";

	public static void main(String[] args) throws Exception {

		for(int i =0 ; i <1 ;i++) {
			invokeBrowser();
		}
	}
//		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Test@piyush.com");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
//		Thread.sleep(1000);
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//
//		driver.findElement(By.cssSelector("input[type=\"text\"]:nth-child(3)")).sendKeys("piyu@bhatia.com");
//
//		// try to enter wrong phone number.
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456787");
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//		//driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("Test");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		// coment bcz use in below function
		//driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();


		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(1000);
		//System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());

		// Back to login ......

	public static void homePage(WebDriver driver) throws Exception{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("inputUsername")).sendKeys("contact@piyushbhatia.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name("inputPassword")).sendKeys("qwerewq");
		driver.findElement(By.className("submit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		// forgot password.
		Thread.sleep(3000);

		String paswrd = passExtractor(driver);
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Thread.sleep(1000);
		backToLogin(driver);

	}


	public static void invokeBrowser( ) throws  Exception{
		//System.setProperty("webdriver.chrome.driver", "/Users/piyushbhatia/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		// error message is appear .
		//	driver.get("https://www.google.com");
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(8000);
		driver.manage().window().maximize();
		homePage(driver);
		//Thread.sleep(5000);

	}


	 // back to login
	public static void backToLogin( WebDriver driver) throws  Exception{

		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
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

		Assert.assertEquals(driver.findElement(By.xpath("//p")).getText(), "You are successfully logged in.");

		System.out.println(driver.findElement(By.xpath("//div/h2")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div/h2")).getText(), "Hello " + name + ",");
		Thread.sleep(2000);

		//	driver.findElement(By.className("button.logout-btn")).click();
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		Thread.sleep(2000);

		driver.quit();

	}


}

//	public static String getPass(WebDriver driver) throws Exception {
//		Thread.sleep(3000);
//      driver.findElement(By.linkText("Forgot your password?")).click();
//		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
//
//		String pass = driver.findElement(By.cssSelector("p.infoMsg")).getText();
//		 String[] passarr = pass.split("'");
//		 String passwrd = passarr[1].split("'")[0];
//
//	 return passwrd;
//	}

	


