package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


import java.util.List;

public class DropdownPrac {
    static String country ="ind";
    public static void nonSelectedDropdown (WebDriver driver)throws Exception{
  selectCheckBox(driver);
        driver.findElement(By.id("autosuggest")).sendKeys(country);
        Thread.sleep(2000);
       List<WebElement> options =  driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        Thread.sleep(2000);

      for(WebElement option :options){

          if(option.getText().equalsIgnoreCase("India")){
               option.click();
               break;
           }
      }

        Thread.sleep(2000);

    }

    public static void selectCheckBox(WebDriver driver) throws Exception{
       Thread.sleep(1000);
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
     //   System.out.println(  driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
       Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        System.out.println(  driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

       // driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();


    }

      public static void DynamicDropdown(WebDriver driver)throws Exception{
         // From field
          driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//a[@value='DEL']")).click();
          Thread.sleep(1000);
         // System.out.println( driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).getText());
        // To field .
         driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
         // Thread.sleep(1000);
          driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

          //  Thread.sleep(3000);
        // System.out.println( driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).getText());
          Thread.sleep(2000);
          //driver.findElement(By.xpath("//a[@class=\"ui-state-default ui-state-highlight\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[7]/a")).click();

         // driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
          Thread.sleep(1000);


         driver.findElement(By.xpath("//input[@value='Search']")).click();
          Thread.sleep(1000);

          nonSelectedDropdown(driver);

      }
    public static void performAction()throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Thread.sleep(2000);
        WebElement selectDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(selectDropdown);
        Thread.sleep(1000);
        dropdown.selectByIndex(3);
        System.out.println( dropdown.getFirstSelectedOption().getText());
        Thread.sleep(1000);
        dropdown.selectByVisibleText("AED");
        System.out.println( dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("INR");
        System.out.println( dropdown.getFirstSelectedOption().getText());
        Thread.sleep(1000);

        UpdatedDropdown(driver);
       // driver.close();
    }


    public static void UpdatedDropdown(WebDriver driver) throws Exception{
        Thread.sleep(2000);
        driver.findElement(By.id("divpaxinfo")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Thread.sleep(2000);

        for(int i = 0 ; i<5 ; i++){
              driver.findElement(By.id("hrefIncAdt")).click();
          }
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Thread.sleep(1000);
        driver.findElement(By.id("btnclosepaxoption")).click();
        Thread.sleep(2000);
        DynamicDropdown(driver);
        driver.quit();
    }


   public static void handlinAlert()throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("name")).sendKeys("Piyush");
        Thread.sleep(1000);
        // alert button
       driver.findElement(By.id("alertbtn")).click();
       System.out.println(driver.switchTo().alert().getText());
       Thread.sleep(1000);

       // handle the alert appear on the screen ..
       driver.switchTo().alert().accept();
       driver.findElement(By.id("name")).sendKeys("Bhatia");
       driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(1000 );
       driver.switchTo().alert().dismiss();

        Thread.sleep(1000);
        driver.quit();
   }


    @Test
    public static void test002() throws Exception {

//       for(int i =0;i<5;i++){
//           performAction();
//       }

       handlinAlert();

    }
}
