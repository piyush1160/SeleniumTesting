package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/piyushbhatia/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();
        //	driver.get("https://www.google.com");
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // parent -> child -> siblings
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
       // go back to parent.
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div")).getText());
        driver.quit();

    }


}
