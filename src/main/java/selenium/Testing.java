package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testing {

   public static void main (String args[]) throws Throwable{
	 // System.setProperty("webdriver.chrome.driver","/Users/piyushbhatia/Downloads/chromedriver-mac-arm64/chromedriver");
     
	  //ChromeOptions co = new ChromeOptions();
	  //co.addArguments("--remote-allow-origins=*");
	  
	  WebDriver driver = new ChromeDriver();
	   
	   
	   //driver.get("https://www.google.com/search?q=youtube%27&sca_esv=596358087&source=hp&ei=bZyaZdbFFo2VseMP-em4oAs&iflsig=ANes7DEAAAAAZZqqfZGw_IhVqDnmJo3hhqOdUe8Rc0Tv&ved=0ahUKEwiWsI_rpsuDAxWNSmwGHfk0DrQQ4dUDCAo&uact=5&oq=youtube%27&gs_lp=Egdnd3Mtd2l6Igh5b3V0dWJlJzIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBhAAGAMYCjIFEAAYgAQyBRAAGIAEMgUQABiABDIHEAAYgAQYCjINEAAYgAQYChixAxiDAUirIlDeB1iHHHABeACQAQCYAY0FoAGuGKoBBzMtMS4yLjO4AQPIAQD4AQGoAgrCAhAQABgDGI8BGOUCGOoCGIwDwgITEAAYAxiPARjlAhjlAhjqAhiMA8ICERAuGIMBGMcBGLEDGNEDGIAEwgIEEAAYA8ICCxAAGIAEGLEDGIMBwgIOEC4YgAQYigUYsQMYgwHCAgsQLhiABBixAxiDAcICBRAuGIAEwgIREC4YgAQYsQMYgwEYxwEY0QPCAggQABiABBixAw&sclient=gws-wiz");
	  // driver.get("https://accounts.google.com/v3/signin/identifier?hl=en-gb&ifkv=ASKXGp3hlaL5P3aFnR2zS7I4mK7-rHg94UQ8iAiPS6Fs-fwA_EpVZKF2IXoJgitxJOUZnHkdogY63g&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1006884703%3A1704632896511326&theme=glif");
	  //driver.get("https://www.makemytrip.com/");
	 // System.out.println(driver.getTitle());
	   
	//   driver.manage().window().maximize();
	  
	//   driver.findElement(By.id("identifierId")).sendKeys("piyushbhatia534@gmail.com");
        //Thread.sleep(1000);
	  // driver.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button/span")).click();
   
//     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//	  driver.findElement(By.className("userLoggedOut")).click() ;
//   
//      
//      driver.findElement(By.id("username")).sendKeys("9896502619");
//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
//      driver.findElement(By.className("font16")).click();
//      driver.findElement(By.className("inputText")).sendKeys("piyushbhatia534@gmail.com");
//      driver.findElement(By.className("createMbAccount__btn")).click();
//      
//      // input full name
//      driver.findElement(By.cssSelector("inputText")).sendKeys("Piyush Bhatia");
//      driver.findElement(By.className("inputTextWithMultipleCountryCodes")).sendKeys("9896502619");
//      
//      driver.findElement(By.className("mybizLoginClose")).click();
	  
	  
	  
	 
	  
	  
	  
   }
}
