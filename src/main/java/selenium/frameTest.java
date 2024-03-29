package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frameTest {

    public static void frame(WebDriver driver){
     driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
     driver.findElement(By.id("draggable")).click();

    }



@Test
    public static void test001(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        frame(driver);
    }
}
