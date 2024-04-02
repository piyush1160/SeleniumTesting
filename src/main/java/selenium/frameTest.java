package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class frameTest {

    public static void frame(WebDriver driver){
     driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
     driver.findElement(By.id("draggable")).click();

        Actions act = new Actions(driver);
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
       act.dragAndDrop(drag,drop).build().perform();
       //driver.quit();
    }



@Test
    public static void test001(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    ChromeOptions options = new ChromeOptions();
 //   options.setBrowserVersion(PropertiesUtils.getPropertyValue("ChromeVersion"));
    options.addArguments("--remote-allow-origins=*");
    //options.setPageLoadStrategy(PageLoadStrategy.NONE);
    	options.addArguments("--headless");

    frame(driver);
    }
}
