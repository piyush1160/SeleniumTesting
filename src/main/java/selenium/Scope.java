package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Scope {

    public static void scope(WebDriver driver) throws  Exception{
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement element = driver.findElement(By.id("gf-BIG"));

        System.out.println(element.findElements(By.tagName("a")).size());
       WebElement coloum1 =  element.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println("column Link : "+ coloum1.findElements(By.tagName("a")).size());

        Actions an = new Actions(driver);
       // Thread.sleep(3000);
        // for clicking all links
        for(int i =0;i < coloum1.findElements(By.tagName("a")).size() ;i++){
           // String clicking = Keys.chord(Keys.CONTROL ,Keys.ENTER);
            try{
                String clicking = Keys.chord(Keys.COMMAND ,Keys.ENTER);
                //driver.navigate().refresh();
              //  Thread.sleep(3000);
                coloum1.findElements(By.tagName("a")).get(i).sendKeys(clicking);

               // driver.navigate().back();


            }catch (StaleElementReferenceException e){
//                driver.navigate().refresh();
//                driver.navigate().back();
                String clicking = Keys.chord(Keys.CONTROL ,Keys.ENTER);
                coloum1.findElements(By.tagName("a")).get(i).sendKeys(clicking);
            }
            // to open in defferennt tab ..


        }
        Thread.sleep(2000);
        driver.close();
    }


    public static void openMultiple(WebDriver driver) throws  Exception{
//        WebElement element = driver.findElement(By.id("gf-BIG"));
//        WebElement column1 = element.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
//        int linkCount = column1.findElements(By.tagName("a")).size();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        Actions actions = new Actions(driver);
//        for (int i = 1; i < linkCount; i++) {
//            WebElement link = column1.findElements(By.tagName("a")).get(i);
//            wait.until(ExpectedConditions.elementToBeClickable(link));
//            actions.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
//        }
//
//        Thread.sleep(3000); // Allow time for tabs to open
//
//        // Switch to each tab and then close it
//        for (String windowHandle : driver.getWindowHandles()) {
//            driver.switchTo().window(windowHandle);
//            //driver.close();
//        }
        WebElement elementfooter = driver.findElement(By.id("gf-BIG"));

        WebElement column1 = elementfooter.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        List<WebElement> list = driver
                .findElements(By.xpath("//div[@id = 'gf-BIG']//tbody/tr/td[1]/ul/li/a"));
        System.out.println(list.size());

        for(int i =0 ; i< driver.findElements(By.xpath("//div[@id = 'gf-BIG']//tbody/tr/td[1]/ul/li/a")).size() ;i++){

            try{
                list.get(i).click();
                Thread.sleep(3000);
                driver.navigate().back();
                Thread.sleep(3000);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
                driver.navigate().refresh();
            }catch (Exception e){
                list = driver
                        .findElements(By.xpath("//div[@id = 'gf-BIG']//tbody/tr/td[1]/ul/li/a"));
                list.get(i).click();
                Thread.sleep(3000);
                driver.navigate().back();
                Thread.sleep(3000);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
                driver.navigate().refresh();
            }
//            list.get(i).click();
//            Thread.sleep(3000);
//            driver.navigate().back();
//            Thread.sleep(3000);
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//            driver.navigate().refresh();
        }

        //System.out.println(list);
    }

    @Test
    public static void test001() throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        ChromeOptions options = new ChromeOptions();
        //   options.setBrowserVersion(PropertiesUtils.getPropertyValue("ChromeVersion"));
        options.addArguments("--remote-allow-origins=*");
        //options.setPageLoadStrategy(PageLoadStrategy.NONE);
        options.addArguments("--headless");

        scope(driver);
       // openMultiple(driver);
    }
}
