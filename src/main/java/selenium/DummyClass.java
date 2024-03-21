package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DummyClass {
    public static void main(String[] args) throws  Exception{
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(1000);
        // System.out.println( driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).getText());
        // To field .
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
         Thread.sleep(1000);
        // driver.findElement(By.xpath("(//a[@value='MAA'][2])")).click();
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        //  Thread.sleep(3000);
        // System.out.println( driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).getText());
          //Thread.sleep(1000);
       // driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
      //   driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
        Thread.sleep(1000);

        // driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();

        System.out.println(  driver.findElement(By.id("Div1")).getAttribute("style") );
        driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();

        System.out.println(  driver.findElement(By.id("Div1")).getAttribute("style") );
           if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
               System.out.println("its enabled ");
               Assert.assertTrue(true);
           }else{
               Assert.assertTrue(false);
           }


         Thread.sleep(6000);
          driver.quit();



    }
}
