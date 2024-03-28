package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actionDemo {


    public static void actiondemo(WebDriver driver){
        Actions as = new Actions(driver);
       as.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();
       as.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("iphone").doubleClick().build().perform() ;
    }


    @Test
    public static void test001(){
        WebDriver driver = new ChromeDriver();
         driver.get("https://www.amazon.in/ref=nav_logo");
          actiondemo(driver);
    }
}
